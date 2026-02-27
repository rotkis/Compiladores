package com.compilador;
public class Token {
    String tipo;
    String lexema;

    public Token(String tipo, String lexema) {
        this.lexema = lexema;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "<" + tipo  + ", " + lexema + ">";
    }

    

}
