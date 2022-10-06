/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suhunormal;

import java.util.Scanner;

/**
 *
 * @author TOSHIBA
 */
public class SuhuNormal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        double suhu;
        String nama;
        System.out.println("------------------------------------------------");
        System.out.println("---------------PROGRAM SUHU NORMAL--------------");
        System.out.println("------------------------------------------------");
        System.out.print  ("Masukkan Nama Pasien = ");
        nama = input.nextLine();
        System.out.print  ("Masukkan Suhu = ");
        suhu = input.nextDouble();
        if ((suhu >= 35.0) && (suhu <= 36.9)){
            System.out.println("Nama = " + nama);
            System.out.println("Suhu Tubuh Anda Normal Dengan Suhu = " +suhu);
            System.out.println("------------------------------------------------");
            System.out.println("-----PROGRAM SUHU NORMAL By Yudha Developer-----");
            System.out.println("------------------------------------------------");
        }
        else{
            System.out.println("Nama = " + nama);
            System.out.println("Suhu Tubuh Anda Tidak Normal Dengan Suhu = " + suhu);
            System.out.println("Sebaiknya Anda Istirahat Saja Di rumah Anda");
            System.out.println("------------------------------------------------");
            System.out.println("-----PROGRAM SUHU NORMAL By Yudha Developer-----");
            System.out.println("------------------------------------------------");
        }
    }
    
}
