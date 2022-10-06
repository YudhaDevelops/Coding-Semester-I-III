package matrix;

import java.util.Scanner;

public class Matrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int baris, kolom, matrix = 4;
        char mulai = '0';

        System.out.println("+----------------------+");
        System.out.println("|---- Matrix 4 x 4 ----|");
        System.out.println("+----------------------+");
        System.out.println("");

        int[][] bil = new int[4][4];

        for (kolom = 0; kolom < matrix; kolom++) 
        {
            for (baris = 0; baris < matrix; baris++) 
            {
                System.out.printf(" Bilangan %d, %d = ", kolom, baris);
                bil[baris][kolom] = sc.nextInt();

            }
        }

        System.out.println("");
        System.out.println("");

        System.out.println("Matrix 4 x 4 = "); // berdasarkan tugas for 4
        System.out.println("");
        for (kolom = 0; kolom < matrix; kolom++) 
        {
            for (baris = 0; baris < matrix; baris++) 
            {
                System.out.printf(" %3d ", bil[baris][kolom]);
            }
            System.out.println(" ");
        }

        System.out.println("Segitiga Bawah"); //berdasarkan tugas for if 1
        System.out.println("");
        for (baris = 0; baris < matrix; baris++) {
            for (kolom = 0; kolom < matrix; kolom++) {
                if (kolom <= baris) 
                {
                    System.out.printf(" %d  ", bil[baris][kolom]);
                } 
                else 
                {
                    System.out.printf(" 0  ");
                }
            }
            System.out.println("");
        }

        System.out.println("Matrix Diagonal"); //berdasarkan tugas for if 3
        System.out.println("");
        for (kolom = 0; kolom < matrix; kolom++) 
        {
            for (baris = 0; baris < matrix; baris++) 
            {
                if (baris == kolom) 
                    System.out.printf(" %d ", bil[baris][kolom]);
                else 
                    System.out.printf(" 0 ");
            }
            System.out.println("");
        }
        
        System.out.println("");
        System.out.println("+----------------------+");
        System.out.println("|-2020_Java_205314020-|");
        System.out.println("+----------------------+");
        System.out.println("");
    }

}
