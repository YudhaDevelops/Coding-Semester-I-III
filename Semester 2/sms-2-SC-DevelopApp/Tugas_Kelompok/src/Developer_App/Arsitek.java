package Developer_App;

/**
 *
 * @author Carolus Rico A_205314022
 */
public class Arsitek 
{
    private String nama, cv;
    private Kuli namaKuli, jumlah;

    public Arsitek(String nama, String cv) {
        this.nama = nama;
        this.cv = cv;
    }
    public Arsitek(String nama){
        this.nama = nama;
    }
    public Arsitek(){
        
    }
    public String memberiPerkerjaan(String kerja){
        String pekerjaan ="Kuli Harus Menyelesaikan Proyek "+ kerja;
        return pekerjaan;
    }
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getCv() {
        return cv;
    }

    public void setCv(String cv) {
        this.cv = cv;
    }
}
