/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diversionconbanderas;

import java.util.Scanner;

/**
 *
 * @author Alumne
 */
public class DiversionConBanderas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        char entrada;
        boolean bachillerato, selectividad;
        
        System.out.print("¿Tienes bachillerato aprobado (S/N)?");
        entrada = lector.next().toUpperCase().charAt(0);
        
        bachillerato = entrada == 'S' ? true : false;
        
        System.out.print("¿Tienes las PAU aprobadas (S/N)?");
        entrada = lector.next().toUpperCase().charAt(0);
        
        if (entrada == 'S') {
            selectividad = true;
        } else {
            selectividad = false;
        }
        
        if (bachillerato && selectividad) {
            System.out.println("Puedes acceder a la Universidad");
        }
        
    }
    
}
