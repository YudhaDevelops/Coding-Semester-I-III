package project_akhir_sdl;

import java.util.Scanner;
//misalnya menampilkan data yang udah ada di dalam linked list, dalam nya ada 
//stack and queue. setelah nampilin daftar, nampilin menu.Agustina Putri: Mau 
//nampilin data keluar terus diahpus setelah itu kalau mau nambah make addTail(belakang) 
//karena urutan antrian gaboleh ditengah jadi harus addTail
//Pakai queue masuk pertama keluar pertama panggil, keluarin data, hapus
//Kalau udah jadi tambah vitur searching(optional). Dicari berdasarkan nomor utur antrian
//Memikirkan kompleksitas searchingnya, mencari yang lebih efektif, dari awal, akhihr, atau tengah

public class Main_Pogram {

    public static void jalan() {
        char menu, mn = 0;
        Scanner input = new Scanner(System.in);
        String id = "", nama = "", keperluan = "";

        MyUniQueue tellerList = new MyUniQueue();
        MyUniQueue csList = new MyUniQueue();
        do {
            System.out.println("=========== PROGRAM ANTRIAN BANK ===========");
            System.out.println("A. Antrian Masuk ");
            System.out.println("B. Proses Antrian Keluar");
            System.out.println("C. Lihat Antrian");
            System.out.println("D. Keluar");
            System.out.print("Masukkan keperluan :");
            menu = input.next().charAt(0);

            if (menu == 'A' || menu == 'a') {
                System.out.println("");
                System.out.println("Apa Tujuan Anda?");
                System.out.println(" A. Teller");
                System.out.println(" B. Customer Services");

                do {
                    System.out.print("Masukkan Pilihan : ");
                    mn = input.next().charAt(0);
                    if (mn == 'a' || mn == 'A') {
                        System.out.print("Masukkan Nama      : \t");
                        nama = input.next();
                        System.out.print("Masukkan Keperluan : \t");
                        keperluan = input.next();
//                        tellerList.addData(nama, keperluan);
                        input.nextLine();
                        System.out.println("");
                    } else if (mn == 'b' || mn == 'B') {
                        System.out.print("Masukkan Nama      : \t");
                        nama = input.next();
                        System.out.print("Masukkan Keperluan : \t");
                        keperluan = input.next();
//                        csList.addData(nama, keperluan);
                        input.nextLine();
                        System.out.println("");
                    } else {
                        System.out.println("~~ Keluar Dari Pilihan ~~");
                    }
                } while (mn == 'a' || mn == 'A' || mn == 'b' || mn == 'B');

            } else if (menu == 'b' || menu == 'B') {
                System.out.println("Proses Keluar Bagian Teller Atau CS?");
                System.out.println(" A. Teller");
                System.out.println(" B. Customer Service");
                System.out.print("Masukkan Pilihan : ");
                mn = input.next().charAt(0);
                if (mn == 'a' || mn == 'A') {
                    tellerList.remove();
                } else if (mn == 'b' || mn == 'B') {
                    csList.remove();
                } else {
                    System.out.println("Pilihan Tidak Ada");
                }
            } else if (menu == 'c' || menu == 'C') {
                System.out.println("");
                System.out.println("Tampilan Antrian Teller");
                System.out.println(tellerList.toString());
                System.out.println("");
                System.out.println("Tampilan Antrian CS");
                System.out.println(csList.toString());
            } else if (menu == 'd' || menu == 'D') {
                System.out.println("--- Terima Kasih ---");
            } else {
                System.out.println("--- Masukkan Anda Salah ---");
            }
            System.out.println("");
            System.out.println("");

        } while (menu == 'a' || menu == 'A' || menu == 'b' || menu == 'B' || menu == 'c' || menu == 'C' || menu == 'd' || menu == 'D');
    }

