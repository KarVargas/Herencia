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
public class Asus extends lap {
    
    String HDD;
    String RAM;
    String SO;
    String Processor;
    
    public Asus(String marca, String tienda, String HDD, String RAM, String SO, String Processor) {
        super(marca, tienda);
    }
    
    public void setHDD(String HDD){
        this.HDD = HDD;
    }
    public void setRAM(String RAM){
         this.RAM = RAM;
    }
    public void setSO(String SO){
         this.SO = SO;
    }
    public void setProcessor(String Processor){
         this.Processor = Processor;
    }
    public String getHDD(){
        return this.HDD;
    }
    public String getRAM(){
        return this.RAM;
    }
    public String getSO(){
        return this.SO;
    }
    public String getProcessor(){
        return this.Processor;
    }
}
