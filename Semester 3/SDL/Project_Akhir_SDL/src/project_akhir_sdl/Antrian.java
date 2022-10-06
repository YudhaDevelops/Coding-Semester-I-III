package project_akhir_sdl;
public class Antrian {
    protected String noId;
    protected String nama;
    protected String keperluan;

    public Antrian() {
    }

    public Antrian(String noId, String nama, String keperluan) {
        this.noId = noId;
        this.nama = nama;
        this.keperluan = keperluan;
    }

    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNoId() {
        return noId;
    }

    public void setNiId(String niId) {
        this.noId = niId;
    }

    
    public String getKeperluan() {
        return keperluan;
    }

    public void setKeperluan(String keperluan) {
        this.keperluan = keperluan;
    }
    
    
}
