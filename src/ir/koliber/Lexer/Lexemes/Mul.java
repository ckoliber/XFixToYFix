package ir.koliber.Lexer.Lexemes;

import ir.koliber.Lexer.Lexeme;
import ir.koliber.Lexer.Token;

public class Mul extends Lexeme {
    public Mul() {
        super("[*]", Token.TokenType.MUL);
    }
}
