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
public class Ventana extends JFrame implements ActionListener{
    JMenuItem cUp, cRegister, cPays, cConsult;
    JMenu mClient, mMoves;
    JMenuBar bMenu;
    private JButton bAccept, bCancel, bAccept1, bAR;
    private JTextField tName, tEmail, tTel, tTarjeta, tidT, tBalance;
    private final JFrame v = new JFrame("Este es un formulario");
    //Constructor
    public Ventana(){
        
        super("Menú"); 
        setBounds(200,200,200,200); //x,y,ancho,alto
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        cUp = new JMenuItem("Alta de Clientes");
        cRegister = new JMenuItem("Registo de Compras");
        cPays = new JMenuItem("Pagos");
        cConsult = new JMenuItem("Consulta de Saldo");
        
        mClient = new JMenu("Clientes");
        mMoves = new JMenu("Movimientos");
        
        bMenu = new JMenuBar();
        
        mClient.add(cUp);
        mMoves.add(cRegister);
        mMoves.add(cPays);
        mMoves.add(cConsult);
        
        bMenu.add(mClient);
        bMenu.add(mMoves);
        setJMenuBar(bMenu);
        setVisible(true);
        cUp.addActionListener(this);
        cRegister.addActionListener(this); 
        cPays.addActionListener(this);
        cConsult.addActionListener(this); 
    }
    
    private void salir(){
        System.exit(0);
    }
    private void close(){
        v.setVisible(false);
    }

    public void upClient(){
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
    
    public void registerShop(){
        v.setSize(400,250);
        v.setLocation(440,100);
//        v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel lidT = new JLabel("ID Tarjeta:");
        JLabel lT = new JLabel("Ticket:");
        JLabel lC = new JLabel("Cantidad:");
        
        tidT = new JTextField(20);
        tTarjeta = new JTextField(20);
        tName = new JTextField(10);
        
        bAccept = new JButton("Aceptar");
        bCancel = new JButton("Cancelar");
        
        JPanel pnlContenido = new JPanel(null);
        
        lidT.setBounds(10,30,60,10); //x,y, ancho y alto
        tidT.setBounds(70,25,300,25);
        lT.setBounds(10,60,60,10);
        tTarjeta.setBounds(70,55,300,25);
        lC.setBounds(10,90,60,10);
        tName.setBounds(70,85,300,25);
        bAccept.setBounds(100,150,80,25);
        bCancel.setBounds(200,150,90,25);
        
        pnlContenido.add(lidT);
        pnlContenido.add(tidT);
        pnlContenido.add(lT);
        pnlContenido.add(tTarjeta);
        pnlContenido.add(lC);
        pnlContenido.add(tName);
        pnlContenido.add(bAccept);
        pnlContenido.add(bCancel);
        
        v.setContentPane(pnlContenido);
        
        v.setVisible(true); 
        
        bAccept.addActionListener(this);
        bCancel.addActionListener(this);
    }
    public void pays(){
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
    public void consult(){
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

    private String nombre="Yesus Becerril";
    private JFrame mov = new JFrame("Menu");
    float saldo = 2;
    public void accept1(){
        bCancel = new JButton("Cancel");
             
        JLabel lNameC = new JLabel("Nombre: ");
        JLabel lSaldo = new JLabel("Saldo: ");
             
        tName = new JTextField(nombre);
        tBalance = new JTextField (Float.toString(saldo));
        
        bCancel.setBounds(150,150,90,25);
        
        lNameC.setBounds(10,60,60,10); 
        lSaldo.setBounds(10,90,60,10); 
        
        tName.setBounds(70,55,300,25);
        tBalance.setBounds(70,85,300,25);     
             
        JPanel pnlContenido = new JPanel(null);
        
        pnlContenido.add(lNameC);
        pnlContenido.add(lSaldo);
        
        pnlContenido.add(tName);
        pnlContenido.add(tBalance); 
        pnlContenido.add(bCancel); 
             
        v.setContentPane(pnlContenido);
        v.setVisible(true);
            
        bCancel.addActionListener(this);
    }
    public void ac(){
        JOptionPane.showMessageDialog(null, "Se Registro Correctamente");
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==cUp){
            upClient();
        } else if(e.getSource()==cRegister){
            registerShop();
        } else if(e.getSource()==cPays){
            pays();
        } else if(e.getSource()==cConsult){
            consult();
        } else if(e.getSource()==bAccept1){
            accept1();
        } else if(e.getSource()==bCancel){
            close();
        } else if(e.getSource()==bAR){
            ac();
        }
    }
}
