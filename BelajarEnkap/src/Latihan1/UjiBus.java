
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajarenkap;

/**
 *
 * @author USER
 */
public class UjiBus {
    public static void main (String[]args){
        //buat objek BusMini dari class Bus
        Bus BusMini = new Bus();
        //masukkan nilai jumlah penumpang dan makspenumpang kedalam objek baru tersebut
        BusMini.penumpang=5;
        BusMini.maksPenumpang=5;
        
        //memanggil atau eksekusi method
        BusMini.cetak();
        
        //menambah penumpang
        BusMini.penumpang= BusMini.penumpang +5;
        
        //eksekusi
        BusMini.cetak();
        
        //mengurangi penumpang
        BusMini.penumpang= BusMini.penumpang -2;
        
        //eksekusi
        BusMini.cetak();
        
        //menambah
        BusMini.penumpang= BusMini.penumpang +8;
        
        //eksekusi
        BusMini.cetak();
    }
}
