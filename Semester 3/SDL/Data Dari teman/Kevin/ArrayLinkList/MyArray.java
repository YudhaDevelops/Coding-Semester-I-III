
// 205314027 - Andreas Kevin Maheswara

public class MyArray {
    private char[] data;
    private int rear = -1;

    public MyArray(int max) {
        data = new char[max];
    }

    public void addFront(char value) {
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
            data[0] = value;
        }
    }

    public void addRear(char value) {
        if (isFull())
            System.out.println("MyArray Penuh");
        else {
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

        if (isEmpty()) {
            return dataReturn;
        } else {
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

    public void insertAt(int indeks, char value) {
        if (isFull()) {
            System.out.println("MyArray Penuh");
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
            if (indeks >= 0)
                this.data[indeks] = value;
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
        boolean returnSearch = false;

        for (int i = 0; i < rear; i++){
            if (this.data[i] == value)
                returnSearch = true;
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