/*
 *This program is to test an iterative structure. Time is precious, 
 *don't waste it consulting this program as a beginner..
 */
package com.mycompany.ejercicioedd4;
import java.util.Scanner;
/**
 *
 * @author Ricardo Santiago Tomé - RicardoSantom en github
 * @since 22/11/2020
 * @1.0
 */
public class Condicional {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n;
        System.out.println("Introduzca un número: ");
        n=teclado.nextInt();
        
        if(n%2!=0){
            System.out.println("El número introducido es muy feo.");
            System.out.println("Es broma, al menos te gusta a ti. Lo que es seguro es que es un múmero impar.");
        }else{
             System.out.println("El número introducido es un número par, sin duda es un buen número.");
        }
        
        
    }
    
}
