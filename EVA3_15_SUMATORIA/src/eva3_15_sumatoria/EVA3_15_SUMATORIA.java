/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_15_sumatoria;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA3_15_SUMATORIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Numero a sumar: ");
        int sumar = input.nextInt();
        
        int resu = sumarNumero(sumar);
        System.out.println("el resultado es= " + resu);
    }
    
    public static int sumarNumero(int valor){
    int resu = 0;
        for (int i = 0; i < valor; i++) {
            resu = valor + valor;
            
        }
    
 
    return resu;
    
    }
}
