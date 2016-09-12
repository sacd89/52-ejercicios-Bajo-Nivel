package programas;

import java.util.Scanner;

/**
 * Clase que cuenta las veces que aparece una determinada letra en una frase 
 * que introduciremos por teclado.
 *
 * @author Daniela Santillanes Castro
 * @version 1.0
 */
public class Programa18 {
    
    public static void main(String[] args) {
        prog18();
    }
    
    public static void prog18(){
        Scanner in = new Scanner(System.in);
        Integer aux = 0;
        String frase;
        String letra;
        
        System.out.println("Ingrese una frase: ");
        frase = in.next();
        
        System.out.println("Ingrese la letra que desea contar dentro de su frase: ");
        letra = in.next();
        
        for (int i = 1; i <= frase.length(); i++) {
            if(frase.substring(i-1,i).equals(letra)){
                aux++;
            }
        }
        
        System.out.println("La letra " + letra + " se introdujo " + aux + " veces.");
    }
    
}
