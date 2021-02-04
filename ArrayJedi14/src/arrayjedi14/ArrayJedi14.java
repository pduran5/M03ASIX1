/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayjedi14;

/**
 *
 * @author Alumne
 */
public class ArrayJedi14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int total = calcularTotalArray();
        
        int[] array = new int[total];
        
        rellenarArray(array);
        
        imprimirArray(array);
    }

    private static int calcularTotalArray() {
        int total = 0;
        for (int i = 1; i < 11; i++) {
            total = total + i;
        }
        return total;
    }

    private static void rellenarArray(int[] array) {
        int posicion = 0;
        
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                array[posicion] = i;
                posicion++;
            }
        }
    }

    private static void imprimirArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
    
}
