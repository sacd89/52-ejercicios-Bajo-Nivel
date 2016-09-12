package programas;

import java.util.Scanner;

/**
 * Clase que leera un número por teclado, que nos diga si es positivo o negativo.
 *
 * @author Daniela Santillanes Castro
 * @version 1.0
 */
public class Programa9 {
    
    public static void main(String[] args) {
        prog9();
    }
    
    /**
     * Método donde el usuario ingresara un número ya sea positivo o negativo
     * entero, y nos dira si ese número ingresado es positivo o negativo.
     */
    public static void prog9(){
        Scanner in = new Scanner(System.in);
        Integer num=0;
        
        System.out.println("Ingrese un numero(positivo o negativo): ");
        num = in.nextInt();
        
        if(num>0){
            System.out.println("El número ingresado es positivo.");
        }else{
            System.out.println("El número ingresado es negativo.");
        }
    }
    
}
