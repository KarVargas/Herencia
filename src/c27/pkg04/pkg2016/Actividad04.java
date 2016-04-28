/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c27.pkg04.pkg2016;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author CarlosManuel
 */
public class Actividad04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Generica g = new Generica();
        //Strings
        Generica<String> ST = new Generica<String>();
        ST.almacenarUltimoDisponible("Como");
        ST.almacenarUltimoDisponible("esta");
        ST.almacenarUltimoDisponible("usted?");
        System.out.println(ST.devuelveAlmacenados());
        System.out.println("");
        
        //Integers
        Generica<Integer> IN = new Generica<Integer>();
        IN.almacenarUltimoDisponible(222);
        IN.almacenarUltimoDisponible(30);
        IN.almacenarUltimoDisponible(5);
        System.out.println(IN.devuelveAlmacenados());
        System.out.println("");
        
        //Floats
        Generica<Float> FL = new Generica<Float>();
        FL.almacenarUltimoDisponible(4.56f);
        FL.almacenarUltimoDisponible(2.4f);
        FL.almacenarUltimoDisponible(0.871f);
        System.out.println(FL.devuelveAlmacenados());
        System.out.println("");
        
        //Personas
        Generica<Persona> PE = new Generica<Persona>();
        Persona p1 = new Persona("Mariana", "Femenino", 19);
        Persona p2 = new Persona("Irving", "Masculino", 21);
        PE.almacenarUltimoDisponible(p1);
        PE.almacenarUltimoDisponible(p2);
        List<Persona> t = new ArrayList();
        t = PE.devuelveAlmacenados();
        System.out.println("");
        
        //Posicion
        Scanner sc = new Scanner(System.in);
        Persona p3 = new Persona("", "", 0);
        System.out.print("Nombre: ");
        String n = sc.next();
        p3.setN(n);
        System.out.print("Sexo: ");
        String s = sc.next();
        p3.setS(s);
        System.out.print("Edad: ");
        int e = sc.nextInt();
        p3.setE(e);
        PE.almacenarUltimoDisponible(p3);
        for (int i = 0; i < t.size(); i++) {
            System.out.println(t.get(i).getN() + ", " + t.get(i).getS() + ", " + t.get(i).getE());
        }
        System.out.println("");
        
        //System.out.println(t.get(2).getN() + ", " + t.get(2).getS() + ", " + t.get(2).getE());
    }
    
}
