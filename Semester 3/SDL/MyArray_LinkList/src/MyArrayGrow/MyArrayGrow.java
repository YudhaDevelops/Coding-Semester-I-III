package MyArrayGrow;
//Nama : FX. Bima Yudha Pratama 
//NIM  : 205314020
public class MyArrayGrow {
    private char[] data;
    private int rear = -1;

    public MyArrayGrow(int maksData) {
        data = new char[maksData];
    }

    public void addFront(char dataBaru) {
        if (isFull()) {
            grow();
            rear++;
            if (!isEmpty()) {
                for (int i = rear; i > 0; )
                    data[i] = data[--i];
            }
            data[0] = dataBaru;
        } else {
            rear++;
            if (!isEmpty()) {
                for (int i = rear; i > 0; )
                    data[i] = data[--i];
            }
            data[0] = dataBaru;
        }
    }

    public void addRear(char dataBaru) {
        if (isFull()) {
            grow();
            rear++;
            data[rear] = dataBaru;
        } else {
            rear++;
            data[rear] = dataBaru;
        }
    }

    public char delAt(int index) {
        char returnData = 0;
        if (isEmpty())
            return returnData;
        else if (index > rear || index < 0)
            return returnData;
        else
            returnData = data[index];
            for (int i = index; i < rear; ) {
                data[i] = data[++i];
            }
            rear--;
            return returnData;
    }

    public char delFront() {
        char returnData = 0;
        if (isEmpty())
            return returnData;
        else {
            returnData = data[0];
            for (int i = 0; i < rear; ) {
                data[i] = data[++i];
            }
            rear--;
            return returnData;
        }
    }

    public char delRear() {
        char returnData = 0;

        if (isEmpty())
            return returnData;
        else {
            returnData = data[rear];
            rear--;
            return returnData;
        }
    }

    public char getData(int index) {
        return this.data[index];
    }

    public int getSize() {
        return rear + 1;
    }

    private void grow() {
        char[] dataOld = new char[data.length];

        for (int i = 0; i < data.length ; i++) {
            dataOld[i] = data[i];
        }

        data = new char[data.length * 2];

        for (int i = 0; i < dataOld.length ; i++) {
            data[i] = dataOld[i];
        }
    }

    public void insertAt(int index, char dataBaru) {
        if (isFull()) {
            grow();
        } else if (index <= -1 || index > rear) {
            System.out.println("Salah Index");
        } else{
            rear++;
            if (!isEmpty()) {
                int i = rear;
                while ( i > index ) {
                    data[i] = data[i-1];
                    i--;
                }
            }
            if (index >= 0) {
                this.data[index] = dataBaru;
            }
        }
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
        boolean returnSearch = false;

        for (int i = 0; i < rear; i++){
            if (this.data[i] == value) {
                returnSearch = true;
            }
        }

        return returnSearch;
    }
    
    public void setData(int index, char dataBaru) {
        this.data[index] = dataBaru;
    }

    @Override
    public String toString() {
        String returnString = "";

        if(isEmpty()) {
            returnString = "Empty";
        } else {
            for(int i = 0; i <= rear; i++) {
                returnString += data[i]+ ", ";
            }
        }

        return returnString;
    }
    
}
