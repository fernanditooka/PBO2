/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EnkapNilai;

/**
 *
 * @author USER
 */
public class Enkapsulasinilai {
    public static void main(String[]args){
        nilai Bio = new nilai();
        Bio.Nama = "OKA";
        Bio.Kelas = " X RPL 1 ";
        Bio.NIS = " 2206042020 ";
        Bio.setnilai(100);
        System.out.println("NAMA = "+Bio.Nama);
        System.out.println("KELAS = "+Bio.Kelas);
        System.out.println("NIS = "+Bio.NIS);
        System.out.println("NILAI = "+Bio.getnilai());
    }
}
