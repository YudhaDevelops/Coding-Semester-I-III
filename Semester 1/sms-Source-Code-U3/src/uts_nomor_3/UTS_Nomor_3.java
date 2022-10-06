/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts_nomor_3;

import java.util.Scanner;

/**
 *
 * @author TOSHIBA
 */
public class UTS_Nomor_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
/*      Universitas KotaBebek, berenana membuat program untuk menghitung nilai akhir dalam bentuk angka dan huruf. 
        Nilai akhir dalam bentuk angka diperoleh dari nilai Tugas, UTS1, UTS2 dan UAS. 
        Masing-masing nilai diinputkan melalui keyboard. 
        Bobot komponen penilaian adalah Tugas 30%, UTS1 15%, UTS2 20% dan UAS 35%. 
        Jika nilai angka lebih besar atau sama dengan 80 maka nilai hurufnya adalah A. 
        Nilai angka lebih besar atau sama dengan 70 dan di bawah 80 mendapakan nilai huruf B. 
        Nilai huruf C diperoleh jika nilai angka lebih besar atau sama dengan 60 dan lebih kecil dari 70. 
        Nilai angka di bawah 60 dinyatakan tidak lulus dan mendapatkan nilai huruf D. Buatlah program tersebut
*/
        double nilaiTugas, nilaiUTS1, nilaiUTS2, nilaiUAS;
        double nilaiAngka, NILAI_TUGAS, NILAI_UTS1,NILAI_UTS2, NILAI_UAS;
        NILAI_TUGAS = 0.30;
        NILAI_UTS1 = 0.15;
        NILAI_UTS2 = 0.20;
        NILAI_UAS = 0.35;
        
        Scanner input = new Scanner(System.in);
        System.out.println("");
        System.out.println("Perhitungan Nilai Akhir");
        System.out.println("Nama : FX Bima Yudha Pratama");
        System.out.println("NIM  : 205314020");
        System.out.println("");
        System.out.print  ("Maukkan Nilai Tugas : ");
        nilaiTugas = input.nextDouble();
        
        System.out.print  ("Masukkan Nilai UTS 1: ");
        nilaiUTS1 = input.nextDouble();
        
        System.out.print  ("Masukkan Nilai UTS 2: ");
        nilaiUTS2 = input.nextDouble();
        
        System.out.print  ("Masukkan Nilai UAS  : ");
        nilaiUAS = input.nextDouble();
        
        nilaiAngka = (nilaiTugas * NILAI_TUGAS ) + (nilaiUTS1 * NILAI_UTS1) + (nilaiUTS2 * NILAI_UTS2) + (nilaiUAS * NILAI_UAS);
        System.out.println("");
            if (nilaiAngka >= 80 && nilaiAngka <= 100){
                System.out.println("Selamat Anda LULUS");
                System.out.println("Nilai Angka Anda= " + nilaiAngka);
                System.out.println("Anda Mendapatkan Nilai \"A\"");
            }
            else if (nilaiAngka >= 70 && nilaiAngka < 80){
                System.out.println("Selamat Anda LULUS");
                System.out.println("Nilai Angka Anda = " + nilaiAngka);
                System.out.println("Anda Mendapatkan Nilai \"B\"");
            }
            else if (nilaiAngka >= 60 && nilaiAngka < 70){
                System.out.println("Selamat Anda LULUS");
                System.out.println("Nilai Angka Anda = " + nilaiAngka);
                System.out.println("Anda Mendapatkan Nilai \"C\"");
            }
            else{
                System.out.println("Maaf Anda Tidak LULUS");
                System.out.println("Nilai Angka Anda = " + nilaiAngka);
                System.out.println("Anda Mendapatkan Nilai \"D\"");
            }
    }
    
}
