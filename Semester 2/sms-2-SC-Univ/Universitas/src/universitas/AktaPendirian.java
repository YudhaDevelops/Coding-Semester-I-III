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
public class AktaPendirian {
    String noSurat, tanggal, catatan;

    public AktaPendirian(String noSurat, String tgl, String ctt) {
        this.noSurat = noSurat;
        this.tanggal = tgl;
        this.catatan = ctt;
    }        

    public String getNoSurat() {
        return noSurat;
    }

    public void setNoSurat(String noSurat) {
        this.noSurat = noSurat;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getCatatan() {
        return catatan;
    }

    public void setCatatan(String catatan) {
        this.catatan = catatan;
    }

}
