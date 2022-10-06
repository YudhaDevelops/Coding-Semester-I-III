package coba;

import java.util.Scanner;
public class Coba {
    public static void main(String[] args) {
        
        double Volume, luas, r, t;
        final double Phi = 3.14;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Jari Jari =");
        r = scanner.nextDouble();

        System.out.print("Masukkan Tinggi =");
        t = scanner.nextDouble();
 
        double jariJari = r*r;
        double volume0= 0.3;
        
        Volume = volume0*Phi*jariJari*t;
        //double volume2 = 0.3*Volume;
        luas = (Phi*jariJari)+((Phi*jariJari)*t);

        //V = (1/3) PHI r2 t ;   L = PHI r2  +  PHI r2 t
        
        System.out.println("");
        System.out.println("Hasil Volume sementara "+Volume);
        System.out.println("volume final kerucut "+volume0);
        System.out.println("Hasil Luas Selimut Kerucut "+luas);
        
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Nama :");
//        String nama = sc.nextLine();
//        System.out.print("Berat :");
        
//        System.out.print("uts 1 ");
//        uts1 = sc.nextDouble();
//        System.out.print("uts 2 ");
//        uts2 = sc.nextDouble();
//        System.out.print("uas ");
//        uas = sc.nextDouble();
        
//        double uts1, uts2,uas, hasil;
//        final double UTS = 0.3;
//        final double UAS = 0.4;
//        
//        uts1 = 10;
//        uts2 = 15;
//        uas = 20;
//        
//        
//        hasil = (UTS * uts1+UTS*uts2 + UAS * uas);
//        
//        System.out.println("Total hasil = " + hasil);
//        if(hasil >= 80){
//            System.out.println("A");
//        }
//        else if (hasil >= 65 && hasil < 80){
//            System.out.println("B");
//        }
//        else if(hasil >= 55 && hasil < 65){
//            System.out.println("C");
//        }
//        else if(hasil >= 50 && hasil < 55){
//            System.out.println("D");
//        }
//        else {
//            System.out.println("E");
//        }
//        
        
        
//        double x = 3;
//        double hasil ;
//        
//        double pangkat = 2;
//        
//        double angka = 2;
//        // 2 pangkat 2 = 4
//        
//        double ha = 1 ;
//        
//        for (int i = 1; i <= pangkat; i++) {
//            ha = ha * angka;
//        }
//        System.out.println("angka pangkat " + ha);
//        pangkat = ha;
//        ha = 1;
//        //x pangkat ha = 3.3.3.3 = 81
//        for (int i = 1; i <= pangkat; i++) {
//            ha = ha * x;
//        }
//        double hasilPangkatX = ha;
//        
//        System.out.println("Hasil x pangkat 4 " + hasilPangkatX);
//        //2 di kali x = 162
//        hasil = 2 * hasilPangkatX;
//        System.out.println("hasil " +hasil);
        
//        String[] data = { "a", "b", "c" };
//        String delete = "b";
//        String[] newData = new String[data.length - 1];
//        int index = 0;
//        
//        for (int c = 0; c < data.length; c++) {
//            if (data[c].equals(delete)) {
//                index = c;
//                break;
//            }
//        }
// looping di atas berfungsi untuk mencari tahu item yg mau di hapus berada di index ke berapa.
//        for (int x = 0; x < index; x++) {
//            newData[x] = data[x];
//        }
// utk mengisi array baru dg index yg lebih kecil dari input
//        for (int y = index + 1; y < data.length; y++) {
//            newData[y - 1] = data[y];
//        }
// utk mengisi array  baru dg index yg  lebih besar dari  input
//        for (int z = 0; z < newData.length; z++) {
//            System.out.println(newData[z]);
//        }
        
//        Scanner in = new Scanner(System.in);
//        int[] intArr = {1, 2, 5, 12, 7, 3, 8};
//        System.out.print("Enter Element to be deleted : ");
//        int elem = in.nextInt();
//        
//        for(int i = 0; i < intArr.length; i++){
//            if(intArr[i] == elem){
//                // shifting elements
//                for(int j = i; j < intArr.length - 1; j++){
//                    intArr[j] = intArr[j+1];
//                }
//                break;
//            }
//        }
//      
//        System.out.println("Elements -- " );
//        for(int i = 0; i < intArr.length; i++){
//            System.out.print(" " + intArr[i]);
//        }                
    }
    
}
