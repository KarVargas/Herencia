/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c27.pkg04.pkg2016;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author CarlosManuel
 */
public class Generica<T>{
    //private T t;
    /*ArrayList<T> contenido;
    Generica<String> listn = new Generica<String>();
    Generica<String> lists = new Generica<String>();
    Generica<Integer> liste = new Generica<Integer>();*/
    ArrayList<T> list = new ArrayList<T>();
    protected int i;
    
    public Generica(){      }
    public void almacenarUltimoDisponible(/*String nombre, String sexo, int edad,*/ T dato){
        list.add(dato);
        System.out.println("Se ha agregado el dato");
        /*Persona p = new Persona(nombre, sexo, edad);
        if (this.i < 10){
            try{  
                list.add((T) p);
                this.i++;
                wait();
            } catch(InterruptedException e) {
                System.out.println("Excepcion al Agregar");
            }
        }
        notifyAll();
        Persona p = new Persona(nombre, sexo, edad);
        int i = almacenarEnPosicion(list);
        if (i == 100){ //listaContacto.length){
            System.out.println("Lo sentimos tu lista de contactos esta llena");
        } else {
            list.set(i, (T) p);
        }*/
    }
    
    public void almacenarEnPosicion(/*List[] agenda*/int pos, T dato){
        try {
            this.list.add(pos, dato);
            System.out.println("Se ha agregado el dato");
        } catch (IndexOutOfBoundsException e){
            System.out.println("Fuera del limite de posiciones");
        }
        /* list.add(pos, dato);
        
        int i = 0;
        while (agenda [i]!= null){
            i++;
        }
        if (1<agenda.length -1){
            return i;
        } else {
            return 100;
        }*/
    }
    
    public ArrayList<T> devuelveAlmacenados(){
        /*if (list [i]!= null){
            System.out.println ("La info del contacto" + i + "es: ");
            return
                list[i].getN()+
                list[i].getS()+
                list[i].getE();
        }else{
          return "El contacto no existe dentro de la agenda" + i;
        }*/
        return this.list;
    }
    
    public T devuelvePrimero(){
        return list.get(0);
    }
    
    public T devuelveUltimoExistente(){
        return this.list.get(this.list.size() - 1);
    }
    /*public int getI(){
        return this.i;}
   
    @Override
    public String toString(){
        String cant = new Integer(getI()).toString();
        return cant;}*/
}
