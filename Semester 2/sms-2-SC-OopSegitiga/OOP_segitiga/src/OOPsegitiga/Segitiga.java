/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOPsegitiga;

/**
 *
 * @author TOSHIBA
 */
public class Segitiga {
    /* deklarasi variabel */
    //atribut
    double miring;
    private String nama = "Segitiga Satu";
    private double alas = 4.0;
    private double tinggi = 6.0;
    
    //method
    public double getKeliling()
    {
        miring = Math.sqrt((alas * alas) + (tinggi * tinggi));
        return (alas + tinggi + miring);
    }
    
    public double getLuas()
    {
        return (0.5 * alas * tinggi);
    }
    
    //getter
    public String getNama()
    {
        return nama;
    }
    public double getAlas()
    {
        return alas;
    }
    public double getTinggi()
    {
        return tinggi;
    }
    
    //setter
    public void setNama(String Nama)
    {
        nama = Nama;
    }
    public void setAlas(double Alas)
    {
        if (Alas > 0 )
        {
            alas = Alas;
        }
        else
        {
            System.out.println("Alas Tidak Boleh Negatif");
            System.out.println("Dan Alas Tidak Bisa Berubah");
        }
    }
    public void setTinggi(double Tinggi)
    {
        if (Tinggi > 0)
        {
            tinggi = Tinggi;
        }
        else
        {
            System.out.println("Tinggi Tidak Boleh Negatif");
            System.out.println("Dan Tinggi Tidak Bisa Berubah");
        }
    }
}
