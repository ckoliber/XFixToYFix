package ir.koliber.Lexer;

public class Token {
    public enum TokenType {
        CLOSE,
        OPEN,
        NUMBER,
        ADD,
        SUB,
        MUL,
        DIV
    }

    public String token;
    public TokenType type;

    public Token(String token, TokenType type) {
        this.token = token;
        this.type = type;
    }
}
