package ir.koliber.Lexer;

import ir.koliber.Lexer.Lexemes.*;
import ir.koliber.Lexer.Lexemes.Number;

import java.util.ArrayList;

public class Lexer {
    private Lexeme[] lexemes;

    public Lexer() {
        this.lexemes = new Lexeme[]{
                new Open(),
                new Close(),
                new Number(),
                new Add(),
                new Sub(),
                new Mul(),
                new Div()
        };
    }

    private Token matches(String tokenString) {
        for (Lexeme matcher : this.lexemes) {
            Token token = matcher.get(tokenString);

            if (token != null) {
                return token;
            }
        }

        return null;
    }

    public ArrayList<Token> lex(String source) {
        ArrayList<Token> result = new ArrayList<>();

        int begin = 0;
        for (int cursor = 0 ; cursor <= source.length() ; cursor++) {
            String tokenString = source.substring(begin, cursor);

            if (this.matches(tokenString) == null && cursor > 0) {
                tokenString = source.substring(begin, cursor-1);

                Token token = this.matches(tokenString);

                if (token != null) {
                    result.add(token);
                    begin += token.token.length();
                } else {
                    System.out.printf("Bad Token: %s\n", tokenString);
                }
            }

        }

        return result;
    }
}
