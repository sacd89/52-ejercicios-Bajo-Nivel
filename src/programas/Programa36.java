/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programas;

import java.util.Random;

/**
 * Generar una matriz de 4 filas y 5 columnas con numeros aleatorios entre 1 y
 * 100, e imprimirla.
 *
 * @author Daniela Santillanes Castro
 */
public class Programa36 {
    
    public static void main(String[] args) {
        prog36();
    }

    public static void prog36() {
        int matriz[][] = new int[4][5];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * 100 + 1);
                System.out.print(matriz[i][j]);
                if (j != matriz[i].length - 1) {
                    System.out.print("\t");
                } else {
                    System.out.print("\n");
                }
            }
        }

    }

}
