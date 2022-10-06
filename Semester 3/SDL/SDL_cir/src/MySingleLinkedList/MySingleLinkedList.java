package MySingleLinkedList;
public class MySingleLinkedList {
        public class Node{
        private char data;
        private Node next;

        public Node(char data) {
            this.data = data;
            next = null;
        }
    }
    
    private Node head;

    public MySingleLinkedList() {
        head = null;
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
        }
        else{
            addNode.next = head;
            head = addNode;
        }
    }
    
    public void addTail(char data){
        Node pointer = head;
        Node addNode = new Node(data);
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
        char returnData;
        if(isEmpty()){
            returnData = 0;
        }
        else{
           returnData = head.data;
           head = head.next;
        }
        return returnData;
    }
    
    public char delTail(){
        char returnData = 0;
        if (isEmpty()){
            returnData = 0;
        }
        else if (head.next == null){
            returnData = head.data;
            head = null;
        }
        else{
            Node pointer = head;
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
        if(head == null){
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
    
}
