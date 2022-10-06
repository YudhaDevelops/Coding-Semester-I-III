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
public class MySingleLinkedList {

    private Node head;

    private class Node {

        private char data;
        private Node next;

        private Node(char data) {
            this.data = data;
            next = null;
        }
    }

    public MySingleLinkedList() {
        head = null;
    }

    public boolean isEmpty() {
        if (head == null) {
            return true;
        } else {
            return false;
        }
    }

    public int getSize() {
        int sizeReturn = 0;
        Node ptr = head;
        while (ptr != null) {
            sizeReturn++;
            ptr = ptr.next;
        }
        return sizeReturn;
    }

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

    public void addHead(char data) {
        Node addNode = new Node(data);
        if (isEmpty()) {
            head = addNode;
        } else {
            addNode.next = head;
            head = addNode;
        }
    }

    public char delHead() {
        char dataReturn;
        if (isEmpty()) {
            dataReturn = 0;
        } else {
            dataReturn = head.data;
            head = head.next;
        }
        return dataReturn;
    }

    public void addTail(char data) {
        Node addNode = new Node(data);
        if (isEmpty()) {
            head = addNode;
        } else {
            Node ptr = head;
            while (ptr.next != null) {
                ptr = ptr.next;
            }
            ptr.next = addNode;
        }
    }

    public char delTail() {
        char dataReturn;

        if (isEmpty()) {
            dataReturn = 0;
        } else if (head.next == null) {
            dataReturn = head.data;
            head = null;
        } else {
            Node ptr = head;
            while (ptr.next.next != null) {
                ptr = ptr.next;
            }
            dataReturn = ptr.next.data;
            ptr.next = null;
        }
        return dataReturn;
    }

    private Node gotoIndex(int index) {
        Node ptrReturn = head;
        for (int i = 0; i < index; i++) {
            ptrReturn = ptrReturn.next;
        }
        return ptrReturn;
    }

    public char getData(int index) {
        if (isEmpty() || index < 0 || index >= getSize()) {
            return 0;
        } else {
            Node ptr = gotoIndex(index);
            return ptr.data;
        }
    }

    public void setData(int index, char data) {
        if (isEmpty() || index < 0 || index >= getSize()) {
            System.out.println("Salah Index");
        } else {
            Node ptr = gotoIndex(index);
            ptr.data = data;
        }
    }

    public void addAfter(int index, char data) {
        Node ptr = head;
        if (index < 0 || index > (getSize() - 1)) {
            System.out.println("Salah Index");
        } else {
            if (!isEmpty()) {
               ptr = gotoIndex(index);
               Node addNode = new Node(data);
               addNode.next = ptr.next;
               ptr.next = addNode;   
            }
        }
    }

    public char delAfter(int index) {
        char dataReturn = 0;
        if (!isEmpty()) {
            if (index < 0 || index >= (getSize() - 1)) {
            dataReturn = 0;
            } else {
            Node ptr = gotoIndex(index);
            dataReturn = ptr.next.data;
            ptr.next = ptr.next.next;
            }
        }
        return dataReturn;
    }

    public void reverse() {
        Node ptrKi = null, ptr = head, ptrKa;

        while (ptr != null) {
            ptrKa = ptr.next;
            ptr.next = ptrKi;
            ptrKi = ptr;
            ptr = ptrKa;
        }
        head = ptrKi;
    }
    
    public boolean searchData(char data){
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
}
