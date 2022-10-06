package MyCircularArray;
//Nama : FX. Bima Yudha Pratama 
//NIM  : 205314020
public class MyCircularArray {
    char[] data;
    int front = -1;
    int rear = -1;

    public MyCircularArray(int maxData) {
        data = new char[maxData];
    }

    public void addFront(char dataBaru) {
        if (isFull()) {
            System.out.println("MyArray Penuh");
        } else if (isEmpty()) {
            rear = 0;
            front = 0;
            data[front] = dataBaru;
        } else {
            front = dec(front);
            data[front] = dataBaru;
        }
    }

    public void addRear(char dataBaru) {
        if (isFull()) {
            System.out.println("MyArray Penuh");
        } else if (isEmpty()) {
            rear = 0;
            front = 0;
            data[rear] = dataBaru;
        } else {
            rear = inc(rear);
            data[rear] = dataBaru;
        }
    }

    private int dec(int x) {
        if (x == 0) {
            return data.length - 1;
        } else {
            return x - 1;
        }
    }

    public char delFront() {
        char returnData = 0;

        if (isEmpty()) {
            return returnData;
        } else if (front == rear) {
            returnData = data[front];
            front = -1;
            rear = -1;
            return returnData;
        } else {
            returnData = data[front];
            front = inc(front);
            return returnData;
        }
    }

    public char delRear() {
        char returnData = 0;

        if (isEmpty()) {
            return returnData;
        } else if (front == rear) {
            returnData = data[rear];
            front = -1;
            rear = -1;
            return returnData;
        } else {
            returnData = data[rear];
            rear = dec(rear);
            return returnData;
        }
    }

    public char getData(int index) {
        if(front+index > data.length) {
            return this.data[front+index-data.length];
        } else {
            return this.data[front+index];
        }
    }

    public int getSize() {
        if (front == -1) {
            return 0;
        } else if (rear >= front) {
            return rear - front + 1;
        } else {
            return rear - front + 1 + data.length - 1;
        }
    }

    private int inc(int x) {
        if (x == data.length - 1) {
            return 0;
        } else {
            return x + 1;
        }
    }

    public boolean isEmpty() {
        if (front == -1 && rear == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (inc(rear) == front) {
            return true;
        } else {
            return false;
        }
    }

    public boolean searchData(char dataBaru) {
        boolean returnSearch = false;

        for (int i = front; i != rear; i = inc(i)){
            if (this.data[i] == dataBaru || this.data[rear] == dataBaru) {
                returnSearch = true;
                break;
            }
        }
        return returnSearch;
    }

    public void setData(int index, char dataBaru) {
        if(front+index > data.length) {
            this.data[front+index-data.length] = dataBaru;
        } else {
            this.data[front+index] = dataBaru;
        }
    }
    
//    public String shortData(){
//        String hasil ="";
//        Arrays.sort(data);
//        for(int i = front; i != rear; i = inc(i)) {
//            hasil += data[i]+ ", ";
//        }
//        hasil += data[rear];
//        return hasil;
//    }

    @Override
    public String toString() {
        String returnString = "";

        if(isEmpty()) {
            returnString = "Empty";
        } else {
            for(int i = front; i != rear; i = inc(i)) {
                returnString += data[i]+ ", ";
            }
            returnString += data[rear];
        }

        return returnString;
    }
    
}
