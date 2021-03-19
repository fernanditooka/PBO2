/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan2;

/**
 *
 * @author USER
 */
public class Bus {
    private int penumpang,makspenumpang;
    //konstruktor
    public Bus(int makspenumpang){
        this.makspenumpang=makspenumpang;
        penumpang = 0;
    }
        public void addPenumpang(int penumpang) {
        int temp;
        temp = this.penumpang + penumpang;
        if (temp >= makspenumpang) {
            System.out.println("Penumpang melebihi kuota");
        } else {
            this.penumpang = temp;
        }
    }
    //method mutator
    public void pluspenumpang(int penumpang){
        int temp;
        temp=this.penumpang+penumpang;
        if (temp>=makspenumpang){
            System.out.println("Overload Penumpang");
        }
        else{
            this.penumpang=temp;
        }
    }
    public void cetak(){
        System.out.println("Penumpang Sekarang = "+penumpang);
        System.out.println("Penumpang Maks Seharusnya = "+makspenumpang);
    }
}
