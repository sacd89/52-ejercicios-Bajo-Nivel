package programas;

import java.util.Scanner;

/**
 * Clase que imprime el mayor y el menor de una serie de cinco números que 
 * vamos introduciendo por teclado.
 *
 * @author Daniela Santillanes Castro
 * @version 1.0
 */
public class Programa14 {
    
    public static void main(String[] args) {
        prog14();
    }
    
    /**
     * Método donde ingresamos 5 números, después vamos checando si el número
     * ingresado es mayor o menos al siguiente hasta que termine de ingresar
     * los 5 números, al final imprimimos el número mayor y el menor.
     */
    public static void prog14(){
        Scanner in = new Scanner(System.in);
        Integer mayor= -99999, menor=99999;
        Integer num[] = new Integer[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Numero " + (i+1) + " : ");
            num[i]= in.nextInt();
            if(num[i]<menor){
                menor=num[i];
            }else if(num[i]>mayor){
                mayor=num[i];
            }
        }
        
        System.out.println("El número mayor ingresado es: " + mayor);
        System.out.println("El número menor ingresado es: " + menor);
    }
    
}
