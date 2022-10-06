package TestLari;

// 205314007 - ADISYA KAILA NUR FAISA
// 205314020 - FX BIMA YUDHA PRATAMA
// 205314032 - PATRISIUS ADITYA FEBRIO
public class LarikKu 
{
    //inisiasi
    private double []data = null;
    private int maxData = 0;
    private int jumlahData = 0;

    public LarikKu(int maxData) {
        if(maxData > 0){
            data = new double [maxData];
            this.maxData = maxData;
        }
    }
    
    public void tambahBelakang(double data)
    {
        if(jumlahData < maxData){
            this.data[jumlahData] = data;
            jumlahData++;
        }
    }
    
    public void tambahDepan(double data)
    {
        if(jumlahData < maxData){
            jumlahData++;
            int ulang = 1;
        
            for (int i = 0; i < jumlahData-1; i++) {
                this.data[jumlahData-1-i] = this.data[jumlahData-ulang-1];
                ulang++;
            }
            this.data[0] = data;
	}
        
    }
    
    public void printData()
    {
        System.out.println("Jumlah Data = " + this.jumlahData);
        System.out.print("Larik       = ");
        for (int i = 0; i < jumlahData; i++) {
            System.out.print(this.data[i] + "; ");
        }
        System.out.println("");
        System.out.println("");
//        System.out.println("Jumlah Data = " + jumlahData);
//        System.out.print  ("Larik       = ");
//        for (int i = 0; i < jumlahData; i++) {
//            if (data[i] != 0.0){
//                System.out.print(this.data[i] + "; ");
//            }
//            else if(jumlahData > 1){
//                System.out.print(this.data[i] + "; ");
//            }
//            else{
//                break;
//            }
//        }
//        System.out.println("");
//        System.out.println("");
    }
    void hapusDataDepan(){
        double newData = this.data[0];
        for (int i = 0; i < this.data.length; i++) {
            if(this.data[0] == newData){
                for (int j = i; j < this.data.length -1; j++) {
                    this.data[j] = this.data[j+1];
                }
                break;
            }
        }
        jumlahData--;
    }
    
    public void hapusDataBelakang(){
        jumlahData --;
    }
    
    public void cariData(double data)
    {
        int i = 1;
        boolean ditemukan = false;
        for (i = 1; i < this.data.length; i++) {
            if(this.data[i] == data){
		ditemukan = true;
		break;
            }
        }
//        double[] cari = new double[11];
//        cari[0] = 10.1;
//        cari[1] = 3.14;
//        cari[2] = 2.17;
//        cari[3] = 6.67;
//        cari[4] = 1.67;
//        cari[5] = 9.1;
//        cari[6] = 8.31;
//        cari[7] = 1.38;
//        cari[8] = 9.8;
//        cari[9] = 7.29;
//        cari[10]= 0.25;

        if(ditemukan = true && (data > 0) ){
	   System.out.println(data + " ada di-indeks no : " + i);
	   System.out.println("");
        }
        else{
            System.out.println("Tidak Ada Di Larik");
            System.out.println("");
        }
    }
        
        
}
