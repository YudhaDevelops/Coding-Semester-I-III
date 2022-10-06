/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylinkedlist;

/**
 *
 * @author Michael
 */
public class MyCircularHeadedDoubleLinkedList {
    
    
    public class Node{
        private char data;
        private Node next;
        private Node prev;

        public Node(char data) {
            this.data = data;
            next = null;
            prev = null;
        }
    }
    
    private Node head = new Node(' ');
    private int size;
    
    public MyCircularHeadedDoubleLinkedList() {
        head.next = head;
        head.prev = head;
    }
    
    public void addAfter(Node ptr, char data){
        Node addNode = new Node(data);
        addNode.next = ptr.next;
        addNode.prev = ptr;
        ptr.next.prev = addNode;
        ptr.next = addNode;
        size++;
    }
    
    private void addBefore(Node ptr, char data){
        Node addNode = new Node(data);
        addNode.next = ptr;
        addNode.prev = ptr.prev;
        ptr.prev.next = addNode;
        ptr.prev = addNode;
        size++;
    }
    
    public void addHead(char value){
        addAfter(head, value);
    }
    
    public void addTail(char value){
        addBefore(head, value);
    }
    
    private char delAt(Node ptr) {
        size--;
        ptr.prev.next = ptr.next;
        ptr.next.prev = ptr.prev;
        size--;
        return ptr.data;
    }
    
    public char delAt(int index) {
        char dataReturn = 0;
        Node ptr = goToIndex(index);
        
        if (isEmpty() || index < 0 || index >= getSize()){
            dataReturn = 0;
        }
        else{
            Node ptr1, ptr2;
            dataReturn = ptr.data;
            ptr1 = ptr.prev;
            ptr2 = ptr.next;
            ptr1.next = ptr2;
            ptr2.prev = ptr1;
            size--;
                    
        }
        
        return dataReturn;
    }
    
    public char delHead(){
        char dataReturn = 0;
        Node ptr = head.next.next;
        
        if (isEmpty()){
            dataReturn = 0;
        }
        else if (head.next == head){
            dataReturn = head.data;
            head.next = head;
            head.prev = head;
            size--;
        }
        else{
            dataReturn = ptr.prev.data;
            ptr.prev =ptr.prev.prev;
            head.next = head.next.next;
            size--;
        }
        
        return dataReturn;
    }
    
    public char delTail(){
        char dataReturn = 0;
        Node ptr = head.prev.prev;
        
        if (isEmpty()){
            dataReturn = 0;
        }
        else if (head.prev == head){
            dataReturn = head.data;
            head.next = head;
            head.prev = head;
            size--;
        }
        else{
            dataReturn = ptr.next.data;
            ptr.next = ptr.next.next;
            head.prev = head.prev.prev;
            size--;
        }
        
        return dataReturn;
    }
    
    public char getData(int index){
        Node ptr, ptr1 = head.next;
        
        for (int i = 0; i < index; i++) {
            ptr1 = ptr1.next;
        } if (isEmpty() || index < 0 || index >= getSize()) {
            return 0;
        } else {
            ptr = ptr1;
        }
            return ptr.data;
    }
    
    public int getSize(){
        int sizeReturn = size;
        
        return sizeReturn;
    }
    
    public Node goToIndex(int index){
        Node ptr = head.next;
        
        for (int i = 0; i < index; i++) {
            ptr = ptr.next;
        }
        
        return ptr;
    }
    
    public void insertAt (int index, char data){

        if(index < 0 || index >= getSize()) {
            System.out.println("Salah Index");
        }else {
            Node ptr = goToIndex(index);
            addBefore(ptr, data);
        }
        
    }
    
    public boolean isEmpty(){
        if(head.next == head){
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean searchData(char data){
        boolean dataReturn = false;
        Node ptr = head.next;
        
        while(ptr != head) {
            if(ptr.data == data) {
                dataReturn = true;
            }
            ptr = ptr.next;
        }
        return dataReturn;
    }
    
    public void setData(int index, char data){
        if(isEmpty() || index < 0 || index >= getSize()){
            System.out.println("Salah Index");
        } else{
            Node ptr = goToIndex(index);
            ptr.data = data;
        }
    }
    
    @Override
    public String toString() {
        String dataReturn = "";
        Node ptr = head.next;
        
        if(isEmpty()){
            dataReturn = "Empty";
        } else {
            while(ptr != head){
                dataReturn += ptr.data + ", ";
                ptr = ptr.next;
            }
        }
        
        return dataReturn;
    }
    
    public String toStringReverse() {
        Node ptr = head.prev;
        String dataReturn = "";
        
        if (isEmpty()) {
            dataReturn = "Empty";
        } else {
            while (ptr != head) {
                dataReturn += ptr.data + ", ";
                ptr = ptr.prev;
            }
        }
        
        return dataReturn;
        
    }
}
