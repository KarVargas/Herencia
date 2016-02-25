/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c24.pkg02.pkg2016;

/**
 *
 * @author CarlosManuel
 */
public class Composicion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Telefono starTAC = new Telefono();
        starTAC.EA.presionar();
        System.out.println("El starTAC está " + starTAC.EA.IO);
        starTAC.setTeclado();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(starTAC.Teclado[i][j].getDigito() + " ");
            }
            System.out.println("");
        }
    }
    
}
