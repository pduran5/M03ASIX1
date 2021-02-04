/*
Desenvolupa un programa que demani 10 números i digui quin és el
major i quin és el menor.
 */
package ejercicioadicional13;

import java.util.Scanner;

/**
 *
 * @author Alumne
 */
public class EjercicioAdicional13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int numero, mayor, menor;
        
        System.out.print("Introduce el número 1: ");
        numero = lector.nextInt();
        mayor = numero;
        menor = numero;
        
        System.out.print("Introduce el número 2: ");
        numero = lector.nextInt();
        if (numero > mayor) {
            mayor = numero;
        } else if (numero < menor) {
            menor = numero;
        }
        
        System.out.print("Introduce el número 3: ");
        numero = lector.nextInt();
        if (numero > mayor) {
            mayor = numero;
        } else if (numero < menor) {
            menor = numero;
        }
        
        System.out.print("Introduce el número 4: ");
        numero = lector.nextInt();
        if (numero > mayor) {
            mayor = numero;
        } else if (numero < menor) {
            menor = numero;
        }

        System.out.print("Introduce el número 5: ");
        numero = lector.nextInt();
        if (numero > mayor) {
            mayor = numero;
        } else if (numero < menor) {
            menor = numero;
        }

        System.out.print("Introduce el número 6: ");
        numero = lector.nextInt();
        if (numero > mayor) {
            mayor = numero;
        } else if (numero < menor) {
            menor = numero;
        }

        System.out.print("Introduce el número 7: ");
        numero = lector.nextInt();
        if (numero > mayor) {
            mayor = numero;
        } else if (numero < menor) {
            menor = numero;
        }

        System.out.print("Introduce el número 8: ");
        numero = lector.nextInt();
        if (numero > mayor) {
            mayor = numero;
        } else if (numero < menor) {
            menor = numero;
        }

        System.out.print("Introduce el número 9: ");
        numero = lector.nextInt();
        if (numero > mayor) {
            mayor = numero;
        } else if (numero < menor) {
            menor = numero;
        }

        System.out.print("Introduce el número 10: ");
        numero = lector.nextInt();
        if (numero > mayor) {
            mayor = numero;
        } else if (numero < menor) {
            menor = numero;
        }
        
        System.out.println("El número menor es: " + menor);
        System.out.println("El número mayor es: " + mayor);
        
    }
    
}
