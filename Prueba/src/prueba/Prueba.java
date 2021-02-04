/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import java.util.Scanner;

/**
 *
 * @author Alumne
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int num;
        boolean negativo;
        do {
            System.out.print("Introduce un número: ");
            num = lector.nextInt();
            if (num < 0) {
                negativo = true;
            } else {
                negativo = false;
            }
        } while (num == 0);
        if (negativo == true) {
            System.out.println("Se ha encontrado un negativo");
        } else {
            System.out.println("Todos los números son positivos");
        }
    }
    
}
