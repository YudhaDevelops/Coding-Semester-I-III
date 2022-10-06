package Dunia_App;

public abstract class BinatangLaut extends Binatang{
    private int insang=1;

    public void MethodBinatangLaut(){
        System.out.printf("Ini Method Binatang Laut");
    }

    @Override
    public void MethodAbstractBinatang() {
        System.out.printf("Ini Method Abstract Binatang yang di Override Binatang Laut");
    }
}
