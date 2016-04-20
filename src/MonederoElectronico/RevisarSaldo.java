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
public class RevisarSaldo extends Ventana1 implements ActionListener{
    
    public RevisarSaldo(){
        super();
    }private JFrame v = new JFrame("Consulta de Saldo");
    public void revisarSaldo(){
        JLabel lidTarjeta = new JLabel("ID Tarjeta:");
        /*JLabel lNombreC = new JLabel("Nombre Cliente:"); //salida
        JLabel lSaldo = new JLabel("Saldo:"); //salida*/
        v.setSize(400,250);  //Establecemos las dimensiones del formulario (ancho x alto)
        v.setLocation(440,100); //Establecemos la ubicación en pantalla (x,y)
//        v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //Evento!, esta instrucción permite cerrar la ventana al presionar x
        
        tidT = new JTextField(20);
        
        bAccept1 = new JButton("Aceptar");
        bCancel = new JButton("Cancelar");
        
        JPanel pnlContenido = new JPanel(null);
        lidTarjeta.setBounds(10,30,60,10); 
        tidT.setBounds(70,25,300,25);
         
        bAccept1.setBounds(100,150,80,25);
        bCancel.setBounds(200,150,90,25);
        
        pnlContenido.add(lidTarjeta);
        pnlContenido.add(tidT);
        
        pnlContenido.add(bAccept1);
        pnlContenido.add(bCancel);
        
        v.setContentPane(pnlContenido);
        v.setVisible(true);
        
        bAccept1.addActionListener(this);
        bCancel.addActionListener(this);
    }
}
