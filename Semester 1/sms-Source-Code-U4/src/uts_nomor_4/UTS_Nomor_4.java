/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts_nomor_4;

import java.util.Scanner;

/**
 *
 * @author TOSHIBA
 */
public class UTS_Nomor_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int nilaiAngka;
        double nilaiTugas, nilaiUTS1, nilaiUTS2, nilaiUAS;
        double NILAI_TUGAS, NILAI_UTS1, NILAI_UTS2, NILAI_UAS;
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
        nilaiAngka = (int) ((nilaiTugas * NILAI_TUGAS ) + (nilaiUTS1 * NILAI_UTS1) + (nilaiUTS2 * NILAI_UTS2) + (nilaiUAS * NILAI_UAS));
        System.out.println("");
            if (nilaiAngka >= 80 && nilaiAngka <= 100){
                System.out.println("Nilai Angka = ");
                if (nilaiAngka >=80.1 && nilaiAngka < 80.5){
                    int nilai = nilaiAngka - 2;
                    System.out.println("---Versi LangLingLung---");
                    System.out.println("Selamat Anda LULUS");
                    System.out.println("Nilai Angka Anda= " + nilai);
                    System.out.println("Anda Mendapatkan Nilai \"A\"");
                }
                else if(nilaiAngka >= 80.5 && nilaiAngka < 100){
                    int nilai = nilaiAngka + 2;
                    System.out.println("---Versi LangLingLung---");
                    System.out.println("Selamat Anda LULUS");
                    System.out.println("Nilai Angka Anda= " + nilai);
                    System.out.println("Anda Mendapatkan Nilai \"A\"");
                }
                
            }
            else if (nilaiAngka >= 70 && nilaiAngka < 80){
                System.out.println("Nilai Angka = " + nilaiAngka);
                if (nilaiAngka >=70.1 && nilaiAngka < 70.5){
                    int nilai = nilaiAngka - 2;
                    System.out.println("---Versi LangLingLung---");
                    System.out.println("Selamat Anda LULUS");
                    System.out.println("Nilai Angka Anda= " + nilai);
                    System.out.println("Anda Mendapatkan Nilai \"A\"");
                }
                else if(nilaiAngka >= 70.5 && nilaiAngka < 80){
                    int nilai = nilaiAngka + 2;
                    System.out.println("---Versi LangLingLung---");
                    System.out.println("Selamat Anda LULUS");
                    System.out.println("Nilai Angka Anda= " + nilai);
                    System.out.println("Anda Mendapatkan Nilai \"A\"");
                }
                
            }
            else if (nilaiAngka >= 60 && nilaiAngka < 70){
                System.out.println("Nilai Angka = " + nilaiAngka);
                    if(nilaiAngka >=60.1 && nilaiAngka < 60.5){
                        int nilai = nilaiAngka - 2;
                        System.out.println("---Versi LangLingLung---");
                        System.out.println("Selamat Anda LULUS");
                        System.out.println("Nilai Angka Anda = " + nilai);
                        System.out.println("Anda Mendapatkan Nilai \"C\"");
                    }
                    else if (nilaiAngka >= 60.5 && nilaiAngka < 70){
                        int nilai = nilaiAngka + 2;
                        System.out.println("---Versi LangLingLung---");
                        System.out.println("Selamat Anda LULUS");
                        System.out.println("Nilai Angka Anda = " + nilai );
                        System.out.println("Anda Mendapatkan Nilai \"C\"");
                    }
                
            }
            else{
                System.out.println("Nilai Angka = ");
                System.out.println("---Versi LangLingLung---");
                System.out.println("Maaf Anda Tidak LULUS");
                System.out.println("Nilai Angka Anda = " + nilaiAngka);
                System.out.println("Anda Mendapatkan Nilai \"D\"");
            }
    }
    
}
