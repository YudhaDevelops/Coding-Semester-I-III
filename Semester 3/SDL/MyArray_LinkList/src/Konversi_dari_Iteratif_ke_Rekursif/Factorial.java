package Konversi_dari_Iteratif_ke_Rekursif;
//205314020 FX Bima Yudha Pratama
public class Factorial {

    public static int hitungFaktorial(int bilangan) {
        if (bilangan == 0) {
            System.out.println("Faktorial Selesai");
            return 1;
        }
        else{
            return bilangan * hitungFaktorial(bilangan - 1);
        }
    }
    
    public static void main(String[] args) {
        int masuk, faktor;
        masuk = 8;
        faktor = hitungFaktorial(masuk);

        System.out.println("");
        System.out.println("Nilai Faktorial Dari " + masuk + "! Adalah " + faktor);
    }

}
