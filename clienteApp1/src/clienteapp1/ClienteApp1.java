/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clienteapp1;

/**
 *
 * @author Alumne
 */
public class ClienteApp1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String result = adios("Mercedes", "Castellon");
        System.out.println(result);
        
        String result1 = hello("Mercedes");
        
        System.out.println(result1);
    }

    private static String adios(java.lang.String name, java.lang.String apellido) {
        cat.proven.ws.NewWebService_Service service = new cat.proven.ws.NewWebService_Service();
        cat.proven.ws.NewWebService port = service.getNewWebServicePort();
        return port.adios(name, apellido);
    }

    private static String hello(java.lang.String name) {
        cat.proven.ws.NewWebService_Service service = new cat.proven.ws.NewWebService_Service();
        cat.proven.ws.NewWebService port = service.getNewWebServicePort();
        return port.hello(name);
    }
    
}
