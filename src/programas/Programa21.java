/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package programas;

import java.util.Scanner;

/**
 * Programa que calcule independientemente la suma de los pares y los impares 
 * de los numeros entre 1 y 1000, utilizando un switch.
 * 
 * @author Daniela Santillanes Castro
 */
public class Programa21 {
    
    public static void main(String[] args) {
        prog21();
    }
    
    public static void prog21(){
        Character par = null;
        Scanner in = new Scanner(System.in);
        String op = null;
        System.out.println("Ingrese 'p' si desea obtener la suma de los números pares."
                + "Ingrese 'i' si desea obtener la suma de los números impares");
        op = in.next();
        par = op.charAt(0);
        switch(par){
            case 'p':
                Integer sumaPares=0;
                for (int i = 1; i <= 100; i++) {
                    if(i%2==0){
                        sumaPares=sumaPares+i;
                    }
                }
                System.out.println("Suma números pares: "+ sumaPares);
                break;
            case 'i':
                Integer sumaImpares=0;
                for (int i = 1; i <= 100; i++) {
                    if(i%2==0){
                        sumaImpares=sumaImpares+i;
                    }
                }
                System.out.println("Suma números impares: "+ sumaImpares);
                break;
        }
    }
}
