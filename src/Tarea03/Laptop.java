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
public class Laptop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        HP h = new HP("","","","","","");
        h.setMarca("HP");
        h.setTienda("Sam's");
        h.setHDD("2 TB");
        h.setRAM("8 GB");
        h.setSO("Windows 10");
        h.setProcessor("Intel Core i7 (Sexta Generación)");
        System.out.println();
        System.out.println("Los datos de la laptop es: ");
        System.out.println("La marca es " + h.getMarca());
        System.out.println("La tienda que la vende es " + h.getTienda() );
        System.out.println("Tiene " + h.getHDD() + " de HDD");
        System.out.println("Tiene " + h.getRAM() + " de RAM");
        System.out.println("Sistema Operativo: " + h.getSO());
        System.out.println("Procesador: " + h.getProcessor());
        System.out.println(h.disponibilidad());
        
        
        Lenovo l = new Lenovo(""," ","","","","");
        l.setMarca("Lenovo");
        l.setTienda("H-E-B");
        l.setHDD("3 TB");
        l.setRAM("6 GB");
        l.setSO("Windows 10");
        l.setProcessor("Intel Core i7 (Sexta Generación)");
        System.out.println();
        System.out.println("Los datos de la laptop es: ");
        System.out.println("La marca es " + l.getMarca());
        System.out.println("La tienda que la vende es " + l.getTienda() );
        System.out.println("Tiene " + l.getHDD() + " de HDD");
        System.out.println("Tiene " + l.getRAM() + " de RAM");
        System.out.println("Sistema Operativo: " + l.getSO());
        System.out.println("Procesador: " + l.getProcessor());
        System.out.println(l.pedido());
        
        
        Dell d = new Dell("","","","","","");
        d.setMarca("Dell");
        d.setTienda("Liverpool");
        d.setHDD("1 TB");
        d.setRAM("4 GB");
        d.setSO("Windows 10");
        d.setProcessor("Intel Core i7 (Sexta Generación)");
        System.out.println();
        System.out.println("Los datos de la laptop es: ");
        System.out.println("La marca es " + d.getMarca());
        System.out.println("La tienda que la vende es " + d.getTienda() );
        System.out.println("Tiene " + d.getHDD() + " de HDD");
        System.out.println("Tiene " + d.getRAM() + " de RAM");
        System.out.println("Sistema Operativo: " + d.getSO());
        System.out.println("Procesador: " + d.getProcessor());
        System.out.println(d.disponibilidad());

        
        Acer ac = new Acer("","","","","","");
        ac.setMarca("Acer");
        ac.setTienda("Soriana");
        ac.setHDD("2 TB");
        ac.setRAM("4 GB");
        ac.setSO("Windows 10");
        ac.setProcessor("Intel Core i7 (Sexta Generación)");
        h.setProcessor("Intel Core i7 (Sexta Generación)");
        System.out.println();
        System.out.println("Los datos de la laptop es: ");
        System.out.println("La marca es " + ac.getMarca());
        System.out.println("La tienda que la vende es " + ac.getTienda() );
        System.out.println("Tiene " + ac.getHDD() + " de HDD");
        System.out.println("Tiene " + ac.getRAM() + " de RAM");
        System.out.println("Sistema Operativo: " + ac.getSO());
        System.out.println("Procesador: " + ac.getProcessor());
        System.out.println(ac.pedido());
        System.out.println(ac.disponibilidad());
        
        Asus as = new Asus("","","","","","");
        as.setMarca("Asus");
        as.setTienda("Walmart");
        as.setHDD("1 TB");
        as.setRAM("16 GB");
        as.setSO("Windows 10");
        as.setProcessor("Intel Core i7 (Sexta Generación)");
        System.out.println();
        System.out.println("Los datos de la laptop es: ");
        System.out.println("La marca es " + as.getMarca());
        System.out.println("La tienda que la vende es " + as.getTienda() );
        System.out.println("Tiene " + as.getHDD() + " de HDD");
        System.out.println("Tiene " + as.getRAM() + " de RAM");
        System.out.println("Sistema Operativo: " + as.getSO());
        System.out.println("Procesador: " + as.getProcessor());
        System.out.println(as.disponibilidad());
        
        
        Apple ap = new Apple("","","","","","");
        ap.setMarca("Apple");
        ap.setTienda("Liverpool");
        ap.setHDD("1 TB");
        ap.setRAM("6 GB");
        ap.setSO("OS X El Capitan");
        ap.setProcessor("Intel Core i7 (Sexta Generación)");
        System.out.println();
        System.out.println("Los datos de la laptop es: ");
        System.out.println("La marca es " + ap.getMarca());
        System.out.println("La tienda que la vende es " + ap.getTienda() );
        System.out.println("Tiene " + ap.getHDD() + " de HDD");
        System.out.println("Tiene " + ap.getRAM() + " de RAM");
        System.out.println("Sistema Operativo: " + ap.getSO());
        System.out.println("Procesador: " + ap.getProcessor());
        System.out.println(ap.pedido());
    }
    
}
