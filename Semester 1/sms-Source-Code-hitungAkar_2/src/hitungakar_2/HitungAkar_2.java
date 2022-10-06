package hitungakar_2;

import java.util.Scanner;

public class HitungAkar_2 {
    
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
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        double akar,masuk;
        
        do
        {
            System.out.printf  ("Masukkan Angka Faktoria = ");
            masuk = sc.nextInt();
        }
        while (masuk < 0);
        
        akar = hitungAkar_2(masuk);
        System.out.println("");
        System.out.printf ("Akar dari %f adalah adalah %f \n", masuk , akar);
        System.out.println(" 2020 Java Skuy");
    }
    
}
