package buclesjedi5;

import java.util.Scanner;

public class BuclesJedi5 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        long num, factorial = 1;
        
        System.out.print("Introduce un número: ");
        num = lector.nextLong();
        
        if (num >= 0) {
            for (long i = num; i >= 1; i--) {
                factorial = factorial * i; // factorial *= num
            }
            System.out.println("El factorial de " + num + " es " + factorial);
        } else {
            System.out.println("ERROR. El número no es positivo");
        }50
                5050
        
    }
    
}
