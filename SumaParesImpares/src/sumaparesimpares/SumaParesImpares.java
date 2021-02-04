package sumaparesimpares;

public class SumaParesImpares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int pares = 0, impares = 0;

        for (int cont = 100; cont <= 200; cont++) {
            // Comprobamos si es par o impar
            if (cont % 2 == 0) {
                pares += cont;
            } else {
                impares += cont;
            }
        }

        System.out.println("Suma pares: " + pares);
        System.out.println("Suma impares: " + impares);
    }
}
