/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarea02;

/**
 *
 * @author CarlosManuel
 */
public class Productos {
    
    //Attributes
    protected String fechaCaducidad;
    protected int lote;
    
    //Métodos
    //Constructor
    public Productos (String fechaCaducidad, int lote) {
        this.fechaCaducidad = fechaCaducidad;
        this.lote = lote;
    }
    
    public String getFechaCaducidad(){
        return this.fechaCaducidad;
    }
    
    public int getLote(){
        return this.lote;
    }
    
    public void actualizarFechaCaducidad(String fechaCaducidad){
        this.fechaCaducidad = fechaCaducidad;
    }
    
    public void actualizarLote(int lote){
        this.lote = lote;
    }
}

