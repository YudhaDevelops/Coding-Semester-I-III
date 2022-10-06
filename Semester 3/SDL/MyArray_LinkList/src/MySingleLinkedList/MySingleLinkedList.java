package MySingleLinkedList;
//Nama : FX. Bima Yudha Pratama 
//NIM  : 205314020

public class MySingleLinkedList {
    private Node head;
    
    public class Node{
        private char data;
        private Node next;

        public Node(char data) {
            this.data = data;
            next = null;
        }
    }

    public MySingleLinkedList() {
        head = null;
    }
    
    public void addAfter(int index, char dataBaru){
        Node addNode;
        Node pointer = goToIndex(index);
        if(index < 0 || index > getSize()-1){
            System.out.println("Salah Index");
        }
        else{
            if(!isEmpty()){
                addNode = new Node(dataBaru);
                addNode.next = pointer.next;
                pointer.next = addNode;
            }
        }
    }
    
    public void addHead(char data){
        Node addNode = new Node(data);
        if(isEmpty()){
           head = addNode; 
        }
        else{
            addNode.next = head;
            head = addNode;
        }
    }
    
    public void addTail(char dataBaru){
        Node pointer = head;
        Node addNode = new Node(dataBaru);
        if(isEmpty()){
            head = addNode;
        }
        else{
            while(pointer.next != null){
                pointer = pointer.next;
            }
            pointer.next = addNode;
        }
    }
    
    public char delAfter(int index){
        char returnData = 0;
        
        if(!isEmpty()){
            if(index < 0 || index >= getSize()-1){
                returnData = 0;
            } else{
                Node pointer = goToIndex(index);
                returnData = pointer.next.data;
                pointer.next = pointer.next.next;
            }
        }
        return returnData;
    }
    
    public char delHead(){
        char returnData = 0;
        if(isEmpty()){
            return returnData;
        }
        else{
           returnData = head.data;
           head = head.next;
        }
        return returnData;
    }
    
    public char delTail(){
        char returnData = 0;
        Node pointer = head;
        
        if (isEmpty()){
            returnData = 0;
        }
        else if (head.next == null){
            returnData = head.data;
            head = null;
        }
        else{
            while(pointer.next.next != null){
                pointer = pointer.next;
            }
            returnData = pointer.next.data;
            pointer.next = null;
        }
        return returnData;
    }
    
    public char getData(int index){
        if(isEmpty() || index < 0 || index >= getSize()){
            return 0;
        }
        else{
            Node pointer = goToIndex(index);
            return pointer.data;
        }
    }
    
    public int getSize(){
        Node pointer = head;
        
        int sizeList = 0;
        while(pointer != null){
            pointer = pointer.next;
            sizeList++;
        }
        
        return sizeList;
    }
    
    public Node goToIndex(int index){
        Node pointer = head;
        for (int i = 0; i < index; i++) {
            pointer = pointer.next;
        }
        return pointer;
    }
    
    public boolean isEmpty(){
        if(head == null){
            return true;
        }
        else{
            return false;
        }
    }
    
    public void reverse(){
        Node pointerKi, pointer, pointerKa;
        
        pointerKi = null;
        pointer = head;
        pointerKa = pointer.next;
        
        while(pointer != null) {
            pointerKa = pointer.next;
            pointer.next = pointerKi;
            pointerKi = pointer;
            pointer = pointerKa;
        }
        head = pointerKi;
    }
    
    public boolean searchData(char dataBaru){
        boolean returnData = false;
        Node pointer = head;
        
        while(pointer != null) {
            if(pointer.data == dataBaru) {
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
        Node pointer = head;
        
        if(isEmpty()){
            returnData = "Empty";
        }
        else if(!isEmpty()){
            while(pointer != null){
                returnData += pointer.data + ", ";
                pointer = pointer.next;
            }
        }
        return returnData;
    }
    
}
