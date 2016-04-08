/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarea03;

/**
 *
 * @author CarlosManuel
 */
public abstract class lap implements ilap{
    
    //Attributo
    String marca;
    String tienda; //distribuidor
    
    public lap(String marca, String tienda){
       
    }
    
    public void setMarca (String marca){
        this.marca = marca;
    }
    
    public void setTienda (String tienda){
        this.tienda = tienda;
    }
    
    public String getMarca(){
        return this.marca;    
    }
    
    public String getTienda(){
        return this.tienda;
    }
   
    @Override
    public String disponibilidad(){
        return "Sin existencia";
    }
    
    @Override
    public String pedido(){
        return "En proceso de llegar más";
    }
    
}
