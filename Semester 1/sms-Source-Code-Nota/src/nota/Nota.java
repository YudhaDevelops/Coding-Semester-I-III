/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nota;

import java.util.Scanner;

/**
 *
 * @author TOSHIBA
 */
public class Nota {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Nota dari sebua warung makan.
		Masukan program adalah: jumlah Nasi Sayur, Lauk Pauk, Kerupuk dan Minuman.
		Harga: 
		Nasi Sayur Rp. 7500,
		Lauk Pauk Rp. 2000, 
		Kerupuk Rp.500 dan 
		Minuman Rp. 1500
		Simpan dengan nama Nota.java
		CONTOH TAMPILAN (tidak perlu tepat
		*/
		//variabel
		int nasiSayur, laukPauk, Kerupuk, Minuman;
		String Nama;
		nasiSayur =7500;
		laukPauk = 2000;
		Kerupuk =500;
		Minuman =1500;
		int nasi, lauk, kerupuk, minuman, Total;
		int Nasii, Laukk, Kerupukk, Minumann;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("");
		System.out.println("========================================================");
		System.out.println("========= Nota Warung Makan Mak Skuy Sejahrtera =========");
		System.out.println("========================================================");
		System.out.println("Harga Yang Kami Patok:"); 
		System.out.println("");
		System.out.println("  Nasi Sayur Rp. 7500");
		System.out.println("  Lauk Pauk  Rp. 2000"); 
		System.out.println("  Kerupuk    Rp. 500  ");
		System.out.println("  Minuman    Rp. 1500");
		System.out.println("");
		System.out.print  ("  Nasi Sayur = "); nasi = sc.nextInt();
		System.out.print  ("  Lauk Pauk  = "); lauk = sc.nextInt();
		System.out.print  ("  Kerupuk    = "); kerupuk = sc.nextInt();
		System.out.print  ("  Minuman    = "); minuman = sc.nextInt();
		System.out.println("");
		System.out.println("--------------------------------------------------------");
		Nasii = nasi * nasiSayur;
		Laukk = lauk * laukPauk;
		Kerupukk = kerupuk * Kerupuk;
		Minumann = minuman * Minuman;
		
		System.out.println("    1. Nasi Sayur = Rp. " + Nasii);
		System.out.println("    2. Lauk Pauk  = Rp. " + Laukk);
		System.out.println("    3. Kerupuk    = Rp. " + Kerupukk);
		System.out.println("    4. Minuman    = Rp. " + Minumann);
		System.out.println("    ----------------------------------- + ");
		System.out.println("");
		Total = Nasii + Laukk + Kerupukk + Minumann;
		System.out.println("         Totalnya = Rp. " + Total);
		System.out.println("");
		System.out.println("========================================================");
		System.out.println("========= Nota Warung Makan Mak Skuy Sejahtera ==========");
		System.out.println("========================================================");
		System.out.println("=== Terima Kasih Sudah Makan Di Warung Makan Mak Skuy ===");
		System.out.println("========================================================");
		System.out.println("========= Nota Warung Makan Mak Skuy Sejahtera ==========");
		System.out.println("===== Tempat Makan Yang Enak Dan Nyaman Di Skuy =====");
		System.out.println("=====******** Design By : Skuy Developer *********=====");
		System.out.println("========================================================");
    }
    
}
