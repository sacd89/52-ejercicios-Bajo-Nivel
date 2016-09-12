package programas;

import java.util.Scanner;

/**
 * Clase que imprime y conta los multiplos de 3 desde la unidad hasta un numero 
 * que introducimos por teclado.
 *
 * @author Daniela Santillanes Castro
 * @version 1.0
 */
public class Programa11 {
    
    public static void main(String[] args) {
        prog11();
    }
    
    /**
     * Método donde ingresamos un número por teclado, se checa si el número es
     * multiplo de 3, si lo es, se imprime y se aumenta un contador para al final
     * imprimir cuantos números multiplos de 3 se encontraron.
     */
    public static void prog11(){
        Scanner in = new Scanner(System.in);
        Integer num=0, aux=0;
        
        System.out.println("Ingrese un numero: ");
        num = in.nextInt();
        System.out.println("Numeros multiplos de 3");
        for (int i = 1; i <= num; i++) {
            if(i%3==0){
                aux++;
                System.out.println(i);
            }
        }
        
        System.out.println("Números multiplos de 3 encontrados: " + aux);

    }
    
}
