/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enkap3;

/**
 *
 * @author USER
 */
public class TestSiswa {
    public static void main (String[]args){
        //eksekusi
        EnkapSiswa siswa = new EnkapSiswa();
        siswa.setNama ( "OKA");
        siswa.setAddress ("Tulungagung");
        siswa.setKelas ( "X RPL 1");
        System.out.println("Nama: "+siswa.getNama()+"\nAlamat: "+siswa.getAddress()+"\nKelas: "+siswa.getKelas());
    }
}
