package MyCircularHeadedDoubleLinkedList;
public class MyCircularHeadedDoubleLinkedList {
    public class Node{
        private char data;
        private Node next;
        private Node prev;

        public Node(char data) {
            this.data = data;
            next = head;
            prev = head;
        }
    }
    
    private Node head;
    private int size = 0;

    public MyCircularHeadedDoubleLinkedList() {
        head = new Node('_');
        head.next = head;
        head.prev = head;
        
    }
    
    private char delAt(Node value) {
        size--;
        value.prev.next = value.next;
        value.next.prev = value.prev;
        return value.data;
//        Node ptr = value;
//        char returnData = 0;
//        
//        if (isEmpty()){
//            return returnData;
//        }else if (value == null){
//            System.out.println("Salah Index");
//        }else{
//            ptr.prev.next = ptr.next;
//            ptr.next.prev = ptr.prev; 
//            returnData = ptr.data;
//        }
        
    }
    
    public char delAt(int indeks) {
        Node pointer = goToIndex(indeks);
        char returnData = 0;
        
        if (isEmpty()){
            return returnData;
        }else if (indeks < 0 || indeks > getSize()-1){
            System.out.println("Salah Index");
        }else{
            pointer.prev.next = pointer.next;
            pointer.next.prev = pointer.prev; 
            returnData = pointer.data;
        }
        
        return returnData;
    }
    
    public void insertAt (int index, char value){
        if (index < 0 || index >= size){
            System.out.println("Salah Index");
        }
        else{
            Node pointer = goToIndex(index);
            addBefore(pointer, value);
        }
//        if(index < 0 || index > getSize()-1){
//            System.out.println("Salah Index");
//        }
//        else {
//            size++;
//            if(!isEmpty()) {
//                Node addNode = new Node(value);
//                addNode.next = pointer.next;
//                pointer.next = addNode;
//            }
//        }
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
    
    public void addHead(char value){
        this.addAfter(head, value);
        size++;
//        Node addNode = new Node(value);
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
        size++;
    }
    
    private void addBefore(Node pointer, char value){
        Node addNode = new Node(value);
        addNode.next = pointer;
        addNode.prev = pointer.prev;
        pointer.prev.next = addNode;
        pointer.prev = addNode;
        size++;
//        if(isEmpty()){
//            pointer.prev = addNode;
//            addNode.next = pointer;
//        }
//        else{
//            Node temp = head.prev;
//            
//            pointer.prev = addNode;
//            addNode.prev = pointer;
//            addNode.next = temp;
//            temp.next = addNode;
//        }
        
    }
    
    private void addAfter(Node pointer, char value){
        Node addNode = new Node(value);
        
        addNode.next = pointer.next;
        addNode.prev = pointer;
        pointer.next.prev = addNode;
        pointer.next = addNode;
        size++;
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
        
        returnData = delAt(head.next);
        head.next = head.next.next;
        size--;
        
        return returnData;
//
//        if (isEmpty()) {
//            return returnData;
//        } else if (head.next == null && head.prev == null) {
//            returnData = head.data;
//            head = null;
//            //tail = null;
//            size--;
//            return returnData;
//        } else {
//            returnData = head.data;
//            head = head.next;
//            head.prev = null;
//            size--;
//            return returnData;
//        }
    }
    
    public char delTail(){
        char dataReturn;
        
        dataReturn = delAt(head.prev);
        head.prev = head.prev.prev;
        size--;
        
        return dataReturn;
//        char returnData = 0;
//        if (isEmpty()){
//            returnData = 0;
//        }
//        else if (tail.prev == null && tail.next == null){
//            size--;
//            returnData = tail.data;
//            head = null;
//            tail = null;
//        }
//        else{
//            size--;
//            returnData = tail.data;
//            tail = tail.prev;
//            tail.next = null;
//        }
    }
    
    public char getData(int index){
//        if(isEmpty() || index < 0 || index >= getSize()){
//            return 0;
//        }
//        else{
//            Node pointer = goToIndex(index);
//            return pointer.data;
//        }
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
        //Node pointer2 = tail;
        int count = 0;
        while(pointer != null){
            pointer = pointer.next;
            count++;
        }
        return count;
    }
    
    public Node goToIndex(int index){
        Node pointerBantu = head.next;
        
        for (int i = 0; i < index; i++) {
            pointerBantu = pointerBantu.next;
        }
        return pointerBantu;
    }
    
    public boolean isEmpty(){
        if(head.next == head.prev){
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
    
    public boolean searchData(char value){
        boolean returnSearch = false;

//        for (int i = 0; i < rear; i++){
//            if (this.data[i] == value)
//                returnSearch = true;
//        }
        Node pointer = head;
        
        while(pointer != null) {
            if(pointer.data == value) {
                returnSearch = true;
            }
            pointer = pointer.next;
        }
        return returnSearch;
    }
    
    public void setData(int index, char value){
        if(isEmpty() || index < 0 || index >= getSize()){
            System.out.println("Salah Index");
        }
        else{
            Node pointer = goToIndex(index);
            pointer.data = value;
        }
    }

    @Override
    public String toString() {
        String returnData = "";
        if(isEmpty()){
            returnData = "Empty";
        }
        else{
            for (Node pointer = head.next; pointer != head; pointer = pointer.next) {
                returnData += pointer.data + ", ";
            }
        }
        return returnData;
    }
    
    public String toStringReverse() {
//        String returnData = "";
//        MyDoubleLinkedList tes = this;
//        tes.reverse();
//        if(isEmpty()){
//            returnData = "Empty";
//        }
//        else if(!isEmpty()){
//            Node pointer = head;
//            while(pointer != null){
//                returnData += pointer.data + ",";
//                pointer = pointer.next;
//            }
//        }
//        tes.reverse();
//        return returnData;

        String stringReturn = "";
        if (isEmpty()) {
            stringReturn = "Empty";
        } else {
            //Node ptr = tail;
//            while (ptr != null) {
//                stringReturn += ptr.data + ",";
//                ptr = ptr.prev;
//            }
        }
        return stringReturn;
    }
    
}
