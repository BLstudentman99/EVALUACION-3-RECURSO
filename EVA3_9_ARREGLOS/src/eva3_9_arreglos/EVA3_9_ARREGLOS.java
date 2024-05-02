/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_9_arreglos;

/**
 *
 * @author invitado
 */
public class EVA3_9_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String diaSemana[] = {"Domingo", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado"};
        char vocales[] = {'a', 'e','i','o','u' };
        
        System.out.println("tamaño del arreglo diaSemana = " + diaSemana.length );
        System.out.println("tamaño del arreglo vocales = " + vocales.length );
        
        for (int i = 0; i < diaSemana.length; i++) {
            System.out.println(diaSemana[i]);
            
            
        }
        for (int i = 0; i < vocales.length; i++) {
            System.out.print(vocales[i]);
            
        }
        System.out.println("");
        String menu[] = {"Archivo", "Nueva Factura", "Modificar", "Salir"};
        for (int i = 0; i < menu.length; i++) {
            System.out.println(i + " - " + menu[i]);
            
        }
    }
}
