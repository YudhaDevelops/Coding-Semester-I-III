package Developer_App;

/**
 *
 * @author Carolus Rico A_205314022
 */
class Kuli 
{
    private String namaKuli,pekerjaan;
    private Arsitek namaArsitek;
    private int jumlah;

    public Kuli(String nama) {
        this.namaKuli = nama;
    }
    public Kuli(){
        
    }
    public String melaporkanPekerjaan(String lapor){
        String laporan = "Kuli Telah Menyelesaikan Proyek " + lapor;
        return laporan;
    }
    
    public Kuli(int JumlahKuli){
        this.jumlah = JumlahKuli;
    }
    public String getNama() {
        return namaKuli;
    }
    public int getJumlahKuli(){
        return jumlah;
    }

    public void setNama(String nama) {
        this.namaKuli = nama;
    }
    
    public String getTugas(){
        return "Tugas Dari Arsitek : "+pekerjaan;
    }
}
