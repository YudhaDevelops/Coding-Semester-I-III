package Dunia_App;

public class DuniaApp {
    public static void Mysort(int [] data){
        int temp;
        for (int i = 0; i < data.length-1 ; i++) {
            for (int j = 0; j < data.length-1-i; j++) {

                if(data[j] > data[j + 1]){
                    temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
    }

    public static void Sorting(Banding [] data){
        Banding temp;
        for (int i = 0; i < data.length-1; i++) {
            for (int j = 0; j < data.length-1-i; j++) {
                if(data[j].Banding(data[j+1]) > 0){
                    temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        //int[] dataArr ={4,5,7,3,7,2,7,8,9,3,1};
//
//        System.out.print("Sebelum : ");
//        for (int i = 0; i < dataArr.length; i++) {
//            System.out.print(dataArr[i] + ", ");
//            //program sorting di sini.. ==> menjadi fungsi /method
//            Mysort(dataArr);
//        }
//        System.out.println("");
//        System.out.print("Setelah : ");
//        for(int val:dataArr){
//            System.out.print(val+", ");
//        }

        Manusia[] manusia =new Manusia[5];

        manusia[0] = new Manusia(15,"Bejo");
        manusia[1] = new Manusia(16,"Andre");
        manusia[2] = new Manusia(17,"Paijo");
        manusia[3] = new Manusia(18,"Tukiran");
        manusia[4] = new Manusia(19,"Tukijan");
        //cara cetaknya bagaimana.. silahkan anda lanjutkan
        //cara / method sorting nya bagaimana?

//        for(int i =0; i < manusia.length; i++){
//            System.out.println("Orang ke " + (i + 1));
//            System.out.println("Nama : " + manusia[i].getNama());
//            System.out.println("Umur : " + manusia[i].getUmur());
//            System.out.println("");
//        }

//        for(int i =0; i < manusia.length; i++){
//            System.out.println("Orang ke " + (i + 1));
//            System.out.println(manusia[i].toString());
//            System.out.println("");
//        }

        for (Manusia val:manusia){
            System.out.println(val);
        }
        System.out.println("");
        //buat bentuk array yang lain

        Ikan[] ikan = new Ikan[5];
        ikan[0] = new Ikan(9);
        ikan[1] = new Ikan(4);
        ikan[2] = new Ikan(5);
        ikan[3] = new Ikan(6);
        ikan[4] = new Ikan(8);

        for(Ikan fel:ikan){
            System.out.println(fel);
        }

        System.out.println("");
        DuaDimensi[]ghj = new DuaDimensi[5];
        ghj[0] = new Lingkaran(5);
        ghj[1] = new Lingkaran(9);
        ghj[2] = new SegiEmpat(5,3);
        ghj[3] = new Lingkaran(8);
        ghj[4] = new SegiEmpat(8,2);

        for(DuaDimensi def:ghj){
            if( (def instanceof Lingkaran) == true){
                Lingkaran link= (Lingkaran)def;
                System.out.println(link);
            }
            else if( (def instanceof SegiEmpat) == true){
                SegiEmpat segi = (SegiEmpat) def;
                System.out.println(segi);
            }
        }

        System.out.println("");
        System.out.println("Ini Di Sorting");
        Sorting(ikan);
        for (Ikan id:ikan){
            System.out.println(id);
        }


    }
}
