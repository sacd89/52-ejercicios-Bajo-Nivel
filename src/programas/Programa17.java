package programas;

import java.util.Scanner;

/**
 * Clase que imprime, cuenta y suma los multiplos de 2 que hay entre una serie
 * de números, tal que el segundo sea mayor o igual que el primero.
 *
 * @author Daniela Santillanes Castro
 * @version 1.0
 */
public class Programa17 {
    
    public static void main(String[] args) {
        prog17();
    }

    /**
     * Método donde ingresamos dos números tales que el segundo número ingresado
     * sea mayor o igual que el primero, despues checamos cuales son multiplos
     * de dos y de esos que sean multiplos de dos los contamos y los vamos
     * sumando.
     */
    public static void prog17() {
        Scanner in = new Scanner(System.in);
        Integer num1 = 0, num2 = 0, aux = 0, suma = 0;

        System.out.println("Ingrese un numero: ");
        num1 = in.nextInt();
        do {
            System.out.println("Ingrese otro numero: ");
            num2 = in.nextInt();
        } while (num2 < num1);

        if (num1 == num2) {
            if (num1 % 2 == 0) {
                System.out.println(num1);
                System.out.println("Numeros multiplos de dos totales: 1");
                System.out.println("Suma multiplos de dos: " + num1);
            } else {
                System.out.println("No se encontraron numero multiplos de dos");
            }
        } else {
            System.out.println("Multiplos de dos");
            for (int i = num1; i < num2; i++) {
                if (i % 2 == 0) {
                    aux++;
                    suma = suma + i;
                    System.out.println(i);
                }
            }
            System.out.println("Numeros multiplos de dos totales: " + aux);
            System.out.println("Suma multiplos de dos: " + suma);
        }
    }

}
