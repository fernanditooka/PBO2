/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum1;

/**
 *
 * @author USER
 */
public class UjiBus {
    public static void main(String[] args) {
        Bus Bus = new Bus(100);
        Bus.getpenumpang(48);
        Bus.cetakpenumpang();
        System.out.println();
        //tambah
        
        Bus.getpenumpang(20);
        Bus.addpenumpang(30);
        Bus.cetakpenumpang();
        System.out.println();
        //tambah
        
        Bus.getpenumpang(48);
        Bus.addpenumpang(20);
        Bus.cetakpenumpang();
        System.out.println();
        //tambah
        
        Bus.getpenumpang(48);
        Bus.addpenumpang(23);
        Bus.cetakpenumpang();
        System.out.println();
        //tambah
        
        Bus.getpenumpang(20);
        Bus.addpenumpang(30);
        Bus.cetakpenumpang();
        System.out.println();
        //tambah
        Bus.getpenumpang(48);
        Bus.addpenumpang(30);
        Bus.cetakpenumpang();
        
        System.out.println("Rata-rata Berat Penumpang Bus Sekarang adalah = "+Bus.getAverage());
    }
}
