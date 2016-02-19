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
public class Tarea02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Frescos PF = new Frescos("28/02/2016", 342, 4);
        System.out.println("Esta es la información de los Productos Frescos");
        System.out.println("Se caduca: " + PF.getFechaCaducidad());
        System.out.println("Lote: #" + PF.getLote());
        System.out.println("Lleva: " + PF.getDiasFrescos() + " dias de frescura \n");
        
        CAgua PCAg = new CAgua("28/02/2016", 235, -50);
        System.out.println("Esta es la información de los Pruductos Congelados por Agua");
        System.out.println("Se caduca: " + PCAg.getFechaCaducidad());
        System.out.println("Lote: #" + PCAg.getLote());
        System.out.println("Temperatura: " + PCAg.getTemperatura() + "°C \n");
        
        CAire PCAi = new CAire("28/02/2016", 451, 5);
        System.out.println("Esta es la información de los Productos Congelados por Aire");
        System.out.println("Se caduca: " + PCAi.getFechaCaducidad());
        System.out.println("Lote: #" + PCAi.getLote());
        System.out.println("Temperatura: " + PCAi.getTemperatura() + "°C \n");
        
        CNitrogeno PCN = new CNitrogeno("28/02/2016", 387, -25);
        System.out.println("Esta es la información de los Productos Congelados por Nitrógeno");
        System.out.println("Se caduca: " + PCN.getFechaCaducidad());
        System.out.println("Lote: #" + PCN.getLote());
        System.out.println("Temperatura: " + PCN.getTemperatura() + "°C \n");
        
        Refrigerados PR = new Refrigerados("28/02/2016", 922, 10);
        System.out.println("Esta es la información de los Productos Refrigerados");
        System.out.println("Se caduca: " + PR.getFechaCaducidad());
        System.out.println("Lote: #" + PR.getLote());
        System.out.println("Lleva: " + PR.getDiasRefrigerados() + " dias de refrigeracion \n");
        
    }
}
