/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leertextoteclado;

import java.util.Scanner;

/**
 *
 * @author Alumne
 */
public class LeerTextoTeclado {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String nombre;
        
        System.out.print("Introduce nombre y apellidos: ");
        nombre = lector.next();
        
        System.out.print(nombre);
    }
    
}
