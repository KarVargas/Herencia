/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalcuPE;

import javax.swing.*;

/**
 *
 * @author CarlosManuel
 */
public class IMC {
    
    //Attributes
    private float peso, estatura; 
    private String genero, nombre;
    
    public IMC(float peso, float estatura, String genero, String nombre){
        if (estatura > 0.0 && peso > 0.0) {
            this.estatura = estatura;
            this.peso = peso;
            this.genero = genero;
            this.nombre = nombre;
	} else {
            this.estatura = 0;
            this.peso = 0;
            this.genero = "";
            this.nombre = "";
        }
    }
    public float getPeso(){
        return peso;
    }
    public float getEstatura(){
        return estatura;
    }
    public String getGenero(){
        return genero;
    }
    public String getNombre(){
        return nombre;
    }
    public float calcularIMC() {
        if (getEstatura() > 0) {
            return (float) (peso / (Math.pow(estatura, 2)));
        } else {
            return 0;
        }
    }
    public String estado(){
        double imc = calcularIMC();
        if (imc < 15 ){ 
            return "Delgadez Severa";
        } else if (imc >= 15 && imc < 16) { 
            return "Delgadez leve";
        } else if (imc >= 16 && imc < 18.5) {
            return "Delgadez";
        } else if (imc >= 18.5 && imc < 25) {
            return "Peso saludable";
        } else if (imc >= 25 && imc < 30) {
            return "Sobrepeso";
        } else if (imc >= 30 && imc < 35) {
            return "Obesidad moderada";
        } else if (imc >= 35 && imc < 40) {
            return "Obesidad severa";
        } else {
            return "Obesidad muy severa (Obesidad mórbida)";
        }
    }
    public void datosPersona() {
        String imc = String.format(
        "Paciente : %s\nPeso : %.2f Kg\nAltura : %.2f m\n\n"
        + "IMC : %.2f\nEstado : %s\n\n", getNombre(),
        getPeso(), getEstatura(), calcularIMC(), estado());

        if (calcularIMC() > 0) {
            JOptionPane.showMessageDialog(null, imc, "IMC", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    /*public void setEstatura(int e){
        this.estatura = estatura;
    }
    public void setPeso(int p){
        this.peso = peso;
    }
    public void setGenero(String g){
        this.genero = genero;
    }*/
    
    
    
    //i = (int) Math.pow(e, 2);
    //imc = (p / i) * 10000;
    
    /*switch (s){
        case "F": 
            mujer(imc); 
            break;
        case "M": 
            hombre(imc); 
            break;
    }*/
}
    
    
