/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum2;

/**
 *
 * @author USER
 */
public class Bola {
    public double r=21;
    public double d;
    public double luaspermukaan;
    public double volume;
    
    
    public void SetJarijari(){
        r = 21;
        System.out.println("Jari-jari yang digunakan adalah = "+r);
    }
    public void showDiameter(){
        d = 2*r;
        System.out.println("Diameter yang digunakan adalah = "+ d);
    }
    public void showLuaspermukaan(){
        luaspermukaan = 2*Math.PI*r*r;
        System.out.println("Luas Permukaan Bola adalah = "+luaspermukaan);
    }
    public void showVolume(){
        volume = 4/3*Math.PI*r*r*r;
        System.out.println("Volume bola adalah = "+volume);
    }
}
