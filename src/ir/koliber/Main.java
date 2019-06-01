package ir.koliber;

import ir.koliber.Lexer.Lexer;
import ir.koliber.Lexer.Token;
import ir.koliber.Parser.Parser;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Lexer lexer = new Lexer();
        Parser parser = new Parser();

        ArrayList<Token> tokens = lexer.lex("((1+2)-(3*4)) ");

        System.out.printf("Postfix: %s\n", parser.InfixToPostfix(tokens));
        System.out.printf("Prefix: %s\n", parser.InfixToPrefix(tokens));
    }

}
