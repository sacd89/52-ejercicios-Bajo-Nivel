package programas;

import java.util.Scanner;

/**
 * Clase que imprime tantas frases como queramos y contarlas.
 * @author Daniela Santillanes Castro
 * @version 1.0
 */
public class Programa7 {
    
    public static void main(String[] args) {
        prog7();
    }
    
    /**
     * Método donde el usuario ingresara una frase, se aumentara un contador
     * para ver cuántas frases ha ingresado el usuario, se imprimira la frase y
     * el número de frases ingresadas, le preguntaremos al
     * usuario si desea continuar, si asi lo desea, seguira
     * el ciclo, si no, se saldra del ciclo while y finaliza el método.
     */
    public static void prog7(){
        String op;
        String frase;
        Integer aux=0;
        Scanner in = new Scanner(System.in);
        
        do{
            aux++;
            System.out.println("Ingrese una frase: ");
            frase = in.next();
            System.out.println("Frase: " + frase);
            System.out.println("Desea continuar? (Si/No)");
            op = in.next();
        }while((op.equals("Si")));
        
        
        System.out.println("Se han introducido " + aux + " frases");
        
    }
    
}
