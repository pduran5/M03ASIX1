/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayjedi12;

import java.util.Scanner;

/**
 *
 * @author Alumne
 */
public class ArrayJedi12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int[] array = new int[10];
        
        char opcion;
        
        do {
            imprimirMenu();
            opcion = lector.next().charAt(0);

            switch (opcion) {
                case 'a': 
                    mostrarValores(array);
                    break;
                case 'b': 
                    introducirValor(array);
                    break;
                case 'c': break;
            }
        } while(opcion != 'c');
    }

    private static void introducirValor(int[] array) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Introduce el valor V: ");
        int V = lector.nextInt();
        System.out.print("Introduce la posición P: ");
        int P = lector.nextInt();
        array[P-1] = V;
    }

    private static void mostrarValores(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }

    private static void imprimirMenu() {
        System.out.println("a.Mostrar valores");
        System.out.println("b.Introducir valor");
        System.out.println("c.Salir");
        System.out.print("Introduce una opción: ");
    }
    
}
