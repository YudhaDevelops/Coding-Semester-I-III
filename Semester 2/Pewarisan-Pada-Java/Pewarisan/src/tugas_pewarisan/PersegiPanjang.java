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
public class PersegiPanjang extends SegiEmpat{

    public PersegiPanjang() {
    }

    public PersegiPanjang(double panjang, double lebar, String warna, String nama) {
        super(panjang, lebar, warna, nama);
    }
    
    
    @Override
    public double getKeliling(){
        return (2 * (super.getPanjang() + super.getLebar()) );
    }
}
