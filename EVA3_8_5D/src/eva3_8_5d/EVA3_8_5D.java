/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_8_5d;

/**
 *
 * @author invitado
 */
public class EVA3_8_5D {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cinco[][][][][] = new int[10][8][6][4][2];
        for (int i = 0; i < cinco.length; i++) {
            for (int j = 0; j < cinco[i].length; j++) {
                for (int k = 0; k < cinco[i][j].length; k++) {
                    for (int l = 0; l < cinco[i][j][k].length; l++) {
                        for (int m = 0; m < cinco[i][j][k][l].length; m++) {
                            cinco[i][j][k][l][m] = (int)(Math.random() * 100);
                            System.out.println("[" + cinco[i][j][k][l][m] + "]");
                            
                        }
                        
                    }

            
        }
        
    }
    
}
}
}
