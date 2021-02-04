/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caja_brawlstars;

import java.util.Random;

/**
 *
 * @author Alumne
 */
public class Caja_brawlstars {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        abrir_caja();
    }

    private static void abrir_caja() {
        Random rd = new Random();
        double valor = rd.nextDouble()*100;//esto da de 0 a 1 en decimales y asi multiplicando por 100
        //el valor va de 0 a 100
        System.out.println("-->" + valor);
        if(valor<=94.2)
        {
            System.out.println("TE ha tocado monedas");
        }else if(valor>94.2 && valor<=96.87)//2,67%
        {
            System.out.println("Brawler Especial");
        }else if(valor>96.87 && valor<=98.07) //1,20%
        {
            System.out.println("Brawler SuperEspecial");
        }else if(valor>98.07 && valor<=98.61) //0.54%
        {
            System.out.println("Epico");
        }else
        {
            System.out.println("habilidad estelar");
        }
        
    }
    
}
