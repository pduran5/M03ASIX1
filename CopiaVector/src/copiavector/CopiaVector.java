/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package copiavector;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

/**
 *
 * @author Alumne
 */
public class CopiaVector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random aleatorio = new Random();
        int[] vector = new int[10];
        int[] copia = new int[10];
        
        for (int i = 0; i < vector.length; i++) {
            vector[i] = aleatorio.nextInt(11);
        }
        
//        for (int i = 0; i < vector.length; i++) {
//            copia[i] = vector[i];
//        }
        
        System.arraycopy(vector, 0, copia, 0, vector.length);
        
        System.out.print("ORIGINAL: ");
        System.out.println(Arrays.toString(vector));
        
        System.out.print("COPIA:    ");
        System.out.println(Arrays.toString(copia));
        
        //Arrays.fill(copia, 5, 10, 8);
        //System.out.println(Arrays.toString(copia));
        
        //System.out.println(Arrays.equals(vector, copia));
        
        // ORDENAR COPIA ASCENDENTE (MENOR A MAYOR)
        Arrays.sort(copia);
        System.out.print("COPIA ORD:");
        System.out.println(Arrays.toString(copia));
        
        
    }
    
}
