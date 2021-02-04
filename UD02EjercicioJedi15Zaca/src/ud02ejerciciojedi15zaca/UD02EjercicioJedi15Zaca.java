package ud02ejerciciojedi15zaca;

import java.util.Scanner;

public class UD02EjercicioJedi15Zaca {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int num1, num2, num3;
        System.out.print("Introduce el primer numero: ");
        num1 = lector.nextInt();
        System.out.print("Introduce el segundo numero: ");
        num2 = lector.nextInt();
        System.out.print("Introduce el tercer numero: ");
        num3 = lector.nextInt();
        if (num1 > num2 && num1 > num3) {
            System.out.print("El numero mas grande es el " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("El numero mas grande es el " + num2);
        } else {
            System.out.println("El numero mas grande es el " + num3);
        }
    }
    
}
