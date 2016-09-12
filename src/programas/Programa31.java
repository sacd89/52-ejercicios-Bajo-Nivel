/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package programas;

import java.util.Scanner;

/**
 * Introducir dos nymeros por teclado y mediante un menu, calcule su suma, 
 * su resta, su multiplicacion o su division.
 * 
 * @author Daniela Santillanes Castro
 */
public class Programa31 {
    
    public static void main(String[] args) {
        prog31();
    }
    
    public static void prog31(){
        Float num1 = 0f, num2 = 0f;
        Float total = 0f;
        Character operacion = null;
        String op = null;
        Scanner in = new Scanner(System.in);
        System.out.println("Introduzca numero 1: ");
        num1 = in.nextFloat();
        System.out.println("Introduzca numero 2: ");
        num2 = in.nextFloat();
        System.out.println("Eliga una opcion:");
        System.out.println("a) Sumas numeros");
        System.out.println("b) Restar numeros");
        System.out.println("c) Multiplicar numeros");
        System.out.println("d) Dividir numeros");
        op = in.next();
        operacion = op.charAt(0);
        
        switch (operacion) {
            case 'a':
                total = num1 + num2;
                System.out.println("La suma de los numeros es: " + total);
                break;
            case 'b':
                total = num1 - num2;
                System.out.println("La suma de los numeros es: " + total);
                break;
            case 'c':
                total = num1 * num2;
                System.out.println("La suma de los numeros es: " + total);
                break;
            case 'd':
                total = num1 / num2;
                System.out.println("La suma de los numeros es: " + total);
                break;
        }
    }
}
