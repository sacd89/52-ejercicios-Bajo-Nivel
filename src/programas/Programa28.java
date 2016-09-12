/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package programas;

import java.util.Random;
import java.util.Scanner;

/**
 * Simular el lanzamiento de una moneda al aire e imprimir si ha salido 
 * cara o cruz.
 * 
 * @author Daniela Santillanes Castro
 */
public class Programa28 {
    
    public static void main(String[] args) {
        prog28();
    }
    
    public static void prog28(){
        Scanner in = new Scanner(System.in);
        String op = null;
        System.out.println("Lanzar moneda al aire? S/N: ");
        op = in.next();
        double moneda;	
        if (op.equals('s')||op.equals('S')){
        moneda = Math.random();		
        System.out.println(moneda);
                        if(moneda < 0.5){
                                System.out.println("Cara");
                        }
                        else {
                                System.out.println("Cruz");
                        }
                }
        else {
                System.out.println("La moneda no ha sido lanzada");
        }

    }
}
