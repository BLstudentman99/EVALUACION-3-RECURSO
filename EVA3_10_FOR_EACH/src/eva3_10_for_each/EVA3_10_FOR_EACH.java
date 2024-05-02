/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_10_for_each;

/**
 *
 * @author invitado
 */
public class EVA3_10_FOR_EACH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String diaSemana[] = {"Domingo", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado"};
        for (String dia : diaSemana) {
            System.out.println(dia);
            
        }
        int salario[] = {500, 1000, 1500, 2000, 2500, 3000, 3500};
        for (int cant : salario) {
            System.out.println("$" + cant);
            
        }
        String mesAnio[] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto",
                            "Septiembre", "Octubre", "Noviembre", "Diciembre"}; 
        for (String mes : mesAnio) {
            System.out.println(mes);
            
        }
        }
    }
    
