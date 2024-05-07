/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_14_return_2;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA3_14_RETURN_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("base: ");
        int base = input.nextInt();
        System.out.println("potencia: ");
        int pot = input.nextInt();
        //calcular potencia
        int resu = calcularPot(base, pot);
        System.out.println("el resultado es = " + resu);
    }
    
    public static int calcularPot(int base, int potencia){
        //crea una funcion que calcule la potencia de un valor entero
        //Necesitamos un acumulador
        //suma = suma + valor
        // suma += valor;
        int resu = 1;
        for (int i = 0; i < potencia; i++) {
            resu *= base;
        }
        return resu;
    }    
}
