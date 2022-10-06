package tugas_n;

import java.util.Scanner;

public class Tugas_N {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int masuk, baris, kolom;
        
        do
        {
            System.out.print("Masukkan Jumlah Pengulangan (Min 3) = ");
            masuk = sc.nextInt();
        }
        while(masuk < 3);
        
        System.out.println("");
        System.out.println("+----------Tugas N--------+");
        System.out.println("+-------------------------+");
        System.out.println("");
        
        for (baris = 0; baris < masuk; baris++) 
        {
            for (kolom = 0; kolom < masuk; kolom++) 
            {
                if(kolom == masuk + 1 || kolom == 0 || kolom == masuk - 1 || baris == kolom)
                {
                    System.out.print(" $ ");
                }
                else
                {
                    System.out.print(" . ");
                }
            }
            System.out.println(" ");
        }
        System.out.println("");
        System.out.println("+------- 025314020 -------+");
        System.out.println("+-------Program Java------+");
    }
    
}
