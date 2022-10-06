package kelompok;

// 205314001 - RIAN CHRISTIAN SIDIN
// 205314020 - FX BIMA YUDHA PRATAMA
// 205314021 - ADITYA BANGUN SANJAYA
// 205314027 - ANDREAS KEVIN MAHESWARA
// 205314029 - MICHAEL OCTAVIAN SATRIA RAHARJA

public class LarikKu {
    private double[] data;
    private int maxData;
    private int jumlahData = 0;

    public LarikKu(int maxData) {
        if(maxData > 0){
            data = new double[maxData];
            this.maxData = maxData;
        }
    }

    public void tambahBelakang(double data) {
        if (jumlahData < maxData) {
            jumlahData++;
            this.data[jumlahData - 1] = data;   
        }
    }

    public void tambahDepan(double data) {
        if (jumlahData < maxData) {
                jumlahData++;

                int count = 1;

                for (int i = 0; i < jumlahData-1; i++) {
                    this.data[jumlahData - 1 - i] = this.data[jumlahData - count - 1];
                    count++;
                }

                this.data[0] = data;
            }
        }
    public void printData() {
        System.out.println("Jumlah Data = " + this.jumlahData);
        System.out.print("Larik       = ");
        for (int i = 0; i < jumlahData; i++) {
            System.out.print(this.data[i] + "; ");
        }
        System.out.println("");
    }

    public void cariData(double data) {
        boolean ada = false;
        for (int i = 0; i < jumlahData; i++) {
            if (this.data[i] == data) {
                System.out.println(data + " ada di-indeks no: " + i);
                ada = true;
            }
        }

        if (ada == false) {
            System.out.println(data + " tidak ada di larik");
        }
    }

}
