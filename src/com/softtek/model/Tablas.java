package com.softtek.model;

public class Tablas {

    private int tabla;

    public Tablas(int tabla) {
        this.tabla = tabla;
    }

    public String multiplicar(){
        String texto = "";
        for (int i=0;i<=10;i++){
            texto+= tabla+" x " + i + " = " + tabla*i + "\n";
        }
        return texto;
    }
}
