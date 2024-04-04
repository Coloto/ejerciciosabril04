package com.softtek.model;

import java.util.ArrayList;

public class Alumno {
    private String NombreCompleto;
    private ArrayList<Integer> parciales = new ArrayList<>();

    public Alumno(String nombreCompleto) {
        NombreCompleto = nombreCompleto;
        this.parciales = parciales;
    }

    public String getNombreCompleto() {
        return NombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        NombreCompleto = nombreCompleto;
    }

    public ArrayList<Integer> getParciales() {
        return parciales;
    }

    public void setParciales(ArrayList<Integer> parciales) {
        this.parciales = parciales;
    }

    public void añadirParcial(int parcial){
        parciales.add(parcial);
    }

    public String calcularPromedio(){
        int total = 0;
        for(int parcial : parciales){
            total+=parcial;
        }
        double promedio = (double) total/parciales.size();
        return "El promedio de las notas es: " + promedio;
    }

    public String mostrarCalificaciones() {
         return "Las notas de los parciales son: " + parciales;
    }
}
