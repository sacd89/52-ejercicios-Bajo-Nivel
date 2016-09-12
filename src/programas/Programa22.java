/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package programas;

import java.util.Scanner;

/**
 * Introducir una frase por teclado.Imprimirla cinco veces en filas 
 * consecutivas, pero cada impresion ir desplazada cuatro columnas hacia 
 * la derecha.
 * 
 * @author Daniela Santillanes Castro
 */
public class Programa22 {
    
    public static void main(String[] args) {
        prog22();
    }
    
    public static void prog22(){
        Scanner in = new Scanner(System.in);
        String op = null;
        System.out.println("Introduzca una frase: ");
        op = in.next();
        System.out.println(op + "\t" + op + "\t" + op
        + "\t" + op
        + "\t" + op);
    }
}
