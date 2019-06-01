package ir.koliber.Parser;

import ir.koliber.Lexer.Token;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class Parser {
    public String InfixToPostfix(ArrayList<Token> tokens) {
        Stack<Token> stack = new Stack<>();
        String result = "";

        for (Token token : tokens) {
            if (token.type == Token.TokenType.OPEN) {
                stack.push(token);
            } else if (token.type == Token.TokenType.CLOSE) {
                while (!stack.isEmpty()) {
                    Token popedToken = stack.pop();

                    if (popedToken.type != Token.TokenType.OPEN) {
                        result += popedToken.token;
                    } else {
                        break;
                    }
                }
            } else if (token.type == Token.TokenType.NUMBER){
                result += token.token;
            } else {
                stack.push(token);
            }
        }

        while (!stack.isEmpty()) {
            Token popedToken = stack.pop();

            if (popedToken.type != Token.TokenType.OPEN) {
                result += popedToken.token;
            }
        }

        return result;
    }

    public String InfixToPrefix(ArrayList<Token> tokens) {
        Collections.reverse(tokens);

        for (Token token : tokens) {
            if (token.type == Token.TokenType.OPEN) {
                token.token = ")";
                token.type = Token.TokenType.CLOSE;
            } else if (token.type == Token.TokenType.CLOSE) {
                token.token = "(";
                token.type = Token.TokenType.OPEN;
            }
        }

        return new StringBuilder(this.InfixToPostfix(tokens)).reverse().toString();
    }
}
