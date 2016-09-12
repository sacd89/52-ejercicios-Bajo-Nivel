/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programas;

import java.util.Scanner;

/**
 * Comprobar si un numero mayor o igual que la unidad es primo.
 *
 * @author Daniela Santillanes Castro
 */
public class Programa24 {
    
    public static void main(String[] args) {
        prog24();
    }

    public static void prog24() {
        int numero, contador = 2;
        boolean primo = true;
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese un numero : ");
        numero = in.nextInt();
        while ((primo) && contador < numero) {
            if (numero % contador == 0) {
                primo = false;
            }
            contador++;
        }
        System.out.println((primo) ? "El numero " + numero + " es primo" : 
                "El numero " + numero + " no es primo");
    }
}
