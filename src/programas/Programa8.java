package programas;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * Clase que solo nos permita introducir S o N.
 *
 * @author Daniela Santillanes Castro
 * @version 1.0
 */
public class Programa8 {
    
    public static void main(String[] args) {
        prog8();
    }

    /**
     * Método donde el usuario introduzira solamente S o N, mientras introduzca
     * S o N el método seguira ejecutandose, si ingresa otra letra te mandará 
     * un mensaje de error y volvera a ejecutarse el ciclo.
     */
    public static void prog8() {
        Scanner in = new Scanner(System.in);
        String op = null;
        while(op == null){
            do {
                System.out.println("Introduzca S o N");
                op = in.next();
            } while ((op.equals("S")) || (op.equals("s")) || (op.equals("N")) || (op.equals("n")));
            if(!((op == "S") || (op == "s") || (op == "N") || (op == "n"))){
                System.out.println("Solo puedes introducir S o N");
                op = null;
            }
        }
    }

}
