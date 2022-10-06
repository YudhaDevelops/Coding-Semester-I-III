package for_if_5;

import java.util.Scanner;

public class For_If_5 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        int masuk, baris, kolom;
        
        do
        {
            System.out.print("Masukkan Jumlah Pengulangan (Min 3) = ");
            masuk = sc.nextInt();
        }
        while (masuk < 3);
        
        System.out.println("");
        System.out.println("+-----Tugas For if 5 -----+");
        System.out.println("+-------------------------+");
        System.out.println("");
        
        for (baris = 0; baris < masuk; baris++) 
        {
            for (kolom = 1; kolom <= masuk; kolom++) 
            {
                if (kolom == baris + 1 || kolom == 1 || kolom == masuk || (kolom + baris) == masuk)
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
