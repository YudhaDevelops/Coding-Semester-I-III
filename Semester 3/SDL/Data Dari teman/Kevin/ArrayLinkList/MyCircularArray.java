
// 205314027 - Andreas Kevin Maheswara

public class MyCircularArray {
    char[] data;
    int front = -1;
    int rear = -1;

    public MyCircularArray(int maxData) {
        data = new char[maxData];
    }

    public void addFront(char value) {
        if (isFull()) {
            System.out.println("MyArray Penuh");
        } else if (isEmpty()) {
            rear = 0;
            front = 0;
            data[front] = value;
        } else {
            front = dec(front);
            data[front] = value;
        }
    }

    public void addRear(char value) {
        if (isFull()) {
            System.out.println("MyArray Penuh");
        } else if (isEmpty()) {
            rear = 0;
            front = 0;
            data[rear] = value;
        } else {
            rear = inc(rear);
            data[rear] = value;
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
        char dataReturn = 0;

        if (isEmpty()) {
            return dataReturn;
        } else if (front == rear) {
            dataReturn = data[front];
            front = -1;
            rear = -1;
            return dataReturn;
        } else {
            dataReturn = data[front];
            front = inc(front);
            return dataReturn;
        }
    }

    public char delRear() {
        char dataReturn = 0;

        if (isEmpty()) {
            return dataReturn;
        } else if (front == rear) {
            dataReturn = data[rear];
            front = -1;
            rear = -1;
            return dataReturn;
        } else {
            dataReturn = data[rear];
            rear = dec(rear);
            return dataReturn;
        }
    }

    public char getData(int indeks) {
        if(front+indeks > data.length) {
            return this.data[front+indeks-data.length];
        } else {
            return this.data[front+indeks];
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

    public boolean searchData(char value) {
        boolean returnSearch = false;

        for (int i = front; i != rear; i = inc(i)){
            if (this.data[i] == value || this.data[rear] == value) {
                returnSearch = true;
                break;
            }
        }
        return returnSearch;
    }

    public void setData(int indeks, char value) {
        if(front+indeks > data.length) {
            this.data[front+indeks-data.length] = value;
        } else {
            this.data[front+indeks] = value;
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