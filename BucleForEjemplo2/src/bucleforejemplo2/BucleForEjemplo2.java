/*
Ejemplo 2: Programa que muestra los números naturales (1,2,3,4,5,6,...)
hasta un número introducido por teclado
 */
package bucleforejemplo2;

import java.util.Scanner;


public class BucleForEjemplo2 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int fin;
        
        System.out.print("Introduce un número: ");
        fin = lector.nextInt();
        
        for (int i = 1; i <= fin; i++) {
            System.out.println(i);
        }
    }
    
}
