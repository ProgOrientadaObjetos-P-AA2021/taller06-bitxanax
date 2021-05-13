/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author bitxanax
 */
public class Enfermero {

    private String nombre, tipoNombramiento;
    private double sueldoMensual;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Enfermero(String nombre, String tipoNombramiento, double sueldoMensual) {
        this.nombre = nombre;
        this.tipoNombramiento = tipoNombramiento;
        this.sueldoMensual = sueldoMensual;
    }

    public String getTipoNombramiento() {
        return tipoNombramiento;
    }

    public void setTipoNombramiento(String tipoNombramiento) {
        this.tipoNombramiento = tipoNombramiento;
    }

    public double getSueldoMensual() {
        return sueldoMensual;
    }

    public void setSueldoMensual(double sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }

    public String toString() {
        return " - " + nombre + " - nombramiento: " + tipoNombramiento
                + " - sueldo: " + sueldoMensual + "\n";
    }

}
