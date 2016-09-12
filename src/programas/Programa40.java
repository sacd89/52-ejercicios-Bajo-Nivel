/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package programas;

import java.util.Scanner;

/**
 * Crear una tabla de 3 paginas, 4 filas y 5 columnas donde el primer elemento 
 * valga 1, el segundo 2, el tercero 3 y as¡ sucesivamente, e imprimirla.
 * 
 * @author Daniela Santillanes Castro
 */
public class Programa40 {
    public static void main(String[] args) {
        prog40();
    }
    
    public static void prog40(){
        Scanner in = new Scanner(System.in);
        Integer nums[][][] = new Integer[3][4][5];
        Integer contador = 1;
        for (int i = 0; i < 3; i++) {
            System.out.println("Página " + i);
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 5; k++) {
                    nums[i][j][k] = contador++;
                    System.out.println(nums[i][j][k]);
//                    if (k != nums[j].length - 1) {
//                        System.out.print("\t");
//                    } else {
//                        System.out.print("\n");
//                    }
                }
            }
        }
    }
}
