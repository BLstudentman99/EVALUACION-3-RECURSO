/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_12_metodos;

/**
 *
 * @author invitado
 */
public class EVA3_12_METODOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //invocar al metodo --> llamada --> call 
        mostrarMensaje("Hello world");
        mostrarMuchosMensajes("Hello", 5);
    }
    //public static --> para materia de poo
    //void --> (tipo de dato) valor que regresa el metodo
    //void --> no regresa nada
    //nombre del metodo --> identificador valido
    //                      empezar en minuscula, debe ser un verbo
    //() <---- parametros del metodo (argumentos) --> valores que necesita para funcionar .
    
    public static void mostrarMensaje(String mensaje){//encabezado (nombre del metodo)
        //cuerpo del metodo: aqui va nuestro codigo
        System.out.println(mensaje);  
    }
    
    public static void mostrarMuchosMensajes(String mensaje, int veces){
        for (int i = 0; i < veces; i++) {
            System.out.println(mensaje);
            
        }



}
    
}
