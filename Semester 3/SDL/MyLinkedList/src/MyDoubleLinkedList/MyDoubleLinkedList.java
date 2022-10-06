package MyDoubleLinkedList;
/*
Nama Kelompok 2
- (205314001) RIAN CHRISTIAN SIDIN 
- (205314002) YASINTA WAHYU WULANINGRUM SINDUDIPOYONO PUTRI 
- (205314020) FX. BIMA YUDHA PRATAMA 
- (205314021) ADITYA BANGUN SANJAYA 
*/
public class MyDoubleLinkedList {
    public class Node{
        private char data;
        private Node next;
        private Node preview;

        public Node(char data) {
            this.data = data;
            next = null;
            preview = null;
        }
    }
    
    private Node head;
    private Node tail;
    private int size;

    public MyDoubleLinkedList() {
        head = null;
        tail = null;
    }
    
    
    public void addAfter(int index, char data){
        Node addNode;
        Node pointer = goToIndex(index);
        if(index < 0 || index > getSize()-1){
            System.out.println("Salah Index");
        }
        else{
            if(!isEmpty()){
                addNode = new Node(data);
                addNode.next = pointer.next;
                pointer.next = addNode;
                
            }
        }
    }
    
    public void addHead(char data){
        Node addNode = new Node(data);
        if(isEmpty()){
           head = addNode; 
           size++;
        }
        else{
            addNode.next = head;
            head.preview = addNode;
            head = addNode;
            size++;
        }
    }
    
    public void addTail(char data){
//        Node pointer = head;
        Node addNode = new Node(data);
        if (isEmpty()) {
            head = addNode;
            tail = addNode;
            size++;
        } else {
            tail.next = addNode;
            addNode.preview = tail;
            tail = addNode;
            size++;
        }
    }
    
    public char delAfter(int index){
        char returnData = 0;
        if(!isEmpty()){
            if(index < 0 || index >= getSize()-1){
                returnData = 0;
            }
            else{
                Node pointer = goToIndex(index);
                returnData = pointer.next.data;
                pointer.next = pointer.next.next;
            }
        }
        return returnData;
    }
    
    public char delHead(){
        char returnData = 0;

        if (isEmpty()) {
            return returnData;
        } else if (head.next == null && head.preview == null) {
            returnData = head.data;
            head = null;
            tail = null;
            size--;
            return returnData;
        } else {
            returnData = head.data;
            head = head.next;
            head.preview = null;
            size--;
            return returnData;
        }
    }
    
    public char delTail(){
        char returnData = 0;
        if (isEmpty()){
            returnData = 0;
        }
        else if (tail.preview == null && tail.next == null){
            size--;
            returnData = tail.data;
            head = null;
            tail = null;
        }
        else{
            size--;
            returnData = tail.data;
            tail = tail.preview;
            tail.next = null;
        }
        return returnData;
    }
    
    public char getData(int index){
        Node ptrReturn = head;
        for (int i = 0; i < index; i++) {
            ptrReturn = ptrReturn.next;
        }
        if (isEmpty() || index < 0 || index >= getSize()) {
            return 0;
        } else {
            Node ptr = ptrReturn;
            return ptr.data;
        }
    }
    
    public int getSize(){
        Node pointer = head;
        Node pointer2 = tail;
        int count = 0;
        while(pointer != null){
            pointer = pointer.next;
            count++;
        }
        return count;
    }
    
    public Node goToIndex(int index){
        Node pointerBantu = head;
        for (int i = 0; i < index; i++) {
            pointerBantu = pointerBantu.next;
        }
        return pointerBantu;
    }
    
    public boolean isEmpty(){
        if(head == null && tail == null){
            return true;
        }
        else{
            return false;
        }
    }
    
    public void reverse(){
        Node pointerKiri, pointer,pointerKanan,ptr;
        
        pointerKiri = null;
        pointer = head;
        pointerKanan = pointer.next;
        while(pointer != null) {
            pointerKanan = pointer.next;
            pointer.next = pointerKiri;
            pointerKiri = pointer;
            pointer = pointerKanan;
        }
        head = pointerKiri;
        
        
    }
    
    public boolean searchData(char data){
        boolean returnSearch = false;

        Node pointer = head;
        
        while(pointer != null) {
            if(pointer.data == data) {
                returnSearch = true;
            }
            pointer = pointer.next;
        }
        return returnSearch;
    }
    
    public void setData(int index, char data){
        if(isEmpty() || index < 0 || index >= getSize()){
            System.out.println("Salah Index");
        }
        else{
            Node pointer = goToIndex(index);
            pointer.data = data;
        }
    }

    @Override
    public String toString() {
        String returnData = "";
        if(isEmpty()){
            returnData = "Empty";
        }
        else if(!isEmpty()){
            Node pointer = head;
            while(pointer != null){
                returnData += pointer.data + ",";
                pointer = pointer.next;
            }
        }
        return returnData;
    }
    
    public String toStringReverse() {
        String returnData = "";
        if (isEmpty()) {
            returnData = "Empty";
        } else {
            Node ptr = tail;
            while (ptr != null) {
                returnData += ptr.data + ",";
                ptr = ptr.preview;
            }
        }
        return returnData;
    }
}
