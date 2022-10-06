package hitungakar_3;

import java.util.Scanner;

public class HitungAkar_3 {
    
    public static double hitungAkar_3(double bilangan){
        double hitung, akarBaru, galat, akar;
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
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        double akar,masuk;
        
        do
        {
            System.out.print  ("Masukkan Bilangan = ");
            masuk = sc.nextInt();
        }
        while (masuk < 0);
        
        akar = hitungAkar_3(masuk);
        System.out.println("");
        System.out.printf ("Akar dari %f adalah %f \n", masuk, akar);
        System.out.println(" 2020 Java Skuy ");
    }
    
}
