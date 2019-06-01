package ir.koliber.Lexer.Lexemes;

import ir.koliber.Lexer.Lexeme;
import ir.koliber.Lexer.Token;

public class Div extends Lexeme {
    public Div() {
        super("[/]", Token.TokenType.DIV);
    }
}
