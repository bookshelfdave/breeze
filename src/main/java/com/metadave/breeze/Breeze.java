package com.metadave.breeze;

import com.metadave.breeze.ast.BreezeASD;
import com.metadave.breeze.ast.BreezeASTVisitor;
import com.metadave.breeze.ast.BreezeVerifyVisitor;
import com.metadave.breeze.parser.BreezeLexer;
import com.metadave.breeze.parser.BreezeParser;
import com.metadave.breeze.parser.BreezeWalker;
import com.metadave.breeze.render.BreezeSTRender;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.List;

public class Breeze {
    public static void parse(String s, List<BreezeASTVisitor> visitors) throws Exception {
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
            asd.accept(new BreezeVerifyVisitor());
            if(visitors != null) {
                for(BreezeASTVisitor v: visitors) {
                    asd.accept(v);
                }
            }
        } catch (Throwable e) {
            //e.printStackTrace ();
            throw new Exception("Breeze parse error", e);
        }
    }

    public static void parse(String s) throws Exception {
         parse(s, null);
    }
}
