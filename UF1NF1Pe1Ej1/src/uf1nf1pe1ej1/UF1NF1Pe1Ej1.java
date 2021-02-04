/*
Escribe un programa que pida números al usuario. El programa pedirá valores
numéricos al usuario, y parará cuando lleve 3 números introducidos que sean
divisibles por 5.
Al terminar, debe mostrar cuántos números has introducido en total, y debe
mostrar la suma de los 3 números divisibles por 5.

 */
package uf1nf1pe1ej1;

import java.util.Scanner;

/**
 *
 * @author Profe
 */
public class UF1NF1Pe1Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        int numero, suma = 0, contadortotal = 0, contadormultiplos = 0;

        do {
            System.out.print("Introduce número? ");
            numero = lector.nextInt();
            contadortotal++;
            
            if(numero%5==0) {
                contadormultiplos++;
                suma += numero;
            }
        } while(contadormultiplos<3);
        
        System.out.println("Has introducido en total " + contadortotal + " números");
        System.out.println("La suma total de los divisibles entre 5 suman " + suma);
    }
}
