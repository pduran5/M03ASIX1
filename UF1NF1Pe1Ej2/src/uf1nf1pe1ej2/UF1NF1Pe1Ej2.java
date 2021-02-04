/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uf1nf1pe1ej2;

import java.util.Scanner;

/**
 *
 * @author Alumne
 */
public class UF1NF1Pe1Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int opcion;
        
        do {
            System.out.println("****** MENÚ ******");
            System.out.println("0-Salir");
            System.out.println("1-Escribir 15 veces");
            System.out.println("2-Cuenta atrás GONG");
            System.out.println("3-Número impares entre 2 valores");
            System.out.print("Elige tu opción: ");
            
            opcion = lector.nextInt();
            
            switch (opcion) {
                case 0:
                    System.out.println("Fin del programa");
                    System.out.println("Muchas gracias");
                    break;
                case 1:
                    for (int i = 1; i <= 15; i++) {
                        System.out.println(i + " A clase se viene a trabajar");
                    }
                    break;
                case 2:
                    for (int i = 10; i >= 0; i--) {
                        System.out.print(i + " ");
                    }
                    System.out.println("GOONNGGGG!!!!!");
                    break;
                case 3:
                    System.out.print("Introduce un número: ");
                    int numero1 = lector.nextInt();
                    System.out.print("Introduce otro número: ");
                    int numero2 = lector.nextInt();
                    
                    int max, min;
                    
                    if (numero1 > numero2) {
                        max = numero1;
                        min = numero2;
                    } else {
                        max = numero2;
                        min = numero1;
                    }
                    
                    for (int i = min; i <= max; i++) {
                        if (i%2 != 0) {
                            System.out.print(i + " ");
                        }
                    }
                    System.out.println("");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (opcion != 0);

    }

}
