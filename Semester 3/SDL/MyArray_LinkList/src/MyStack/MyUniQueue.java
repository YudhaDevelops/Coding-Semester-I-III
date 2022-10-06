package MyStack;
import MyCircularArray.MyCircularArray;
public class MyUniQueue {
    MyCircularArray unique;

    public MyUniQueue(int maxQueue) {
        unique = new MyCircularArray(maxQueue);
    }
    
    public void add(char data) {
        if (unique.searchData(data) == false) {
            unique.addRear(data);
        }
    }
    
    public void remove() {
        unique.delRear();
    }
    
    public char peek() {
        return unique.getData(0);
    }
    
    public int getSize() {
        return unique.getSize();
    }
    
    public boolean isEmpty() {
        return unique.isEmpty();
    }
    
    public boolean isFull() {
        return unique.isFull();
    }

    @Override
    public String toString() {
        return unique.toString();
    }

}
