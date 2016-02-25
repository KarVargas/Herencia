/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c24.pkg02.pkg2016;

/**
 *
 * @author CarlosManuel
 */
public class botonApagar {
    
    //Attributes
    public Boolean IO;
    
    public botonApagar(){
        this.IO = false;    
    }
    
    public void presionar(){
        this.IO = !this.IO; //si esta apagado
    }
    
    
    
}
