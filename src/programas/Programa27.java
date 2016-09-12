/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programas;

import java.util.Scanner;

/**
 * Realizar la tabla de multiplicar de un numero entre 0 y 10.
 *
 * @author Daniela Santillanes Castro
 */
public class Programa27 {
    
    public static void main(String[] args) {
        prog27();
    }

    public static void prog27() {
        Integer numeros = 0;
        Integer multiplicar;
        Scanner in = new Scanner(System.in);
        System.out.println("Introduzca la tabla que quiere ver del 0 al 10(numero): ");
        numeros = in.nextInt();
        do {
            switch (numeros) {
                case 0:
                    System.out.println("\nTabla 0");
                    for (int i = 0; i <= 10; i++) {
                        multiplicar = 0 * i;
                        System.out.println(multiplicar);
                    }
                    break;
                case 1:
                    System.out.println("\nTabla 1");
                    for (int i = 0; i <= 10; i++) {
                        multiplicar = 1 * i;
                        System.out.println(multiplicar);
                    }
                    break;
                case 2:
                    System.out.println("\nTabla 2");
                    for (int i = 0; i <= 10; i++) {
                        multiplicar = 2 * i;
                        System.out.println(multiplicar);
                    }
                    break;
                case 3:
                    System.out.println("\nTabla 3");
                    for (int i = 0; i <= 10; i++) {
                        multiplicar = 3 * i;
                        System.out.println(multiplicar);
                    }
                    break;
                case 4:
                    System.out.println("\nTabla 4");
                    for (int i = 0; i <= 10; i++) {
                        multiplicar = 4 * i;
                        System.out.println(multiplicar);
                    }
                    break;
                case 5:
                    System.out.println("\nTabla 5");
                    for (int i = 0; i <= 10; i++) {
                        multiplicar = 5 * i;
                        System.out.println(multiplicar);
                    }
                    break;
                case 6:
                    System.out.println("\nTabla 6");
                    for (int i = 0; i <= 10; i++) {
                        multiplicar = 6 * i;
                        System.out.println(multiplicar);
                    }
                    break;
                case 7:
                    System.out.println("\nTabla 7");
                    for (int i = 0; i <= 10; i++) {
                        multiplicar = 7 * i;
                        System.out.println(multiplicar);
                    }
                    break;
                case 8:
                    System.out.println("\nTabla 8");
                    for (int i = 0; i <= 10; i++) {
                        multiplicar = 8 * i;
                        System.out.println(multiplicar);
                    }
                    break;
                case 9:
                    System.out.println("\nTabla 9");
                    for (int i = 0; i <= 10; i++) {
                        multiplicar = 9 * i;
                        System.out.println(multiplicar);
                    }
                    break;
                case 10:
                    System.out.println("\nTabla 10");
                    for (int i = 0; i <= 10; i++) {
                        multiplicar = 10 * i;
                        System.out.println(multiplicar);
                    }
                    break;
            }
        } while (numeros < 0 && numeros > 10);
    }
}
