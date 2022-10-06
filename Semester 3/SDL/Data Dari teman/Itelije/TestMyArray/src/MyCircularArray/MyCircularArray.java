package MyCircularArray;

import java.util.Arrays;

public class MyCircularArray {
    private char [] data;
    private int front = -1;
    private int rear = -1;

    public MyCircularArray(int maxData) {
        this.data = new char [maxData];
    }

    public void addFront(char value){
        if (isFull()) {
            System.out.println("My Array Penuh");
        }
        if (!isEmpty()) {
            for (int i = rear; i > 0;) {
                data[i] = data[--i];
            }
        }
        data[0] = value;
    }

    public void addRear(char value){
        if (isFull()) {
            System.out.println("My Array Penuh");
        }

        rear++;
        data[rear] = value;
    }

    public int dec(int value){
        if(value == 0){
            return data.length-1;
        }
        else{
            return value - 1;
        }
    }

    public int inc(int value){
        if (value == data.length - 1){
            return 0;
        }
        else{
            return value + 1;
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

    public boolean isEmpty(){
        /*
        front - 1
        rear -1
        rear 0 => rear < = maxData
        rear full => rear == maxData => rear -1
        */
        if (rear == -1 && front == -1) {
            return true;
        }
        else if(rear - front != 1){
            return true;
        }

        else{
            return false;
        }
    }

    public boolean isFull(){
        if (rear - front == 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean  searchData(char value){
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
                data = data + this.data[i] + ", ";
            }

            return data;
        }
        else
            return "Salah Index";
    }
}
