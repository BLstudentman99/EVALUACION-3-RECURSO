/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_19_referencias;

/**
 *
 * @author invitado
 */
public class EVA3_19_REFERENCIAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arreglo = new int[5];
        int x = 100;
        System.out.println("antes de llear al metodo. X = " + x);
        sumarUno(x); //le estoy enviando una copia de la variable x 
        System.out.println("Despues de llamar al metodo. X = " + x);
        System.out.println("-------------------------");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("[" + arreglo[i] + "]");
            
        }
        System.out.println("");
        modificarArreglo(arreglo);
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("[" + arreglo[i] + "]");
            
            
        }
        
    }
    
    public static void sumarUno(int valor){
        System.out.println("antes de la operacion. valor: " + valor );
        valor+=1;
        System.out.println("Despues de la operación. valor: " + valor);
    
    }
    public static void modificarArreglo(int[] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = ((int) (Math.random() * 100));
            
        }
    
    
    }
    
}
