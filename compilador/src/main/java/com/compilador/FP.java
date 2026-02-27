package com.compilador;

import java.text.CharacterIterator;

public class FP extends AFD {
    public Token evaluate(CharacterIterator code){
        switch (code.current()) {
            
            case ')':
                code.next();
                return new Token("FP", ")");

            case CharacterIterator.DONE:
                return new Token("EOF", "$");

            default:
                return null;
        }
    }
}
