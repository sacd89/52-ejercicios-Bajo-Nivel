/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package programas;

import java.util.Scanner;

/**
 * Simular cien tiradas de dos dados y contar las veces que entre los dos 
 * suman 10.
 * 
 * @author Daniela Santillanes Castro
 */
public class Programa29 {
    
    public static void main(String[] args) {
        prog29();
    }
    
    public static void prog29(){
        int tiradas = 1, conta = 0, dado1 = 7, dado2 = 7, veces= 100, total;
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese la probabilidad que desea calcular");
        System.out.println("La suma de los dados dara de resultado: ");
        total = in.nextInt();
        
        while (tiradas++ <= veces) {
            dado1 *= Math.random();
            if (dado1 == 0) {
                dado1 = 1;
            }
            dado2 *= Math.random();
            if (dado2 == 0) {
                dado2 = 1;
            }

            if ((dado1 + dado2) == total) {
                conta++;
            }

            dado1 = 7;
            dado2 = 7;
        }

        System.out.println("En " + conta + " ocaciones la suma de los dados"
                + " fue " + total);

    }
}
