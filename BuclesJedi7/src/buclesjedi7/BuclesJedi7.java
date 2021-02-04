package buclesjedi7;

import java.util.Scanner;

public class BuclesJedi7 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        int numero;
        int positivos = 0; // Contador de números positivos
        int negativos = 0; // Contador de números negativos
        
        for (int i = 1; i <= 10; i++) {
            System.out.print("Introduce un número: ");
            numero = lector.nextInt();
            
            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            }
        }
        
        System.out.println("Total números positivos: " + positivos);
        System.out.println("Total números negativos: " + negativos);
    }
    
}
