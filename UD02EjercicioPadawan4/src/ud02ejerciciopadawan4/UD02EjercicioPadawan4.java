/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ud02ejerciciopadawan4;

import java.util.Scanner;

/**
 *
 * @author Alumne
 */
public class UD02EjercicioPadawan4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        int a, b, suma, resta, producto;
        float division;
        
 
        System.out.print("Introduce un número: ");
        a = lector.nextInt();
        System.out.print("Introduce otro número: ");
        b = lector.nextInt();
        
        suma = a + b;
        resta = a - b;
        producto = a * b;
        division = (float) a / b;
        
        System.out.println("SUMA: " + suma);
        System.out.println("RESTA: " + resta);
        System.out.println("PRODUCTO: " + producto);
        System.out.println("DIVISIÓN: " + division);
    }
    
}
