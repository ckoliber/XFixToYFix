package ir.koliber.Lexer.Lexemes;

import ir.koliber.Lexer.Lexeme;
import ir.koliber.Lexer.Token;

public class Add extends Lexeme {
    public Add() {
        super("[+]", Token.TokenType.ADD);
    }
}
