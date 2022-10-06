
package PBOKelas;
public class DaftarKontak 
{
    private Kontak[] dataKontak;
    private int jumlah = 0;
    
    public DaftarKontak (int maxData){
        if(maxData > jumlah){
            dataKontak = new Kontak[maxData];
        }
    }
    public void addKontak(String nama, String hp){
        dataKontak[jumlah]= new Kontak(nama, hp);
        jumlah++;
    }
	
    public void printDaftar(){
        int ulang = 1;
        System.out.println("No  Hp        Nama");
        for (int i = 0; i < dataKontak.length; i++) {
            if (dataKontak[i] == null) {
                System.out.println("");
            }
            else{
                System.out.println(ulang + "  " + dataKontak[i].getInfo());
                ulang++;
            }
        }
    }
	
    public void setKontak(int index, Kontak data){
        if (index - dataKontak.length-1 > 0) {
            System.out.println("Index tidak Ditemukan");
        }
        else{
            dataKontak[index] = data;
            jumlah++;
        }
    }
	
    public Kontak getKontak(int index){
        if(index  - dataKontak.length -1 >0){
            System.out.println("Index Tidak Ditemukan");
            return null;
        }
        else{
            return dataKontak[index];
        }
    }
}
