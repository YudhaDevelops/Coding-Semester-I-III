/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rerata;

import java.util.Scanner;

/**
 *
 * @author Personal
 */
public class Rerata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       Scanner input = new Scanner(System.in);
       int angka, count;
       double dataMasuk, hasil, rata;
       hasil = 0;
       count = 1;
       
        do
        {
            System.out.print  ("Masukkan Jumllah Entry = ");
            angka = input.nextInt();
            System.out.println("");
        }
        while (angka <= 0);
        
        do
        {
            System.out.printf  ("Data Ke -"+ count + " = ");
            dataMasuk = input.nextDouble();
            hasil = hasil + dataMasuk;
            rata = hasil / angka;
            count++;
        }
        while(count <= angka);
                System.out.printf  ("Jumlah Data = %d %n", angka);
                System.out.printf  ("Sigma Data = %f %n", hasil);
                System.out.printf  ("Rata - Rata = %f %n", rata);
    }
}
