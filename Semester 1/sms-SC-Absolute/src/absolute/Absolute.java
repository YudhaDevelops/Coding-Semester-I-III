/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package absolute;

import java.util.Scanner;

/**
 *
 * @author TOSHIBA
 */
public class Absolute {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int bilangan;
        String nama;
        System.out.println("------------------------------------------------");
        System.out.println("-----------------PROGRAM ABSOLUTE---------------");
        System.out.println("------------------------------------------------");
        System.out.print  ("Masukkan Nama Anda = ");
        nama = input.nextLine();
        System.out.print  ("Masukkan Angka Anda = ");
        bilangan = input.nextInt();
            if (bilangan < 0){
                System.out.println("Nama Anda = " + nama);
                System.out.println("Bilangan Yang Anda Masukkan = " +bilangan);
                System.out.println("Nilai Absolute = "+ bilangan * -1);
                System.out.println("------------------------------------------------");
                System.out.println("------PROGRAM ABSOLUTE By Yudha Developer-------");
                System.out.println("------------------------------------------------");
        }
            else{
                System.out.println("Nama Anda = " + nama);
                System.out.println("Bilangan Yang Anda Masukkan = " +bilangan);
                System.out.println("Nilai Absolute = "+ bilangan);
                System.out.println("------------------------------------------------");
                System.out.println("------PROGRAM ABSOLUTE By Yudha Developer-------");
                System.out.println("------------------------------------------------");
        }
    }
    
}
