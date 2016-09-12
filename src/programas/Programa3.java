package programas;

/**
 * Clase que imprime los números pares entre 0 y 100.
 * @author Daniela Santillanes Castro
 * @version 1.0
 */
public class Programa3 {
    
    public static void main(String[] args) {
        prog3();
    }
    
    /**
     * Método donde se imprimen los números pares entre el 0 y el 100.
     */
    public static void prog3(){
        for (int i = 0; i <= 100; i++) {
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}
