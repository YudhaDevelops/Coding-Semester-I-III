package sdl_cir;
public class SDL_cir {
    public static void main(String[] args) {
        System.out.println("MyCircularArray Test");
        System.out.println("====================");
        System.out.println("Inisialisasi");
        MyCircularArray myArr1 = new MyCircularArray(10);
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

        System.out.println("\nKetika ditambahkan 12 data (lebih dari kapasitasnya yaitu 10 data)");
        for(char i = 'A'; i < 'M'; i++)
            myArr1.addRear(i);
        System.out.print(" ... yang masuk hanya 10     myArr1 = ");
        System.out.println(myArr1);

        System.out.println("\nOperasi Get, Set dan Search");
        System.out.print("Hapus Depan => " + myArr1.delFront() + "             myArr1 = ");
        System.out.println(myArr1);
        System.out.print("Hapus Depan => " + myArr1.delFront() + "             myArr1 = ");
        System.out.println(myArr1);
        System.out.print("Tambah Belakang Y            myArr1 = ");
        myArr1.addRear('Y');
        System.out.println(myArr1);
        System.out.print("Tambah Belakang Z            myArr1 = ");
        myArr1.addRear('Z');
        System.out.println(myArr1);
        System.out.print("Set indeks 4 dengan X        myArr1 = ");
        myArr1.setData(4,'X');
        System.out.println(myArr1);
        System.out.print("Get indeks 4 => " + myArr1.getData(4) + "            myArr1 = ");
        System.out.println(myArr1);
        myArr1.printRearDanFront();
        /*
        index 0, 1, 2, 3, 4, 5, 6, 7, 8, 9
        data  c, d, e, f, x, h, i, j, y, z
 front & rear    R  F
        
        */
        System.out.println("Search Y     => " + myArr1.searchData('Y'));
        System.out.println("Search Z     => " + myArr1.searchData('Z'));
        System.out.println("Search X     => " + myArr1.searchData('X'));
    }
    
}
