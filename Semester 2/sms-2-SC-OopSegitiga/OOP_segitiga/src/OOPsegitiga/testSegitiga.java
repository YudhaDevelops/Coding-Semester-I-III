/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOPsegitiga;

/**
 *
 * @author TOSHIBA
 */
public class testSegitiga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //deklarasi variabel
        
        //deklarasi objek dari sebuah class
        Segitiga segitigaSatu,segitigaDua,segitigaTiga;
        
        
        System.out.println("=============================================");
        System.out.println("=Program Luas Segitiga Dan Keliling Segitiga=");
        System.out.println("=============================================");
        System.out.println("= Nama : Life For Coding                    =");
        System.out.println("= Build By  : Skuy Replay                   =");
        System.out.println("=                                           =");
        System.out.println("=============================================");
        
        
        //instance
        segitigaSatu = new Segitiga();
        segitigaDua = new Segitiga();
        segitigaTiga = new Segitiga();
        
        //print atribut sebelum setter untuk segitiga satu
        System.out.println("Nama Segitiga  :" + segitigaSatu.getNama());
        System.out.println("Alas Segitiga  :" + segitigaSatu.getAlas());
        System.out.println("Tinggi Segitiga:" + segitigaSatu.getTinggi());
        System.out.println("");
        System.out.printf ("Luas Segitiga    : %4.2f \n", segitigaSatu.getLuas());
        System.out.printf ("Keliling Segitiga: %4.2f \n", segitigaSatu.getKeliling());
        System.out.println("");
        
        System.out.println("=============================================");
        //merubah atribut dengan setter
        segitigaDua.setNama("Segitiga Dua");
        segitigaDua.setAlas(3.6);
        segitigaDua.setTinggi(4.5);
        
        //print atribut sesudah setter untuk segitiga dua
        System.out.println("Nama Segitiga  :" + segitigaDua.getNama());
        System.out.println("Alas Segitiga  :" + segitigaDua.getAlas());
        System.out.println("Tinggi Segitiga:" + segitigaDua.getTinggi());
        System.out.println("");
        System.out.printf ("Luas Segitiga    : %4.2f \n", segitigaDua.getLuas());
        System.out.printf ("Keliling Segitiga: %4.2f \n", segitigaDua.getKeliling());
        System.out.println("");
        System.out.println("=============================================");
        
        segitigaTiga.setNama("Segitiga Tiga");
        segitigaTiga.setAlas(2.7);
        segitigaTiga.setTinggi(5.5);
        
        //print atribut sesudah setter untuk segitiga tiga
        System.out.println("Nama Segitiga  :" + segitigaTiga.getNama());
        System.out.println("Alas Segitiga  :" + segitigaTiga.getAlas());
        System.out.println("Tinggi Segitiga:" + segitigaTiga.getTinggi());
        System.out.println("");
        System.out.printf ("Luas Segitiga    : %4.2f \n", segitigaTiga.getLuas());
        System.out.printf ("Keliling Segitiga: %4.2f \n", segitigaTiga.getKeliling());
        System.out.println("");
        System.out.println("=============================================");
        
        
        segitigaTiga.setNama("Segitiga Menggunakan Atribut Yang Minus");
        segitigaTiga.setAlas(-7.7);
        System.out.println("");
        segitigaTiga.setTinggi(-5.5);
        System.out.println("");
        //print atribut sesudah setter untuk atribut segitiga yang minus
        System.out.println("Nama Segitiga  :" + segitigaTiga.getNama());
        System.out.println("Alas Segitiga  :" + segitigaTiga.getAlas());
        System.out.println("Tinggi Segitiga:" + segitigaTiga.getTinggi());
        System.out.println("");
        System.out.printf ("Luas Segitiga    : %4.2f \n", segitigaTiga.getLuas());
        System.out.printf ("Keliling Segitiga: %4.2f \n", segitigaTiga.getKeliling());
        System.out.println("");
        System.out.println("=============================================");
        
    }
    
}
