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
public class Taxi extends Vehiculo{

    //Atributes
    private final String sitio;
    
    /** Métodos 
     * Constructor
     * @param placa
     * @param modelo
     * @param pasajeros
     * @param sitio 
     */
    public Taxi(String placa, String modelo, int pasajeros, String sitio) {
        super(placa, modelo, pasajeros);
        this.sitio = sitio;
    }
    
    /**
     * Método para devolver el sitio del Taxi
     * @return una cadena
     */
    public String getSitio (){
        return this.sitio;
    }
}
