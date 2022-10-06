package Konversi_dari_Iteratif_ke_Rekursif;
/*
    Tugas ini kami kerjakan bersama-sama 
    Jadi mungkin jawaban kami bertiga hampir semuanya sama
    205314020 FX Bima Yudha P
    205314027 Andreas Kevin M
    205314029 Michael Octavian S.R

    Kami mengerjakan bersama karena sedikit mengalami kesulitan
    Sehingga kami berdiskusi untuk mendapat jawaban yang tepat

    Sumber :
    https://en.wikipedia.org/wiki/Methods_of_computing_square_roots#Babylonian_method
*/
public class Akar {
//205314020 FX Bima Yudha Pratama
    // Rekursif
    // akar kuadrat
    public static double hitungAkar2_1(double bil, double akar, double galat) {
        double akarBaru;
        if (galat > 0.000000000001) {
            akarBaru = (akar + (bil / akar)) / 2.0;
            return hitungAkar2_1(bil, akarBaru, akar - akarBaru);
        }
        return akar;
    }
    
    public static double akar2(double angka){
        return hitungAkar2_1(angka, angka, angka);
    }
    
    
    // menggunakan rumus babilonia//
    static double hitungAkar2_2(double angka, double akar, double m) {

        if (angka == 0 || angka == 1) {
            return angka;
        }
        if (m <= 0) {
            return akar;
        } else {
            return hitungAkar2_2(angka, 0.5 * (akar + angka / akar), m - 1);
        }

    }

    static double akar(double angka) {
        int panjangDigit = hitungPanjangDigit((int) angka);     //output data dari hitung panjang digit di ubah tipe data nya ke integer
        if (panjangDigit == 1) {
            return hitungAkar2_2(angka, 1.4, angka);
        }
        if (panjangDigit >= 4) {
            return hitungAkar2_2(angka, panjangDigit * Math.pow(10, 2), panjangDigit);
        }
        return hitungAkar2_2(angka, panjangDigit * Math.pow(10, 2), angka);
    }
    
    // hitung panjang digit
    public static int hitungPanjangDigit(int n) {
        String angka = Integer.toString(n); //mencari panjang digit dengan mengubah nya ke tipe data String
        return angka.length();      //di cari panjang string nya
    }
    
    //looping 
    public static double hitungAkar_2(double bil){
        double akar, akarBaru, galat;
        akar= bil;
        galat = akar ;
        while( galat > 0.00001){
            akarBaru = ( akar + ( bil /akar ))/ 2.0;
            galat = akar - akarBaru ;
            akar = akarBaru ;
        }
        return akar;
    }
    
    public static void main(String[] args) {
        double akar2,loop, akar, masuk;
        masuk = 8;
        akar = akar(masuk); //menggunakan rumus babilonian
        akar2 = akar2(masuk);
        loop = hitungAkar_2(masuk); 
        System.out.println("");
        System.out.println("Hitung Akar 2");
        System.out.println("===========================================");
        System.out.println("---Looping---");
        System.out.println("Akar dari "+ masuk +" adalah adalah "+ loop);
        System.out.println("");
        System.out.println("===========================================");
        System.out.println("---Rekursif--");
        System.out.println("Akar dari "+ masuk +" adalah adalah "+ akar);
        System.out.println("Akar dari "+ masuk +" adalah adalah "+ akar2);

    }

}
