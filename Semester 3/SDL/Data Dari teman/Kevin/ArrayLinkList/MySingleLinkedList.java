
// 205314027 - ANDREAS KEVIN MAHESWARA

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
    
    public void addAfter(int index, char value){
        Node addNode;
        Node pointer = goToIndex(index);
        if(index < 0 || index > getSize()-1){
            System.out.println("Salah Index");
        }
        else{
            if(!isEmpty()){
                addNode = new Node(value);
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
    
    public void addTail(char value){
        Node pointer = head;
        Node addNode = new Node(value);
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
        char dataReturn = 0;
        
        if(!isEmpty()){
            if(index < 0 || index >= getSize()-1){
                dataReturn = 0;
            } else{
                Node pointer = goToIndex(index);
                dataReturn = pointer.next.data;
                pointer.next = pointer.next.next;
            }
        }
        return dataReturn;
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
        char dataReturn = 0;
        Node ptr = head;
        
        if (isEmpty()){
            dataReturn = 0;
        }
        else if (head.next == null){
            dataReturn = head.data;
            head = null;
        }
        else{
            while(ptr.next.next != null){
                ptr = ptr.next;
            }
            dataReturn = ptr.next.data;
            ptr.next = null;
        }
        return dataReturn;
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
        Node ptr = head;
        
        int sizeList = 0;
        while(ptr != null){
            ptr = ptr.next;
            sizeList++;
        }
        
        return sizeList;
    }
    
    public Node goToIndex(int index){
        Node ptr = head;
        for (int i = 0; i < index; i++) {
            ptr = ptr.next;
        }
        return ptr;
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
        Node ptrKi, ptr, ptrKa;
        
        ptrKi = null;
        ptr = head;
        ptrKa = ptr.next;
        
        while(ptr != null) {
            ptrKa = ptr.next;
            ptr.next = ptrKi;
            ptrKi = ptr;
            ptr = ptrKa;
        }
        head = ptrKi;
    }
    
    public boolean searchData(char value){
        boolean dataReturn = false;
        Node ptr = head;
        
        while(ptr != null) {
            if(ptr.data == value) {
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
        Node ptr = head;
        
        if(isEmpty()){
            dataReturn = "Empty";
        }
        else if(!isEmpty()){
            while(ptr != null){
                dataReturn += ptr.data + ", ";
                ptr = ptr.next;
            }
        }
        return dataReturn;
    }
}
