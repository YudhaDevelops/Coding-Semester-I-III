package mysinglelinkedlist2;
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
    
    public void addAfter(int index, char value){
        Node addNode;
        Node pointer = goToIndex(index);
        if(index <= -1 || index > getSize()-1){
            System.out.println("Salah Index");
        }
        else{
            if(!isEmpty()){
                if(index <= 0 || index > (getSize() -1)){
                    addNode = new Node(value);
                    addNode.next = pointer.next;
                    pointer.next = addNode;
                }
                else{
                    addNode = new Node(value);
                    addNode.next = pointer.next;
                    pointer.next = addNode;
                }
                
            }
        }
    }
    
    public void addHead(char value){
        Node addNode = new Node(value);
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
        
        if(isEmpty()){
            return dataReturn;
        }
        else if(index <= -1 || index > getSize()-1){
            return dataReturn;
        }
        else{
            Node pointer = goToIndex(index);
            dataReturn = pointer.next.data;
            pointer.next = pointer.next.next;
            return dataReturn;
        }
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
        char dataReturn = 0;
        if(!isEmpty() && getSize() == 1){
            dataReturn = head.data;
            head = null;
            return dataReturn;
        }
        else if(!isEmpty() && getSize() > 1){
            Node pointer = head;
            while(pointer.next.next != null){
                pointer = pointer.next;
                break;
            }
            dataReturn = pointer.next.data;
            pointer.next = null;
            return dataReturn;
        }
        else{
            return dataReturn;
        }
        
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
        
    }
    
    public boolean searchData(char value){
        return false;
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
        String dataReturn = "";
        if(isEmpty()){
            dataReturn = "Empty";
        }
        else if(!isEmpty()){                       //a
            Node pointer = head;
            while(pointer != null){
                dataReturn += pointer.data + ",";
                pointer = pointer.next;
            }
        }
        return dataReturn;
        
    }
    
}
