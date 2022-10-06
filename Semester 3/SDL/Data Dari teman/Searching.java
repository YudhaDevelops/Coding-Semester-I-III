/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package searching;

/**
 *
 * @author Michael
 */
import java.util.Arrays;

public class Searching {

    static int count = 0;

    /**
     * @param args the command line arguments
     */
    public static int Linear(int array[], int x, int low, int high) {

        // Going through array sequencially
        for (int i = low; i <= high; i++) {
            if (array[i] == x) {
                return i;
            }
        }
        return -1;
    }

    static int BinaryIteratif(int array[], int x, int low, int high) {

        // Repeat until the pointers low and high meet each other
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (array[mid] == x) {
                count++;
                System.out.println("Perulangan = " + count);
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
        System.out.println("Perulangan = " + count);
        count = 0;
        return -1;
    }

    static int BinaryRecursive(int array[], int x, int low, int high) {

        int mid = low + (high - low) / 2;
        if (low <= high) {
            count++;
            if (array[mid] == x) {
                System.out.println("Perulangan = " + count);
                count = 0;
                return mid;
            } else if (array[mid] < x) {
                return BinaryRecursive(array, x, mid + 1, high);
            } else if (array[mid] > x) {
                return BinaryRecursive(array, x, low, mid - 1);
            }
        }
        System.out.println("Perulangan = " + count);
        count = 0;
        return -1;
    }

    public static int interpolationSearch(int arr[], int x, int low, int high) {
        int mid;

        // Since array is sorted, an element
        // present in array must be in range
        // defined by corner
        while (low <= high && x >= arr[low] && x <= arr[high]) {
            // Probing the position with keeping
            // uniform distribution in mind.
//            mid = (((x - arr[low])/(arr[high] - arr[low])) * (high - low) + low);
//            mid = low + (((high - low) / (arr[high] - arr[low])) * (x - arr[low]));
            mid = low + (((x - arr[low]) * (high - low)) / (arr[high] - arr[low]));
            // Condition of target found
            if (arr[mid] == x) {
                count++;
                System.out.println("Perulangan = " + count);
                count = 0;
                return mid;
            }

            // If x is larger, x is in right sub array
            if (arr[mid] < x) {
                count++;
                low = mid + 1;
            }

            // If x is smaller, x is in left sub array
            if (arr[mid] > x) {
                count++;
                high = mid - 1;
            }
        }
        System.out.println("Perulangan = " + count);
        count = 0;
        return -1;
    }

    public static void main(String[] args) {
        int[] test1 = {5, 20, 15, 11, 31, 26, 8, 26, 35, 9, 21};
        int[] test2 = {5, 8, 9, 11, 15, 20, 21, 26};
        int[] test3 = {5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25};

        System.out.println("Cari 40 : " + Linear(test1, 40, 0, test1.length - 1));
        System.out.println("Cari 40 : " + Linear(test2, 40, 0, test2.length - 1));
        System.out.println("Cari 27 : " + BinaryRecursive(test2, 27, 0, test2.length - 1));
        System.out.println("Cari 27 : " + BinaryIteratif(test3, 22, 0, test2.length - 1));
        System.out.println("Cari 26 (LORD) : " + interpolationSearch(test3, 26, 0, test3.length - 1));

        int MAX_DATA = 100000;
        int[] test4 = new int[MAX_DATA];
        int cari;
        for (int i = 0; i < MAX_DATA; i++) {
            test4[i] = (int) (Math.random() * MAX_DATA);
        }
        Arrays.sort(test4);
        long start, stop;
        start = System.nanoTime();
        cari = 1000;
        System.out.println("Bilangan yang di cari = " + cari);
        System.out.println("Ada di index no       = " + BinaryIteratif(test4, cari, 0, test4.length - 1));
        stop = System.nanoTime();
        System.out.println("Waktu yang dibutuhkan = " + (stop - start) / 1000 + " ms");
    }

}
