/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import entidades.Ciudad;
import entidades.Enfermero;
import entidades.Hospital;
import entidades.Medico;
import java.util.Scanner;

/**
 *
 * @author bitxanax
 */
public class Taller6 {

    /**
     * @param args the command line arguments
     */
    static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Ingrese el nombre de la provincia: ");
        String nombreCiudad = read.nextLine();

        System.out.println("Ingrese el nombre de la provincia: ");
        String nombreProvincia = read.nextLine();

        Ciudad ciudad = new Ciudad(nombreCiudad, nombreProvincia);

        System.out.println("Ingrese el nombre del hospital: ");
        String nombreHospital = read.nextLine();

        System.out.println("Ingrese la dirección: ");
        String direccion = read.nextLine();

        System.out.println("Ingrese la cantidad de especialidades: ");
        int cantidadEspecialidades = Integer.parseInt(read.nextLine());

        Hospital hospital = new Hospital(nombreHospital, direccion, cantidadEspecialidades, ciudad);

        System.out.println("Cantidad médicos a ingresar: ");
        int cantidadMedicos = Integer.parseInt(read.nextLine());
        System.out.println("Cantidad enfermeros a ingresar: ");
        int cantidadEnfermeros = Integer.parseInt(read.nextLine());

        createMedicos(hospital, cantidadMedicos);
        createEnfermeros(hospital, cantidadEnfermeros);

        hospital.calcularSueldosCancelar();

        System.out.println(hospital);
    }

    public static void createMedicos(Hospital hospital, int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese los valores del médico " + (i + 1) + ": ");
            System.out.print("Nombre: ");
            String nombre = read.nextLine();
            System.out.print("Especialidad: ");
            String especialidad = read.nextLine();
            System.out.print("Sueldo: ");
            double sueldo = read.nextDouble();

            Medico medico = new Medico(nombre, especialidad, sueldo);
            hospital.addMedico(medico);
        }
    }

    public static void createEnfermeros(Hospital hospital, int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese los valores del enfermero " +(i + 1)+ ": ");
            System.out.print("Nombre: ");
            String nombre = read.nextLine();
            System.out.print("Tpo contrato: ");
            String contrato = read.nextLine();
            System.out.print("Sueldo: ");
            double sueldo = read.nextDouble();

            Enfermero enfermero = new Enfermero(nombre, contrato, sueldo);
            hospital.addEnfermero(enfermero);
        }

    }
}
