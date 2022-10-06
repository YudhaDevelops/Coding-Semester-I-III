package MyArray;
//Nama : FX. Bima Yudha Pratama 
//NIM  : 205314020

public class MyArray {
    private char[] data;
    private int rear = -1;

    public MyArray(int max) {
        data = new char[max];
    }

    public void addFront(char dataBaru) {
        if (isFull())
            System.out.println("MyArray Penuh");
        else {
            rear++;
            if (!isEmpty()) {
                int i = rear;
                while ( i > 0 ) {
                    data[i] = data[i-1];
                    i--;
                }
            }
            data[0] = dataBaru;
        }
    }

    public void addRear(char dataBaru) {
        if (isFull())
            System.out.println("MyArray Penuh");
        else {
            rear++;
            data[rear] = dataBaru;
        }
    }

    public char delAt(int index) {
        char dataReturn = 0;
        if (isEmpty())
            return dataReturn;
        else if (index > rear || index < 0)
            return dataReturn;
        else
            dataReturn = data[index];
            for (int i = index; i < rear; ) {
                data[i] = data[++i];
            }
            rear--;
            return dataReturn;
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

        if (isEmpty()) {
            return returnData;
        } else {
            returnData = data[rear];
            rear--;
            return returnData;
        }
    }

    public char getData(int indeks) {
        return this.data[indeks];
    }

    public int getSize() {
        return rear + 1;
    }

    public void insertAt(int index, char dataBaru) {
        if (isFull()) {
            System.out.println("MyArray Penuh");
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
            if (index >= 0)
                this.data[index] = dataBaru;
        }
    }

    public boolean isEmpty() {
        if (rear == -1)
            return true;
        else
            return false;
    }

    public boolean isFull() {
        if (rear == data.length - 1)
            return true;
        else
            return false;
    }

    public boolean searchData(char value) {
        boolean retrunCari = false;

        for (int i = 0; i < rear; i++){
            if (this.data[i] == value)
                retrunCari = true;
        }
        return retrunCari;
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
