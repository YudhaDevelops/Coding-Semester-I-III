package MyStack;
import MySingleLinkedList.MySingleLinkedList;
import MyDoubleLinkedList.MyDoubleLinkedList;
import MyCircularHeadedDoubleLinkedList.MyCircularHeadedDoubleLinkedList;
public class MyStack {    
    MyDoubleLinkedList myStack;
//    MyCircularHeadedDoubleLinkedList myStack;

    public MyStack() {
        myStack = new MyDoubleLinkedList();
    }
    
    public void push (double data){
        myStack.addHead(data);
    }
    
    public double pop(){
        return myStack.delHead();
    }
    
    public int getSize(){
        return myStack.getSize();
    }
    
    public boolean isEmpty(){
        return myStack.isEmpty();
    }
    
    public double peek(){
        return myStack.getData(0);
    }
    
    public String toString(){
        return myStack.toString();
    }
    
}
