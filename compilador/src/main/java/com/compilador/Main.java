package com.compilador;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Token> tokens = null;
        String data = "2 + 34 + 9";
        Lexer lexer = new Lexer(data);
        tokens = lexer.getTokens();
        for (Token token :tokens) {
            System.out.println(token);
        }
    }
}