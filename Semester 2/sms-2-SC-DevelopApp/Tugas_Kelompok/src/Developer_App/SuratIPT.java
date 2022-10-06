
package Developer_App;

/**
 *
 * @author Yulius Agung T_205314008
 */
class SuratIPT {
    private String namaPemilik, nomor,tanggal;
    private Tempat lokasi;
    
    public SuratIPT(String namaPemilik, String nomor, Tempat lokasi,String tanggal) {
        this.namaPemilik = namaPemilik;
        this.nomor = nomor;
        this.lokasi = lokasi;
        this.tanggal = tanggal;
    }
    public SuratIPT(String nomor, Tempat lokasi,String tanggal) {
        this.nomor = nomor;
        this.lokasi = lokasi;
        this.tanggal = tanggal;
    }
    public String getNamaPemilik() {
        return namaPemilik;
    }

    public void setNamaPemilik(String namaPemilik) {
        this.namaPemilik = namaPemilik;
    }

    public String getNomor() {
        return nomor;
    }


    public Tempat getLokasi() {
        return lokasi;
    }

    public void setLokasi(Tempat lokasi) {
        this.lokasi = lokasi;
    }
    
    public String getTanggal(){
        return tanggal;
    }
    public void setTanggal(String tanggal){
        this.tanggal = tanggal;
    }
}
