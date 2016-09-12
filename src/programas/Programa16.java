package programas;

/**
 * Clase que imprime diez veces la serie de numeros del 1 al 10.
 *
 * @author Daniela Santillanes Castro
 * @version 1.0
 */
public class Programa16 {
    
    public static void main(String[] args) {
        prog16();
    }
    
    /**
     * Metodo donde imprimimos diez veces la serie de los números del 1 al 10.
     */
    public static void prog16(){
        for (int i = 1; i <= 10; i++) {
            System.out.println("Serie " + i + " : ");
            for (int j = 1; j <= 10; j++) {
                System.out.println(j);
            }
        }
    }
    
}
