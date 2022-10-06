/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package angkabaik;

import java.util.Scanner;

/**
 *
 * @author TOSHIBA
 */
public class AngkaBaik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //angka ( ((0 <= angka) && (angka < 10)) && (angka != 4)
        Scanner input = new Scanner(System.in);
        int angka;
        String nama;
        System.out.println("------------------------------------------------");
        System.out.println("----------------PROGRAM ANGKA BAIK--------------");
        System.out.println("------------------------------------------------");
        System.out.print  ("Masukkan Nama Anda = ");
        nama = input.nextLine();
        System.out.print  ("Masukkan Angka Anda = ");
        angka = input.nextInt();
            if ( (0 <= angka) && (angka <= 10) && (angka != 4)){
                System.out.println("Nama Anda = " + nama);
                System.out.println("Bilangan Anda Adalah Bilangan Baik ");
                System.out.println("Dengan Nominal = " + angka);
                System.out.println("------------------------------------------------");
                System.out.println("----PROGRAM BILANGAN BAIK By Yudha Developer----");
                System.out.println("------------------------------------------------");
        }
            else{
                System.out.println("Nama Anda = " + nama);
                System.out.println("Bilangan Anda Adalah Bilangan Buruk ");
                System.out.println("Dengan Nominal = " + angka);
                System.out.println("------------------------------------------------");
                System.out.println("----PROGRAM BILANGAN BAIK By Yudha Developer----");
                System.out.println("------------------------------------------------");
        }
        
    }
    
}
