package bucledowhile;

import java.util.Scanner;

public class BucleDoWhile {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int fin;
        
        System.out.print("Introduce un número: ");
        fin = lector.nextInt();
        
        int i = 1;
        
        do {
            System.out.println(i);
            i++;
        } while (i<=fin);
    }
}
