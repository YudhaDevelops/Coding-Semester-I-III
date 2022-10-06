/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package faktorial;

import java.util.Scanner;

/**
 *
 * @author Personal
 */
public class Faktorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
         Scanner input = new Scanner(System.in);
        
     //   5! = 5.4.3.2.1
      int angka, count, faktor, faktori;
      byte mulai = 1;
      faktori = 1;
        
        System.out.println("+--------------PROGRAM FAKTORIAL---------------+");
        System.out.println("+----------------------------------------------+");
        do
        {
            System.out.printf  ("+ Masukkan Angka Faktoria = ");
        angka = input.nextInt();
        }
        while (angka < 0);
        System.out.println("+----------------------------------------------+");
        
        
        for (count = 1,faktor = 1; count <= angka; faktor = faktor * count,count++) {
        }
            
        while (mulai <= angka)
        {
            faktori = faktori * mulai;
            mulai++;
        }
        System.out.println("");
        System.out.println("");
        System.out.println ("+----------------------------------------------+");
        System.out.println ("+ Nilai Yang Anda Masukkan = "+ angka);
        System.out.println ("+----------------------------------------------+");
        System.out.println ("");
        System.out.println ("+----------------------------------------------+");
        System.out.println ("+---------Program Ini Menggunaka For ----------+");
        System.out.println ("+ Nilai Faktorial Dari "+ angka +"! Adalah "+ faktor);
        System.out.println ("+----------------------------------------------+");
        System.out.println ("");
        System.out.println ("+----------------------------------------------+");
        System.out.println ("+---------Program Ini Menggunaka While --------+");
        System.out.println ("+ Nilai Faktorial Dari "+ angka +"! Adalah "+ faktori);
        System.out.println ("+----------------------------------------------+");
    }
}
