/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ud4operadoreslogicos;

/**
 *
 * @author Alumne
 */
public class UD4OperadoresLogicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean a, b, c, d;
        
        a = true;
        b = true;
        c = false;
        d = false;
        
        System.out.println("true Y true = " + (a&&b));
        System.out.println("true Y false = " + (a&&c));
        
        System.out.println("true O true = " + (a||b));
        
        System.out.println("NO false = " + !c);
        
    }
    
}
