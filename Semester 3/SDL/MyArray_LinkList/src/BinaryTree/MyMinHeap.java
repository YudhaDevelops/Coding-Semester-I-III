package BinaryTree;
//205314020 FX.Bima Yudha Pratama
public class MyMinHeap {
    
    private int[] value;
    private int rear = -1;

    public MyMinHeap(int max) {
        value = new int[max];
    }


    

    public int getData(int index) {
        return value[index];
    }

    public void setData(int index, int value) {
        if (isFull()) {
            grow();
        }
        this.value[index] = value;
        heapifyUp(index);
        heapifyDown(index);
    }

    private int parent(int index) {
        if (index > 0) {
            return (index - 1) / 2;
        } else {
            return 0;
        }
    }

    private int left(int index) {
        int left = (index * 2) + 1;
        if (left < getSize()) {
            return left;
        } else {
            return index;
        }
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
        if (rear == value.length - 1) {
            return true;
        } else {
            return false;
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

    private void swapData(int index1, int index2) {
        int temp;
        temp = value[index1];
        value[index1] = value[index2];
        value[index2] = temp;
    }

    private void heapifyUp(int evaluasi) {
        while (evaluasi > 0 && value[parent(evaluasi)] > value[evaluasi]) {
            swapData(parent(evaluasi), evaluasi);
            evaluasi = parent(evaluasi);
        }
    }

    private void heapifyDown(int evaluasi) {
        int index;
        do {
            index = evaluasi; // cari posisi maxIndex
            if (value[left(evaluasi)] < value[index]) {
                index = left(evaluasi); // left lebih besar
            }
            if (value[right(evaluasi)] < value[index]) {
                index = right(evaluasi); // right lebih besar
            }
            if (index == evaluasi) { // tidak terjadi pertukaran
                break; // perulangan selesai
            } else {
                swapData(index, evaluasi);
                evaluasi = index;
            }
        } while (evaluasi < getSize() / 2);
    }

    public void addData(int value) {
        if (isFull()) {
            grow();
        }
        rear++;
        this.value[rear] = value;
        heapifyUp(rear);

    }

    public int delData() {
        int dataReturn = 0;
        if (isEmpty()) {
            return dataReturn;
        } else {
            dataReturn = value[0];
            value[0] = value[rear];
            rear--;
            heapifyDown(0);
            return dataReturn;
        }
    }

    @Override
    public String toString() {
        String data = "";

        if (isEmpty()) {
            return "EMPTY";
        } else if (!isEmpty()) {
            for (int i = 0; i <= rear; i++) {
                data = data + this.value[i] + ", ";
            }

            return data;
        } else {
            return "Salah Index";
        }
    }
    private void grow() {
        int[] dataOld = value;
        value = new int[2 * rear + 1];

        for (int i = 0; i < dataOld.length; i++) {
            value[i] = dataOld[i];
        }
    }
}
