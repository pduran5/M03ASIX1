/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uf2nf1pt1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Alumne
 */
public class UF2NF1Pt1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        inicio();
        
        boolean continuar;
        
        nivel1();
        
        continuar = nivel2();
        
        if (continuar) {
            continuar = nivel3();
        }
        
        if (continuar) {
            continuar = nivel4();
        }
        
        if (continuar) {
            continuar = nivel5();
        }
        
        if (continuar) {
            ganar();
        } else {
            perder();
        }
        
        fin();
    }

    private static void inicio() {
        Scanner lector = new Scanner(System.in);
        System.out.println("=== STAR WARS CÓDIGOS SECRETOS ===\n"
                + "Hace mucho tiempo, en una galaxia muy, muy lejana…\nLa Princesa Leia, Luke Skywalker, Han Solo, Chewbacca, C3PO y R2D2 viajan en una nave imperial robada en una misión secreta para infiltrarse en otra estrella de la muerte que el imperio está construyendo para destruirla. (Presiona Intro para continuar)");
        lector.nextLine();
    }

    
    
    
    
    
    
    
    
    
    
    
    private static boolean nivel1() {
        Scanner lector = new Scanner(System.in);
        Random aleatorio = new Random();
        int S1 = aleatorio.nextInt(10) + 1;
        int S2 = aleatorio.nextInt(11) + 20;

        int sumatorio = sumatorio(S1, S2);

        System.out.println("Los problemas empiezan cuando deben realizar un salto hiperespacial hasta al sistema " + S1 + " en el sector " + S2 + ", pero el sistema de navegación está estropeado y el computador tiene problemas para calcular parte de las coordenadas de salto. Chewbacca, piloto experto, se da cuenta que falta el cuarto número de la serie. Recuerda de sus tiempos en la academia de pilotos que para calcularlo hay que calcular el sumatorio entre el nº del sistema y el nº del sector (ambos inclusive). ¿Qué debe introducir?");

        int numero = lector.nextInt();
        boolean pasanivel1 = false;

        if (numero == sumatorio) {
            pasanivel1 = true;
        }

        return pasanivel1;

    }
    
    private static int sumatorio(int S1, int S2) {
        int sumatorio = 0;
        for (int i = S1; i <= S2; i++) {
            sumatorio += i;
        }
        return sumatorio;
    }

    private static boolean nivel2() {
        Scanner lector = new Scanner(System.in);
        Random aleatorio = new Random();

        int P1 = aleatorio.nextInt(7) + 1;
        int P2 = aleatorio.nextInt(5) + 8;

        int productorio = productorio(P1, P2);

        System.out.println("Gracias a Chewbacca consiguen llegar al sistema correcto y ven a lo lejos la estrella de la muerte. Como van en una nave imperial robada se aproximan lentamente con la intención de pasar desapercibidos. De repente suena el comunicador. “Aquí agente de espaciopuerto " + P1 + " contactando con nave imperial " + P2 + ". No están destinados en este sector. ¿Qué hacen aquí?”. Han Solo coge el comunicador e improvisa. “Eh… tenemos un fallo en el… eh… condensador de fluzo... Solicitamos permiso para atracar y reparar la nave”. El agente, que no se anda con tonterías, responde “Proporcione código de acceso o abriremos fuego”. Han Solo ojea rápidamente el manual del piloto que estaba en la guantera y da con la página correcta. El código es el productorio entre el nº del agente y el nº de la nave (ambos inclusive).\n"
                + "¿Cuál es el código?");

        int numero = lector.nextInt();
        boolean pasanivel2 = false;

        if (numero == productorio) {
            pasanivel2 = true;
        }

        return pasanivel2;
    }

    private static int productorio(int P1, int P2) {
        int productorio = 1;
        for (int i = P1; i <= P2; i++) {
            productorio *= i;
        }
        return productorio;
    }

    private static boolean nivel3() {
        Scanner lector = new Scanner(System.in);
        Random aleatorio = new Random();

        int N = aleatorio.nextInt(51) + 50;
        int Nredond = N / 10;

        System.out.println("Han Solo proporciona el código correcto. Atracan en la estrella de la muerte, se equipan con trajes de soldados imperiales que encuentran en la nave para pasar desapercibidos y bajan. Ahora deben averiguar en qué nivel de los " + N + " existentes se encuentra el reactor principal. Se dirigen al primer panel computerizado que encuentran y la Princesa Leia intenta acceder a los planos de la nave pero necesita introducir una clave de acceso. Entonces recuerda la información que le proporcionó Lando Calrissian “La clave de acceso a los planos de la nave es el factorial de " + N + "/10 (redondeando " + N + " hacia abajo), donde " + N + " es el nº de niveles”.\n"
                + "¿Cual es el nivel correcto?");

        int factorial = productorio(1, Nredond);

        int numero = lector.nextInt();
        boolean pasanivel3 = false;

        if (numero == factorial) {
            pasanivel3 = true;
        }

        return pasanivel3;
    }

    private static boolean nivel4() {
        Scanner lector = new Scanner(System.in);
        Random aleatorio = new Random();

        int P = aleatorio.nextInt(91) + 10;

        System.out.println("Gracias a la inteligencia de Leia llegan al nivel correcto y encuentran la puerta acorazada que da al reactor principal. R2D2 se conecta al panel de acceso para intentar hackear el sistema y abrir la puerta. Para desencriptar la clave necesita verificar si el número " + P + " es primo o no. Si es primo introduce un 1, si no lo es introduce un 0.");

        boolean esPrimo = esPrimo(P);

        int numero = lector.nextInt();
        boolean pasanivel4 = false;

        if (numero == 1 && esPrimo || numero == 0 && !esPrimo) {
            pasanivel4 = true;
        }

        return pasanivel4;
    }

    private static boolean esPrimo(int P) {
        boolean esPrimo = true;
        for (int i = 2; i < P - 1; i++) {
            if (P % i == 0) {
                esPrimo = false;
            }
        }
        return esPrimo;
    }

    private static boolean nivel5() {
        Scanner lector = new Scanner(System.in);
        Random aleatorio = new Random();

        int M = aleatorio.nextInt(6) + 5;
        int S = aleatorio.nextInt(6) + 5;

        System.out.println("Consiguen entrar al reactor. Ya solo queda que Luke Skywalker coloque la bomba, programe el temporizador y salir de allí corriendo. Necesita programarlo para que explote en exactamente " + M + " minutos y " + S + " segundos, el tiempo suficiente para escapar antes de que explote pero sin que el sistema de seguridad anti-explosivos detecte y desactive la bomba. Pero el temporizador utiliza un reloj Zordgiano un tanto peculiar. Para convertir los minutos y segundos al sistema Zordgiano hay que sumar el factorial de " + M + " y el factorial de " + S + ". ¿Qué valor debe introducir?");

        int resultado = productorio(1, 7) + productorio(1, 5);

        int numero = lector.nextInt();
        boolean pasanivel5 = false;

        if (numero == resultado) {
            pasanivel5 = true;
        }

        return pasanivel5;
    }

    private static void ganar() {
        System.out.println("Luke Skywalker introduce el tiempo correcto, activa el temporizador y empiezan a sonar las alarmas. Salen de allí corriendo, no hay tiempo que perder. La nave se convierte en un hervidero de soldados de arriba a abajo y entre el caos que les rodea consiguen llegar a la nave y salir de allí a toda prisa. A medida que se alejan observan por la ventana la imagen de la colosal estrella de la muerte explotando en el silencio del espacio, desapareciendo para siempre junto a los restos del malvado imperio.\n"
                + "\n"
                + "¡Has salvado la galaxia gracias a la Fuerza Jedi de las matemáticas! Enhorabuena ;D");
    }

    private static void perder() {
        System.out.println("Ese no era el código correcto… La misión ha sido un fracaso… :( :( :(\n"
                + "Todavía no eres un Maestro Jedi de las Matemáticas. ¡Vuelve a intentarlo!");
    }

    private static void fin() {
        System.out.println("Gracias por jugar :D");
    }
}
