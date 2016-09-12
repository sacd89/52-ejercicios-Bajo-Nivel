package programas;

/**
 * Clase que imprime y cuenta los números que son multiplos de 2 o de 3 que 
 * hay entre 1 y 100.
 *
 * @author Daniela Santillanes Castro
 * @version 1.0
 */
public class Programa13 {
    
    public static void main(String[] args) {
        prog13();
    }
    
    /**
     * Método donde imprimimos los números multiplos de 2 y 3 que se encuentran
     * entre el 1 y el 100, y con dos contadores vemos cuántos números multiplos
     * de 2 y 3 hay respectivamente.
     */
    public static void prog13(){
        Integer mulp2=0, mulp3=0;
        
        for (int i = 1; i <= 100; i++) {
            if(i%2==0){
                mulp2++;
                System.out.println(i);
            }else if(i%3==0){
                mulp3++;
                System.out.println(i);
            }
        }
        
        System.out.println("Multiplos de 2: " + mulp2);
        System.out.println("Multiplos de 3: " + mulp3);
    }
    
}
