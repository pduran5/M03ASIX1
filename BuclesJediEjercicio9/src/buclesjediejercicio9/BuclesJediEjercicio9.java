/*
Realiza un programa que pida introducir tres valores enteros y nos diga cuál de
ellos es el más elevado. Impleméntalo creando únicamente una función a la que le
pasemos dos valores (no tres) y nos devuelva el máximo de los dos valores.
*/

package buclesjediejercicio9;

import java.util.Scanner;

/**
 *
 * @author Alumne
 */
public class BuclesJediEjercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        System.out.print("Indica cuántos números quieres comparar para obtener el máximo: ");
        int total = lector.nextInt();
        
        System.out.print("Introduce el número 1: ");
        int n1 = lector.nextInt();
        int max = 0;

        for (int i = 2; i <= total; i++) {
            System.out.print("Introduce el número " + i + ": ");
            int n2 = lector.nextInt();
            max = maximo(n1, n2);
            n1 = max;
        }
        
        System.out.println("El número máximo es: " + max);
    }
    
    public static int maximo(int a, int b) {
        int max;
        
        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        
        return max;
    }
    
}
