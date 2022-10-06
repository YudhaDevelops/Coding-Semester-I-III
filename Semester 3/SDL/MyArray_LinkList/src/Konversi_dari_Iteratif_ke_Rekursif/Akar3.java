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
public class Akar3 {
//205314020 FX Bima Yudha Pratama
    // akar kubik
    public static double hitungAkar_3(double bil, double akar, double galat) {
        double akarBaru;
        if (galat > 0.000001) {
            akarBaru = (2 * akar + (bil / (akar * akar))) / 3.0;
            return hitungAkar_3(bil, akarBaru, akar - akarBaru);
        }
        return akar;
    }
    
    public static double akar3_1(double angka){
        return hitungAkar_3(angka, angka, angka);
    }

    public static double hitungAkar_3(double bilangan){
        double akarBaru, galat, akar;
        akar = bilangan;
        galat = akar;
        while(galat > 0.000001)
        {
            akarBaru = ( ( (2 * akar) + (bilangan / (akar * akar)) ) / 3);
            galat = akar - akarBaru;
            
            akar = akarBaru;
        }
        return akar;
    }
    
    static double cbrt(double angka, double akar, double n) {
        if (angka == 0 || angka == 1) {
            return angka;
        }
        if (n <= 0) {
            return akar;
        } else {
            return cbrt(angka, (1.0 / 3.0) * ((2 * akar) + (angka / (akar * akar))), n - 1);
        }
    }

    public static int hitungPanjangDigit(int n) {
        String angka = Integer.toString(n); //mencari panjang digit dengan mengubah nya ke tipe data String
        return angka.length();      //di cari panjang string nya
    }
    
    public static double akar3_2(double n) {
        int angka = hitungPanjangDigit((int) n);
        if (angka <= 2) {
            return cbrt(n, 1.3, n);
        }
        if (angka >= 5) {
            return cbrt(n, angka * Math.pow(10, 1), angka);
        }
        
        return cbrt(n, angka * Math.pow(10, 2), n);
    }

    
    public static void main(String[] args) {
        double akar3_1,akar3_2,loop, masuk;
        masuk = 5;
        akar3_1 = akar3_1(masuk);
        akar3_2 = akar3_2(masuk);
        loop = hitungAkar_3(masuk);
        System.out.println("");
        System.out.println("Hitung Akar 3");
        System.out.println("===========================================");
        System.out.println("---Looping---");
        System.out.println("Akar dari "+ masuk +" adalah adalah "+ loop);
        System.out.println("");
        System.out.println("===========================================");
        System.out.println("---Rekursif--");
        System.out.println("Akar dari "+ masuk +" adalah adalah "+ akar3_1);
        System.out.println("Akar dari "+ masuk +" adalah adalah "+ akar3_2);
    }

}
