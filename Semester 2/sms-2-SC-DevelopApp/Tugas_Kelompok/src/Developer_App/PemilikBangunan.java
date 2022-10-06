
package Developer_App;

/**
 *
 * @author Yulius Agung T_205314008
 */
class PemilikBangunan {
    private String nama, umur;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getUmur() {
        return umur;
    }

    public void setUmur(String umur) {
        this.umur = umur;
    }

    public PemilikBangunan(String nama, String umur) {
        this.nama = nama;
        this.umur = umur;
    }
}
