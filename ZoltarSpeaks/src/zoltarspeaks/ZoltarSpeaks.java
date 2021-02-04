package zoltarspeaks;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Profe
 */
public class ZoltarSpeaks {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        Random aleatorio = new Random();
        int opcion;

        // IMPRIMIR MENÚ DE INICIO
        System.out.println("Zoltar Speaks");
        System.out.println("1. Demana un desig");
        System.out.println("2. Obrir una galeta de la fortuna");
        System.out.print("Selecciona una opció (1 o 2): ");
        opcion = lector.nextInt();

        if (opcion == 1) {
            // OPCIO 1 DEMANA UN DESIG
            System.out.print("Demana el teu desig> ");
            lector.nextLine(); // Lee el intro del número
            lector.nextLine(); // Lee el texto introducido
            int deseo = aleatorio.nextInt(2);

            if (deseo == 0) {
                System.out.println("El teu desig NO es complirà.");
            } else {
                System.out.println("El teu desig SÍ es complirà.");
            }

        } else if (opcion == 2) {
            // OPCIO 2 OBRIR GALETA FORTUNA

            int mes, año;
            System.out.print("Introdueix la teva data de naixement (mes)> ");
            mes = lector.nextInt();
            System.out.print("Introdueix la teva data de naixement (any)> ");
            año = lector.nextInt();

            System.out.print("El teu signe zodiacal és ");

            int signozodiacal = 0;

            switch (mes) {
                case 1:
                    System.out.println("CAPRICORNIO");
                    signozodiacal = 10;
                    break;
                case 2:
                    System.out.println("ACUARIO");
                    signozodiacal = 11;
                    break;
                case 3:
                    System.out.println("PISCIS");
                    signozodiacal = 12;
                    break;
                case 4:
                    System.out.println("ARIES");
                    signozodiacal = 1;
                    break;
                case 5:
                    System.out.println("TAURO");
                    signozodiacal = 2;
                    break;
                case 6:
                    System.out.println("GÉMINIS");
                    signozodiacal = 3;
                    break;
                case 7:
                    System.out.println("CÁNCER");
                    signozodiacal = 4;
                    break;
                case 8:
                    System.out.println("LEO");
                    signozodiacal = 5;
                    break;
                case 9:
                    System.out.println("VIRGO");
                    signozodiacal = 6;
                    break;
                case 10:
                    System.out.println("LIBRA");
                    signozodiacal = 7;
                    break;
                case 11:
                    System.out.println("ESCORPIO");
                    signozodiacal = 8;
                    break;
                case 12:
                    System.out.println("SAGITARIO");
                    signozodiacal = 9;
                    break;

            }

            int residuo = (signozodiacal + año) % 5;

            switch (residuo) {
                case 0:
                    System.out.println("Fortune: Take care of yourself first. Then help others.");
                    break;
                case 1:
                    System.out.println("Fortune: Pursue your dreams with vigor.");
                    break;
                case 2:
                    System.out.println("Fortune: Don't wait for success to come - go find it!");
                    break;
                case 3:
                    System.out.println("Fortune: An exciting adventure awaits you.");
                    break;
                case 4:
                    System.out.println("Fortune: Face the truth with dignity.");
                    break;
            }

        }

    }

}
