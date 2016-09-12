package programas;

/**
 * Clase que imprime los numeros del 100 al 0, en orden decreciente.
 * @author Daniela Santillanes Castro
 * @version 1.0
 */
public class Programa2 {
    
    public static void main(String[] args) {
        prog2();
    }
    
    /**
     * Método donde se imprimen los números del 100 al 0 en order decreciente.
     */
    public static void prog2(){
        for (int i = 100; i >= 0; i--) {
            System.out.println(i);
        }
    }
    
}
