package funcionesjediejercicio10;

import java.util.Scanner;

public class FuncionesJediEjercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        System.out.print("Introduce el día: ");
        int dia = lector.nextInt();
        
        System.out.print("Introduce el mes: ");
        int mes = lector.nextInt();
        
        System.out.print("Introduce el año: ");
        int año = lector.nextInt();
        
        if(comprobarFecha(dia, mes, año) == true) {
            System.out.println("LA FECHA ES CORRECTA");
        } else {
            System.out.println("LA FECHA ES INCORRECTA");
        }
    }
    
    public static boolean comprobarFecha(int dia, int mes, int año) {
        boolean fechaCorrecta = true;
        
        if (dia < 1 || dia > 30) {
            fechaCorrecta = false;
        }
        
        if (mes < 1 || mes > 12) {
            fechaCorrecta = false;
        }
        
        return fechaCorrecta;
    } 
    
}
