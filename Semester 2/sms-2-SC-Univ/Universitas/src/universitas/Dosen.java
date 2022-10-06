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
public class Dosen {
    String nama, nip;

    public Dosen(String nama, String nip) {
        this.nama = nama;
        this.nip = nip;
    }
    
    public void memberiTugas(Mahasiswa mhs){
        
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }
    
}
