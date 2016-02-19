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
public class Frescos extends Productos{
    
    //Attributes
    protected int diasFrescos;
    
    public Frescos(String fechaCaducidad, int lote, int diasFrescos) {
        super(fechaCaducidad, lote);
        this.diasFrescos = diasFrescos;
    }
    
    public int getDiasFrescos(){
        return this.diasFrescos;
    }
    
}
