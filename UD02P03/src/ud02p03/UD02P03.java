/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ud02p03;

import java.util.Scanner;

/**
 *
 * @author Alumne
 */
public class UD02P03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        int lado, area;
        
        System.out.print("Introduce el lado del rectángulo: ");
        lado = lector.nextInt();
        
        area = lado * lado;
        System.out.println("El área del rectángulo es: " + area);
        
        
    }
    
}
