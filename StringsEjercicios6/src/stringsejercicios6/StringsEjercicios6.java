package stringsejercicios6;

import java.util.Scanner;

public class StringsEjercicios6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        int contador = 0;
        
        System.out.print("Introduce una palabra: ");
        String entrada = lector.nextLine();
        
        for (int i = 0; i < entrada.length(); i++) {
            if (i==0 && entrada.charAt(0) == 'A') {
                contador++;
            } else if (entrada.charAt(i) == 'A' && entrada.charAt(i-1) != 'A') {
                contador++;
            }
        }
        
        System.out.println("Se ha encontrado " + contador + " letras As no consecutivas");
    }
    
}
0