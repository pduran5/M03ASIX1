/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ud02ejerciciopadawan5;

import java.util.Scanner;

/**
 *
 * @author Alumne
 */
public class UD02EjercicioPadawan5 {

    /**
     * Esto es la función la princial
     * @param args Argumentos de entrada
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        float radio, longitud, area, volumen;
        final float PI = 3.1416F; // Definimos la constante PI
        
        // Solicitamos datos al usuario por teclado        
        System.out.print("Introduce el radio del círculo: ");
        radio = lector.nextFloat();
        
        /*
            Realizamos diferentes cálculos
            Longitud, Área y Volumen a partir de un radio
        */
        longitud = 2 * PI * radio;
        area = PI * radio * radio;
        volumen = 4 / 3 * PI * radio * radio * radio;
        
        System.out.println("LONGITUD: " + longitud);
        System.out.println("VOLUMEN: " + volumen);
        System.out.println("ÁREA: " + area);
    }
    
}
