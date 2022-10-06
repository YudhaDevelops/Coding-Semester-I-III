package MyCircularHeadedDoubleLinkedList;
//Nama : FX. Bima Yudha Pratama 
//NIM  : 205314020
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
    
    public void addAfter(Node pointer, char data){
        Node addNode = new Node(data);
        addNode.next = pointer.next;
        addNode.prev = pointer;
        pointer.next.prev = addNode;
        pointer.next = addNode;
        size++;
    }
    
    private void addBefore(Node pointer, char data){
        Node addNode = new Node(data);
        addNode.next = pointer;
        addNode.prev = pointer.prev;
        pointer.prev.next = addNode;
        pointer.prev = addNode;
        size++;
    }
    
    public void addHead(char dataBaru){
        addAfter(head, dataBaru);
    }
    
    public void addTail(char dataBaru){
        addBefore(head, dataBaru);
    }
    
    private char delAt(Node pointer) {
        size--;
        pointer.prev.next = pointer.next;
        pointer.next.prev = pointer.prev;
        size--;
        return pointer.data;
    }
    
    public char delAt(int index) {
        char returnData = 0;
        Node pointer = goToIndex(index);
        
        if (isEmpty() || index < 0 || index >= getSize()){
            returnData = 0;
        }
        else{
            Node pointer1, pointer2;
            returnData = pointer.data;
            pointer1 = pointer.prev;
            pointer2 = pointer.next;
            pointer1.next = pointer2;
            pointer2.prev = pointer1;
            size--;
        }
        
        return returnData;
    }
    
    public char delHead(){
        char returnData = 0;
        Node pointer = head.next.next;
        
        if (isEmpty()){
            returnData = 0;
        }
        else if (head.next == head){
            returnData = head.data;
            head.next = head;
            head.prev = head;
            size--;
        }
        else{
            returnData = pointer.prev.data;
            pointer.prev =pointer.prev.prev;
            head.next = head.next.next;
            size--;
        }
        
        return returnData;
    }
    
    public char delTail(){
        char returnData = 0;
        Node pointer = head.prev.prev;
        
        if (isEmpty()){
            returnData = 0;
        }
        else if (head.prev == head){
            returnData = head.data;
            head.next = head;
            head.prev = head;
            size--;
        }
        else{
            returnData = pointer.next.data;
            pointer.next =pointer.next.next;
            head.prev = head.prev.prev;
            size--;
        }
        
        return returnData;
    }
    
    public char getData(int index){
        Node pointer, pointer1 = head.next;
        
        for (int i = 0; i < index; i++) {
            pointer1 = pointer1.next;
        } if (isEmpty() || index < 0 || index >= getSize()) {
            return 0;
        } else {
            pointer = pointer1;
        }
            return pointer.data;
    }
    
    public int getSize(){
        int sizeList = size;
        
        return sizeList;
    }
    
    public Node goToIndex(int index){
        Node pointer = head.next;
        
        for (int i = 0; i < index; i++) {
            pointer = pointer.next;
        }
        
        return pointer;
    }
    
    public void insertAt (int index, char data){
        if(index < 0 || index >= getSize()) {
            System.out.println("Salah Index");
        }else {
            Node pointer = goToIndex(index);
            addBefore(pointer, data);
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
        boolean returnData = false;
        Node pointer = head.next;
        
        while(pointer != head) {
            if(pointer.data == data) {
                returnData = true;
            }
            pointer = pointer.next;
        }
        
        return returnData;
    }
    
    public void setData(int index, char data){
        if(isEmpty() || index < 0 || index >= getSize()){
            System.out.println("Salah Index");
        } else{
            Node pointer = goToIndex(index);
            pointer.data = data;
        }
    }
    
    @Override
    public String toString() {
        String returnData = "";
        Node pointer = head.next;
        
        if(isEmpty()){
            returnData = "Empty";
        } else {
            while(pointer != head){
                returnData += pointer.data + ", ";
                pointer = pointer.next;
            }
        }
        
        return returnData;
    }
    
    public String toStringReverse() {
        Node pointer = head.prev;
        String returnData = "";
        
        if (isEmpty()) {
            returnData = "Empty";
        } else {
            while (pointer != head) {
                returnData += pointer.data + ", ";
                pointer = pointer.prev;
            }
        }
        
        return returnData;
        
    }
    
}
