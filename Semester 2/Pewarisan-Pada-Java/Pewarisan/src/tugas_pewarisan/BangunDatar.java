/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tugas_pewarisan;

/**
 *
 * @author ASUS
 */
public class BangunDatar {
    String warna, nama;

    public BangunDatar() {
    }

    public BangunDatar(String warna, String nama) {
        this.warna = warna;
        this.nama = nama;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public double getLuas(){
        return 0;
    }
    public double getKeliling(){
        return 0;
    }
}
