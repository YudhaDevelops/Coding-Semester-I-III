package PBOKelas;

public class Kontak 
{
    private String nama;
    private String hp;

    public Kontak(String nama, String hp) {
        this.nama = nama;
        this.hp = hp;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getHp() {
        return hp;
    }

    public void setHp(String hp) {
        this.hp = hp;
    }
    public String getInfo(){
        return "\t"+getHp()+"\t"+ getNama();
    }
	
}
