/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m03uf2nf1ruleta;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Alumne
 */
public class M03UF2NF1Ruleta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int saldo = 100;
        int aposta = 50;
        int tipus;
        System.out.printf("El teu saldo actual és: %d\n", saldo);
        while (apostaPunts(saldo, aposta) != -1) {
            tipus = tipusAposta();
            saldo = joc(tipus, saldo, aposta);
            System.out.printf("El teu saldo actual és: %d\n", saldo);
        }
    }
    
        /**
     * Funció pintaAsterisc: Fes una funció que rebi per paràmetre un número
     * sencer i pinti per pantalla tants asteriscs com el número.
     *
     * @numero: sencer que indica el nº d'asteriscs
     *
     * Aclaració: aquest procediment només pinta una línia d'asterisc (com a separador)
     */
    static void pintaAsterisc(int numero) {
        for (int i = 0; i < numero; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    /**
     * Funció aleatori: Dissenya una funció que ens retorni un número aleatori
     * entre el 0 i el 36 inclosos
     *
     * @return : nº sencer entre 0 i 36
     */
    static int aleatori() {
        Random aleatori = new Random();
        return aleatori.nextInt(37);
    }

    /**
     * Funció: tipusAposta Dissenya una funció que demani a l'usuari quin tipus
     * d'aposta vol fer
     *
     * @return : Nº sencer -1 : aposta és SENAR -2: aposta és PARELL 1 i 36 quan
     * aposta per un número
     *
     */
    static int tipusAposta() {
        Scanner lector = new Scanner(System.in);
        int opcion, tipusAposta;
        boolean opcionCorrecta = false;
        
        do {
            // Preguntar al usuario por las 3 opciones de apuesta
            System.out.println("Escoge una de las siguientes apuestas:");
            System.out.println("1. Apuesta por PAR");
            System.out.println("2. Apuesta por IMPAR");
            System.out.println("3. Apuesta por número entre el 1 y 36");
            System.out.print("Introduce una opción: ");
            opcion = lector.nextInt();
            
            if (opcion >=1 && opcion<=3) {
                opcionCorrecta = true;
            } else {
                System.out.println("OPCIÓN INCORRECTA");
            }
            
        } while(!opcionCorrecta);
        
        
        if (opcion == 1) {
            tipusAposta = -2; // Apuesta por PAR
        } else if (opcion == 2) {
            tipusAposta = -1; // Apuesta por IMPAR
        } else {
            // APUESTA POR UN NUMERO ENTRE 1 y 36
            int numero;
            do {
                System.out.print("Introduce el número a apostar (1-36): ");
                numero = lector.nextInt();
            } while (numero < 1 || numero > 36);
            tipusAposta = numero;
        }
        
        return tipusAposta;
    }

    /**
     * Funcio: apostaPunts Dissenya una funció que demani a l'usuari quants
     * punts vol apostar i els retorni.No pot apostar més punts dels que
     * disposa.
     *
     * @puntsTotal : Nº sencer de punts total de l'usuari
     * @puntsAposta : Nº sencer de punts que aposta
     *
     * @return : nº sencer -1 quan puntsTotal es menor a la aposta retorna els
     * puntsAposta
     */
    static int apostaPunts(int puntsTotal, int puntsAposta) {
//        Scanner lector = new Scanner(System.in);
//        
//        System.out.print("Introduce tu apuesta: ");
//        int apuesta = lector.nextInt();
//        
        int puntos;
        
        // Si intenta apostar más de lo que tienes, devuelve -1
        if (puntsAposta > puntsTotal) {
            puntos = -1;
        } else {
            puntos = puntsAposta;
        }
        
        return puntos;
    }

    /**
     * Dissenya una funció que faci joc amb l'aposta: La funció ha de rebre per
     * paràmetre:
     *
     * @tipusAposta : sencer amb quin tipus d'aposta farà.
     * @saldo : sencer amb el saldo actual de punts.
     * @puntsAposta : sencer quantitat de punts aposta.
     *
     *
     * @return : sencer torna el saldo de punts que ens queda després de fer
     * l'aposta
     *

     // si el nº de la ruleta és parell guanya x2
     // si el nº de la ruleta és senar guanya x2
     // si el nº de la ruleta és = x 36
     */
    static int joc(int tipusAposta, int saldo, int puntsAposta) {
        saldo -= puntsAposta;        
        
        int numeroRuleta;
        numeroRuleta = aleatori();
       
        System.out.println("El número de la Ruleta es: " + numeroRuleta);
        
        switch (tipusAposta) {
            case -1: // IMPAR
                if (numeroRuleta % 2 == 1) {
                    saldo += puntsAposta*2;
                }
                break;
            case -2: // PAR
                if (numeroRuleta % 2 == 0) {
                    saldo += puntsAposta*2;
                }
                break;
            default: // HA APOSTADO POR UN NUMERO (1-36)
                if (numeroRuleta == tipusAposta) {
                    saldo += puntsAposta * 36;
                }
        }
        
        return saldo;
    }

    // PARTE AMPLIACIÓN

    /**
     * Funció QuantitatAposta: Demana per teclat quina quantitat vol apostar
     *
     * @return : nº sencer amb la quantitat que vol apostar 0 si no vol apostar
     * més
     *
     */

    /**
     * Funció AfegirPunts: Demana per teclat quants punts volem afegir al Saldo
     *
     * @saldo : Rep el saldo total del que disposa
     *
     * @return : Retorna el Saldo + el nº de punts que ha ingressat
     *
     */
    
}
