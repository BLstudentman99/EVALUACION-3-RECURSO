/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_11_busqueda;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA3_11_BUSQUEDA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            int valor;
            int arreglo[] = {40, 15, 90, 29, 10, 7, 3, 8, 14, 20};
            Scanner input = new Scanner (System.in);
            for (int cant : arreglo) {
            System.out.println(cant);      
    }       
            System.out.println(" ");
            System.out.println("ingrese el valor que buscas");
               valor = input.nextInt();
         
            int pos = -1;   
            for (int i = 0; i < arreglo.length; i++) {
                if(valor == arreglo[i]){
                    pos = i;
                    break;
                
                
                
                }
            
        } 
            System.out.println("posición = " + pos);
}
}
