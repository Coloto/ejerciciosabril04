package com.softtek.presentacion;

import com.softtek.model.Areas;
import com.softtek.model.Campos;
import com.softtek.model.Tablas;
import com.softtek.model.Alumno;

public class Main {

    public static void main(String[] args) {

        int numero = 6;
        int resultado = ++numero;
        System.out.println(resultado);
        System.out.println(numero);
        numero=6;
        resultado = numero++;
        System.out.println(resultado);
        System.out.println(numero);

        //areaCuadrado(4);

        //areaCirculo(3);

        //periRectangulo(4,3);

        //areas();

        //campos();

        //tablasMultiplicar();

        //alumnoNotas();

        probarString();
    }

    public static void areaCuadrado(int lado) {
        System.out.println(Math.pow(lado,2));  //se usan metodos de la clase Math
    }//cierra metodo areaCuadrado

    public static void areaCirculo(int radio) {
        System.out.println(Math.PI*Math.pow(radio,2)); //se usan metodos de la clase Math
    }//cierra metodo areaCirculo

    public static void periRectangulo(int base, int altura) {
        System.out.println(base*2+altura*2);
    }//cierra metodo periRectangulo

    public static void areas() {
        Areas area = new Areas();

        System.out.println(area.areaRect(4,5));
        System.out.println(area.areaCirc(3));
    }//cierra metodo areas

    public static void campos() {
        Campos campo = new Campos(0);
        campo.Muestra();
        campo.Incrementa();
        campo.Muestra();
        campo.Incrementa();
        campo.Muestra();
    }//cierra metodo campos

    public static void tablasMultiplicar(){
        /*for (int i=1;i<=10;i++){
            Tablas tabla = new Tablas(i);
            System.out.println(tabla.multiplicar());
            System.out.println("=============");
        }*/
        Tablas tabla = new Tablas(5);
        System.out.println(tabla.multiplicar());
    }//cierra metodo tablasMultiplicar

    public static void alumnoNotas(){
        Alumno alumno = new Alumno("Juan");
        alumno.añadirParcial(6);
        alumno.añadirParcial(5);
        alumno.añadirParcial(4);
        alumno.mostrarCalificaciones();
        alumno.calcularPromedio();
    }//cierra metodo alumnonotas

    public static void probarString(){
        String texto = "Nunca mates una mosca sobre la cabeza de un tigre.";

        System.out.println(texto.toUpperCase());
        System.out.println(texto.toLowerCase());
        String[] palabras = texto.split(" "); //una forma de hacerlo es declarando un array con cada palabra spliteada del texto
        System.out.println(texto.split(" ")[0]); //otra forma es poniendo el split del texto y la posicion deseada directamente en el print
        System.out.println(palabras[3]);
        System.out.println(palabras[6]);
        System.out.println(texto.toLowerCase().indexOf('m')); //busca el indice (posicion) de la letra m en el texto en minusculas
        System.out.println(texto.length());
    } //cierra metodo probarString
}
