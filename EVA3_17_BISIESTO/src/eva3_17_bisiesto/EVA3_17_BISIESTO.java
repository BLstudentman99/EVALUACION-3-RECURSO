/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_17_bisiesto;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA3_17_BISIESTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("introduce el año");
        Scanner input = new Scanner(System.in);
        int year  = input.nextInt();
        boolean resu = esBisiesto(year);
        if(resu)
            System.out.println("si es año bisiesto");
        else
            System.out.println("no es año bisiesto");
    }
    
    public static boolean esBisiesto(int anio){
        boolean resu;
       if(anio % 100 != 0)
            if(anio % 4 == 0)
                resu = true;
        else
                resu = false;
        else if (anio % 400 == 0)
            resu = true;
        else
            resu = false;
       
            
        return resu;
        
    }
}