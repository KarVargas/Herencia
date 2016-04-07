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
public class Telefono {
    
    //Attributes, instancia objeto
    Tecla[][] Teclado = new Tecla[5][3];
    botonApagar EA = new botonApagar(); //por default es publico
    
    //También tiene una lista de contactos
    public static Contacto[] listaContacto = new Contacto[100];
    
    //Contructor
    static int i = 0;
    public Telefono (){
        //inicializaTeclado ();
    }
    
    public static void nuevoContacto(String name, String tel, String email){
        Contacto t = new Contacto(name, tel, email);
        agregarContacto(t);        
    }
    
    public static String mostrarContacto(int i){
        if (listaContacto[i] != null){
            System.out.println("La info del contacto " + (i + 1)  + " es: ");
            return listaContacto[i].getName()+listaContacto[i].getTel()+listaContacto[i].getEmail();
        } else { 
            return "No existe contacto " + i;
        }
    }
    
    public static void agregarContacto(Contacto nuevo){
        int i = ultimo(listaContacto);
        if (i == 100){ //listaContacto.length){
            System.out.println("Lo sentimos tu lista de contactos esta llena");
        } else {
            //Contacto nuevo = new Contacto(name, tel, email);
            listaContacto[i] = nuevo;
            //i++;
        }
    }
    
    private static int ultimo (Contacto [] agenda){
        int i = 0;
        while (agenda [i]!= null){
            i++;
        }
        if (1<agenda.length -1){
            return i;
        } else {
            return 100;
        }
    }
    
    public static String mostrarContactos(int i){
        if (listaContacto [i]!= null){
            System.out.println ("La info del contacto" + i + "es: ");
            return
                listaContacto[i].getName()+
                listaContacto[i].getTel()+
                listaContacto[i].getEmail();
        }else{
          return "El contacto no existe dentro de la agenda" + i;
        }
/*        for (int j = 0; j < listaContacto.length; j++) {
            if (listaContacto[j] != null) {
                System.out.println("La info del contacto" + j + "es: ");
                listaContacto[j].getName();
                listaContacto[j].getTel();
                listaContacto[j].getEmail();
            }
        }*/
    }
    
/*    public static boolean buscaEspacio(int i){
	if (listaTel[i] = null){
            return true;
        } else {
            return false;
        }
    }*/
    
        
    
    
/*    private static int buscaEspacio(Contacto[].ListaTemp){
        //codigo para buscar espacio
    }
    public static void nuevoContacto(){
        System.out.println("Digitalice el nombre: ");
    }
    
    public static void mostrarContacto(){
    }*/
/*    public Telefono(){
        inicializaTeclado();
    }
    
    public static String mostrarContacto(int i){
        if (listaTel[i] !=  {
            return "El contacto" + i + "es: \n\t"
        }
    }*/
    
    public void setTeclado(){
        int n = 0;
        String s;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Tecla t = new Tecla();
                n++;
                s = Integer.toString(n);
                t.setDigito(s.charAt(0));
                Teclado[i][j] = t;
                
            }
        }
        
        Tecla t0 = new Tecla();
        t0.setDigito('*');
        Teclado[3][0] = t0;
        Tecla t1 = new Tecla();
        t1.setDigito('0');
        Teclado[3][1] = t1;
        Tecla t2 = new Tecla();
        t2.setDigito('#');
        Teclado[3][2] = t2;
        Tecla t3 = new Tecla();
        t3.setDigito('Y');
        Teclado[4][0] = t3;
        Tecla t4 = new Tecla();
        t4.setDigito('M');
        Teclado[4][1] = t4;
        Tecla t5 = new Tecla();
        t5.setDigito('N');
        Teclado[4][2] = t5;
        
        
    }
/*    private void setTecla(int i, int j, char){
        
    }
    static void mostarlista(){
        int i = 0;
        while(1<100){
            mostrarContacto(i);
        }
    }*/
}
