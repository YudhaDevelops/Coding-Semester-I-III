package CircularDoubleLinkedList;

// Kelompok 5
/* 205314007 - ADISYA KAILA NUR FAISA
 * 205314008 - YULIUS AGUNG TRISNANTO
 * 205314026 - ALFRINA GRACIA PRAMESTI
 * 205314027 - ANDREAS KEVIN MAHESWARA
 */

public class MyCircularHeadedDoubleLinkedList {
    private Node head;
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
    
    public MyCircularHeadedDoubleLinkedList() {
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
    
    private void addBefore(Node index, char value){
        Node addNode = new Node(value);
        Node pointer = null;
        addNode.prev = pointer.prev;
        addNode.next = pointer;
        pointer.prev.next = addNode;
        pointer.prev = addNode;
    }
    
    public void addHead(char value){
        Node addNode = new Node(value);
        if(isEmpty()){
           head = addNode; 
           size++;
        }
        else{
            addNode.next = head;
            head.prev = addNode;
            head = addNode;
            size++;
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
    
    private char delAt(Node value) {
        Node ptr = value;
        char dataReturn = 0;
        
        if (isEmpty()){
            return dataReturn;
        }else if (value == null){
            System.out.println("Salah Index");
        }else{
            ptr.prev.next = ptr.next;
            ptr.next.prev = ptr.prev; 
            dataReturn = ptr.next.data;
        }
        
        return dataReturn;
    }
    
    public char delAt(int index) {
        Node ptr = goToIndex(index);
        char dataReturn = 0;
        
        if (isEmpty()){
            return dataReturn;
        } else if (index < 0 || index > getSize()-1){
            System.out.println("Salah Index");
        } else{
            ptr.prev.next = ptr.next;
            ptr.next.prev = ptr.prev;
            dataReturn = ptr.next.data;
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
    
    public Node goToIndex(int index){
        Node ptr = head;
        
        for (int i = 0; i < index; i++) {
            ptr = ptr.next;
        }
        
        return ptr;
    }
    
    public void insertAt (int index, char value){
        Node pointer = goToIndex(index);
        if(index < 0 || index > getSize()-1){
            System.out.println("Salah Index");
        }
        else {
            size++;
            if(!isEmpty()) {
                Node addNode = new Node(value);
                addNode.next = pointer.next;
                pointer.next = addNode;
            }
        }
    }
    
    public boolean isEmpty(){
        if(head == null){
            return true;
        }
        else{
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
        } else {
            while(ptr != null){
                dataReturn += ptr.data + ", ";
                ptr = ptr.next;
            }
        }
        
        return dataReturn;
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
    
    public String toStringReverse() {
        String dataReturn = "";
        Node ptr = head;
        this.reverse();
        
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
