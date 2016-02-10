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
public class TransportesHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Intancia un Autobus y un Taxi
        /**
         * Instanciamos un Autobus
         */
        Autobus expresoTec = new Autobus("TEC21", "Semana i", 40, 2);
        /**
         * Instanciamos un Taxi
         */
        Taxi taxiSeguro = new Taxi("T3C21", "Semestre i", 4, "Rayo Empendedor");
        
        System.out.println("Esta es la información del Autobus");
        System.out.println("Modelo: " + expresoTec.getModelo());
        System.out.println("Placa: " + expresoTec.getPlaca());
        System.out.println("Capacidad: " + expresoTec.getPasajeros() + " pasajeros");
        System.out.println("Ruta: " + expresoTec.getRuta() + "\n");
        
        System.out.println("Esta es la información del Taxi");
        System.out.println("Modelo: " + taxiSeguro.getModelo());
        System.out.println("Placa: " + taxiSeguro.getPlaca());
        System.out.println("Capacidad: " + taxiSeguro.getPasajeros() + " pasajeros");
        System.out.println("Sitio: " + taxiSeguro.getSitio() + "\n");
        
        Vehiculo gene1215 = new Vehiculo("21-Tec", "Borrego", 4);
        System.out.println("Esta es la información del Vehiculo");
        System.out.println("Modelo: " + gene1215.getModelo());
        System.out.println("Placa: " + gene1215.getPlaca());
        System.out.println("Capacidad: " + gene1215.getPasajeros() + " pasajeros");
        
    }
    
}
