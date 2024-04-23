/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_2_arreglos_2;

/**
 *
 * @author invitado
 */
public class EVA3_2_ARREGLOS_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO codeDE ELEM application logic here
        //JAVA:0 es el primer elemento
        //     N - 1 ULTIMO ELEMENTO
        //N --> TOTAL ENTOS ALMACENADOS EN EL ARREGLO 
        
        //vamos a crear un arreglo llenarlo de valores aleatorios.
        int datos[] = new int[20];
        
        
        //asignar valores aleatorios entre 0 y 99,(1-100)
        for (int i = 0; i < datos.length; i++) {
            datos[i] = (int)(Math.random() * 100); //0 - 99
            
        }
        for (int i = 0; i < datos.length; i++) {
            System.out.print("[" + datos[i] + "]");
            
        }
    }
    
}
