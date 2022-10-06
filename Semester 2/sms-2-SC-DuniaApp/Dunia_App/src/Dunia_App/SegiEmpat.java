package Dunia_App;

public class SegiEmpat extends DuaDimensi{
    private int panjang = 1, lebar = 1;

    public SegiEmpat(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public int getPanjang() {
        return panjang;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public int getLebar() {
        return lebar;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    @Override
    public double getKeliling() {
        return 2 * (panjang + lebar);
    }

    @Override
    public double getLuas() {
        return panjang * lebar;
    }

    @Override
    public String toString() {
        return "SegiEmpat{" +
                "panjang=" + panjang +
                ", lebar=" + lebar +
                '}';
    }
}
