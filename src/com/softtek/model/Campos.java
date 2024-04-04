package com.softtek.model;

public class Campos {
    private int x;

    public Campos(int x) {
        this.x = x;
    }

    public int Muestra(){
        return x;
    }
    public void Incrementa(){
       x+=1;
    }
}
