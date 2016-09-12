/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package programas;

import java.util.Scanner;

/**
 * Introducir un numero menor de 5000 y pasarlo a numero romano.
 * @author Daniela Santillanes Castro
 */
public class Programa25 {
    
    public static void main(String[] args) {
        prog25();
    }
    
    public static void prog25(){
        Scanner in = new Scanner(System.in);
        Integer numero;
        do {
            System.out.println("Introduzca un número: ");
            numero = in.nextInt();
            System.out.println("Número romano de " + numero + ": " + 
                    convertirNumeros(numero));
        } while (numero < 1 || numero > 3999);
        
    }
    
    public static String convertirNumeros(int numero) {
        Integer i, miles, centenas, decenas, unidades;
        String romano = "";

        miles = numero / 1000;
        centenas = numero / 100 % 10;
        decenas = numero / 10 % 10;
        unidades = numero % 10;

        for (i = 1; i <= miles; i++) {
               romano = romano + "M";
        }

        if (centenas == 9) {
            romano = romano + "CM";
        } else if (centenas >= 5) {
                       romano = romano + "D";
                       for (i = 6; i <= centenas; i++) {
                              romano = romano + "C";
                       }
        } else if (centenas == 4) {
                        romano = romano + "CD";
        } else {
                    for (i = 1; i <= centenas; i++) {
                           romano = romano + "C";
                    }
        }

        if (decenas == 9) {
             romano = romano + "XC";
        } else if (decenas >= 5) {
                        romano = romano + "L";
                        for (i = 6; i <= decenas; i++) {
                              romano = romano + "X";
                        }
        } else if (decenas == 4) {
                        romano = romano + "XL";
        } else {
                      for (i = 1; i <= decenas; i++) {
                             romano = romano + "X";
                      }
        }

        if (unidades == 9) {
             romano = romano + "IX";
        } else if (unidades >= 5) {
                        romano = romano + "V";
                        for (i = 6; i <= unidades; i++) {
                               romano = romano + "I";
                        }
        } else if (unidades == 4) {
                        romano = romano + "IV";
        } else {
                    for (i = 1; i <= unidades; i++) {
                           romano = romano + "I";
                    }
        }
        return romano;
    }
    
}
