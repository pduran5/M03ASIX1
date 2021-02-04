/*
15. Dibuja un ordinograma que lea tres números distintos y nos diga cuál es el mayor.
 */
package ud02ejerciciojedi15b;

import java.util.Scanner;

public class UD02EjercicioJedi15b {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int num1, num2, num3;
        
        System.out.print("Introduce el primer número: ");
        num1 = lector.nextInt();
        
        System.out.print("Introduce el segundo número: ");
        num2 = lector.nextInt();
        
        System.out.print("Introduce el tercer número: ");
        num3 = lector.nextInt();
        
        if (num1 > num2) {
            if (num1 > num3) {
                // 6 4 2
                System.out.println("MAYOR: " + num1);
            } else {
                // 4 2 6
                System.out.println("MAYOR: " + num3);
            }
        } else {
            if (num2 > num3) {
                // 2 6 4
                System.out.println("MAYOR: " + num2);
            } else {
                // 2 4 6
                System.out.println("MAYOR: " + num3);
            }
        }
    }
}
