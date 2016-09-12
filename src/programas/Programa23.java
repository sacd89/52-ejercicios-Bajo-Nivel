/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package programas;

/**
 * Imprimir los números del 0 al 100, controlando las filas y las columnas.
 * @author Daniela Santillanes Castro
 */
public class Programa23 {
    
    public static void main(String[] args) {
        prog23();
    }
    
    public static void prog23(){
        Integer numero = 0;
        for (int i = 1; i <= 100; i++) {
            if(i%10==0){
                System.out.print(i+ "\n");
            }else{
                System.out.print(i + " ");
            }
        }
        
        
    }
}
