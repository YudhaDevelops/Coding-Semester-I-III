package Dunia_App;

public abstract class Binatang {
    private int nyawa=1;

    public void MethodBinatangSatu(){
        System.out.println("Ini Method Binatang Satu");
    }

    public void MethodBinatangDua(){
        System.out.println("Ini Method Binatang Duar");
    }

    public abstract void MethodAbstractBinatang();

}
