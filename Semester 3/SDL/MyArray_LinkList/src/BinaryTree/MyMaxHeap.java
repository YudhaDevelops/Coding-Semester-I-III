package BinaryTree;
//205314020 FX.Bima Yudha Pratama
public class MyMaxHeap {

    private int [] data;
    private int rear = -1;

    public MyMaxHeap(int max) {
        data = new int[max];
    }

    public void addData(int value) {
        if (isFull()) {
            System.out.println("Array Penuh");
        } else {
            rear++;
            data[rear] = value;
            heapifyUp(rear);
        }
    }

    public int delData() {
        int hasil = 0;
        if (isEmpty()) {
            return hasil;
        } else {
            hasil = data[0];
            data[0] = data[rear];
            rear--;
            heapifyDown(0);
        }
        return hasil;
    }

    public int getData(int indeks) {
        return this.data[indeks];
    }

    public int getSize() {
        return rear + 1;
    }

    public boolean isEmpty() {
        if (rear == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (rear == data.length - 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean searchData(char value) {
        boolean retrunCari = false;

        for (int i = 0; i < rear; i++) {
            if (this.data[i] == value) {
                retrunCari = true;
            }
        }
        return retrunCari;
    }

    public void setData(int index, int dataBaru) {
        if (index < getSize() || index > 0) {
            this.data[index] = dataBaru;
            heapifyUp(index);
            heapifyDown(index);
        } else {
            System.out.println("Salah Index");
        }

    }

    @Override
    public String toString() {
        String returnString = "";

        if (isEmpty()) {
            returnString = "Empty";
        } else if (!isEmpty()) {
            for (int i = 0; i <= rear; i++) {
                returnString = returnString + this.data[i] + ", ";
            }
            return returnString;
        } else {
            return "Salah Index";
        }
        return returnString;
    }

    private int left(int index) {
        int left = (index * 2) + 1;
        if (left < getSize()) {
            return left;
        } else {
            return index;
        }
    }

    private int right(int index) {
        int right = (index * 2) + 2;
        if (right < getSize()) {
            return right;
        } else {
            return index;
        }
    }

    private int parent(int index) {
        if (index > 0) {
            return (index - 1) / 2;
        } else {
            return 0;
        }
    }

    private void swapData(int index1, int index2) {
        int temp;
        temp = data[index1];
        data[index1] = data[index2];
        data[index2] = (char) temp;
    }

    private void heapifyUp(int index) {
        while (index > 0 && data[parent(index)] < data[index]) {
            swapData(parent(index), index);
            index = parent(index);
        }
    }

    private void heapifyDown(int evaluasi) {
         int maxIndex;
        do {
            maxIndex = evaluasi; // cari posisi maxIndex
            if (data[left(evaluasi)] > data[maxIndex]) {
                maxIndex = left(evaluasi); // left lebih besar
            }
            if (data[right(evaluasi)] > data[maxIndex]) {
                maxIndex = right(evaluasi); // right lebih besar
            }
            if (maxIndex == evaluasi) { // tidak terjadi pertukaran
                break; // perulangan selesai
            } else {
                swapData(maxIndex, evaluasi);
                evaluasi = maxIndex;
            }
        } while (evaluasi < getSize() / 2);
    }
}
