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
public class EnkapSiswa {
    private String nama;
    private String address;
    private String kelas;

    EnkapSiswa() {
    }

    public String getNama() {
        return nama;
    }

    public String getAddress() {
        return address;
    }

    public String getKelas() {
        return kelas;
        
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public EnkapSiswa(String nama, String address, String kelas) {
        this.nama = nama;
        this.address = address;
        this.kelas = kelas;
    }
}
