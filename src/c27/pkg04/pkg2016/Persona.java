/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c27.pkg04.pkg2016;

/**
 *
 * @author CarlosManuel
 */
public class Persona {
    private String nombre, sexo;
    private int edad;
    
    public Persona(String nombre, String sexo, int edad){
        this.nombre = nombre;
	this.sexo = sexo;
	this.edad = edad;}
    public void setN(String nombre){
        this.nombre = nombre;}
    public void setS(String sexo){
        this.sexo = sexo;}
    public void setE(int edad){
        this.edad = edad;}
    
    public String getN(){
        return nombre;}
    public String getS(){
        return sexo;}
    public int getE(){
        return edad;}
}
