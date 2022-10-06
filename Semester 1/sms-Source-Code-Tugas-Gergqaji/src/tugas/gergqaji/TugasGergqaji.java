package tugas.gergqaji;

import java.util.Scanner;


public class TugasGergqaji {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int baris, kolom, masuk;
        do
        {
            System.out.print("Masukkan Jumlah Pengulangan = ");
            masuk = input.nextInt();
        }
        while(masuk < 3);
        for (int count = 1; count <= masuk; count++) 
        {
            
            for (baris = 0;  baris <= masuk; baris++) 
            {
                for (kolom = 1; kolom <= baris; kolom++) 
                {
                    System.out.print("* ");
                }
                System.out.println("");
            }
        }
    }
    
}
