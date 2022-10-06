/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylinkedlist;

/**
 *
 * @author Michael
 */
public class MyDoubleLinkedList {

    private Node head;
    private Node tail; // Tambahkan tail
    private int size = 0; // memperbaiki getSize

    private class Node { // Class Node

        private Node prev; // Tambahkan prev
        private char data; //
        private Node next; //
// 

        Node(char data) { //
            prev = null; // Tambahkan prev
            this.data = data; //
            next = null; //
        } //
    } //

    public MyDoubleLinkedList() {
        head = null;
        tail = null; // Tambahkan tail
    }
// Method Class MySDoubleLinkedList

    public boolean isEmpty() {
        if (head == null && tail == null) {
            return true;
        } else {
            return false;
        }
    }

    public void addHead(char data) {
        Node addNode = new Node(data);
        if (isEmpty()) {
            head = addNode;
            size++;
        } else {
            addNode.next = head;
            head.prev = addNode;
            head = addNode;
            size++;
        }
    }

    public void addTail(char data) {
        Node addNode = new Node(data);
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

    public char delTail() {
        char dataReturn = 0;

        if (isEmpty()) {
            return dataReturn;
        } else if (tail.prev == null && tail.next == null) {
            size--;
            dataReturn = tail.data;
            head = null;
            tail = null;
            return dataReturn;
        } else {
            size--;
            dataReturn = tail.data;
            tail = tail.prev;
            tail.next = null;
            return dataReturn;
        }
    }

    public char delHead() {
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

    @Override
    public String toString() {
        String stringReturn = "";
        if (isEmpty()) {
            stringReturn = "Empty";
        } else {
            Node ptr = head;
            while (ptr != null) {
                stringReturn += ptr.data + ", ";
                ptr = ptr.next;
            }
        }
        return stringReturn;
    }

    public String toStringReverse() {
        String stringReturn = "";
        if (isEmpty()) {
            stringReturn = "Empty";
        } else {
            Node ptr = tail;
            while (ptr != null) {
                stringReturn += ptr.data + ", ";
                ptr = ptr.prev;
            }
        }
        return stringReturn;
    }

    public boolean searchData(char data) {
        boolean ada = false;
        Node ptr = head;
        while (ptr.next != null) {
            if (ptr.data == data) {
                ada = true;
                break;
            }
            ptr = ptr.next;
        }
        return ada;
    }
    
     public int getSize() {
        int sizeReturn = size;
        
        return sizeReturn;
    }
     
     public char getData(int index) {
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

    public void setData(int index, char data) {
        Node ptrReturn = head;
        for (int i = 0; i < index; i++) {
            ptrReturn = ptrReturn.next;
        }
        if (isEmpty() || index < 0 || index >= getSize()) {
            System.out.println("Salah Index");
        } else {
            Node ptr = ptrReturn;
            ptr.data = data;
        }
    }
}
