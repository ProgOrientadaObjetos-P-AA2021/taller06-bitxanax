/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.ArrayList;

/**
 *
 * @author bitxanax
 */
public class Hospital {

    private String nombre,
            direccion;
    private int especialidades;
    private Ciudad ciudad;
    private double sueldosCancelar;

    private ArrayList<Medico> medicos = new ArrayList<>();
    private ArrayList<Enfermero> enfermeros = new ArrayList<>();


    public Hospital(String nombre, String direccion, int especialidades, Ciudad ciudad) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.especialidades = especialidades;
        this.ciudad = ciudad;

    }

    public int getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(int especialidades) {
        this.especialidades = especialidades;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Medico> getMedicos() {
        return medicos;
    }

    public String getMedicosInfo() {
        String info = "";
        for (Medico i : medicos) {
            info += i.toString();
        }
        return info;
    }

    public String getEnfermerosInfo() {
        String info = "";
        for (Enfermero i : enfermeros) {
            info += i.toString();
        }
        return info;
    }

    public void setMedicos(ArrayList<Medico> medicos) {
        this.medicos = medicos;
    }

    public ArrayList<Enfermero> getEnfermeros() {
        return enfermeros;
    }

    public void setEnfermeros(ArrayList<Enfermero> enfermeros) {
        this.enfermeros = enfermeros;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    public double getSueldosCancelar() {
        return sueldosCancelar;
    }

    public void calcularSueldosCancelar() {
        for (Medico i : medicos) {
            this.sueldosCancelar += i.getSueldoMensual();
        }
        for (Enfermero i : enfermeros) {
            this.sueldosCancelar += i.getSueldoMensual();
        }
    }

    public void addMedico(Medico medico) {
        medicos.add(medico);
    }

    public void addEnfermero(Enfermero enfermero) {
        enfermeros.add(enfermero);
    }

    @Override
    public String toString() {
        return String.format(
                "HOSPITAL %s\n"
                + "Direccion: %s\n"
                + "Ciudad: %s\n"
                + "Provincia: %s\n"
                + "Nº especialidades: %s\n"
                + "Listado de médicos: \n%s\n"
                + "Listado de enferemer@s: \n%s\n"
                + "\nTotal de sueldos a pagar por mes: %s \n",
                nombre, direccion, ciudad.getNombre(), ciudad.getProvinciaNombre(),
                especialidades, getMedicosInfo(), getEnfermerosInfo(), sueldosCancelar);
    }

}
