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
public class Vehiculo {
    
    //atributes
    protected String placa, modelo;
    private final int pasajeros;
    
    //Métodos
    /**
     * Contructor
     * @param placa, es la palaca del vehiculo
     * @param modelo, es el modelo del vehiculo
     * @param pasajeros, es la cantidad de pasajeros
     */
    public Vehiculo(String placa, String modelo, int pasajeros) {
        this.placa = placa;
        this.modelo = modelo;
        this.pasajeros = pasajeros;
    }
    
    /**
     * Método que devuelve la placa del vehiculo
     * @return, regresa la placa en formato string
     */
    public String getPlaca (){
        return this.placa;
    }
    
    /**
     * Método para devolver el modelo del vehiculo
     * @return 
     */
    public String getModelo (){
        return this.modelo;
    }
    
    /**
     * Método para notificar la capacidad máximo del vehiculo
     * @return, devuelve un entero con la cantidad max de pasajeros
     */
    public int getPasajeros (){
        return this.pasajeros;
    }
    
}
