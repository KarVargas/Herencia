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
public class Telefono {
    
    //Attributes, instancia objeto
    Tecla[][] Teclado = new Tecla[5][3];
    public botonApagar EA = new botonApagar();
    
    public void setTeclado(){
        int n = 0;
        String s;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Tecla t = new Tecla();
                n++;
                s = Integer.toString(n);
                t.setDigito(s.charAt(0));
                Teclado[i][j] = t;
                
            }
        }
        
        Tecla t0 = new Tecla();
        t0.setDigito('*');
        Teclado[3][0] = t0;
        Tecla t1 = new Tecla();
        t1.setDigito('0');
        Teclado[3][1] = t1;
        Tecla t2 = new Tecla();
        t2.setDigito('#');
        Teclado[3][2] = t2;
        Tecla t3 = new Tecla();
        t3.setDigito('C');
        Teclado[4][0] = t3;
        Tecla t4 = new Tecla();
        t4.setDigito('M');
        Teclado[4][1] = t4;
        Tecla t5 = new Tecla();
        t5.setDigito('T');
        Teclado[4][2] = t5;
    }
}
