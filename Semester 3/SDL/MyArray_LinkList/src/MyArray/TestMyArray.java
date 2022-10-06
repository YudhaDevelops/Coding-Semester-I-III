package MyArray;
public class TestMyArray {
    public static void main(String[] args) {
        System.out.println("MyArray Test");
        System.out.println("============");
        System.out.println("Inisialisasi");
        MyArray myArr1 = new MyArray(10);
        System.out.print("new MyArray(10)              myArr1 = ");
        System.out.println(myArr1);

        System.out.println("\nOperasi Belakang");
        System.out.print("Tambah Belakang A            myArr1 = ");
        myArr1.addRear('A');
        System.out.println(myArr1);
        System.out.print("Tambah Belakang B            myArr1 = ");
        myArr1.addRear('B');
        System.out.println(myArr1);
        System.out.print("Tambah Belakang C            myArr1 = ");
        myArr1.addRear('C');
        System.out.println(myArr1);
        System.out.print("Hapus Belakang => " + myArr1.delRear() + "          myArr1 = ");
        System.out.println(myArr1);
        System.out.print("Hapus Belakang => " + myArr1.delRear() + "          myArr1 = ");
        System.out.println(myArr1);
        System.out.print("Hapus Belakang => " + myArr1.delRear() + "          myArr1 = ");

        System.out.println(myArr1);
        System.out.print("Hapus Belakang => " + myArr1.delRear() + "          myArr1 = ");
        System.out.println(myArr1);

        System.out.println("\nOperasi Depan");
        System.out.print("Tambah Depan A               myArr1 = ");
        myArr1.addFront('A');
        System.out.println(myArr1);
        System.out.print("Tambah Depan B               myArr1 = ");
        myArr1.addFront('B');
        System.out.println(myArr1);
        System.out.print("Tambah Depan C               myArr1 = ");
        myArr1.addFront('C');
        System.out.println(myArr1);
        System.out.print("Hapus Depan => " + myArr1.delFront() + "             myArr1 = ");
        System.out.println(myArr1);
        System.out.print("Hapus Depan => " + myArr1.delFront() + "             myArr1 = ");
        System.out.println(myArr1);
        System.out.print("Hapus Depan => " + myArr1.delFront() + "             myArr1 = ");
        System.out.println(myArr1);
        System.out.print("Hapus Depan => " + myArr1.delFront() + "             myArr1 = ");
        System.out.println(myArr1);

        System.out.println("\nOperasi Tengah");
        System.out.print("Tambah Belakang A            myArr1 = ");
        myArr1.addRear('A');
        System.out.println(myArr1);
        System.out.print("Tambah Belakang B            myArr1 = ");
        myArr1.addRear('B');
        System.out.println(myArr1);
        System.out.print("Tambah Tengah C, indeks 1    myArr1 = ");
        myArr1.insertAt(1,'C');
        System.out.println(myArr1);

        System.out.print("Tambah Tengah D, indeks 0    myArr1 = ");
        myArr1.insertAt(0,'D');
        System.out.println(myArr1);
        System.out.print("Tambah Tengah E, indeks 3    myArr1 = ");
        myArr1.insertAt(3,'E');
        System.out.println(myArr1);
        System.out.print("Tambah Tengah *, indeks -1   myArr1 = ");
        myArr1.insertAt(-1,'*');
        System.out.print("Tambah Tengah *, indeks 5    myArr1 = ");
        myArr1.insertAt(5,'*');
        System.out.print("Hapus Tengah indeks 2 => " + myArr1.delAt(2) + "   myArr1 = ");
        System.out.println(myArr1);
        System.out.print("Hapus Tengah indeks 0 => " + myArr1.delAt(0) + "   myArr1 = ");
        System.out.println(myArr1);
        System.out.print("Hapus Tengah indeks 1 => " + myArr1.delAt(1) + "   myArr1 = ");
        System.out.println(myArr1);
        System.out.print("Hapus Tengah indeks 3 => " + myArr1.delAt(3) + "   myArr1 = ");
        System.out.println(myArr1);
        System.out.print("Hapus Tengah indeks -1 => " + myArr1.delAt(-1) + "  myArr1 = ");
        System.out.println(myArr1);
        System.out.print("Hapus Tengah indeks 1 => " + myArr1.delAt(1) + "   myArr1 = ");
        System.out.println(myArr1);
        System.out.print("Hapus Tengah indeks 0 => " + myArr1.delAt(0) + "   myArr1 = ");
        System.out.println(myArr1);
        System.out.print("Hapus Tengah indeks 0 => " + myArr1.delAt(0) + "   myArr1 = ");
        System.out.println(myArr1);
        System.out.print("Tambah Tengah *, indeks 0    myArr1 = ");
        myArr1.insertAt(0,'*');

        System.out.println("\nKetika ditambahkan 12 data (lebih dari kapasitasnya yaitu 10 data)");
        for(char i = 'A'; i < 'M'; i++)
            myArr1.addRear(i);
        System.out.print(" ... yang masuk hanya 10     myArr1 = ");
        System.out.println(myArr1);

        System.out.println("\nOperasi Get, Set dan Search");
        System.out.print("Set indeks 4 dengan X        myArr1 = ");
        myArr1.setData(4,'X');
        System.out.println(myArr1);
        System.out.print("Get indeks 4 => " + myArr1.getData(4) + "            myArr1 = ");
        System.out.println(myArr1);
        System.out.println("Search X     => " + myArr1.searchData('X'));

    }
    
}
