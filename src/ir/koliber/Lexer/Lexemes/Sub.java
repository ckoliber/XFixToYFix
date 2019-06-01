package ir.koliber.Lexer.Lexemes;

import ir.koliber.Lexer.Lexeme;
import ir.koliber.Lexer.Token;

public class Sub extends Lexeme {
    public Sub() {
        super("[-]", Token.TokenType.SUB);
    }
}
