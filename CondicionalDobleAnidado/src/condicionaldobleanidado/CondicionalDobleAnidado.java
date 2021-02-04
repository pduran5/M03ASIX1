package condicionaldobleanidado;

import java.util.Scanner;

public class CondicionalDobleAnidado {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int nota;

        System.out.print("Introduce tu nota: ");
        nota = lector.nextInt();

        if (nota < 5) {
            // Entra si la nota es inferior a 5
            System.out.println("INSUFICIENTE");
        } else if (nota < 6) {
            // Entra si es igual o mayor a 5 e inferior a 6
            System.out.println("SUFICIENTE");
        } else if (nota < 7) {
            // Entra si es igual o mayor a 6 e inferior a 7
            System.out.println("BIEN");
        } else if (nota < 9) {
            // Entra si es igual o mayor a 7 e inferior a 9
            System.out.println("NOTABLE");
        } else {
            // Entra si es igual o mayor a 9
            System.out.println("EXCELENTE");
        }
    }
}
