package MyDoubleLinkedList;
//Nama : FX. Bima Yudha Pratama 
//NIM  : 205314020
public class MyDoubleLinkedList {
    private Node head;
    private Node tail;
    private int size = 0;
    
    public class Node{
        private double data;
        private Node next;
        private Node prev;

        public Node(double data) {
            this.data = data;
            next = null;
            prev = null;
        }
    }

    public MyDoubleLinkedList() {
        head = null;
        tail = null;
    }
    
    public void addHead(double data){
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
    
    public void addTail(double dataBaru){
        Node addNode = new Node(dataBaru);
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
    
    public double delHead(){
        double returnData = 0;

        if (isEmpty()) {
            return returnData;
        } else if (head.next == null && head.prev == null) {
            returnData = head.data;
            head = null;
            tail = null;
            size--;
            return returnData;
        } else {
            returnData = head.data;
            head = head.next;
            head.prev = null;
            size--;
            return returnData;
        }
    }
    
    public double delTail(){
        double returnData = 0;
        if (isEmpty()){
            return returnData;
        } else if (tail.prev == null && tail.next == null){
            size--;
            returnData = tail.data;
            head = null;
            tail = null;
        } else{
            size--;
            returnData = tail.data;
            tail = tail.prev;
            tail.next = null;
        }
        return returnData;
    }
    
    public double getData(int index){
        Node pointer, pointer1 = head;
        for (int i = 0; i < index; i++) {
            pointer1 = pointer1.next;
        } if (isEmpty() || index < 0 || index >= getSize()) {
            return 0;
        } else {
            pointer = pointer1;
            return pointer.data;
        }
    }
    
    public int getSize(){
        
        int sizeList = size;
        
        return sizeList;
    }
    
    public boolean isEmpty(){
        if(head == null && tail == null){
            return true;
        } else{
            return false;
        }
    }
    
    public boolean searchData(double data){
        boolean returnData = false;
        Node pointer = head;
        
        while(pointer != null) {
            if(pointer.data == data) {
                returnData = true;
            }
            pointer = pointer.next;
        }
        
        return returnData;
    }
    
    public void setData(int index, double data){
        Node pointer, pointer1 = head;
        
        for (int i = 0; i < index; i++) {
            pointer1 = pointer1.next;
        } if (isEmpty() || index < 0 || index >= getSize()) {
            System.out.println("Salah Index");
        } else {
            pointer = pointer1;
            pointer.data = data;
        }
    }
    
    @Override
    public String toString() {
        String returnData = "";
        Node pointer = head;
        
        if(isEmpty()){
            returnData = "Empty";
        } else {
            while(pointer != null){
                returnData += pointer.data + ", ";
                pointer = pointer.next;
            }
        }
        
        return returnData;
    }
    
    public String toStringReverse() {
        Node pointer = tail;
        String returnData = "";
        
        if (isEmpty()) {
            returnData = "Empty";
        } else {
            while (pointer != null) {
                returnData += pointer.data + ", ";
                pointer = pointer.prev;
            }
        }
        
        return returnData;
    }
    
}
