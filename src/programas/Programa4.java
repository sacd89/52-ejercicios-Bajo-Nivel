package programas;

/**
 * Imprime la suma de los 100 primeros números.
 * @author Daniela Santillanes Castro
 * @version 1.0
 */
public class Programa4 {
    
    public static void main(String[] args) {
        prog4();
    }
    
    public static void prog4(){
        Integer suma=0;
        for (int i = 0; i <= 100; i++) {
            suma=suma+i;
        }
        
        System.out.println("Suma: " + suma);
    }
}
