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
public class SegiEmpat extends BangunDatar{
    private double panjang, lebar;

    public SegiEmpat() {
    }

    public SegiEmpat(String warna, String nama) {
        super(warna, nama);
    }

    public SegiEmpat(double panjang, double lebar, String warna, String nama) {
        super(warna, nama);
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }
    
     @Override
    public double getKeliling(){
        return (2 * panjang + 2 * lebar);
    }
    @Override
    public double getLuas(){
        return (panjang * lebar);
    }
    
}
