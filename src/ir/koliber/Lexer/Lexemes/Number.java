package ir.koliber.Lexer.Lexemes;

import ir.koliber.Lexer.Lexeme;
import ir.koliber.Lexer.Token;

public class Number extends Lexeme {
    public Number() {
        super("[0-9]+", Token.TokenType.NUMBER);
    }
}
