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
public class AltaClientes extends Ventana1 implements ActionListener{
    
    protected String nombre, apellido;
    
    public AltaClientes (String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public String getApellido(){
        return this.apellido;
    }
    
    public AltaClientes() {
        super();
    }
    private JFrame v = new JFrame("Este es un formulario");
    public void altaClientes(){
        v.setSize(400,250);
        v.setLocation(440,100);
//        v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel lName = new JLabel("Nombre Cliente:");
        JLabel lEmail = new JLabel("Email:");
        JLabel lTel = new JLabel("Telefono:");
        JLabel lTarjeta = new JLabel("ID Tarjeta:");
        
        tName = new JTextField();
        tEmail = new JTextField();
        tTel = new JTextField();
        tTarjeta = new JTextField();
        
        bAR = new JButton("Aceptar");
        bCancel = new JButton("Cancelar");
        
        JPanel pnlContenido = new JPanel(null);
        
        lName.setBounds(10,30,100,10); //x,y, ancho y alto
        tName.setBounds(110,25,260,25);
        lEmail.setBounds(10,60,60,10);
        tEmail.setBounds(110,55,260,25);
        lTel.setBounds(10,90,60,10);
        tTel.setBounds(110,85,260,25);
        lTarjeta.setBounds(10,120,80,10);
        tTarjeta.setBounds(110,115,260,25);
        bAR.setBounds(100,150,80,25);
        bCancel.setBounds(200,150,90,25);
        
        pnlContenido.add(lName);
        pnlContenido.add(tName);
        pnlContenido.add(lEmail);
        pnlContenido.add(tEmail);
        pnlContenido.add(lTel);
        pnlContenido.add(tTel);
        pnlContenido.add(lTarjeta);
        pnlContenido.add(tTarjeta);
        pnlContenido.add(bAR);
        pnlContenido.add(bCancel);
        
        v.setContentPane(pnlContenido);
        
        v.setVisible(true); 
        
        bAR.addActionListener(this);
        bCancel.addActionListener(this);
    }
}
