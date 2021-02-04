/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerosaleatorios;

import java.util.Random;

/**
 *
 * @author Alumne
 */
public class NumerosAleatorios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random aleatorio = new Random();
        
        // Devuelve aleatorio entre el 0 y 49
        int numero = aleatorio.nextInt(50);
        
        System.out.println(numero);
        
        // Devuelve aleatorio entre el 1 y 50
        numero = aleatorio.nextInt(50)+1;
        
        // Devuelve aleatorio entre el 25 y 51
        // numero = aleatorio.nextInt(final-inicio+1)+inicio
        numero = aleatorio.nextInt(51-25+1)+25;
        
    }
    
}
