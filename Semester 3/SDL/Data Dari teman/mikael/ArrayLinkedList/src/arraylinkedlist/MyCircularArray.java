package arraylinkedlist;

public class MyCircularArray {

    private char[] data;
    private int front = -1;
    private int rear = -1;

    public MyCircularArray(int maxData) {
        this.data = new char[maxData];
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
            System.out.println("My Array Pennuh");
        } else if (isEmpty()) {
            rear = 0;
            front = 0;
            data[rear] = value;
        } else {
            rear = inc(rear);
            data[rear] = value;
        }
    }

    private int dec(int value) {
        if (value == 0) {
            return data.length - 1;
        } else {
            return value - 1;
        }
    }

    private int inc(int value) {
        if (value == data.length - 1) {
            return 0;
        } else {
            return value + 1;
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

    public char getData(int index) {
        if (front + index > data.length) 
            return this.data[front+index-data.length];
        
        else
            return this.data[front+index];
    }

    public int getSize() {
        if (front == -1) {
            return 0;
        } else if (rear >= front) {
            return rear - front + 1;
        } else {
            return rear - front + 1 + data.length;
        }
    }

    public boolean isEmpty() {
        if (rear == -1 && front == -1) {
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
        boolean ada = false;
        for (int i = front ; i != rear; i = inc(i)) {
            if (this.data[i] == value || this.data[rear] == value) {
                ada = true;
                break;
            }
        }
        return ada;
    }

    public void setData(int index, char value) {
        if (front + index > data.length) 
            this.data[front+index-data.length] = value;
        
        else
            this.data[front+index] = value;
    }

    @Override
    public String toString() {
         String data = "";
        if (isEmpty()) {
            return "EMPTY";
        }
        else {
            for(int i = front; i != rear; i = inc(i)) {
                data += this.data[i]+ ", ";
            }
            data += this.data[rear];
        }

        return data;
    }
}
