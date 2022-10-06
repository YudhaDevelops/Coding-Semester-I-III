/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts_nomor_2;

import java.util.Scanner;

/**
 *
 * @author TOSHIBA
 */
public class UTS_Nomor_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* 
        Buatlah sebuah program konversi suhu dari salah satu satuan suhu ke dua satuan yang lain! 
        Masukan berupa pilihan asal satuan dan suhunya, keluaran berupa hasil konversi suhu ke dua satuan yang lain. 
        Rumus konversi yang digunakan adalah sebagai berikut:
        • Celcius ke Reamur dan ke Fahrenheit
        Reamur = (4.0 / 5.0 ) * Celcius
        Fahrenheit = (9.0 / 5.0 ) * Celcius + 32
        •Reamur ke Celcius dan ke Fahrenheit
        Celcius = (5.0 / 4.0) * Reamur
        Fahrenheit = (9.0 / 4.0) * Reamur + 32
        • Fahrenheit ke Celcius dan ke Reamur
        Celcius = (5.0 / 9.0) * (Fahrenheit - 32)
        Reamur = (4.0 / 9.0) * (Fahrenheit - 32)
        */
        
        double suhuCelcius, suhuFahrenheit, suhuReamur;
        double celcius, fahrenheit, reamur;
        char pilihan1;
        Scanner input= new Scanner(System.in);
        System.out.println("");
        System.out.println("Program Korvens Suhu Oleh :");
        System.out.println("Nama : FX Bima Yudha Pratama");
        System.out.println("NIM  : 205314020");
        System.out.println("Menu");
        System.out.println("1. Celcius");
        System.out.println("2. Fahrenheit");
        System.out.println("3. Reamur");
        System.out.print  ("Masukkan Pilihan : ");
        pilihan1 = input.next().charAt(0);
            if(pilihan1 == '1') {
                System.out.print  ("Masukkan Suhu Celcius: " );
                suhuCelcius = input.nextDouble();
                reamur = (4.0 / 5.0) * suhuCelcius;
                fahrenheit =(9.0 / 5.0) * suhuCelcius + 32;
                System.out.println("Suhu Reamur     : " + reamur);
                System.out.println("Suhu Fahrenheit : " + fahrenheit);
            }
            else if(pilihan1 == '2'){
                System.out.print  ("Masukkan Suhu Fahrenheit : " );
                suhuFahrenheit = input.nextDouble();
                celcius = (5.0 / 9.0) * (suhuFahrenheit - 32);
                reamur = (4.0 / 9.0) * (suhuFahrenheit - 32);
                System.out.println("Suhu Reamur  : " + reamur);
                System.out.println("Suhu Celcius : " + celcius);
            }
            else if(pilihan1 == '3'){
                System.out.print  ("Masukkan Suhu Reamur: " );
                suhuReamur = input.nextDouble();
                fahrenheit = (9.0 / 4.0) * suhuReamur + 32;
                celcius = (5.0 / 4.0) * suhuReamur;
                System.out.println("Suhu Fahrenheit : " + fahrenheit);
                System.out.println("Suhu Celcius    : " + celcius);
            }
            else{
                System.out.println("Masukkan Salah");
            }
    }
    
}
