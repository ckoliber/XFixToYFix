package ir.koliber.Lexer.Lexemes;

import ir.koliber.Lexer.Lexeme;
import ir.koliber.Lexer.Token;

public class Open extends Lexeme {
    public Open() {
        super("[(]", Token.TokenType.OPEN);
    }
}
