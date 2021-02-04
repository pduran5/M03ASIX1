/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buclesjedi6;

import java.util.Scanner;

/**
 *
 * @author Alumne
 */
public class BuclesJedi6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int num;
        
        for (int i = 1; i <= 10; i++) {
            System.out.print("Introduce el número " + i +  ": ");
            num = lector.nextInt(); 
        }
        
        
        
    }
    
}
