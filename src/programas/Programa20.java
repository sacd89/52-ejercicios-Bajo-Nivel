/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package programas;

import java.util.Scanner;

/**
 * Calcular el factorial de un numero.
 * 
 * @author Daniela Santillanes Castro
 */
public class Programa20 {
    
    public static void main(String[] args) {
        prog20();
    }
    
    public static void prog20(){
        Integer factorial = 1;
        Integer numero = 0;
        
        Scanner in = new Scanner(System.in);
        String op = null;
        System.out.println("Ingrese un número: ");
        op = in.next();
        numero = Integer.parseInt(op);
        while ( numero!=0) {
            factorial=factorial*numero;
            numero--;
        }
        
        System.out.println("Factorial: " + factorial);
    }

}
