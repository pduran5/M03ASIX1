/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploarray1;

/**
 *
 * @author Alumne
 */
public class Ejemploarray1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] armario = new int[6];
        armario[0] = 20;
        armario[1] = 18;
        armario[2] = 23;
        armario[3] = 19;
        armario[4] = 19;
        armario[5] = 20;
        System.out.println("Total cajones: " + armario.length);
        
//        // Recorrer array
//        for (int i = 0; i < armario.length; i++) {
//            System.out.println(armario[i]);
//        }
//        
//        // Recorrer array inverso
//        for (int i = armario.length - 1; i >= 0; i--) {
//            System.out.println(armario[i]);
//        }
//        
        // Actualizado edades 1 año
        for (int i = 0; i < armario.length; i++) {
            armario[i] = armario[i] + 1;
        }
        
        for (int i = 0; i < armario.length; i++) {
            System.out.println(armario[i]);
        }
//        
//        // foreach
//        for (int cajon : armario) {
//            System.out.println(cajon);
//        }
    }
    
}
