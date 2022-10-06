package Dunia_App;

public class Ikan extends BinatangLaut implements Banding{
    private int sisik=10;

    public Ikan(int sisik) {
        this.sisik = sisik;
    }

    public int getSisik() {
        return sisik;
    }

    public void setSisik(int sisik) {
        this.sisik = sisik;
    }

    @Override
    public String toString() {
        return "Ikan{" +
                "sisik=" + sisik +
                '}';
    }

    @Override
    public int Banding(Banding other) {
        if(other instanceof Ikan){
            Ikan obj= (Ikan)other;
            if(this.sisik == obj.getSisik()){
                return 0;
            }
            else if (this.sisik > obj.getSisik()){
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
