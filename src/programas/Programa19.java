/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package programas;

import java.util.Scanner;

/**
 * Programa que simula el funcionamiento de un reloj digital y que permite
 * ponerlo en hora.
 * 
 * @author Daniela Santillanes Castro
 */
public class Programa19 {
    
    public static void main(String[] args) {
        prog19();
    }
    
    public static void prog19(){
        Integer horas = 0;
        Integer minutos = 0;
        Integer segundos = 0;
        Scanner in = new Scanner(System.in);
        String op = null;
        
        System.out.println("Introducir la hora");
        System.out.println("Hora: ");
        op = in.next();
        horas = Integer.parseInt(op);
        op = null;
        System.out.println("Minutos: ");
        op = in.next();
        minutos = Integer.parseInt(op);
        
        while(true){
            System.out.println(horas + " : " + minutos + " : " + segundos);
            segundos++;
            if(segundos == 60){
                segundos = 0;
                minutos++;
                if(minutos == 60){
                    minutos = 0;
                    horas++;
                    if(horas == 24){
                        horas = 0;
                    }
                }
            }
        }

//        for(horas=0;horas<23;horas++){
//            for(minutos=0;minutos<59;minutos++){
//                if( horas < 10 & minutos >= 10 ) // para que coloque el cero antes de la hora
//System.out.println("0" + horas + " : " + minutos);
//else if( horas < 10 & minutos < 10 ) // para colocar el cero antes de la hora y el minuto
//System.out.println("0" + horas + " : " + "0" + minutos);
//else
//System.out.println(horas + " : " + minutos); 
//            }
//        }
    }
    
}
