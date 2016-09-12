package programas;

/**
 * Clase que imprime los numeros del 1 al 100, que calcula la 
 * suma de todos los numeros pares por un lado, y por otro, la de todos los 
 * impares.
 *
 * @author Daniela Santillanes Castro
 * @version 1.0
 */
public class Programa12 {
    
    public static void main(String[] args) {
        prog12();
    }
    
    /**
     * Método donde imprimimos los números del 1 al 100, después mediante un
     * metodo if verificamos si es par o impar, dependiendo de que sea se le
     * sumara en su respectiva suma y se imprimira el resultado final de dichas
     * sumas.
     */
    public static void prog12(){
        Integer sumaPares=0;
        Integer sumaImpares=0;
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
            if(i%2==0){
                sumaPares=sumaPares+i;
            }else{
                sumaImpares=sumaImpares+i;
            }
        }
        System.out.println("Suma pares = " + sumaPares);
        System.out.println("Suma impares = " + sumaImpares);
    }
    
}
