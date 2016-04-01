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
public class IndiceDeMasaCorporal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
/*        e = Integer.parseInt(JOptionPane.showInputDialog(null, "Cual es su estatura(cm)"));
        p = Integer.parseInt(JOptionPane.showInputDialog(null, "Cual es su peso(kg)"));
        s = JOptionPane.showInputDialog(null, "Cual es su género");
        //a = Integer.parseInt(JOptionPane.showInputDialog(null, "Cual es su edad"));
        Calcu gby = new Calcu();
        JOptionPane.showMessageDialog(null, "Su IMC es: " + imc);*/
        String es, p, nombre = null, genero = null;
        float estatura = 0,peso = 0;

        nombre = JOptionPane.showInputDialog(null, "Introduce tu Nombre",
        "IMC", JOptionPane.PLAIN_MESSAGE);
        es = JOptionPane.showInputDialog(null,
        "Introduce tu altura (Ejem: 1.80)", "IMC",
        JOptionPane.PLAIN_MESSAGE);
        p = JOptionPane.showInputDialog(null,
        "Introduce tu peso (Ejem: 80.2)", "IMC",
        JOptionPane.PLAIN_MESSAGE);

        estatura = Float.parseFloat(es);
        peso = Float.parseFloat(p);

//            JOptionPane.showMessageDialog(null, "Datos incorrectos", "Error",
//            JOptionPane.ERROR_MESSAGE);

        IMC imc = new IMC(peso, estatura, genero, nombre);
        imc.datosPersona();
    }        
    
/*    public static void mujer(float imc){
        if (imc < 15){
            JOptionPane.showMessageDialog(null, "Delgadez Severa");}
        if (imc >= 15 && imc < 16){
            JOptionPane.showMessageDialog(null, "Delgadez leve");}
        if (imc >= 16 && imc < 18.5){
            JOptionPane.showMessageDialog(null, "Delgadez");}
        if (imc >= 18.5 && imc < 25){
            JOptionPane.showMessageDialog(null, "Peso saludable");}
        if (imc >= 25 && imc < 30){
            JOptionPane.showMessageDialog(null, "Sobrepeso");}
        if (imc >= 30 && imc < 35){
            JOptionPane.showMessageDialog(null, "Obesidad moderada");}
        if (imc >= 35 && imc < 40){
            JOptionPane.showMessageDialog(null, "Obesidad severa");}
        if (imc >= 40){
            JOptionPane.showMessageDialog(null, "Obesidad muy severa (Obesidad mórbida)");}
    }
    
     public static void hombre(float imc){
        if (imc < 15){
            JOptionPane.showMessageDialog(null, "Delgadez Severa");}
        if (imc >= 15 && imc < 16){
            JOptionPane.showMessageDialog(null, "Delgadez leve");}
        if (imc >= 16 && imc < 18.5){
            JOptionPane.showMessageDialog(null, "Delgadez");}
        if (imc >= 18.5 && imc < 25){
            JOptionPane.showMessageDialog(null, "Peso saludable");}
        if (imc >= 25 && imc < 30){
            JOptionPane.showMessageDialog(null, "Sobrepeso");}
        if (imc >= 30 && imc < 35){
            JOptionPane.showMessageDialog(null, "Obesidad moderada");}
        if (imc >= 35 && imc < 40){
            JOptionPane.showMessageDialog(null, "Obesidad severa");}
        if (imc >= 40){
            JOptionPane.showMessageDialog(null, "Obesidad muy severa (Obesidad mórbida)");}
    }*/
    /*public void mujer(int e){
        switch (e){
            case 3: break;
            case 4: break;
            case 5: break;
            case 6: break;
            case 7: break;
            case 8: break;
            case 9: break;
            case 10: break;
            case 11: break;
            case 12: break;
            case 13: break;
            case 14: break;
            case 15: break;
            case 16: break;
            case 17: break;
            case 18: break;
        }
    }*/
    
    /*public void hombre(int e){
        switch (e) {
            case 3: break;
            case 4: break;
            case 5: break;
            case 6: break;
            case 7: break;
            case 8: break;
            case 9: break;
            case 10: break;
            case 11: break;
            case 12: break;
            case 13: break;
            case 14: break;
            case 15: break;
            case 16: break;
            case 17: break;
            case 18: break;
        }
    }*/
}
