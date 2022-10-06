package Dunia_App;

public class Manusia implements Banding{
    private int umur = 1;
    private String nama = "PBO";

    public Manusia(int umur, String nama) {
        this.umur = umur;
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public String toString() {
        return "Manusia{" +
                "umur = " + umur +
                ", nama = '" + nama + '\'' +
                '}';
    }

    @Override
    public int Banding(Banding other) {
        if(other instanceof Manusia){
            Manusia obj= (Manusia)other;
            if(this.umur == obj.getUmur()){
                return 0;
            }
            else if (this.umur > obj.getUmur()){
                return 1;
            }
            else{
                return -1;
            }
        }
        else{
            return 0;
        }
    }


}
