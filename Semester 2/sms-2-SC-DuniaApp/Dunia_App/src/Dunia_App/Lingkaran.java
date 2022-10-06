package Dunia_App;

public class Lingkaran extends DuaDimensi implements Banding{
    private int jejari = 1;

    public Lingkaran(int jejari) {
        this.jejari = jejari;
    }

    public int getJejari() {
        return jejari;
    }

    public void setJejari(int jejari) {
        this.jejari = jejari;
    }

    @Override
    public double getKeliling() {
        return 3.14 * 2 * jejari;
    }

    @Override
    public double getLuas() {
        return 3.14 * jejari * jejari;
    }

    @Override
    public String toString() {
        return "Lingkaran{" +
                "jejari=" + jejari +
                '}';
    }

    @Override
    public int Banding(Banding other) {
        if( (other instanceof Lingkaran) == true){
            Lingkaran lingkaran = (Lingkaran) other;
            if(this.jejari == lingkaran.getJejari()){
                return 0;
            }
            else if(this.jejari > lingkaran.getJejari()){
                return 1;
            }
            else{
                return -1;
            }
        }
        return 0;
    }
}
