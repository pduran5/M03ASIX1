package condicionalmultiple;

import java.util.Scanner;

public class CondicionalMultiple {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int dia;
        
        System.out.print("Introduce un número entre 1 y 7: ");
        dia = lector.nextInt();
        
        switch (dia) {
            case 1:
                System.out.println("LUNES");
                break;
            case 2:
                System.out.println("MARTES");
                break;
            case 3:
                System.out.println("MIÉRCOLES");
                break;
            case 4:
                System.out.println("JUEVES");
                break;
            case 5:
                System.out.println("VIERNES");
                break;
            case 6:
                System.out.println("SÁBADO");
                break;
            case 7:
                System.out.println("DOMINGO");
                break;
            default:
                System.out.println("ERROR: Introduce nº del 1 al 7");
        }
    }    
}
