package hitungfactorial;

import java.util.Scanner;

public class HitungFactorial {
    
    public static int hitungFaktorial (int bilangan){
        int angka, count, faktor, hitung;
        angka = bilangan;
        for (count = 1,faktor = 1; count <= angka; faktor = faktor * count,count++) {
        }
        
        while (count <= angka)
        {
            faktor = faktor * count;
            count++;
        }
        return faktor;
    }    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        int masuk, faktor;
        do
        {
            System.out.printf  ("Masukkan Angka Faktoria = ");
            masuk = sc.nextInt();
        }
        while (masuk < 0);        
        faktor = hitungFaktorial(masuk);
        System.out.println("");
        System.out.println ("Nilai Faktorial Dari "+ masuk +"! Adalah "+ faktor);
        System.out.println(" 2020 Java Skuy");
        
    }
    
}
