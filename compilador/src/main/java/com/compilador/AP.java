package com.compilador;

import java.text.CharacterIterator;

public class AP extends AFD{
    public Token evaluate(CharacterIterator code){
        switch (code.current()) {
            
            case '(':
                code.next();
                return new Token("AP", "(");

            case CharacterIterator.DONE:
                return new Token("EOF", "$");

            default:
                return null;
        }
    }
}
