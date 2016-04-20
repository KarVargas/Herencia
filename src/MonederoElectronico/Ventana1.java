/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MonederoElectronico;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
/**
 *
 * @author CarlosManuel
 */
public class Ventana1 extends JFrame implements ActionListener{
    JMenuItem cUp, cRegister, cPays, cConsult;
    JMenu mClient, mMoves;
    JMenuBar bMenu;
    protected JButton bAccept, bCancel, bAccept1, bAR;
    protected JTextField tName, tEmail, tTel, tTarjeta, tidT, tBalance;
    private JFrame v = new JFrame("Este es un formulario");
    //Constructor
    public Ventana1(){
        
        super("Menú"); 
        
    }
    public void ventana(){
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
    
    protected void salir(){
        System.exit(0);
    }
    protected void close(){
        v.setVisible(false);
    }
    public void upClient(){
        AltaClientes a = new AltaClientes();
        a.altaClientes();
    }
    public void registerShop(){
        Cuenta rc = new Cuenta();
        rc.registrarCompra();
    }
    public void pays(){
        Tarjeta rc = new Tarjeta();
        rc.pagos();
    }
    public void consult(){
        RevisarSaldo cds = new RevisarSaldo();
        cds.revisarSaldo();
    }

    private String nombre = "Yesus Becerril";
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
    
    /*public void guardar(){
        try{
            FileWriter ficheronombre = new FileWriter("Nombre");
            ficheronombre.write(tName.toString());
            ficheronombre.close();
            
            FileWriter ficheroemail = new FileWriter("Email");
            ficheroemail.write(tEmail.toString());
            ficheroemail.close();
            
            FileWriter ficherotel = new FileWriter("Tel");
            ficherotel.write(tTel.toString());
            ficherotel.close();
            
            FileWriter ficheroTarjeta = new FileWriter("Tarjeta");
            ficheroTarjeta.write(tTarjeta.toString());
            ficheroTarjeta.close();
        }
            
        v.setVisible(false);
    }*/
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
