package DoubleLinkedList;

// Kelompok 5
/* 205314007 - ADISYA KAILA NUR FAISA
 * 205314008 - YULIUS AGUNG TRISNANTO
 * 205314026 - ALFRINA GRACIA PRAMESTI
 * 205314027 - ANDREAS KEVIN MAHESWARA
 */

public class MyDoubleLinkedList {
    private Node head;
    private Node tail;
    private int size = 0;
    
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

    public MyDoubleLinkedList() {
        head = null;
        tail = null;
    }
    
    public void addHead(char data){
        Node addNode = new Node(data);
        if(isEmpty()){
           head = addNode; 
           size++;
        } else{
            addNode.next = head;
            head.prev = addNode;
            head = addNode;
            size++;
        }
    }
    
    public void addTail(char value){
        Node addNode = new Node(value);
        if (isEmpty()) {
            head = addNode;
            tail = addNode;
            size++;
        } else {
            tail.next = addNode;
            addNode.prev = tail;
            tail = addNode;
            size++;
        }
    }
    
    public char delHead(){
        char dataReturn = 0;

        if (isEmpty()) {
            return dataReturn;
        } else if (head.next == null && head.prev == null) {
            dataReturn = head.data;
            head = null;
            tail = null;
            size--;
            return dataReturn;
        } else {
            dataReturn = head.data;
            head = head.next;
            head.prev = null;
            size--;
            return dataReturn;
        }
    }
    
    public char delTail(){
        char dataReturn = 0;
        if (isEmpty()){
            return dataReturn;
        } else if (tail.prev == null && tail.next == null){
            size--;
            dataReturn = tail.data;
            head = null;
            tail = null;
        } else{
            size--;
            dataReturn = tail.data;
            tail = tail.prev;
            tail.next = null;
        }
        return dataReturn;
    }
    
    public char getData(int index){
        Node ptr, ptr1 = head;
        for (int i = 0; i < index; i++) {
            ptr1 = ptr1.next;
        } if (isEmpty() || index < 0 || index >= getSize()) {
            return 0;
        } else {
            ptr = ptr1;
            return ptr.data;
        }
    }
    
    public int getSize(){
        Node ptr = head;
        
        int sizeList = 0;
        while(ptr != null){
            ptr = ptr.next;
            sizeList++;
        }
        
        return sizeList;
    }
    
    public boolean isEmpty(){
        if(head == null && tail == null){
            return true;
        } else{
            return false;
        }
    }
    
    public boolean searchData(char data){
        boolean dataReturn = false;
        Node ptr = head;
        
        while(ptr != null) {
            if(ptr.data == data) {
                dataReturn = true;
            }
            ptr = ptr.next;
        }
        
        return dataReturn;
    }
    
    public void setData(int index, char data){
        Node ptr, ptr1 = head;
        
        for (int i = 0; i < index; i++) {
            ptr1 = ptr1.next;
        } if (isEmpty() || index < 0 || index >= getSize()) {
            System.out.println("Salah Index");
        } else {
            ptr = ptr1;
            ptr.data = data;
        }
    }
    
    @Override
    public String toString() {
        String dataReturn = "";
        Node ptr = head;
        
        if(isEmpty()){
            dataReturn = "Empty";
        } else {
            while(ptr != null){
                dataReturn += ptr.data + ", ";
                ptr = ptr.next;
            }
        }
        
        return dataReturn;
    }
    
    public String toStringReverse() {
        Node ptr = tail;
        String dataReturn = "";
        
        if (isEmpty()) {
            dataReturn = "Empty";
        } else {
            while (ptr != null) {
                dataReturn += ptr.data + ", ";
                ptr = ptr.prev;
            }
        }
        
        return dataReturn;
    }
    
}
