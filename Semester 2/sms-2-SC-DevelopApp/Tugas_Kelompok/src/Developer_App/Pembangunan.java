
package Developer_App;

/**
 *
 * @author FX Bima Yudha Pratama_205314020
 */
class Pembangunan {
    private String namaBangunan, tipeBangunan;
    private PemilikBangunan namaPemilik;
    private Tempat alamat;
    private final SuratIMB suratIzin;
    
    public Pembangunan(String namaBangunan, PemilikBangunan namaPemilik, 
            String tipeBangunan,String noSurat, String luasBangunan, String tanggal, Tempat alamat){
        this.namaBangunan = namaBangunan;
        this.namaPemilik = namaPemilik;
        this.suratIzin = new SuratIMB(namaPemilik,noSurat,luasBangunan,tanggal,alamat);
        this.tipeBangunan = tipeBangunan;
        this.alamat = alamat;
    }
    public void setTanggal(String tanggal){
        this.suratIzin.getTanggal();
    }
    public SuratIMB getCopySurat(){
        SuratIMB copySurat = new SuratIMB(
                suratIzin.getNomor(), 
                suratIzin.getTanggal(),
                suratIzin.getLuasBangunan());
        return copySurat;
    }

    public void setNamaBangunan(String namaBangunan) {
        this.namaBangunan = namaBangunan;
    }

    public void setNamaPemilik(PemilikBangunan namaPemilik) {
        this.namaPemilik = namaPemilik;
    }

    public void setTipeBangunan(String tipeBangunan) {
        this.tipeBangunan = tipeBangunan;
    }

    public String getNamaBangunan() {
        return namaBangunan;
    }

    public String getTipeBangunan() {
        return tipeBangunan;
    }

    public PemilikBangunan getNamaPemilik() {
        return namaPemilik;
    }

    public Tempat getAlamat() {
        return alamat;
    }

    public SuratIMB getSuratIzin() {
        return suratIzin;
    }
}
