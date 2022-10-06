package for_2;

import java.util.Scanner;

public class For_2 {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        int masuk, angka, baris, kolom;
        
        do
        {
            System.out.print("Masukkan Jumlah Perulangan (Min 1) = ");
            masuk = input.nextInt();
        }
        while(masuk < 1);
        
        System.out.println("");
        System.out.println("+-------Tugas For 2-------+");
        System.out.println("+-------------------------+");
        System.out.println("");
        
        for (baris = 0, angka = 0; baris < masuk; baris++, angka++) 
        {
            for (kolom = 0; kolom <= baris; kolom++) 
            {
                System.out.print("* ");
            }
            System.out.println(angka);
        }
        System.out.println("");
        System.out.println("+------- 025314020 -------+");
        System.out.println("+-------Program Java------+");
    }
    
}
