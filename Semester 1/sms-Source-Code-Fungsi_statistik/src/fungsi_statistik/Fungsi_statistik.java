package fungsi_statistik;

import java.util.*;
import java.lang.ArrayIndexOutOfBoundsException;
public class Fungsi_statistik 
{
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
    public static double sigma (int ulang,int []bil)
    {
        int sigma,i;
        sigma = 0;
        for (i = 0; i < ulang; i++) {
            sigma = sigma + bil[i];
        }
        
       return sigma;
    }
    public static double rerata(double sigma, int ulang)
    {
        double rerata;
        rerata = sigma / ulang;
        return rerata;
    }
    public static double varians (int ulang, double rerata, int []bil)
    {
        int i;
        double varians = 0;
        for (i = 0; i < ulang; i++) {
            varians = varians + (bil[i] - rerata) * (bil[i] - rerata);
        }
        varians /= (ulang -1);
        return varians;
    }
    public static double stdev (double varians, double hitungAkar_2)
    {
        double stdev;
        stdev = hitungAkar_2(varians);
        return stdev;
    }
    public static double minimal (int ulang, int [] data)
    {
        int i;
        double minimal, maksimal;
        minimal = 0;
        maksimal = 0;
        maksimal = data[0];
        minimal = data[0];
        for (i = 1; i < ulang; i++) {
            if(data[i] > maksimal)
            {
                maksimal = data[i];
            }
            else if (data[i] < minimal)
            {
                minimal = data[i];
            }
        }
        
        return minimal;
    }
    public static double maksimal (int ulang, int [] data)
    {
        int i;
        double minimal, maksimal;
        minimal = 0;
        maksimal = 0;
        maksimal = data[0];
        minimal = data[0];
        
        for (i = 1; i < ulang; i++) {
            if(data[i] > maksimal)
            {
                maksimal = data[i];
            }
            else if (data[i] < minimal)
            {
                minimal = data[i];
            }
        }
        
        return maksimal;
    }
    
    public static int Faktorial (int bilangan){
        int angka, count, faktor, hitung;
        angka = bilangan;
        for (count = 1,faktor = 1; count <= angka; faktor = faktor * count,count++) {
        }
        
        return faktor;
    }
    
    public static int segitigaPascal(int n, int r)
    {
        int kurang, combinasi;
        kurang = n - r;
        combinasi = Faktorial(n) / (Faktorial(r) * Faktorial(kurang) );
        
        return combinasi;
    }
   
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int ulang, baris,masuk,kolom;
        double sigma,rerata,varians,stdev,minimal,maksimal,hitungAkar2;
        
        System.out.println("+--------------------------------------+");
        System.out.println("|        Wellcome To My Program        |");
        System.out.println("+--------------------------------------+");
        System.out.println("|                                      |");
        System.out.println("|                                      |");
        System.out.println("|                                      |");
        System.out.println("+--------------------------------------+");
        System.out.println("|          Program Statistika          |");
        System.out.println("+--------------------------------------+");
        System.out.println("");
        
        System.out.print("Masukkan Nama Anda = ");
        String nama = sc.nextLine();
        System.out.println("");
        
        do
        {
            System.out.print("Masukkan perulangan = ");
            ulang = sc.nextInt();
        }
        while(ulang <= 0 || ulang > 100);
        
        
        int [] data = new int [100];
        
        for (baris = 0; baris < ulang; baris++)
        {
            System.out.print("Bilangan ke- "+ baris +" = ");
                data[baris] = sc.nextInt();
                
        }
        System.out.println("");
        
        hitungAkar2 = hitungAkar_2(ulang);
        sigma = sigma(ulang,data);
        rerata = rerata(sigma,ulang);
        varians = varians(ulang,rerata, data);
        stdev = stdev(varians, hitungAkar2);
        minimal = minimal(ulang, data);
        maksimal = maksimal(ulang, data);
                
        System.out.printf("Nama User Pengguna Saudara/i %s \n" , nama);
        System.out.printf("Sigma Data     = %7.2f \n", sigma);
        System.out.printf("Rerata         = %7.2f \n", rerata);
        System.out.printf("Varians        = %7.2f \n", varians);
        System.out.printf("Standart Dev   = %7.2f \n", stdev);
        System.out.printf("Nilai Maksimum = %7.2f \n", maksimal);
        System.out.printf("Nilai Minimum  = %7.2f \n", minimal);
        
        
        System.out.println("");
        System.out.println("");
        System.out.println("+--------------------------------------+");
        System.out.println("|            Program Sortir            |");
        System.out.println("+--------------------------------------+");
        System.out.println("");
        
        
        System.out.println("");
        System.out.println("");
        System.out.println("+--------------------------------------+");
        System.out.println("|       Program Segitiga Pascal        |");
        System.out.println("+--------------------------------------+");
        
        do
        {
            System.out.printf  ("Masukkan Angka Faktoria = ");
            masuk = sc.nextInt();
        }while(masuk <= 2 );
        
        for (baris = 0; baris <= masuk; baris++) 
        {
            for (kolom = 0; kolom <= baris; kolom++)
            {
                for (kolom = 0; kolom <= baris; kolom++) {
                    System.out.printf("%5d",(int)segitigaPascal(baris, kolom));
                }
                System.out.println("");
            }
        }
        
        
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("+--------------------------------------+");
        System.out.println("|         2020 (Java) Skuy Replay      |");
        System.out.println("+--------------------------------------+");
        System.out.println("");
    }
    
}
