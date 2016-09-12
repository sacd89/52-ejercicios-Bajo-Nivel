package programas;

import java.util.Scanner;

/**
 * Clase que lee dos números por teclado, imprime los números naturales que 
 * hay entre ambos números empezando por el m s pequeño, contar cuántos hay y 
 * cuántos de ellos son pares y calcula la suma de los impares.
 *
 * @author Daniela Santillanes Castro
 * @version 1.0
 */
public class Programa15 {
    
    public static void main(String[] args) {
        prog15();
    }
    
    /**
     * Método donde ingresamos dos números, verificamos cual de esos dos números
     * es el menor y el mayor, después checamos cuales numeros entre los dos 
     * ingresados son pares e impares, para sacar cuántos números pares hay en 
     * total y la suma de los numeros impares.
     */
    public static void prog15(){
        Scanner in = new Scanner(System.in);
        Integer num1=0, num2=0, sumaImpares=0, aux1=0, aux2=0, 
                mayor=0, menor=0;
        
        System.out.println("Ingrese un numero: ");
        num1 = in.nextInt();
        System.out.println("Ingrese otro numero: ");
        num2 = in.nextInt();
        
        if(num1>num2){
            mayor=num1;
            menor=num2;
        }else{
            menor=num1;
            mayor=num2;
        }
        System.out.println("Numeros entre es rango");
        for (int i = menor; i <= mayor; i++) {
            aux1++;
            System.out.println(i);
            if(i%2==0){
                aux2++;
            }else{
                sumaImpares=sumaImpares+i;
            }
        }
        
        System.out.println("Numeros naturales: " + aux1);
        System.out.println("Números pares: " + aux2);
        System.out.println("Suma Impares: " + sumaImpares);
    }
}
