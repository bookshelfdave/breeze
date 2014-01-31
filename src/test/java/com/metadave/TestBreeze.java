package com.metadave;

import com.metadave.breeze.Breeze;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
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

}
