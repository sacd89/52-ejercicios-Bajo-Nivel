/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programas;

/**
 * Generar una matriz de 4 filas y 5 columnas con n£meros aleatorios entre 1 y
 * 100, y hacer su matriz transpuesta.
 *
 * @author Daniela Santillanes Castro
 */
public class Programa37 {
    
    public static void main(String[] args) {
        prog37();
    }

    public static void prog37() {
        int matriz[][] = new int[4][5];
        int matrizT[][] = new int[matriz[0].length][matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * 100 + 1);
                matrizT[j][i] = matriz[i][j];
                System.out.print(matriz[i][j]);
                if (j != matriz[i].length - 1) {
                    System.out.print("\t");
                } else {
                    System.out.print("\n");
                }
            }
        }
        System.out.println("");
        System.out.println("Matriz traspuesta");
        for (int i = 0; i < matrizT.length; i++) {
            for (int j = 0; j < matrizT[i].length; j++) {
                System.out.print(matrizT[i][j]);
                if (j != matrizT[i].length - 1) {
                    System.out.print("\t");
                } else {
                    System.out.print("\n");
                }
            }
        }

    }
}
