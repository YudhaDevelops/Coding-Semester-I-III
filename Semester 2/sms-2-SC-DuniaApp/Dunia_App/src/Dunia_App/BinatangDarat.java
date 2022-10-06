package Dunia_App;

public abstract class BinatangDarat extends Binatang {
    private int kaki = 2;

    public int getKaki() {
        return kaki;
    }

    public void setKaki(int kaki) {
        this.kaki = kaki;
    }

    @Override
    public void MethodAbstractBinatang() {
        System.out.println("Ini Metho Abstract Binatang yang di Override Binatang Darat");
    }
}
