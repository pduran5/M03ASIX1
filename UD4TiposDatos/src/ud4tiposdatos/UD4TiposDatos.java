/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ud4tiposdatos;

/**
 *
 * @author Alumne
 */
public class UD4TiposDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // POST INCREMENTO
        int valor = 1;
        valor++; // valor = valor + 1
        System.out.println("Paso 1: " + valor); // valor = 2
        
        System.out.println("Paso 2: " + valor++); // se imprime 2 y valor al final vale 3 
        // System.out.printl(valor);
        // valor++;
        
        System.out.println("Paso 3: " + valor); // valor = 3
        
        // PRE INCREMENTO
        int numero = 1;
        
        System.out.println("PASO 1: " + numero); //se imprime 1
        
        System.out.println("PASO 2: " + ++numero); // se imprime 2
    }
}
