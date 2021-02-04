/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package copiavector2;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Alumne
 */
public class CopiaVector2 {

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
        
        
        Arrays.toString(copia);
    }
    
}
