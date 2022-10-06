package arraylinkedlist;
public class MyArray {
    private char[] data;
    private int rear = -1;


    public MyArray(int maxData ) {
        this.data = new char [maxData];
    }

    public void addFront(char value){
        if (isFull()) {
            System.out.println("MyArray Penuh");
        } else {
            rear++;
            if (!isEmpty()) {
                for (int i = rear; i > 0;) {
                    data[i] = data[--i];
                }
            }
            data[0] = value;
        }
    }

    public void addRear(char value){
        if (isFull()) {
            System.out.println("MyArray Penuh");
        } else {
            rear++;
            data[rear] = value;
        }
    }
    public char delAt(int index){
        char dataReturn = 0;

        if (isEmpty()) {
            return dataReturn;
        }

        else if(index <= -1 || index > rear){
            return dataReturn;
        }

        else{
            dataReturn = data[index];
            for (int i = index; i < rear;) {
                data[i] = data[++i];
            }
            rear--;
            return dataReturn;
        }
    }

    public char delFront(){
        char dataReturn = 0;
        if (isEmpty()) {
            return dataReturn;
        } else {
            dataReturn = data[0];
            for (int i = 0; i < rear;) {
                data[i] = data[++i];
            }
            rear--;
            return dataReturn;
        }
    }

    public char delRear(){
        char dataReturn = 0;
        if (isEmpty()) {
            return dataReturn;
        } else {
            dataReturn = data[rear];
            rear--;
            return dataReturn;
        }
    }

    public char getData(int index){
        return data[index];
    }

    public int getSize(){
        return rear + 1;
    }

    public void insertAt(int index, char value){
        if (isFull()) {
            System.out.println("MyArray Penuh");
        }

        else if(index <= -1 || index > rear){
            System.out.println("Salah Index");
        }

        else {
            if (!isEmpty() && index > -1) {
                rear++;
                for (int i = rear; i > index;) {
                    data[i] = data[--i];
                }
            }

            data[index] = value;
        }
    }

    public boolean isEmpty(){
        if (rear == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull(){
        if (rear == data.length - 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean searchData(char value){
        boolean ada = false;
        for (int i = 0; i < rear; i++) {
            if (this.data[i] == value) {
                ada = true;
                break;
            }
        }
        return ada;
    }

    public void setData(int index, char value){
        this.data[index] = value;
    }

    @Override
    public String toString() {
        String data = "";

        if (isEmpty()) {
            return "EMPTY";
        }
        else if (!isEmpty()) {
            for (int i = 0; i <= rear; i++) {
                data += this.data[i] + ", ";
            }

            return data;
        }
        else
            return "Salah Index";
    }
    
}
