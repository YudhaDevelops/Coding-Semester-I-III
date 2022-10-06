/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package print_10_for;

import java.util.Scanner;
/**
 *
 * @author Personal
 */
public class Print_10_For {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
       
       int angka, counter, angkaBaru;
       String nama;
       
        System.out.print  ("Masukkan Angka = ");
        angka = input.nextInt();
        
        for (counter = 0, angkaBaru = 10, nama = "FX BIMA YUDHA PRATAMA" ;counter < angka; angkaBaru+=10, counter++) {
            System.out.printf ("%d. %s %n" , angkaBaru, nama);
        }
    }
}
