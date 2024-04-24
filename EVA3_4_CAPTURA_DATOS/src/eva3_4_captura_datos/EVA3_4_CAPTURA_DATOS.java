/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_4_captura_datos;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA3_4_CAPTURA_DATOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cant;
        Scanner input = new Scanner(System.in);
        System.out.println("¿cuantos nombres vas a capturar?");
        cant = input.nextInt();
        String[] listaNombres = new String[cant];
        input.nextLine();
        
        //hay que preguntar cada nombre:
        for (int i = 0; i < listaNombres.length; i++) {
            System.out.println("Nombre #" + (i + 1) + ": ");
            listaNombres[i] = input.nextLine();
            
        }
        for (int i = 0; i < listaNombres.length; i++) {
            System.out.println(listaNombres[i]);
    }
    }
}
    
 
