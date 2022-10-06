/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playlistmusic;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class PlaylistMusic {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<String> playlist = new LinkedList<String>();
        playlist.add("Berak-Anggoro");
        playlist.add("Mari Bertaubat-Rita");
        playlist.add("abc-Hany");
//       playlist.poll();
        System.out.println("Menu:");
        System.out.println("1. List Lagu\n2. Cari Lagu\n3. Tambah Lagu\n4. Hapus Lagu");
        System.out.println("5. Lagu Saat Ini\n6. Total Lagu");
        System.out.printf("Silakhan pilih menu: ");
        int pilihMenu;
        pilihMenu = sc.nextInt();
        sc.nextLine(); //https://stackoverflow.com/questions/19482877/java-why-wont-scanner-work-inside-a-switch
        String lagu;
        while (pilihMenu < 7) {
            switch (pilihMenu) {
                case 1:
                    System.out.println("List Lagu:");
                    System.out.println(playlist);
                    break;
                case 2:
                    System.out.printf("Masukkan lagu yang ingin dicari: ");
                    lagu = sc.nextLine();
                    if (playlist.contains(lagu) == false) {
                        System.out.println(lagu + " tidak ditemukan pada playlist");
                    } else {
                        System.out.println(lagu + " ditemukan pada playlist");
                    }
                    break;
                case 3:
                    System.out.printf("Masukkan lagu yang ingin ditambah: ");
                    lagu = sc.nextLine();
                    playlist.add(lagu);
                    System.out.println("Lagu " + lagu + " berhasil ditambahkan!");
                    break;
                case 4:
                    playlist.poll();
                    System.out.println("Lagu yang diputar saat ini telah dihilangkan dari antrian");
                    break;
                case 5:
                    System.out.println(playlist.peek() + "sedang diputar");
                    break;
                case 6:
                    System.out.println("Ada " + playlist.size() + " Lagu di playlist kamu");
                    break;
                default:
                    System.out.println("Tidak menu nomor " + pilihMenu);
                    break;
            }
        }

    }
}
