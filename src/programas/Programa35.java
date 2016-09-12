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
 * Hacer un programa que busque una nota en el vector.
 * @author Daniela Santillanes Castro
 */
public class Programa35 {
    
    public static void main(String[] args) {
        prog35();
    }
    
    public static void prog35(){
        
        Float calificacionBuscar= 0f;
        Scanner in = new Scanner(System.in);
        List<Float> calificaciones = new ArrayList<>();
        Float calificacion = 0f;
        Float media = 0f;
        Boolean encontrar = false;
        System.out.println("Ingrese calificaciones: ");
        for (int i = 0; i < 10; i++) {
            System.out.println("Calificacion " + (i+1));
            calificacion = in.nextFloat();
            calificaciones.add(calificacion);
        }
        System.out.println("Ingrese calificacion a buscar:");
        calificacionBuscar = in.nextFloat();
        
        for (int i = 0; i < calificaciones.size(); i++) {
            if(calificacionBuscar.equals(calificaciones.get(i))){
                encontrar = true;
            }
        }
        
        if(encontrar.equals(true)){
            System.out.println("La calificacion buscada si se encuentra en la lista");
        }else{
            System.out.println("La calificacion buscada no se encuentra en la lista");
        }
        
    }
}
