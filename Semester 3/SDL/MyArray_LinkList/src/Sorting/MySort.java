package Sorting;

import java.util.Arrays;

public class MySort {

//    Nama : FX. Bima Yudha Pratama.
//    NIM : 205314020
//    Kelas : DP
    public static void main(String[] args) {
        sorting m = new sorting();
        System.out.println("\nBubble");
        int[] data_Bub1 = { -2, 45, 0, 11, -9 };
        System.out.println("Sebelum di sort : " + Arrays.toString(data_Bub1));
        sorting.bubbleSort_ASC(data_Bub1);
        System.out.println("Setelah di sort : " + Arrays.toString(data_Bub1));
//      uji pengurutan turun
        System.out.println("");
        System.out.println("Uji Pengurutan Turun BubbleSort");
        int[] data_Bub2 = data_Bub1.clone();
        System.out.println("Sebelum di sort : " + Arrays.toString(data_Bub2));
        sorting.bubbleSort_DESC(data_Bub2);
        System.out.println("Setelah di sort : " + Arrays.toString(data_Bub2));
        
        //selection
        System.out.println("\nSelection");
        int[] data_select1 = { 20, 12, 10, 15, 2 };
        System.out.println("Sebelum di sort : " + Arrays.toString(data_select1));
        sorting.selectionSort_ASC(data_select1);
        System.out.println("Setelah di sort : " + Arrays.toString(data_select1));
//      uji pengurutan turun
        System.out.println("");
        System.out.println("Uji Pengurutan Turun SelectionSort");
        int[] data_select2 = data_select1.clone();
        System.out.println("Sebelum di sort : " + Arrays.toString(data_select2));
        sorting.selectionSort_DESC(data_select2);
        System.out.println("Setelah di sort : " + Arrays.toString(data_select2));
        
        System.out.println("\nInsertion");
        int[] data_insert1 = { 9, 5, 1, 4, 3 };
        System.out.println("Sebelum di sort : " + Arrays.toString(data_insert1));
        sorting.insertionSort_ASC(data_insert1);
        System.out.println("Setelah di sort : " + Arrays.toString(data_insert1));
//      uji pengurutan turun
        System.out.println("");
        System.out.println("Uji Pengurutan Turun InsertSort");
        int[] data_insert2 = data_insert1.clone();
        System.out.println("Sebelum di sort : " + Arrays.toString(data_insert2));
        sorting.insertionSort_DESC(data_insert2);
        System.out.println("Setelah di sort : " + Arrays.toString(data_insert2));
        
        System.out.println("\nMerge");
        int data_merge1[] = { 6, 5, 12, 10, 9, 1 };
        System.out.println("Sebelum di sort : " + Arrays.toString(data_merge1));
       
        m.mergeSort_ASC(data_merge1, 0, data_merge1.length-1);
        System.out.println("Setelah di sort : " + Arrays.toString(data_merge1));
//      uji pengurutan turun
        System.out.println("");
        System.out.println("Uji Pengurutan Turun MergeSort");
        int[] data_merge2 = data_merge1.clone();
        System.out.println("Sebelum di sort : " + Arrays.toString(data_merge2));
        m.mergeSort_DESC(data_merge2, 0, data_merge2.length-1);
        System.out.println("Setelah di sort : " + Arrays.toString(data_merge2));
        
        System.out.println("\nQuick");
        int[] data_quick1 = { 8, 7, 2, 1, 0, 9, 6 };
        System.out.println("Sebelum di sort : " + Arrays.toString(data_quick1));
        sorting.quickSort_ASC(data_quick1, 0, data_quick1.length-1);
        System.out.println("Setelah di sort : " + Arrays.toString(data_quick1));
//      uji pengurutan turun
        System.out.println("");
        System.out.println("Uji Pengurutan Turun Quick");
        int[] data_quick2 = { 8, 7, 2, 1, 0, 9, 6 };
        System.out.println("Sebelum di sort : " + Arrays.toString(data_quick2));
        sorting.quickSort_DESC(data_quick2, 0, data_quick2.length-1);
        System.out.println("Setelah di sort : " + Arrays.toString(data_quick2));

// Test Time        
        int MAX_DATA = 20000;
        int[] test = new int[MAX_DATA];
        int[] copyTest = new int[MAX_DATA];
        for (int i = 0; i < MAX_DATA; i++) {
            test[i] = (int) (Math.random() * MAX_DATA);
        }
        long start, stop;

        System.out.println("\nBubble");
        copyTest = test.clone();
        start = System.nanoTime();
        sorting.bubbleSort_ASC(copyTest);
        stop = System.nanoTime();
        System.out.println("Waktu rerata     : " + (stop - start) / 1000 + " ms");

        start = System.nanoTime();
        sorting.bubbleSort_ASC(copyTest);
        stop = System.nanoTime();
        System.out.println("Waktu best       : " + (stop - start) / 1000 + " ms");
//      percobaan sorting terburuk ==> urutan dibalik
        start = System.nanoTime();
        sorting.bubbleSort_DESC(copyTest);
        stop = System.nanoTime();
        System.out.println("Waktu terburuk   : " + (stop - start) / 1000 + " ms");

        System.out.println("\nSelection");
        copyTest = test.clone();
        start = System.nanoTime();
        sorting.selectionSort_ASC(copyTest);
        stop = System.nanoTime();
        System.out.println("Waktu rerata     : " + (stop - start) / 1000 + " ms");

        start = System.nanoTime();
        sorting.selectionSort_ASC(copyTest);
        stop = System.nanoTime();
        System.out.println("Waktu best       : " + (stop - start) / 1000 + " ms");
//      percobaan sorting terburuk ==> urutan dibalik
        start = System.nanoTime();
        sorting.selectionSort_DESC(copyTest);
        stop = System.nanoTime();
        System.out.println("Waktu terburuk   : " + (stop - start) / 1000 + " ms");

        System.out.println("\nInsertion");
        copyTest = test.clone();
        start = System.nanoTime();
        sorting.insertionSort_ASC(copyTest);
        stop = System.nanoTime();
        System.out.println("Waktu rerata     : " + (stop - start) / 1000 + " ms");

        start = System.nanoTime();
        sorting.insertionSort_ASC(copyTest);
        stop = System.nanoTime();
        System.out.println("Waktu best       : " + (stop - start) / 1000 + " ms");
//      percobaan sorting terburuk ==> urutan dibalik
        start = System.nanoTime();
        sorting.insertionSort_DESC(copyTest);
        stop = System.nanoTime();
        System.out.println("Waktu terburuk   : " + (stop - start) / 1000 + " ms");

        System.out.println("\nMerge");
        copyTest = test.clone();
        start = System.nanoTime();
        m.mergeSort_ASC(copyTest, 0, copyTest.length - 1);
        stop = System.nanoTime();
        System.out.println("Waktu rerata     : " + (stop - start) / 1000 + " ms");

        start = System.nanoTime();
        m.mergeSort_ASC(copyTest, 0, copyTest.length - 1);
        stop = System.nanoTime();
        System.out.println("Waktu best       : " + (stop - start) / 1000 + " ms");
//      percobaan sorting terburuk ==> urutan dibalik
        start = System.nanoTime();
        m.mergeSort_DESC(copyTest, 0, copyTest.length - 1);
        stop = System.nanoTime();
        System.out.println("Waktu terburuk   : " + (stop - start) / 1000 + " ms");

        System.out.println("\nQuick");
        copyTest = test.clone();
        start = System.nanoTime();
        sorting.quickSort_ASC(copyTest, 0, copyTest.length - 1);
        stop = System.nanoTime();
        System.out.println("Waktu rerata     : " + (stop - start) / 1000 + " ms");

        start = System.nanoTime();
        sorting.quickSort_ASC(copyTest, 0, copyTest.length - 1);
        stop = System.nanoTime();
        System.out.println("Waktu best       : " + (stop - start) / 1000 + " ms");
//      percobaan sorting terburuk ==> urutan dibalik
        start = System.nanoTime();
        sorting.quickSort_DESC(copyTest, 0, copyTest.length - 1);
        stop = System.nanoTime();
        System.out.println("Waktu terburuk   : " + (stop - start) / 1000 + " ms");
        
//        liat rekaman menit 22.23
        
        
//        int a[] = {38, 10, 29, 25, 23, 6, 2, 30, 15};
//        int n = a.length;
//        TimSort t1 = new TimSort();
//        System.out.print("\nBefore sorting array elements are - ");
//        t1.printArr(a, n);
//        t1.timSort(a, n);
//        System.out.print("\nAfter sorting array elements are - ");
//        t1.printArr(a, n);
//        System.out.println();
//
//        int[] array1 = {38, 10, 29, 25, 23, 6, 2, 30, 15, 4, 8, 99, 46};
//        n = array1.length;
//        System.out.print("\nBefore sorting array elements are - ");
//        t1.printArr(array1, n);
//        t1.tim_Sort(array1);
//        System.out.print("\nAfter sorting array elements are - ");
//        t1.printArr(array1, n);
//
//        Dosen d = new Dosen("Yudha", 4566);
//        Mahasiswa m1 = new Mahasiswa("Bambank", 467, "jakarta");
//        Mahasiswa m2 = new Mahasiswa("paijo", 123, "sulawesi");
//        Mahasiswa m3 = new Mahasiswa("tukiman", 423, "lampung");
//        Mahasiswa[] test = {m1, m2, m3};
//        n = test.length;
//        t1.ngawur(d);
//        t1.ngawur(m1);
//        t1.bubbleSort_ASC(test, 1);
//        System.out.println("");
//        t1.printAr(test, n);
    }

}
