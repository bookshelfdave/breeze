package com.metadave;

import com.metadave.breeze.Breeze;
import com.metadave.breeze.ast.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;


public class TestBreeze {

    @Test
    public void testSimple() {
        try {

            String s = "stm = Compound(stm,stm)";
            Breeze.parse(s);
        } catch (Exception e) {
            fail();
        }
    }

    @Test
    public void testOne() {
        try {
            String s =
                    "stm = Compound(stm,stm)\n" +
                        "| Assign(identifier, exp)\n" +
                        "| Print(exp_list)\n" +
                    "exp_list = ExpList(exp, exp_list) | Nil\n" +
                    "exp = Id(identifier)\n" +
                        "| Num(int)\n" +
                        "| Op(exp, binop, exp)\n" +
                    "binop = Plus | Minus | Times | Div";
            Breeze.parse(s);
        } catch (Exception e) {
            fail();
        }
    }

    @Test
    public void testTwo() {
        try {
            String s = "pos = (string? file, int line, int offset)\n" +
                       "stm = Compound(stm head, stm next)\n" +
                             "| Assign(identifier lval, exp rval)\n" +
                             "| Print(exp* args)\n" +
                       "attributes (pos p)\n" +
                       "real = (int mantissa, int exp)\n" +
                       "exp = Id(identifier)\n" +
                             "| Num(int)\n" +
                             "| Op(exp, binop, exp)\n" +
                          "attributes (real? value)\n" +
                       "binop = Plus | Minus | Times | Div";
            Breeze.parse(s);
        } catch (Exception e) {
            fail();
        }
    }

    @Test
    public void testCtorDups() {
        try {
            String s =
                    "stm = Compound(stm,stm)\n" +
                            "| Assign(identifier, exp)\n" +
                            "| Print(exp_list)\n" +
                    "exp_list = ExpList(exp, exp_list) | Nil\n" +
                    "exp = Id(identifier)\n" +
                            "| Num(int)\n" +
                            "| Op(exp, binop, exp)\n" +
                    "binop = Plus | Minus | Times | Div\n" +
                    "foo = Print(foo)";
            Breeze.parse(s);
            fail();
        } catch (Exception e) {
            assertTrue(true);
        }
    }


    @Test
    public void testDefDups() {
        try {
            String s =
                    "stm = Compound(stm,stm)\n" +
                            "| Assign(identifier, exp)\n" +
                            "| Print(exp_list)\n" +
                    "exp_list = ExpList(exp, exp_list) | Nil\n" +
                    "exp = Id(identifier)\n" +
                            "| Num(int)\n" +
                            "| Op(exp, binop, exp)\n" +
                    "binop = Plus | Minus | Times | Div\n" +
                    "stm = Foo(foo)";
            Breeze.parse(s);
            fail();
        } catch (Exception e) {
            assertTrue(true);
        }
    }

    @Test
    public void testDefDups2() {
        try {
            String s =
                    "stm = Compound(stm,stm)\n" +
                            "| Assign(identifier, exp)\n" +
                            "| Print(exp_list)\n" +
                            "exp_list = ExpList(exp, exp_list) | Nil\n" +
                            "exp = Id(identifier)\n" +
                            "| Num(int)\n" +
                            "| Op(exp, binop, exp)\n" +
                            "binop = Plus | Minus | Times | Times";
            Breeze.parse(s);
            fail();
        } catch (Exception e) {
            assertTrue(true);
        }
    }


    @Test
    public void testVisitor() {
        try {
            TestVisitor v = new TestVisitor();

            String s =
                    "stm = Compound(stm,stm)\n" +
                            "| Assign(identifier, exp)\n" +
                            "| Print(exp_list)\n" +
                    "foo = (sum, sum)\n" +
                    "exp_list = ExpList(exp, exp_list) | Nil\n" +
                    "exp = Id(identifier)\n" +
                            "| Num(int)\n" +
                            "| Op(exp, binop, exp)\n" +
                    "binop = Plus | Minus | Times | Div";

            List<BreezeASTVisitor> visitors = new ArrayList<BreezeASTVisitor>();
            visitors.add(v);
            Breeze.parse(s, visitors);
            assertTrue(v.objs.contains(com.metadave.breeze.ast.BreezeSumType.class));
            assertTrue(v.objs.contains(com.metadave.breeze.ast.BreezeProductType.class));
            assertTrue(v.objs.contains(com.metadave.breeze.ast.BreezeFields.class));
            assertTrue(v.objs.contains(com.metadave.breeze.ast.BreezeField.class));
            assertTrue(v.objs.contains(com.metadave.breeze.ast.BreezeDefinition.class));
            assertTrue(v.objs.contains(com.metadave.breeze.ast.BreezeConstructor.class));
            assertTrue(v.objs.contains(com.metadave.breeze.ast.BreezeASD.class));

            assertEquals(7, v.objs.size());
        } catch (Exception e) {
            e.printStackTrace();;
            fail();
        }
    }
}

class TestVisitor implements BreezeASTVisitor {
    public Set<Object> objs = new HashSet<Object>();

    @Override
    public void visit(BreezeASD asd) throws Exception {
        objs.add(asd.getClass());
    }

    @Override
    public void visit(BreezeConstructor ctor) throws Exception {
        objs.add(ctor.getClass());
        //assertEquals("XXX", ctor.getId());
    }

    @Override
    public void visit(BreezeDefinition def) throws Exception {
        objs.add(def.getClass());
    }

    @Override
    public void visit(BreezeField field) throws Exception {
        objs.add(field.getClass());
    }

    @Override
    public void visit(BreezeFields fields) throws Exception {
        objs.add(fields.getClass());
    }

    @Override
    public void visit(BreezeProductType pt) throws Exception {
        objs.add(pt.getClass());
    }

    @Override
    public void visit(BreezeSumType st) throws Exception {
        objs.add(st.getClass());
    }

}
