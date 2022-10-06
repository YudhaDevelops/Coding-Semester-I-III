package Sorting;

public class sorting {

    public sorting() {
    }
    
    // Bubble sort in Java
    // perform the bubble sort
    public static void bubbleSort_ASC(int array[]) {
        int size = array.length;
        // loop to access each array element
        for (int i = 0; i < size - 1; i++) // loop to compare array elements
        {
            for (int j = 0; j < size - i - 1; j++) // compare two adjacent elements
            // change > to < to sort in descending order
            {
                if (array[j] > array[j + 1]) {
                    // swapping occurs if elements
                    // are not in the intended order
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
    
    
    public static <T extends Comparable> void bubbleSort_ASC(T[] array, int urut) {
        int size = array.length;
        if (urut < 0) {
            urut = 1;
        } else {
            urut = -1;
        }
        // loop to access each array element
        for (int i = 0; i < size - 1; i++) // loop to compare array elements
        {
            for (int j = 0; j < size - i - 1; j++) // compare two adjacent elements
            // change > to < to sort in descending order
            {
                if (array[j].compareTo(array[j + 1]) == urut) {//-1 urut turun +1 urut naik
                    // swapping occurs if elements
                    // are not in the intended order
                    T temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }


    public static void bubbleSort_DESC(int array[]) {
        int size = array.length;
        // loop to access each array element
        for (int i = 0; i < size - 1; i++) // loop to compare array elements
        {
            for (int j = 0; j < size - i - 1; j++) // compare two adjacent elements
            // change > to < to sort in descending order
            {
                if (array[j] < array[j + 1]) {
                    // swapping occurs if elements
                    // are not in the intended order
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void selectionSort_ASC(int array[]) {
        int size = array.length;

        for (int step = 0; step < size - 1; step++) {
            int min_idx = step;

            for (int i = step + 1; i < size; i++) {

                // To sort in descending order, change > to < in this line.
                // Select the minimum element in each loop.
                if (array[i] < array[min_idx]) {
                    min_idx = i;
                }
            }

            // put min at the correct position
            int temp = array[step];
            array[step] = array[min_idx];
            array[min_idx] = temp;
        }
    }

    public static void selectionSort_DESC(int array[]) {
        int size = array.length;

        for (int step = 0; step < size - 1; step++) {
            int min_idx = step;

            for (int i = step + 1; i < size; i++) {

                // To sort in descending order, change > to < in this line.
                // Select the minimum element in each loop.
                if (array[i] > array[min_idx]) {
                    min_idx = i;
                }
            }

            // put min at the correct position
            int temp = array[step];
            array[step] = array[min_idx];
            array[min_idx] = temp;
        }
    }

    public static void insertionSort_ASC(int array[]) {
        int size = array.length;

        for (int step = 1; step < size; step++) {
            int key = array[step];
            int j = step - 1;

            // Compare key with each element on the left of it until an element smaller than
            // it is found.
            // For descending order, change key<array[j] to key>array[j].
            while (j >= 0 && key < array[j]) {
                array[j + 1] = array[j];
                --j;
            }

            // Place key at after the element just smaller than it.
            array[j + 1] = key;
        }
    }

    public static void insertionSort_DESC(int array[]) {
        int size = array.length;

        for (int step = 1; step < size; step++) {
            int key = array[step];
            int j = step - 1;

            // Compare key with each element on the left of it until an element smaller than
            // it is found.
            // For descending order, change key<array[j] to key>array[j].
            while (j >= 0 && key > array[j]) {
                array[j + 1] = array[j];
                --j;
            }

            // Place key at after the element just smaller than it.
            array[j + 1] = key;
        }
    }

    //merge
    // Merge sort in Java
    // Merge two subarrays L and M into arr
    void merge_ASC(int arr[], int p, int q, int r) {
        // Create L ← A[p..q] and M ← A[q+1..r]
        int n1 = q - p + 1;
        int n2 = r - q;

        int L[] = new int[n1];
        int M[] = new int[n2];

        for (int i = 0; i < n1; i++) {
            L[i] = arr[p + i];
        }
        for (int j = 0; j < n2; j++) {
            M[j] = arr[q + 1 + j];
        }
        // Maintain current index of sub-arrays and main array
        int i, j, k;
        i = 0;
        j = 0;
        k = p;
        // Until we reach either end of either L or M, pick larger among
        // elements L and M and place them in the correct position at A[p..r]
        while (i < n1 && j < n2) {
            if (L[i] <= M[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = M[j];
                j++;
            }
            k++;
        }
        // When we run out of elements in either L or M,
        // pick up the remaining elements and put in A[p..r]
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = M[j];
            j++;
            k++;
        }
    }

    // Divide the array into two subarrays, sort them and merge them
    void mergeSort_ASC(int arr[], int l, int r) {
        if (l < r) {

            // m is the point where the array is divided into two subarrays
            int m = (l + r) / 2;

            mergeSort_ASC(arr, l, m);
            mergeSort_ASC(arr, m + 1, r);

            // Merge the sorted subarrays
            merge_ASC(arr, l, m, r);
        }
    }

    // Divide the array into two subarrays, sort them and merge them
    void mergeSort_DESC(int arr[], int l, int r) {
        if (l < r) {
            // m is the point where the array is divided into two subarrays
            int m = (l + r) / 2;
            mergeSort_DESC(arr, l, m);
            mergeSort_DESC(arr, m + 1, r);
            // Merge the sorted subarrays
            merge_DESC(arr, l, m, r);
        }
    }

    void merge_DESC(int arr[], int p, int q, int r) {
        // Create L ← A[p..q] and M ← A[q+1..r]
        int n1 = q - p + 1;
        int n2 = r - q;
        int L[] = new int[n1];
        int M[] = new int[n2];
        for (int i = 0; i < n1; i++) {
            L[i] = arr[p + i];
        }
        for (int j = 0; j < n2; j++) {
            M[j] = arr[q + 1 + j];
        }
        // Maintain current index of sub-arrays and main array
        int i, j, k;
        i = 0;
        j = 0;
        k = p;
        // Until we reach either end of either L or M, pick larger among
        // elements L and M and place them in the correct position at A[p..r]
        while (i < n1 && j < n2) {
            if (L[i] >= M[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = M[j];
                j++;
            }
            k++;
        }
        // When we run out of elements in either L or M,
        // pick up the remaining elements and put in A[p..r]
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = M[j];
            j++;
            k++;
        }
    }
    // Print the array
//    static void printArray(int arr[]) {
//        int n = arr.length;
//        for (int i = 0; i < n; ++i) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//    }

    //quik
    // method to find the partition position
    static int partition_ASC(int array[], int low, int high) {
        // choose the rightmost element as pivot
        int pivot = array[high];
        // pointer for greater element
        int i = (low - 1);
    // traverse through all elements
        // compare each element with pivot
        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
        // if element smaller than pivot is found
                // swap it with the greatr element pointed by i
                i++;

                // swapping element at i with element at j
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        // swapt the pivot element with the greater element specified by i
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        // return the position from where partition is done
        return (i + 1);
    }

    static void quickSort_ASC(int array[], int low, int high) {
        if (low < high) {
      // find pivot element such that
            // elements smaller than pivot are on the left
            // elements greater than pivot are on the right
            int pi = partition_ASC(array, low, high);
            // recursive call on the left of pivot
            quickSort_ASC(array, low, pi - 1);
            // recursive call on the right of pivot
            quickSort_ASC(array, pi + 1, high);
        }
    }

    static void quickSort_DESC(int array[], int low, int high) {
        if (low < high) {
      // find pivot element such that
            // elements smaller than pivot are on the left
            // elements greater than pivot are on the right
            int pi = partition_DESC(array, low, high);
            // recursive call on the left of pivot
            quickSort_DESC(array, low, pi - 1);
            // recursive call on the right of pivot
            quickSort_DESC(array, pi + 1, high);
        }
    }
    
    static int partition_DESC(int array[], int low, int high) {
        // choose the rightmost element as pivot
        int pivot = array[high];
        // pointer for greater element
        int i = (low - 1);
    // traverse through all elements
        // compare each element with pivot
        for (int j = low; j < high; j++) {
            if (array[j] >= pivot) {
        // if element smaller than pivot is found
                // swap it with the greatr element pointed by i
                i++;

                // swapping element at i with element at j
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        // swapt the pivot element with the greater element specified by i
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        // return the position from where partition is done
        return (i + 1);
    }
}
