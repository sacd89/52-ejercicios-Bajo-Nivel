/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package programas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Programa que lea las calificaciones de un alumno en 10 asignaturas, 
 * las almacene en un vector y calcule e imprima su media.
 * @author Daniela Santillanes Castro
 */
public class Programa34 {
    
    public static void main(String[] args) {
        prog34();
    }
    
    public static void prog34(){
        List<Float> calificaciones = new ArrayList<>();
        Float calificacion = 0f;
        Float media = 0f;
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese calificaciones: ");
        for (int i = 0; i < 10; i++) {
            System.out.println("Calificacion " + (i+1));
            calificacion = in.nextFloat();
            calificaciones.add(calificacion);
        }
        for (int i = 0; i < calificaciones.size(); i++) {
            media = (media + calificaciones.get(i)/calificaciones.size());
        }
        
        System.out.println("La media es: " + media);
    }
}
