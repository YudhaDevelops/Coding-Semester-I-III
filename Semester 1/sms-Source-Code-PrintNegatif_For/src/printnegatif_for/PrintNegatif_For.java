/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package printnegatif_for;

import java.util.Scanner;

/**
 *
 * @author Personal
 */
public class PrintNegatif_For {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        int angka, angkaBaru;
        String nama;
       
        
       
        System.out.print  ("Masukkan Angka = ");
        angka = input.nextInt();
        
        for (nama = "FX BIMA YUDHA PRATAMA"; angka > 0; angkaBaru = angka - 1, angka--) {
            System.out.printf ("%d. %s %n" , angka, nama);
        }
    }
}
