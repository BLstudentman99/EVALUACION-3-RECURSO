/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_1_arreglos;

/**
 *
 * @author invitado
 */
public class EVA3_1_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //los arreglos en java son objetos
        //tenemos que crearlos antes de usarlos
        // [] --> manejar indices: arreglo[3] acceso a la posicion
        //DECLARACIÓN = CREACIÓN [TAMAÑO DEL ARREGLO]
        int arreglo[] = new int[10]; //un arreglo de 10 enteros
        //a través de los indices:
        //conocer las posiciones de los valores:
        //primer posición de un arreglo es cero --> 0
        //ultima posicion de un arreglo es --> N - 1, donde 
        //N es el tamaño del acceso
        arreglo[1] = 100;
        System.out.println("Valor de arreglo[1] = " + arreglo[1]);
        System.out.println(arreglo);    
        System.out.println(arreglo.length); //length es la cantidad del arreglo 
       
        
    }
    
}
