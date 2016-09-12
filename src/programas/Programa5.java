package programas;

/**
 * Clase que imprime los números impares hasta el 100 y que imprima cuántos 
 * impares hay.
 * @author Daniela Santillanes Castro
 * @version 1.0
 */
public class Programa5 {
    
    public static void main(String[] args) {
        prog5();
    }
    
    /**
     * Método donde imprime los números impares y cuántos números impares 
     * existen.
     */
    public static void prog5(){
        Integer aux=0;
        for (int i = 0; i <= 100; i++) {
            if(!(i%2==0)){
                System.out.println(i);
                aux++;
            }
        }
        System.out.println("Número total de impares = " + aux);
    }
    
}
