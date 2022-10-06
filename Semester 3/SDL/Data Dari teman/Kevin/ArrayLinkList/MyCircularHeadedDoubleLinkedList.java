
// Kelompok 5
/* 205314007 - ADISYA KAILA NUR FAISA
 * 205314008 - YULIUS AGUNG TRISNANTO
 * 205314026 - ALFRINA GRACIA PRAMESTI
 * 205314027 - ANDREAS KEVIN MAHESWARA
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
//        if(index < 0 || index > getSize()-1){
//            System.out.println("Salah Index");
//        }
//        else{
//            if(!isEmpty()){
//                addNode = new Node(value);
//                addNode.next = pointer.next;
//                pointer.next = addNode;
//            }
//        }
    }
    
    private void addBefore(Node ptr, char data){
//        Node addNode = new Node(data);
//        Node pointer = null;
//        addNode.prev = pointer.prev;
//        addNode.next = pointer;
//        pointer.prev.next = addNode;
//        pointer.prev = addNode;
        Node addNode = new Node(data);
        addNode.next = ptr;
        addNode.prev = ptr.prev;
        ptr.prev.next = addNode;
        ptr.prev = addNode;
        size++;
    }
    
    public void addHead(char value){
//        Node addNode = new Node(value);
        addAfter(head, value);
//        if(isEmpty()){
//           head = addNode; 
//           size++;
//        }
//        else{
//            addNode.next = head;
//            head.prev = addNode;
//            head = addNode;
//            size++;
//        }
    }
    
    public void addTail(char value){
        addBefore(head, value);
//        Node addNode = new Node(value);
//        
//        if(isEmpty()){
//            head = addNode;
//        }
//        else{
//            Node pointer = head;
//            while(pointer.next != null){
//                pointer = pointer.next;
//            }
//            pointer.next = addNode;
//        }
    }
    
    private char delAt(Node ptr) {
//        Node ptr = value;
//        char dataReturn = 0;
//        
//        if (isEmpty()){
//            return dataReturn;
//        }else if (value == null){
//            System.out.println("Salah Index");
//        }else{
//            ptr.prev.next = ptr.next;
//            ptr.next.prev = ptr.prev; 
//            dataReturn = ptr.next.data;
//        }
        size--;
        ptr.prev.next = ptr.next;
        ptr.next.prev = ptr.prev;
        
        return ptr.data;
    }
    
    public char delAt(int index) {
//        Node ptr = goToIndex(index);
//        char dataReturn = 0;
        
//        if (isEmpty()){
//            return dataReturn;
//        } else if (index < 0 || index > getSize()-1){
//            System.out.println("Salah Index");
//        } else{
//            dataReturn = ptr.next.data;
//            ptr.prev.next = ptr.next;
//            ptr.next.prev = ptr.prev;
//        }
//        
//        return dataReturn;
    
//        return delAt(ptr);
        
        char dataReturn = 0;
        Node ptr = goToIndex(index);
        
        if (isEmpty() || index < 0 || index >= getSize()){
            dataReturn = 0;
//        }
//        else if (head.next == head || head.prev == head){
//            dataReturn = head.data;
//            head.next = head;
//            head.prev = head;
        }
        else{
            Node ptr1, ptr2;
            dataReturn = ptr.data;
            ptr1 = ptr.prev;
            ptr2 = ptr.next;
            ptr1.next = ptr2;
            ptr2.prev = ptr1;
                    
//            dataReturn = ptr.prev.data;
//            ptr.prev =ptr.prev.prev;
//            head.next = head.next.next;
        }
        
        return dataReturn;
    }
    
    public char delHead(){
//        char returnData = 0;
//        
//        if(isEmpty()){
//            return returnData;
//        }
//        else{
//           returnData = head.data;
//           head = head.next;
//        }
//        
//        return returnData;

        char dataReturn = 0;
        Node ptr = head.next.next;
        
        if (isEmpty()){
            dataReturn = 0;
        }
        else if (head.next == head){
            dataReturn = head.data;
            head.next = head;
            head.prev = head;
        }
        else{
            dataReturn = ptr.prev.data;
            ptr.prev =ptr.prev.prev;
            head.next = head.next.next;
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
        }
        else{
            dataReturn = ptr.next.data;
            ptr.next =ptr.next.next;
            head.prev = head.prev.prev;
        }
        
        return dataReturn;
//        char returnData = 0;
//        
//        if(isEmpty()){
//            return returnData;
//        }
//        else{
//           returnData = head.data;
//           head = head.prev;
//        }
//        
//        return returnData;
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
        Node ptr = head.next;
        
        int sizeList = 0;
        while(ptr != head){
            ptr = ptr.next;
            sizeList++;
        }
        
        return sizeList;
    }
    
    public Node goToIndex(int index){
        Node ptr = head.next;
        
        for (int i = 0; i < index; i++) {
            ptr = ptr.next;
        }
        
        return ptr;
    }
    
    public void insertAt (int index, char data){
//        Node ptr = goToIndex(index);
//        Node ptr1;
        
//        Node addNode = new Node(value);
//        Node pointer = null;
//        addNode.prev = pointer.prev;
//        addNode.next = pointer;
//        pointer.prev.next = addNode;
//        pointer.prev = addNode;
//        ptr1 = ptr.prev;
        
//        if (index == 0) {
//            this.addHead(value);
//        } else if (index == size - 1) {
//            this.addTail(value);
//        }

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
    
//    public void reverse(){
//        Node ptrKi, ptr, ptrKa;
//        
//        ptrKi = null;
//        ptr = head;
//        ptrKa = ptr.next;
//        
//        while(ptr != null) {
//            ptrKa = ptr.next;
//            ptr.next = ptrKi;
//            ptrKi = ptr;
//            ptr = ptrKa;
//        }
//        head = ptrKi;
//    }
    
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
