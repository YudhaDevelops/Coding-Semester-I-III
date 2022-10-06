/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bilangangenap;

import java.util.Scanner;

/**
 *
 * @author TOSHIBA
 */
public class BilanganGenap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int bilangan;
        String nama;
        System.out.println("------------------------------------------------");
        System.out.println("-------------PROGRAM BILANGAN GENAP-------------");
        System.out.println("------------------------------------------------");
        System.out.print  ("Masukkan Nama Anda = ");
        nama = input.nextLine();
        System.out.print  ("Masukkan Bilangan Anda = ");
        bilangan = input.nextInt();
        if ((bilangan % 2)==0) {
            System.out.print  ("Nama Anda = " + nama);
            System.out.println(" Dan Bilangan Anda Genap ");
            System.out.println("Dengan Nominal = " +bilangan);
            System.out.println("------------------------------------------------");
            System.out.println("---PROGRAM BILANGAN GENAP By Skuy replay -------");
            System.out.println("------------------------------------------------");
        }
        else{
            System.out.print  ("Nama Anda = " + nama);
            System.out.println("Dan Bilangan Anda Ganjil ");
            System.out.println("Dengan Nominal = " +bilangan);
            System.out.println("------------------------------------------------");
            System.out.println("---PROGRAM BILANGAN GENAP By Skuy replay -------");
            System.out.println("------------------------------------------------");
        }
    }
    
}
