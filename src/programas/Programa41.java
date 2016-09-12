/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 *Se dispone de una tabla de 5 páginas, 10 filas y 20 columnas, que se refieren
 * al centro, al curso y al numero de alumnos de un colegio respectivamente. 
 * Imprimir la nota media por curso y la nota media maxima y su centro de 
 * pertenencia.
 * 
 * @author Daniela Santillanes Castro
 */
public class Programa41 {
    
    public static void main(String[] args) {
        prog41();
    }

    public static void prog41() {
        final int FILAS = 10, COLUMNAS = 20, PAGINAS = 5;
        int[][][] matriz = new int[PAGINAS][FILAS][COLUMNAS];
        Integer contador = 1;
        Random r = new Random();
        for (int k = 0; k < PAGINAS; k++) {
            for (int i = 0; i < FILAS; i++) {
                for (int j = 0; j < COLUMNAS; j++) {
                    matriz[k][i][j] = r.nextInt(11);
                }
            }
        }

        List<Double> medias = new ArrayList<>();
        List<Double> mediasMaximas = new ArrayList<>();
        Double sum = 0.0;
        for (int k = 0; k < PAGINAS; k++) {
            for (int i = 0; i < FILAS; i++) {
                sum = 0.0;
                for (int j = 0; j < COLUMNAS; j++) {
                    sum += matriz[k][i][j];
                }
                medias.add(sum / 20);
            }
            mediasMaximas.add(Collections.max(medias));
        }
        System.out.println(String.format("Media: " + Collections.max(mediasMaximas)+ ", pertenece al centro número: "+ mediasMaximas.indexOf(Collections.max(mediasMaximas)) + 1));
        System.out.println(Arrays.deepToString(matriz));

    }

}
