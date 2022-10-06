package MyCircularArrayGrow;
//Nama : FX. Bima Yudha Pratama 
//NIM  : 205314020
public class MyCircularArrayGrow {
    char[] data;
    int front = -1;
    int rear = -1;

    public MyCircularArrayGrow(int maxData) {
        data = new char[maxData];
    }
    
    private void grow() {
        char[] dataOld = data;
        data = new char[dataOld.length * 2];
        int iOld = front;
        for (int i = 0; i < dataOld.length; i++) {
            data[i] = dataOld[iOld];
            if (iOld < dataOld.length-1) {
                iOld++;
            }
            else
                iOld = 0;
        }
        front = 0;
        rear = dataOld.length-1;

    }

    public void addFront(char dataBaru) {
        if (isFull()) {
            grow();
//            front++;
//            inc(front);
//            dec(front);
//            data[front]=dataBaru;
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
            grow();
            rear++;
            data[rear] = dataBaru;
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
