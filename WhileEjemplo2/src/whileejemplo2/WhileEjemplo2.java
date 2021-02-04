package whileejemplo2;

import java.util.Scanner;

public class WhileEjemplo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int fin;
        
        System.out.print("Introduce un número: ");
        fin = lector.nextInt();
        
        int i = 1;
        
        while (i<=fin) {
            System.out.println(i);
            i++;
        }
        
    }
    
}
