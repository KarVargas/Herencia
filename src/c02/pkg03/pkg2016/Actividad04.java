/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c02.pkg03.pkg2016;

/**
 *
 * @author CarlosManuel
 */
public class Actividad04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Telefono starTAC = new Telefono ();  
        Telefono.nuevoContacto("Carlos Vargas ", "8333020934 ", "A00512795@itesm.mx");
        System.out.println(Telefono.mostrarContacto(0));
        Telefono.nuevoContacto("Irving ","8331111111 ","manchester_irving@hotmail.com");
        System.out.println(Telefono.mostrarContacto(1));
        Telefono.nuevoContacto("Moises ","8331123096 ", "moises_guerrero@hotmail.com");
        System.out.println(Telefono.mostrarContacto(2));
        Telefono.nuevoContacto("Mariana ","8333333333 ", "mariana_96@hotmail.com");
        System.out.println(Telefono.mostrarContacto(3));
        Telefono.nuevoContacto("Roxana ","8332222222 ","rox_rox@hotmail.com");
        System.out.println(Telefono.mostrarContacto(4));
        System.out.println(Telefono.mostrarContacto(80));
       
                    
        starTAC.EA.presionar();
        System.out.println ("el starTac esta "+ starTAC.EA.IO);
        starTAC.setTeclado();
        //Ciclos que recorren toda la matriz
        for (int i = 0; i < 5; i++) { 
            for (int j = 0; j < 3; j++) {
                System.out.print(starTAC.Teclado[i][j].getDigito() + " ");
            }
            System.out.println("");
        }

/*        Telefono starTAC = new Telefono();
        starTAC.EA.presionar();
        System.out.println("El starTAC está " + starTAC.EA.IO);
        starTAC.setTeclado();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(starTAC.Teclado[i][j].getDigito() + " ");
            }
            System.out.println("");
        }
        Telefono.agregarContacto("Carlos Vargas", "8333020934", "A00512795@itesm.mx");*/
     
        
/*        pedro = new Contacto("Pedro", "666444333", "pedro@email.com");
        juan = new Contacto("Juan", "655533110", "juan@email.com");
        alvaro = new Contacto("Alvaro", "N/A", "alvaro@email.com");

        agenda.aniadirContacto(pedro);
        agenda.aniadirContacto(juan);
        agenda.aniadirContacto(alvaro);

        agenda.printAllContacts();

        System.out.println("Buscamos 'Pedro':");
        System.out.println(agenda.buscarContacto("pedro").consultarContactoCompleto());
        System.out.println("Buscamos 'Ana':");
        System.out.println(agenda.buscarContacto("ana").consultarContactoCompleto());*/
        
//        Telefono.nuevoContacto("Carlos Vargas", "8333020934", "A00512795@itesm.mx");
/*        System.out.println(Telefono.mostrarContacto(0));
        System.out.println(Telefono.mostrarContacto(80));
        
        Telefono analogo = new Telefono();
        Telefono.nuevoContacto();
        System.out.println(Telefono.mostrarContacto(1));*/
        

    }

}