    public static void main(String[] args) {
        // TODO code application logic here
        char menu, mn = 0;
        Scanner input = new Scanner(System.in);
        String id = "", nama = "", keperluan = "";

        MyUniQueue tellerList = new MyUniQueue();
        MyUniQueue csList = new MyUniQueue();
        do {
            System.out.println("=========== PROGRAM ANTRIAN BANK ===========");
            System.out.println("A. Antrian Masuk ");
            System.out.println("B. Proses Antrian Keluar");
            System.out.println("C. Lihat Antrian");
            System.out.println("D. Keluar");
            System.out.print("Masukkan keperluan :");
            menu = input.next().charAt(0);

            if (menu == 'A' || menu == 'a') {
                System.out.println("");
                System.out.println("Apa Tujuan Anda?");
                System.out.println(" A. Teller");
                System.out.println(" B. Customer Services");
                System.out.println(" C. Keluar Dari Menambahkan Antrian");

                do {
                    System.out.print("Masukkan Pilihan : ");
                    mn = input.next().charAt(0);
                    if (mn == 'a' || mn == 'A') {
                        System.out.print("Masukkan Nomor Antrian : ");
                        id = input.next();
                        System.out.print("Masukkan Nama      : \t");
                        nama = input.next();
                        System.out.print("Masukkan Keperluan : \t");
                        keperluan = input.next();
                        while (input.hasNext()) {
                            keperluan += " " + input.next();
                            if (keperluan.charAt(keperluan.length() - 1) == '.') {
                                break;
                            }
                        }
//                        tellerList.addData(id, nama, keperluan);
                        input.nextLine();
                        System.out.println("");
                    } else if (mn == 'b' || mn == 'B') {
                        System.out.print("Masukkan Nama      : \t");
                        nama = input.next();
                        System.out.print("Masukkan Keperluan : \t");
                        keperluan = input.next();
//                        csList.addData(id, nama, keperluan);
                        input.nextLine();
                        System.out.println("");
                    } else {
                        System.out.println("~~ Keluar Dari Pilihan ~~");
                    }
                } while (mn == 'a' || mn == 'A' || mn == 'b' || mn == 'B');

            } else if (menu == 'b' || menu == 'B') {
                System.out.println("Proses Keluar");
                System.out.println(" A. Teller");
                System.out.println(" B. Customer Service");
                System.out.print("Masukkan Pilihan : ");
                mn = input.next().charAt(0);
                if (mn == 'a' || mn == 'A') {
                    tellerList.remove();
                } else if (mn == 'b' || mn == 'B') {
                    csList.remove();
                } else {
                    System.out.println("Pilihan Tidak Ada");
                }
            } else if (menu == 'c' || menu == 'C') {
                System.out.println("");
                System.out.println("Tampilan Antrian Teller");
                System.out.println(tellerList.toString());
                System.out.println("");
                System.out.println("Tampilan Antrian CS");
                System.out.println(csList.toString());
            } else if (menu == 'd' || menu == 'D') {
                System.out.println("--- Terima Kasih ---");
            } else {
                System.out.println("--- Pilihan Yang Anda Masukkan Salah ---");
            }
            System.out.println("");

        } while (menu == 'a' || menu == 'A' || menu == 'b' || menu == 'B' || menu == 'c' || menu == 'C');

        char darurat;
        MyUniQueue s = new MyUniQueue();
        Antrian a1 = new Antrian("001", "Yudha", "Maen");
        Antrian a2 = new Antrian("002", "Bem", "Maen");
        Antrian a3 = new Antrian("003", "Bin", "Maen");
        Antrian a4 = new Antrian("004", "Yudha", "Maen");
        s.add(a1);
        s.add(a2);
        s.add(a3);
        s.add(a4);
        System.out.println(s.toString());
        Antrian a5 = new Antrian("001", "Jack", "Maen");
        System.out.println("Apakah Anda Member Dari Bank Ini?");
        System.out.print("Yes Or No? :");
        darurat = input.next().charAt(0);
        if (darurat == 'Y' || darurat == 'y') {
            s.addKedua(a5);
        } else {
            s.add(a5);
        }
        System.out.println(s.toString());
    }
}
