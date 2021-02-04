/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imc;

import java.util.Scanner;

/**
 *
 * @author Alumne
 */
public class IMC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int peso_usuario;
        double altura_usuario;
        
        peso_usuario=pedir_peso();
        System.out.println("pesas " + peso_usuario);
        altura_usuario=pedir_altura();
        System.out.println("altura " + altura_usuario);
        double IMC = calcular_imc(peso_usuario,altura_usuario);
        System.out.println("el indice es"+ IMC);
        resultado(IMC);
    }
    
    public static int pedir_peso()
    {
        Scanner sc = new Scanner(System.in);
        
        int peso;
        do{
            System.out.println("Pon tu peso en kg debe ser positivo");
            peso=sc.nextInt();            
        }while(peso<=0);
        
        
        return peso;
           
    }
    
    public static double pedir_altura()
    {
        Scanner sc = new Scanner(System.in);
        
        double altura;
        do{
            System.out.println("Pon tu altura  en metros con decimales debe ser positivo");
            altura=sc.nextDouble();            
        }while(altura<=0);

        return altura;
           
    }    

    private static double calcular_imc(int peso_usuario, double altura_usuario) {
        double indice = (double) peso_usuario/(altura_usuario*altura_usuario);
        return indice;
    }
 
    private static void resultado(double IMC)
    {
        if (IMC<18.5)
        {
            System.out.println("insuficencia ponderal");
        }else if(IMC>=18.5 && IMC <25)
        {
            System.out.println("normal");
        }else if(IMC>=25 && IMC<30)
        {
            System.out.println("sobrepeso");
        }
        else
        {
            System.out.println("Obesidad");
        }
        
    }
}
