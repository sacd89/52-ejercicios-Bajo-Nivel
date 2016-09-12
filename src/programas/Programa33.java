/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package programas;

import java.util.Scanner;

/**
 * Crear un array unidimensional de 20 elementos con nombres de 
 * personas.Visualizar los elementos de la lista debiendo ir cada uno en 
 * una fila distinta.
 * 
 * @author Daniela Santillanes Castro
 */
public class Programa33 {
    public static void main(String[] args) {
       prog33();
    }
    
    public static void prog33(){
        String[] nombres = {"Daniela", "Ararat", "Consuelo", "Erik", "Edgar",
        "Diana", "Laura", "Michelle", "Estefania", "Victor", "Leticia", "Victor"
        , "Gabriela", "Adrian", "Daniel", "Flor", "Abdiel", "Aidee", "Luis", 
        "Margarita"};
        
        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i]);
        }
    }
}
