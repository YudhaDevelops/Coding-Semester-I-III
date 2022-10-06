package MyArrayGrow;

import java.util.Arrays;

public class MyArrayGrow {
    private char [] data;
    private int rear;

    public MyArrayGrow(int rear) {
        this.rear = rear;
    }

    public void addFront(char datBaru){

    }

    public void addRear(char dataBaru){

    }
    public char delAt(int data){
        return 'c';
    }

    public char delFront(){
        return 'm';
    }

    public char delRear(){
        return 'a';
    }

    public char getData(int data){
        return 'j';
    }

    public int getSize(){
        return 3;
    }

    public void insertAt(int a, char b){

    }

    public boolean isEmpty(){
        return true;
    }

    public boolean isFull(){
        return false;
    }

    public boolean searchData(char data){
        return false;
    }

    public void setData(int a, char b){

    }

    @Override
    public String toString() {
        return "MyArrayGrow{" + "data=" + Arrays.toString(data) + ", rear=" + rear + '}';
    }
}
