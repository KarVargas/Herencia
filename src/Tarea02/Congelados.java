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
public class Congelados extends Productos{

    //Attributes
    protected int temperatura;
    
    public Congelados(String fechaCaducidad, int lote, int temperatura) {
        super(fechaCaducidad, lote);
        this.temperatura = temperatura;
    }
    
    public int getTemperatura(){
        return this.temperatura;
    }
}
