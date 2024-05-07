/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_13_return;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA3_13_RETURN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("valor 1: ");
        int val1 = input.nextInt();
        System.out.println("valor 2: ");
        int val2 = input.nextInt();
        //llamar a la funcion
        //1. guardar el resultado cuando se usara mas veces
        //int resu = sumar(val1, val2);
        //System.out.println("La suma = " + resu );
        //2. usar directamente resultado de la funcion cuando usan solo el resultado una vez
        //System.out.println("La suma = " + sumar(val1, val2));
        sumar(val1, val2);
    }
    
    public static int sumar(int num1, int num2){
        int resu = num1 + num2;
        return resu; //esta es la última instruccion del metodo, despues del return no puede haber mas intrucciones.
        
    
    }
    
}
