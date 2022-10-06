/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package universitas;

/**
 *
 * @author ASUS
 */
enum JalurMasuk { 
    KERJASAMA, 
    PRESTASI, 
    REGULER; 
}
public class Mahasiswa {
    String nama, nim;
    JalurMasuk jalur;

    public Mahasiswa(String nama, String nim, JalurMasuk jalur) {
        this.nama = nama;
        this.nim = nim;
        this.jalur = jalur;
    }
    
    public void konsultasi(Dosen dsn){
        
    }
           
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public JalurMasuk getJalur() {
        return jalur;
    }

    public void setJalur(JalurMasuk jalur) {
        this.jalur = jalur;
    }
    
    
}
