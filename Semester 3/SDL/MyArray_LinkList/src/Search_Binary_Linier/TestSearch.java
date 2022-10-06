package Search_Binary_Linier;

import java.util.Arrays;

public class TestSearch {
    static int count = 0;
    public static int Linear(int [] array, int x, int low, int high){
        int count = 0;
        for (int i = low; i <= high; i++) {
            if (array[i] == x) {
                return i;
            }
            count++;
        }
        System.out.println("Perulangan : " + count);
        return -1;
    }
    
    public static int BinaryIteratif(int [] array, int x, int low, int high){
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (array[mid] == x) {
                count++;
//                System.out.println("Perulangan = " + count);
                count = 0;
                return mid;
            }

            if (array[mid] < x) {
                count++;
                low = mid + 1;
            } else {
                count++;
                high = mid - 1;
            }
        }
//        System.out.println("Perulangan = " + count);
        count = 0;
        return -1;
    }
    
    public static int BinaryRecursive(int[]array, int x, int low,int high){
        int mid = low + (high - low) / 2;
        if (low <= high) {
            count++;
            if (array[mid] == x) {
//                System.out.println("Perulangan = " + count);
                count = 0;
                return mid;
            } else if (array[mid] < x) {
                return BinaryRecursive(array, x, mid + 1, high);
            } else if (array[mid] > x) {
                return BinaryRecursive(array, x, low, mid - 1);
            }
        }
//        System.out.println("Perulangan = " + count);
        count = 0;
        return -1;
    }
    
    public static int InterpolationSearch(int array [], int x, int low, int high){
        int mid;

        // Since array is sorted, an element
        // present in array must be in range
        // defined by corner
        while (low <= high && x >= array[low] && x <= array[high]) {
            // Probing the position with keeping
            // uniform distribution in mind.
//            mid = (((x - arr[low])/(arr[high] - arr[low])) * (high - low) + low);
//            mid = low + (((high - low) / (arr[high] - arr[low])) * (x - arr[low]));
            mid = low + (((x - array[low]) * (high - low)) / (array[high] - array[low]));
            // Condition of target found
            if (array[mid] == x) {
                count++;
//                System.out.println("Perulangan = " + count);
                count = 0;
                return mid;
            }

            // If x is larger, x is in right sub array
            if (array[mid] < x) {
                count++;
                low = mid + 1;
            }

            // If x is smaller, x is in left sub array
            if (array[mid] > x) {
                count++;
                high = mid - 1;
            }
        }
//        System.out.println("Perulangan = " + count);
        count = 0;
        return -1;
    }
    
    public static void main(String[] args) {
        int[] test1 = {5, 20, 15, 11, 31, 26, 8, 26, 35, 9, 21};
        int[] test2 = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};
        int[] test3 = {1,2,3,4};
        int[] t = {2,7,3,9,4,1,34,25,76,80,90,54,21,78};
//        int[] test4 = {5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25};

        System.out.println("");
        System.out.println("Linear");
        System.out.println("Cari 34 : " + Linear(t, 34, 0, t.length-1));
        System.out.println("");
        
        System.out.println("Cari 31 : " + Linear(test1, 31, 0, test1.length-1));
        System.out.println("Linear");
        System.out.println("Cari 21 : " + Linear(test2, 4, 0, test2.length-1));
        System.out.println("Binary");
        System.out.println("Cari  : " + BinaryIteratif(test2, 2, 0, test2.length-1));
        System.out.println("Cari  3 : " + BinaryIteratif(test3, 3, 0, test3.length-1));
        System.out.println("Cari  8 : " + BinaryIteratif(test3, 8, 0, test3.length-1));
        System.out.println("Cari  10 : " + BinaryIteratif(test3, 10, 0, test3.length-1));
        System.out.println("Cari  18 : " + BinaryIteratif(test3, 18, 0, test3.length-1));
        System.out.println("Cari  27 : " + BinaryIteratif(test3, 27, 0, test3.length-1));
        System.out.println("");
        System.out.println("Interpolasi");
        System.out.println("Cari  3 : " + InterpolationSearch(test3, 3, 0, test3.length-1));
        System.out.println("Cari  8 : " + InterpolationSearch(test3, 8, 0, test3.length-1));
        System.out.println("Cari  10 : " + InterpolationSearch(test3, 10, 0, test3.length-1));
        System.out.println("Cari  18 : " + InterpolationSearch(test3, 18, 0, test3.length-1));
        System.out.println("Cari  27 : " + InterpolationSearch(test3, 27, 0, test3.length-1));
        System.out.println("Cari  : " + BinaryIteratif(test2, 5, 0, test2.length-1));
        System.out.println("Cari 21 : " + BinaryRecursive(test2, 35, 0, test2.length-1));

        int MAX_DATA = 10000;
        System.out.println("Waktu Untuk Binary Search");
        int[] test4 = new int[MAX_DATA];
        int cari1;
        for(int i = 0; i < MAX_DATA; i++)
            test4[i] = (int) (Math.random() * MAX_DATA);
        Arrays.sort(test4);
        long start, stop;
        start = System.nanoTime();
            cari1 = (int)(Math.random() * MAX_DATA);
            System.out.println("Data yang di cari     = " + cari1);
            System.out.println("Ada di index no       = " + BinaryIteratif(test4, cari1, 0, test4.length-1));
        stop = System.nanoTime();
        System.out.println("Waktu yang dibutuhkan = " + (stop-start)/1000 + " ms");
        
        System.out.println("");
        System.out.println("Waktu Untuk Interpolation");
        int[] test5 = new int[MAX_DATA];
        for(int i = 0; i < MAX_DATA; i++)
            test5[i] = (int) (Math.random() * MAX_DATA);
        Arrays.sort(test5);
        long start2 = System.nanoTime();
            int cari2 = (int)(Math.random() * MAX_DATA);
            System.out.println("Data yang di cari     = " + cari2);
            System.out.println("Ada di index no       = " + InterpolationSearch(test5, cari2, 0, test5.length-1));
        long stop2 = System.nanoTime();
        System.out.println("Waktu yang dibutuhkan = " + (stop2-start2)/1000 + " ms");
        

    }
    
}
