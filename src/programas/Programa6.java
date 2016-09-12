package programas;

import java.util.Scanner;

/**
 * Clase que imprime todos los números naturales que hay 
 * desde la unidad hasta un número que introducimos por teclado.
 * @author Daniela Santillanes Castro
 * @version 1.0
 */
public class Programa6 {
    
    public static void main(String[] args) {
        prog6();
    }
    
    /**
     * Método donde le pedimos al usuario introducir un número, despues se 
     * imprimiran los números naturales hasta el número ingresado por el usuario.
     */
    public static void prog6(){
        Integer num=0;
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Ingrese un numero: ");
        num = in.nextInt();
        System.out.println("Numero naturales: ");
        for (int i = 0; i <= num; i++) {
            System.out.println(i);
        }
    }
    
}
