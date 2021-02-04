/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buclesjedi6v2;

import java.util.Scanner;

/**
 *
 * @author Alumne
 */
public class BuclesJedi6v2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int num;
        boolean negativo = false;
        
        for (int i = 1; i <= 10; i++) {
            System.out.print("Introduce el número " + i +  ": ");
            num = lector.nextInt();
            
            // Si el número es negativo, levanto la bandera
            if (num < 0) {
                negativo = true;
            }
        }
        
        // Comprobar si la bandera está levantada
        // Eso significa que ha encontrado algún número negativo
        if (negativo == true) {
            System.out.println("Se ha encontrado algún número negativo");
        } else {
            System.out.println("No se ha encontrado ningún negativo");
        }
        
        
        
    }
    
}
