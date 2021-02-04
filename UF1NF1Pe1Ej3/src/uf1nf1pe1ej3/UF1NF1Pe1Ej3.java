/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uf1nf1pe1ej3;

import java.util.Scanner;

/**
 *
 * @author Alumne
 */
public class UF1NF1Pe1Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        float altura, largo, ancho, superficie;
        int habitaciones, totalbotes5l=0, totalbotes1l=0;

        System.out.println("HOY VOY A PINTAR LA CASA!!!");
        System.out.println("---------------------------");
        
        System.out.print("Introduce el número de habitaciones: ");
        habitaciones = lector.nextInt();
        
        for (int i = 1; i <= habitaciones; i++) {
            System.out.println("Habitación " + i);
            System.out.print("Introduce la altura: ");
            altura = lector.nextFloat();
            System.out.print("Introduce el largo: ");
            largo = lector.nextFloat();
            System.out.print("Introduce el ancho: ");
            ancho = lector.nextFloat();

            // Solo paredes y techo pero no el suelo
            superficie = largo * ancho + 2 * altura * (largo + ancho);
            
            int botespintura5l = (int) superficie / 250;
            int botespintura1l = (int) (superficie - botespintura5l * 250)/50;
            if(superficie - botespintura5l * 250 - botespintura1l * 50 > 0) {
                botespintura1l++;
            }
            
            totalbotes5l += botespintura5l;
            totalbotes1l += botespintura1l;
            
            System.out.print("Superficie: " + superficie + "m2");
            System.out.print(" - necesito " + (botespintura5l+botespintura1l) + " botes de pintura = ");
            System.out.print(botespintura5l + " botes de 5 litros + ");
            System.out.println(botespintura1l + " botes de 1 litro.");
            System.out.println("-------------------");
        }
        
        System.out.println("TOTAL " + habitaciones + " habitaciones a pintar");
        System.out.println("TOTAL botes de pintura de 5 litros = " + totalbotes5l);
        System.out.println("TOTAL botes de pintura de 1 litro1 = " + totalbotes1l);
        
        
    }
    
}
