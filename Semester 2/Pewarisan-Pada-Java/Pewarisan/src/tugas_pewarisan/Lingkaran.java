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
public class Lingkaran extends BangunDatar{
    private double jejari;
    private final double PI = 3.14;
    public Lingkaran(){
        
    }

    public Lingkaran(double jejari, String warna, String nama) {
        super(warna, nama);
        this.jejari = jejari;
    }

    public double getJejari() {
        return jejari;
    }

    public void setJejari(double jejari) {
        if (jejari > 0){
            this.jejari = jejari;
        }
        else{
            this.jejari = 1.0;
            System.out.println("Jejari Tidak boleh negatif dan jejari tidak berubah");
        }
    }
    
    @Override
    public double getLuas(){
        return(PI * jejari * jejari);
    }
    
    @Override
    public double getKeliling(){
        return (PI * 2 * jejari);
    }
}
