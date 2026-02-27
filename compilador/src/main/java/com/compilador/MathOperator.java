package com.compilador;

import java.text.CharacterIterator;

public class MathOperator extends AFD {
    @Override
    public Token evaluate(CharacterIterator code){
        switch (code.current()) {
            case '+':
                code.next();
                return new Token("PLUS", "+");

            case '-':
                code.next();
                return new Token("MINUS", "-");

            case '*':
                code.next();
                return new Token("MULT", "*");

            case '/':
                code.next();
                return new Token("DIVIDE", "/");


            case CharacterIterator.DONE:
                return new Token("EOF", "$");

            default:
                return null;
        }
    }
}
