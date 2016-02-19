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
public class Refrigerados extends Productos{

    //Attributes
    protected int diasRefrigerados;
    
    public Refrigerados(String fechaCaducidad, int lote, int diasRefrigerados) {
        super(fechaCaducidad, lote);
        this.diasRefrigerados = diasRefrigerados;
    }
    
    public int getDiasRefrigerados(){
        return this.diasRefrigerados;
    }
    
}
