package Developer_App;

/**
 *
 * @author FX Bima Yudha Pratama_205314020
 */
public class Developer 
{
    final SuratIPT suratIjinIPT;
    final SuratIMB suratIjinIMB;
    final Kuli[] listKuli;
    PemilikBangunan namaPemilik;
    Pembangunan projekPembangunan;
    Tempat alamat;
    Pembangunan gedung;
    String namaDeveloper;
    int jumlahKuli;
    Kuli kuli;
    Arsitek arsk;
    
    public Developer (String namaDeveloper, Tempat alamat,String noSuratIPT,String tanggalSuratIPT,
            String namaBangunan, PemilikBangunan namaPemilik, String tipeBangunan,String noSuratIMB, String luasBangunan, String tanggalSuratIMB,
            int maksKuli, String namaArsitek, String CV){
        this.namaDeveloper = namaDeveloper;
        this.alamat = alamat;
        this.namaPemilik = namaPemilik;
        this.suratIjinIPT = new SuratIPT(namaDeveloper, noSuratIPT, alamat,tanggalSuratIPT);
        this.suratIjinIMB = new SuratIMB(namaPemilik,noSuratIMB,luasBangunan,tanggalSuratIMB, alamat);
        this.projekPembangunan = new Pembangunan(namaBangunan,namaPemilik,tipeBangunan,noSuratIMB,luasBangunan,tanggalSuratIMB,alamat);
        this.arsk = new Arsitek(namaArsitek, CV);
        this.kuli = new Kuli();
        listKuli = new Kuli[maksKuli];
    }
    
    //bagian mengcopy surat IMB
    public SuratIMB getCopySuratIMB(){
        SuratIMB copySuratIMB = new SuratIMB(
                suratIjinIMB.getNomor(), 
                suratIjinIMB.getTanggal(),
                suratIjinIMB.getLuasBangunan());
        return copySuratIMB;
    }
    
    //bagian mengcopy surat IPT
    public SuratIPT getCopySuratIPT(){
        SuratIPT copySuratIPT = new SuratIPT(
                suratIjinIPT.getNomor(), 
                suratIjinIPT.getLokasi(),
                suratIjinIPT.getTanggal() );
        return copySuratIPT;
    }
    
    
    /* Copy bagian untuk Surat IPT*/
    public void setTanggalSuratIPT(String tanggal){
        this.suratIjinIPT.setTanggal(tanggal);
    }
    public void setNamaPemilikSuratIPT(String nama){
        this.suratIjinIPT.setNamaPemilik(nama);
    }
    
    
    public void setNamaPemilikSuratIMB(String nama){
        this.namaPemilik.setNama(nama);
    }
    
    //Menambah nama Kuli sesuai dengan jumlah kuli yang di masukkan
    public void addKuli(Kuli kuli){
        listKuli[jumlahKuli] = kuli;
        jumlahKuli++;
    }
    
    public void setKuli (int list, Kuli kuli){
        if (list < jumlahKuli) {
            this.listKuli[list] = kuli;
        }
    }

    //setter Untuk Arsitek
    public void setNamaArsitek(String nama){
        this.arsk.setNama(nama);
    }
    public void setCVArsitek(String CV){
        this.arsk.setCv(CV);
    }
    
    //setter dan getter untuk alamat
    public Tempat getTempat(){
        return alamat; 
    }
    public void setAlamat(Tempat alamatBaru){
        this.alamat = alamatBaru;
    }
    
    //bagian informasi print seluruh nya
    
    //bagian developer
    public String getIdentitasDeveloper(){
        return  ( "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n"
             + "\n ==========================================="
             + "\n             Identitas developer            "
             + "\n ==========================================="
             + "\n Nama Developer               = " + suratIjinIPT.getNamaPemilik()
             + "\n Nomor Surat IPT Developer    = " + suratIjinIPT.getNomor()
             + "\n Tanggal Surat IPT            = " + suratIjinIPT.getTanggal()
             + "\n" )
                ;
    }
    
    //bagian pemilik bangunan
    public String getIdentitasPemilikBangunan(){
       return (""
             + "\n ==========================================="
             + "\n    Identitas Owner atau Pemilik Bangunan   "
             + "\n ==========================================="
             + "\n Nama Pemilik Bangunan        = " + namaPemilik.getNama()
             + "\n Umur Pemilik Bangunan        = " + namaPemilik.getUmur() +" Tahun"
             + "\n"
             
             
             );    
    }
    
    //bagian Proyek
    public String getIdentitasProyek(){
        return(  "\n ==========================================="
               + "\n              Identitas Proyek              "
               + "\n ==========================================="
               + "\n Nama Bangunan                = " + projekPembangunan.getNamaBangunan()
               + "\n Tipe Bangunan                = " + projekPembangunan.getTipeBangunan()
               + "\n Luas Bangunan                = " + projekPembangunan.getCopySurat().getLuasBangunan()
               + "\n Nomor Surat IMB              = " + projekPembangunan.getCopySurat().getNomor()
               + "\n Tanggal Surat IMB            = " + projekPembangunan.getCopySurat().getTanggal()
               + "\n Alamat Bangunan              = " + projekPembangunan.getAlamat().getAlamatLengkap()
               + "\n"
                );
    }
    
    //bagian arsitek
    public String getIdentitasArsitek(){
        return (  ""
                + "\n ==========================================="
                + "\n              Identitas Arsitek             "
                + "\n ==========================================="
                + "\n Nama Arsitek                 = " + arsk.getNama()
                + "\n Rekam Jejak Pekerjaan        = " + arsk.getCv()
                     );
    }
    
    public void getInfoKuli(){
        System.out.println("===========================================");
        System.out.println("                Daftar Kuli                ");
        System.out.println("===========================================");
        int ulang = 1, i;
        for(i=0; i < listKuli.length; i++){
                System.out.println("  "+ulang + " " + listKuli[i].getNama());
                ulang++;
        }
    }
    
    //bagian Surat IMB
    public String getInfoSuratIMB(){
        return   (
                  "==========================================="
                + "\n                 Surat IMB                 "
                + "\n==========================================="
                + "\n Nama Pemilik                 = " + suratIjinIMB.getNama().getNama()
                + "\n Nomor Surat IMB              = " + suratIjinIMB.getNomor()
                + "\n Luas Bangunan                = " + suratIjinIMB.getLuasBangunan()
                + "\n Tanggal Surat IMB            = " + suratIjinIMB.getTanggal()
                + "\n Alamat Bangunan              = " + suratIjinIMB.getAlamat().getAlamatLengkap()
                + "\n"
                );
    }
    //bagian Surat IPT
    public String getInfoSuratIPT(){
        return  (
                  "==========================================="
                + "\n                 Surat IPT                 "
                + "\n==========================================="
                + "\n Nama Pemilik                 = " + suratIjinIPT.getNamaPemilik()
                + "\n Nomor Surat IMB              = " + suratIjinIPT.getNomor()
                + "\n Tanggal Surat IMB            = " + suratIjinIPT.getTanggal()
                + "\n Alamat Bangunan              = " + suratIjinIPT.getLokasi().getAlamatLengkap()
                + "\n"
                );
    }
    
}
