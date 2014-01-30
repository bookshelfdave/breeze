package com.metadave;

import com.metadave.breeze.Breeze;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class TestBreeze {

    @Test
    public void testSimple() {
        try {

            String s = "stm = Compound(stm,stm)";
            Breeze.parse(s);
        } catch (Exception e) {
            System.out.println(e);
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
            System.out.println(e);
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
            e.printStackTrace();
            System.out.println(e);
        }
    }

}
