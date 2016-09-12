/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package programas;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * Introducir una frase por teclado. Imprimirla en el centro de la pantalla.
 * @author Daniela Santillanes Castro
 */
public class Programa26 {
    
    public static void main(String[] args) {
        prog26();
    }
    
    public static void prog26(){
        Scanner in = new Scanner(System.in);
        String op = null;
        System.out.println("Introduzca una frase: ");
        op = in.next();
        JOptionPane.showMessageDialog(null,op);
        
    }
}
