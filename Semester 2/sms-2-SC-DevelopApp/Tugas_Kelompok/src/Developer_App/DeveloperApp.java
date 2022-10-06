
package Developer_App;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class DeveloperApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String namaDeveloper, noSuratIPT, tanggalSuratIPT,namaBangunan,
                tipeBangunan, noSuratIMB,  luasBangunan,  tanggalSuratIMB,namaArsitek, CV;
        Tempat alamat;
        PemilikBangunan namaPemilik;
        String namaPemilikBangunan,lokasi, perintah, laporanKuli, umur ;
        int maksKuli;
        Kuli namaKuli, laporan;
        Arsitek tugasKuli;
        
        
        System.out.println("            Identitas Developer"            );
        System.out.println("===========================================");
        System.out.print  ("Masukkan Nama Developer         : ");
        namaDeveloper = sc.nextLine();
        System.out.print  ("Masukkan Nomor Surat IPT        : ");
        noSuratIPT = sc.nextLine();
        System.out.print  ("Masukkan Tanggal Surat IPT      : ");
        tanggalSuratIPT = sc.nextLine();
        
        System.out.println("");
        System.out.println("   Identitas Owner atau Pemilik Bangunan   ");
        System.out.println("===========================================");
        System.out.print  ("Masukkan Nama Pemilik Bangunan  : ");
        namaPemilikBangunan = sc.nextLine();

        System.out.print  ("Masukkan Umur Pemilik Bangunan  : ");
        umur = sc.nextLine();

        namaPemilik = new PemilikBangunan(namaPemilikBangunan, umur);
        
        System.out.println("");
        System.out.println("         Identitas Project Bangunan        ");
        System.out.println("===========================================");
        System.out.print  ("Masukkan Nama Bangunan          : ");
        namaBangunan = sc.nextLine();
        System.out.print  ("Masukkan Tipe Bangunan          : ");
        tipeBangunan = sc.nextLine();
        System.out.print  ("Masukkan Luas Bangunan          : ");
        luasBangunan= sc.nextLine();
        System.out.print  ("Masukkan Nomor Surat IMB        : ");
        noSuratIMB = sc.nextLine();
        System.out.print  ("Masukkan Tanggal Surat IMB      : ");
        tanggalSuratIMB = sc.nextLine();
        System.out.print  ("Masukkan Alamat Bangunan        : ");
        lokasi = sc.nextLine();
        alamat = new Tempat(lokasi);
        
        System.out.println("");
        System.out.println("              Identitas Arsitek            ");
        System.out.println("===========================================");
        System.out.print  ("Masukkan Nama Arsitek           : ");
        namaArsitek = sc.nextLine();
        System.out.print  ("Masukkan Rekam Jejak Pekerjaan  : ");
        CV = sc.nextLine();
        

        System.out.println("");
        
        System.out.println("               Identitas Kuli              ");
        System.out.println("===========================================");
        
        System.out.print("Masukkan Jenis Proyek Untuk Kuli : ");
        perintah = sc.nextLine();
        //tugasKuli.memberiPerkerjaan(perintah);

        System.out.print("Masukkan Laporan Proyek Dari Kuli: ");
        laporanKuli = sc.nextLine();
        //laporan.melaporkanPekerjaan(lapor);
        
        do{
            System.out.print  ("Masukkan Jumlah Kuli             : ");
            maksKuli = sc.nextInt();
        }while(maksKuli<1);
        
         Developer Develop = new Developer(namaDeveloper, alamat, noSuratIPT, tanggalSuratIPT,
             namaBangunan,  namaPemilik,  tipeBangunan, noSuratIMB,  luasBangunan,  tanggalSuratIMB,
             maksKuli,  namaArsitek,  CV);
         
        System.out.println("");
        int conter = 0; 
        int noKuli = 1;
        System.out.println("          Masukan Daftar Nama Kuli         ");
        System.out.println("===========================================");
        do{
            
            System.out.print("Masukkan Nama Kuli ke-"+noKuli+"          : ");
            String nama = sc.next();
            namaKuli = new Kuli(nama);
            Develop.addKuli(namaKuli);
            conter++;
            noKuli++;
        }
        while(conter < maksKuli);
        
        System.out.println("");
        System.out.println(Develop.getIdentitasDeveloper());
        
        System.out.println(Develop.getIdentitasPemilikBangunan());
        
        System.out.println(Develop.getIdentitasProyek());
        
        System.out.println(Develop.getInfoSuratIMB());
        
        System.out.println(Develop.getInfoSuratIPT());
        
        System.out.println(Develop.getIdentitasArsitek());

        System.out.println("");
        
        Develop.getInfoKuli();
        
        System.out.println("");
        
        System.out.println(Develop.arsk.memberiPerkerjaan(perintah));
        
        System.out.println(Develop.kuli.melaporkanPekerjaan(laporanKuli));
        
        System.out.println("");
    }
    
}
