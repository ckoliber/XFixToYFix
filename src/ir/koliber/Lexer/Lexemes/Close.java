package ir.koliber.Lexer.Lexemes;

import ir.koliber.Lexer.Lexeme;
import ir.koliber.Lexer.Token;

public class Close extends Lexeme {
    public Close() {
        super("[)]", Token.TokenType.CLOSE);
    }
}
