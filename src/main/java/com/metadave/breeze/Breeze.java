package com.metadave.breeze;

import com.metadave.breeze.ast.BreezeASD;
import com.metadave.breeze.parser.BreezeLexer;
import com.metadave.breeze.parser.BreezeParser;
import com.metadave.breeze.parser.BreezeWalker;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Breeze {
    public static void parse(String s) throws Exception {
        ANTLRInputStream input = new ANTLRInputStream(s);
        BreezeLexer lexer = new BreezeLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        BreezeParser parser = new BreezeParser(tokens);
        //        parser.removeErrorListeners();
        BreezeWalker b = new BreezeWalker();

        ParseTreeWalker walker = new ParseTreeWalker();
        try {
            BreezeParser.AsdContext ctx = parser.asd();
            walker.walk(b, ctx);
            BreezeASD asd = (BreezeASD)b.getValue(ctx);
            System.out.println(asd);
        } catch (Throwable e) {
            throw new Exception("Breeze parse error", e);
        }
    }
}
