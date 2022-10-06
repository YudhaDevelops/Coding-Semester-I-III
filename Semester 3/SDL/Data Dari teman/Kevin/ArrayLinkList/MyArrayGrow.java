
// 205314027 - Andreas Kevin Maheswara

public class MyArrayGrow {
    private char[] data;
    private int rear = -1;

    public MyArrayGrow(int max) {
        data = new char[max];
    }

    public void addFront(char value) {
        if (isFull()) {
            grow();
            rear++;
            if (!isEmpty()) {
                for (int i = rear; i > 0; )
                    data[i] = data[--i];
            }
            data[0] = value;
        } else {
            rear++;
            if (!isEmpty()) {
                for (int i = rear; i > 0; )
                    data[i] = data[--i];
            }
            data[0] = value;
        }
    }

    public void addRear(char value) {
        if (isFull()) {
            grow();
            rear++;
            data[rear] = value;
        } else {
            rear++;
            data[rear] = value;
        }
    }

    public char delAt(int indeks) {
        char dataReturn = 0;
        if (isEmpty())
            return dataReturn;
        else if (indeks > rear || indeks < 0)
            return dataReturn;
        else
            dataReturn = data[indeks];
            for (int i = indeks; i < rear; ) {
                data[i] = data[++i];
            }
            rear--;
            return dataReturn;
    }

    public char delFront() {
        char dataReturn = 0;
        if (isEmpty())
            return dataReturn;
        else {
            dataReturn = data[0];
            for (int i = 0; i < rear; ) {
                data[i] = data[++i];
            }
            rear--;
            return dataReturn;
        }
    }

    public char delRear() {
        char dataReturn = 0;

        if (isEmpty())
            return dataReturn;
        else {
            dataReturn = data[rear];
            rear--;
            return dataReturn;
        }
    }

    public char getData(int indeks) {
        return this.data[indeks];
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

    public void insertAt(int indeks, char value) {
        if (isFull()) {
            grow();
        } else if (indeks <= -1 || indeks > rear) {
            System.out.println("Salah Index");
        } else{
            rear++;
            if (!isEmpty()) {
                int i = rear;
                while ( i > indeks ) {
                    data[i] = data[i-1];
                    i--;
                }
            }
            if (indeks >= 0) {
                this.data[indeks] = value;
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
    
    public void setData(int indeks, char value) {
        this.data[indeks] = value;
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