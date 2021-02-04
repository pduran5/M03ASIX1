package condicionalsimpleej1;

import java.util.Scanner;

public class CondicionalSimpleEj1 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int edad;
        
        System.out.print("Introduce tu edad: ");
        edad = lector.nextInt();
        
        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        }
        
    }
    
}
