/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package print_char;

import java.util.Scanner;

/**
 *
 * @author Personal
 */
public class Print_Char {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        int counter, angka;
        char huruf;
        counter = 0;
        String nama;
        huruf = 'a';
        
        System.out.print  ("Masukkan Nama = ");
        nama = input.nextLine();
        System.out.print  ("Masukkan Counter = ");
        angka = input.nextInt();
        
        while(counter < angka)
            {
                System.out.printf ("%c. %s %n" , huruf, nama);
                huruf++;
                counter++;
            }
    }
}
