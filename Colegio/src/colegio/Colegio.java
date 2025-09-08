/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package colegio;

/**
 *
 * @author Alaina Reyes
 */
import java.util.HashSet;
public class Colegio {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        // 1. Crear las materias:
        Materia web2 = new Materia(001, "Web 2", 2);
        Materia matematicas = new Materia(002, "Matemáticas", 1);
        Materia laboratorio1 = new Materia(003, "Laboratorio 1", 1);

        // 2. Crear 2 alumnos.
        Alumno lopez = new Alumno(1001, "López", "Martin");
        Alumno martinez = new Alumno(1002, "Martínez", "Brenda");

        // 3. Inscribir a López en las 3 materias.
        lopez.agregarMateria(web2);
        lopez.agregarMateria(matematicas);
        lopez.agregarMateria(laboratorio1);

        // 4. Inscribir a Martínez en las 3 materias y volver a inscribirlo en Laboratorio 1.
        martinez.agregarMateria(web2);
        martinez.agregarMateria(matematicas);
        martinez.agregarMateria(laboratorio1);
        martinez.agregarMateria(laboratorio1); // Esta línea no tendrá efecto, ya que el método lo previene.

        // 5. Visualizar la cantidad de materias a las que está inscripto cada alumno.
        System.out.println("--------------------");
        System.out.println("El/la alumno/a " + lopez.getApellido() + " " + lopez.getNombre() + " está inscripto en " + lopez.cantidadMaterias() + " materias.");
        System.out.println("El/la alumno/a " + martinez.getApellido() + " " + martinez.getNombre() + " está inscripto en " + martinez.cantidadMaterias() + " materias.");
    }
}


