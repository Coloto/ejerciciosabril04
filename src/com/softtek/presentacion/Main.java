package com.softtek.presentacion;

import com.softtek.model.Areas;
import com.softtek.model.Campos;
import com.softtek.model.Tablas;
import com.softtek.model.Alumno;

public class Main {

    public static void main(String[] args) {
        /*areaCuadrado(4);
        areaCirculo(3);
        periRectangulo(4,3);

        int numero = 6;
        int resultado = ++numero;
        System.out.println(resultado);
        System.out.println(numero);
        numero=6;
        resultado = numero++;
        System.out.println(resultado);
        System.out.println(numero);*/



        //areas();

        //campos();

        //tablasMultiplicar();

        alumnoNotas();

    }

    public static void areaCuadrado(int lado) {
        System.out.println(Math.pow(lado,2));
    }

    public static void areaCirculo(int radio) {
        System.out.println(Math.PI*Math.pow(radio,2));
    }

    public static void periRectangulo(int base, int altura) {
        System.out.println(base*2+altura*2);
    }

    public static void areas() {
        Areas area = new Areas();

        System.out.println(area.areaRect(4,5));
        System.out.println(area.areaCirc(3));
    }

    public static void campos() {
        Campos campo = new Campos(0);
        campo.Muestra();
        campo.Incrementa();
        campo.Muestra();
        campo.Incrementa();
        campo.Muestra();
    }

    public static void tablasMultiplicar(){
        /*for (int i=1;i<=10;i++){
            Tablas tabla = new Tablas(i);
            System.out.println(tabla.multiplicar());
            System.out.println("=============");
        }*/
        Tablas tabla = new Tablas(5);
        System.out.println(tabla.multiplicar());
    }

    public static void alumnoNotas(){
        Alumno alumno = new Alumno("Juan");
        alumno.añadirParcial(6);
        alumno.añadirParcial(5);
        alumno.añadirParcial(4);
        alumno.mostrarCalificaciones();
        alumno.calcularPromedio();
    }
}
