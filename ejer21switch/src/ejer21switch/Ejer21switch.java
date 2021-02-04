/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer21switch;

import java.util.Scanner;

/**
 *
 * @author Alumne
 */
public class Ejer21switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        char letra;
        System.out.print("Escribe m para elegir el mago electrico y e para el esbirro ");
        letra = lector.next().toUpperCase().charAt(0);
        
        switch (letra) {
            case 'M':
                System.out.println("Has escogido el mago electrico");
                break;

            case 'E':
                System.out.println("Has escogido el esbirro");
                break;

            default:
                System.out.println("No has escogido ninguna carta");
        }
    }
}
