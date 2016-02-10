/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c10.pkg02.pkg2016;

/**
 *
 * @author CarlosManuel
 */
public class Autobus extends Vehiculo{
    
    //Atributes
    private final int ruta;
    
    /**
     * 
     * @param placa
     * @param modelo
     * @param pasajeros
     * @param ruta 
     */
    public Autobus(String placa, String modelo, int pasajeros, int ruta) {
        super(placa, modelo, pasajeros);
        this.ruta = ruta;
    }
    
    /**
     * Método que devuelve la ruta del autobus
     * @return, devuelve un entero
     */
    public int getRuta (){
        return this.ruta;
    }
}
