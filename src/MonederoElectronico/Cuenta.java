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
public class Cuenta extends Ventana1 implements ActionListener{
    
    //AlmacenaPuntos
    protected int puntos, efectivo;
    
    //DescuentoSaldo
    protected int comprar, transferencia;
    
    //RevisarSaldo
    protected int checar;
    protected boolean disponible;
    
    //BitacoradeMovimientos
    protected int depositar, retirar;
    protected String fecha, hora;
    
    //Administrador
    
    public Cuenta(int puntos, int efectivo, int comprar, int transferencia, int checar, boolean disponible, int depositar, int retirar, String fecha, String hora) {
        this.puntos = puntos;
        this.efectivo = efectivo;
        this.comprar = comprar;
        this.transferencia = transferencia;
        this.checar = checar;
        this.disponible = false;
        this.depositar = depositar;
        this.retirar = retirar;
        this.fecha = fecha;
        this.hora = hora;
        
    }
    
    public int getPuntos(){
        return this.puntos;
    }
    
    public  int getEfectivo(){
        return this.efectivo;
    }
    
    public int getCompra(){
        return this.comprar;
    }
    
    public int getTransferencia(){
        return this.transferencia;
    }
    
    public int getChecar(){
        return this.checar;
    }
    
    public boolean getDisponible(){
        return false;   
    }
    
    public int getDepositar(){
        return this.depositar;
    }
    
    public int getRetirar(){
        return this.retirar;
    }
    
    public String getFecha(){
        return this.fecha;
    }
    
    public String getHora(){
        return this.hora;
    }
    
    public Cuenta(){
        super();
    }private JFrame v = new JFrame("Registro de Compra");
    public void registrarCompra(){
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
    
}
