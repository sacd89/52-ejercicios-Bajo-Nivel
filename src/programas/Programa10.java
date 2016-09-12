package programas;

import java.util.Scanner;

/**
 * Clase que leera un número por teclado y que nos diga si es par o impar.
 *
 * @author Daniela Santillanes Castro
 * @version 1.0
 */
public class Programa10 {
    
    public static void main(String[] args) {
        prog10();
    }
    
    public static void prog10(){
        Scanner in = new Scanner(System.in);
        Integer num=0;
        
        System.out.println("Introduzca un número: ");
        num = in.nextInt();
        
        if(num%2==0){
            System.out.println("El número ingresado es par.");
        }else{
            System.out.println("El número ingresado es impar");
        }
    }
    
}
