package ir.koliber.Lexer;

import java.util.regex.Pattern;

public class Lexeme {
    private Pattern matcher;
    private Token.TokenType type;

    public Lexeme(String regexp, Token.TokenType type) {
        this.matcher = Pattern.compile(regexp);
        this.type = type;
    }

    private boolean match(String token) {
        return this.matcher.matcher(token).matches();
    }

    public Token get(String token) {
        if (this.match(token)) {
            return new Token(token, this.type);
        }

        return null;
    }
}
