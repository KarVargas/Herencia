/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MonederoElectronico;
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author CarlosManuel
 */
public class Tarjeta extends Ventana1 implements ActionListener{
    
    //Tarjeta
    protected String id;
    
    public Tarjeta(String id) {
        this.id = id;
    }
    
    public String getId(){
        return this.id;
    }
    public Tarjeta(){
        super();
    }private JFrame v = new JFrame("Pagos");
    public void pagos(){
        JLabel lidT = new JLabel("ID Tarjeta:");
        JLabel lC = new JLabel("Cantidad:");
        
        v.setSize(400,250);
        v.setLocation(440,100);
//        v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        tidT = new JTextField(20);
        tName = new JTextField(10);
        
        bAccept = new JButton("Aceptar");
        bCancel = new JButton("Cancelar");
        
        JPanel pnlContenido = new JPanel(null);
        
        lidT.setBounds(10,30,60,10); //x,y, ancho y alto
        tidT.setBounds(70,25,300,25);
        lC.setBounds(10,90,60,10);
        tName.setBounds(70,85,300,25);
        bAccept.setBounds(100,150,80,25);
        bCancel.setBounds(200,150,90,25);
        
        pnlContenido.add(lidT);
        pnlContenido.add(tidT);
        pnlContenido.add(lC);
        pnlContenido.add(tName);
        pnlContenido.add(bAccept);
        pnlContenido.add(bCancel);
        
        v.setContentPane(pnlContenido);
        
        v.setVisible(true); 
        
        bAccept.addActionListener(this);
        bCancel.addActionListener(this);
    }
}
