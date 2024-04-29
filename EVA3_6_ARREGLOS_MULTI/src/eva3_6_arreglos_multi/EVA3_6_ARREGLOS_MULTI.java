/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_6_arreglos_multi;

/**
 *
 * @author invitado
 */
public class EVA3_6_ARREGLOS_MULTI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int matriz[][] = new int[3][2];
        matriz[0][0] = 100;
        matriz[0][1] = 100;
        matriz[1][0] = 100;
        matriz[1][1] = 100;
        matriz[2][0] = 100;
        matriz[2][1] = 100;
        //------------
        System.out.println("matriz.lengtth = " + matriz.length);
        //voy a recorrer la primer dimensión
        for (int i = 0; i < matriz.length; i++) {//filas
            for (int j = 0; j < matriz[i].length; j++) {//columnas
                System.out.println("matriz[" + i + "][" + j + "]" + matriz[i][j]);
                
            }
        }
    }
    
}
