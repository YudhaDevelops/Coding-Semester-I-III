
package Developer_App;

/**
 *
 * @author Yulius Agung T_205314008
 */
class SuratIMB {
    private final String nomor, tanggal;
    private String luasBangunan;
    private PemilikBangunan nama;
    private Tempat alamat;

     public SuratIMB(PemilikBangunan nama,String nomor, String luasBangunan, String tanggal, Tempat alamat) {
        this.nomor = nomor;
        this.luasBangunan = luasBangunan;
        this.tanggal = tanggal;
        this.nama = nama;
        this.alamat = alamat;
    }
    public SuratIMB(String nomor, String luasBangunan, String tanggal){
        this.nomor = nomor;
        this.luasBangunan = luasBangunan;
        this.tanggal = tanggal;
    }
    
    public String getNomor() {
        return nomor;
    }

    public String getLuasBangunan() {
        return luasBangunan;
    }

    public void setLuasBangunan(String luasBangunan) {
        this.luasBangunan = luasBangunan;
    }

    public String getTanggal() {
        return tanggal;
    }

    public PemilikBangunan getNama() {
        return nama;
    }

    public Tempat getAlamat() {
        return alamat;
    }

}
