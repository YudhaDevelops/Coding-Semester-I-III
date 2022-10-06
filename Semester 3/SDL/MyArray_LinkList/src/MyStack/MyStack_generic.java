package MyStack;
import MySingleLinkedList.MySingleLinkedList;
import MyDoubleLinkedList.MyDoubleLinkedList;
import MyCircularHeadedDoubleLinkedList.MyCircularHeadedDoubleLinkedList;
public class MyStack_generic {    
//    MyDoubleLinkedList myStack;
    doubleHeadedLinkedList_generic myStack;

    public MyStack_generic() {
        myStack = new doubleHeadedLinkedList_generic();
    }
    
    public <T> void push (T data){
        myStack.addHead(data);
    }
    
    public <T> void push_dariBlakang (T data){
        myStack.addTail(data);
    }
    
    public <T> Object pop(){
        return myStack.delHead();
    }
    
    public int getSize(){
        return myStack.getSize();
    }
    
    public boolean isEmpty(){
        return myStack.isEmpty();
    }
    
    public <T> Object peek(){
        return myStack.getData(0);
    }
    
    public String toString(){
        return myStack.toString();
    }
    
    public int search(int data) {
        return myStack.searchData_generic(data);
    }
    
}
