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

/**
 *
 * @author bitxanax
 */
public class Taller6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ciudad ciudad = new Ciudad("Loja", "Loja");
        Hospital hospital = new Hospital("Clínica Abendaño", "Av. Ayora", 10, ciudad);
        createMedicos(hospital);
        createEnfermeros(hospital);
        hospital.calcularSueldosCancelar();
        System.out.println(hospital);
    }

    //Test only
    public static void createMedicos(Hospital hospital) {
        for (int i = 0; i < 5; i++) {
            Medico medico = new Medico("Joel Romero", "Pediatra", 5000);
            hospital.addMedico(medico);
        }
    }

    public static void createEnfermeros(Hospital hospital) {
        for (int i = 0; i < 5; i++) {
            Enfermero enfermero = new Enfermero("Sebastian Marcos", "Interno", 2500);
            hospital.addEnfermero(enfermero);
        }
    }
}
