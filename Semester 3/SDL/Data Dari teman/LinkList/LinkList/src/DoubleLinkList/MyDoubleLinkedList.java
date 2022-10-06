/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DoubleLinkList;

/**
 *
 * @author Andreas
 */
public class MyDoubleLinkedList {
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
    
    private Node head;
    private Node tail;
    private int size;

    public MyDoubleLinkedList() {
        head = null;
        tail = null;
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
//        Node pointer = head;
        Node addNode = new Node(value);
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
    
    public char delAfter(int index){
        char dataReturn = 0;
        if(!isEmpty()){
            if(index < 0 || index >= getSize()-1){
                dataReturn = 0;
            }
            else{
                Node pointer = goToIndex(index);
                dataReturn = pointer.next.data;
                pointer.next = pointer.next.next;
            }
        }
        return dataReturn;
    }
    
    public char delHead(){
        char dataReturn = 0;

        if (isEmpty()) {
            return dataReturn;
        } else if (head.next == null && head.prev == null) {
            dataReturn = head.data;
            head = null;
            tail = null;
            size--;
            return dataReturn;
        } else {
            dataReturn = head.data;
            head = head.next;
            head.prev = null;
            size--;
            return dataReturn;
        }
    }
    
    public char delTail(){
        char dataReturn = 0;
        if (isEmpty()){
            dataReturn = 0;
        }
        else if (tail.prev == null && tail.next == null){
            size--;
            dataReturn = tail.data;
            head = null;
            tail = null;
        }
        else{
            size--;
            dataReturn = tail.data;
            tail = tail.prev;
            tail.next = null;
        }
        return dataReturn;
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
        String dataReturn = "";
        if(isEmpty()){
            dataReturn = "Empty";
        }
        else if(!isEmpty()){
            Node pointer = head;
            while(pointer != null){
                dataReturn += pointer.data + ",";
                pointer = pointer.next;
            }
        }
        return dataReturn;
    }
    
    public String toStringReverse() {
//        String dataReturn = "";
//        MyDoubleLinkedList tes = this;
//        tes.reverse();
//        if(isEmpty()){
//            dataReturn = "Empty";
//        }
//        else if(!isEmpty()){
//            Node pointer = head;
//            while(pointer != null){
//                dataReturn += pointer.data + ",";
//                pointer = pointer.next;
//            }
//        }
//        tes.reverse();
//        return dataReturn;

        String stringReturn = "";
        if (isEmpty()) {
            stringReturn = "Empty";
        } else {
            Node ptr = tail;
            while (ptr != null) {
                stringReturn += ptr.data + ",";
                ptr = ptr.prev;
            }
        }
        return stringReturn;
    }
}
