/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programas;

import java.util.Scanner;

/**
 * Cargar en una matriz las notas de los alumnos de un colegio en funcion del
 * numero de cursos (filas) y del n£mero de alumnos por curso (columnas).
 *
 * @author Daniela Santillanes Castro
 */
public class Programa38 {
    
    public static void main(String[] args) {
        prog38();
    }

    public static void prog38() {
        Scanner in = new Scanner(System.in);
        Integer cursos, alumnos;
        System.out.println("Ingrese el numero de cursos: ");
        cursos = in.nextInt();
        System.out.println("Ingrese el numero de alumnos: ");
        alumnos = in.nextInt();
        int notas[][] = new int[cursos][alumnos];
        for (int i = 0; i < notas.length; i++) {
//            System.out.println("Curso: ");
//            i = in.nextInt();
            for (int j = 0; j < notas[i].length; j++) {
//                System.out.println("Alumno: ");
//                j = in.nextInt();
                System.out.println("Calificacion: ");
                notas[i][j] = in.nextInt();
            }
        }
        System.out.println("");
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                System.out.print(notas[i][j]);
                if (j != notas[i].length - 1) {
                    System.out.print("\t");
                } else {
                    System.out.print("\n");
                }
            }
        }
    }
}
