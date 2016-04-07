/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c02.pkg03.pkg2016;

import java.util.Scanner;

/**
 *
 * @author CarlosManuel
 */
public class Contacto {
    
    Scanner sc = new Scanner (System.in);
    private String name, tel, email;
    
    public Contacto(){
        System.out.println("Digitalice el nombre del contacto: ");
        System.out.println("Digitalice el telefono del contacto: ");
        System.out.println("Digitalice el e-mail del contacto: ");
    }
    
    public Contacto(String name, String tel, String email){
	this.name = name;
	this.tel = tel;
	this.email = email;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setTel (String tel){
        this.tel = tel;
    }

    public void setEmail (String email){
       this.email = email;
    }
   
    public String getName(){
        return this.name;
    }
    
    public String getTel(){
        return this.tel;
    }
    
    public String getEmail(){
        return this.email;
    }

    
/*    
    
    public String consultarContactoCompleto(){
	if(!buscaEspacio()){
            return "Nombre: " + name + "; Telefono: " + tel + "; Email : " + email + ";";
        } else { 
            return "No existe este contacto.";
        }
    }*/
}
