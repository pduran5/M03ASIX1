/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ruavieja;

import java.util.Scanner;

/**
 *
 * @author Alumne
 */
public class Ruavieja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char sexo_primero, sexo_segundo;
        int anyos_primero, anyos_segundo;
        Scanner sc = new Scanner(System.in);
        System.out.println("Pon sexo primera persona(h/m");
        sexo_primero=sc.next().charAt(0);
        System.out.println("Pon sexo segunda persona(h/m");
        sexo_segundo=sc.next().charAt(0);
        System.out.println("Pon años del primero");
        anyos_primero=sc.nextInt();
        System.out.println("Pon años del segundo");
        anyos_segundo=sc.nextInt();
        System.out.println("Pon dias que os veis");
        int dias_ven=sc.nextInt();
        System.out.println("Estos dias son al año o al mes(a/m)");
        char mes_o_anyo=sc.next().charAt(0);
        System.out.println("horas reales que te ves en esos dias");
        int horas_dias=sc.nextInt();
        
        System.out.println("1->" + sexo_primero + " - " + anyos_primero);
        System.out.println("2->" + sexo_segundo + " - " + anyos_segundo);
        System.out.println("dias veis " + dias_ven);
        System.out.println("horas veis " + horas_dias);
        System.out.println("mes_o_anyo " + mes_o_anyo);
        
        int anyos_restantes = anyos_por_verse(sexo_primero,anyos_primero,sexo_segundo,anyos_segundo);
        System.out.println("os quedan anyos por veros " + anyos_restantes);
        
        
        int horas_totales = Horas_totales_verse(anyos_restantes,dias_ven,horas_dias,mes_o_anyo);
        System.out.println("horas totales que os veis" + horas_totales);
    }

    private static int anyos_por_verse(char sexo_primero, int anyos_primero, char sexo_segundo, int anyos_segundo) {
        int anyos1, anyos2;
        if(sexo_primero=='h')
        {
            anyos1=80-anyos_primero;
        }
        else
        {
           anyos1=86-anyos_primero; 
        }
        if(sexo_segundo=='h')
        {
            anyos2=80-anyos_segundo;
        }
        else
        {
           anyos2=86-anyos_segundo; 
        }
        System.out.println(anyos1 + "-" + anyos2);
        if(anyos1<anyos2)
        {
            return anyos1;
        }else
        {
            return anyos2;
        }
            
    }

    private static int Horas_totales_verse(int anyos_restantes, int dias_ven, int horas_dias, char mes_o_anyo) {
        int horas_totales=0;    
        if (mes_o_anyo=='a')
        {
            horas_totales= anyos_restantes*dias_ven*horas_dias;
        }
        else if (mes_o_anyo=='m')
        {
            horas_totales= anyos_restantes*(dias_ven*12)*horas_dias;
        }
        return horas_totales;
    }
    
}
