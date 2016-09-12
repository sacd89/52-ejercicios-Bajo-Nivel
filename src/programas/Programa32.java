/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package programas;

import java.util.Scanner;

/**
 * Programa que nos permita introducir un numero por teclado y sobre el se 
 * realicen las siguientes operaciones: comprobar si es primo, hallar su 
 * factorial o imprimir su tabla de multiplicar.
 * 
 * @author Daniela Santillanes Castro
 */
public class Programa32 {
    public static void main(String[] args) {
        prog32();
    }
    
    public static void prog32(){
        Scanner in = new Scanner(System.in);
        Integer numero;
        Integer factorial = 1;
        Integer multiplicacion;
        System.out.println("Introduzca un numero: ");
        Integer contador = 2;
        Boolean primo = true;
        numero = in.nextInt();
        
        System.out.println("Tabla de multiplicar");
        for (int i = 0; i <= 10; i++) {
            multiplicacion = numero * i;
            System.out.println(multiplicacion);
        }
        
        while ((primo) && contador < numero) {
            if (numero % contador == 0) {
                primo = false;
            }
            contador++;
        }
        System.out.println((primo) ? "El numero " + numero + " es primo" : 
                "El numero " + numero + " no es primo");
        while ( numero!=0) {
            factorial=factorial*numero;
            numero--;
        }
        System.out.println("Factorial: " + factorial);
        
        
    }
    
}
