/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayreversedsort;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

/**
 *
 * @author Alumne
 */
public class ArrayReversedSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random aleatorio = new Random();
        
        int[] vector = new int[10];
        
        for (int i = 0; i < vector.length; i++) {
            vector[i] = aleatorio.nextInt(11);
        }      
        
        int[] vectorInvertido = Arrays.stream(vector).boxed()
            .sorted(Collections.reverseOrder())
            .mapToInt(Integer::intValue)
            .toArray();
        
        System.out.println(Arrays.toString(vectorInvertido));
    }
}
