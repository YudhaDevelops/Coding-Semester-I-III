/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package antrianapotek;

import java.util.ArrayList;

/**
 *
 * @author Michael
 */
public class MyCircularHeadedDoubleLinkedList {

    public class Node {

        private Object data;
        private Node next;
        private Node prev;

        public Node(Object data) {
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

//    public void addAfter(Node ptr, Object data) {
//        Node addNode = new Node(data);
//        addNode.next = ptr.next;
//        addNode.prev = ptr;
//        ptr.next.prev = addNode;
//        ptr.next = addNode;
//        size++;
//    }

    private void addBefore(Node ptr, Object data) {
        Node addNode = new Node(data);
        addNode.next = ptr;
        addNode.prev = ptr.prev;
        ptr.prev.next = addNode;
        ptr.prev = addNode;
        size++;
    }

//    public void addHead(Object value) {
//        addAfter(head, value);
//    }

    public void addTail(Object value) {
        addBefore(head, value);
    }

//    private Object delAt(Node ptr) {
//        size--;
//        ptr.prev.next = ptr.next;
//        ptr.next.prev = ptr.prev;
//        size--;
//        return ptr.data;
//    }
//    
//    public Object delAt(int index) {
//        Object dataReturn = 0;
//        Node ptr = goToIndex(index);
//        
//        if (isEmpty() || index < 0 || index >= getSize()){
//            dataReturn = 0;
//        }
//        else{
//            Node ptr1, ptr2;
//            dataReturn = ptr.data;
//            ptr1 = ptr.prev;
//            ptr2 = ptr.next;
//            ptr1.next = ptr2;
//            ptr2.prev = ptr1;
//            size--;
//                    
//        }
//        
//        return dataReturn;
//    }
    public void delHead() {
//        Object dataReturn;
        Node ptr = head.next.next;

        if (isEmpty()) {
        } else if (head.next == head) {
//            dataReturn = head.data;
            head.next = head;
            head.prev = head;
            size--;
        } else {
//            dataReturn = ptr.prev.data;
            ptr.prev = ptr.prev.prev;
            head.next = head.next.next;
            size--;
        }
    }

//    public Object delTail() {
//        Object dataReturn = 0;
//        Node ptr = head.prev.prev;
//
//        if (isEmpty()) {
//            dataReturn = 0;
//        } else if (head.prev == head) {
//            dataReturn = head.data;
//            head.next = head;
//            head.prev = head;
//            size--;
//        } else {
//            dataReturn = ptr.next.data;
//            ptr.next = ptr.next.next;
//            head.prev = head.prev.prev;
//            size--;
//        }
//
//        return dataReturn;
//    }

    public Object getData(int index) {
        Node ptr, ptr1 = head.next;

        for (int i = 0; i < index; i++) {
            ptr1 = ptr1.next;
        }
        if (isEmpty() || index < 0 || index >= getSize()) {
            return 0;
        } else {
            ptr = ptr1;
        }
        return ptr.data;
    }

    public int getSize() {
        int sizeReturn = size;

        return sizeReturn;
    }

    public Node goToIndex(int index) {
        Node ptr = head.next;

        for (int i = 0; i < index; i++) {
            ptr = ptr.next;
        }

        return ptr;
    }

//    public void insertAt (int index, Object data){
//
//        if(index < 0 || index >= getSize()) {
//            System.out.println("Salah Index");
//        }else {
//            Node ptr = goToIndex(index);
//            addBefore(ptr, data);
//        }
//        
//    }
    public boolean isEmpty() {
        if (head.next == head) {
            return true;
        } else {
            return false;
        }
    }

    public int searchData(String nama) {
        boolean ada = false;
//        String dataReturn = "";
        int nomor = 0;
        Node ptr = head.next;

        while (ptr != head) {
            nomor++;
            if (((Customer) ptr.data).getNama().equals(nama)) {
                ada = true;
                break;
//                System.out.println(((Customer)ptr.data).getNama() + " ada di antrian ke " + nomor);
            }
            ptr = ptr.next;
        }
        if (ada == true) {
            return nomor;
        } else {
            return 0;
        }
//        return nomor;
    }

    public void setData(int index, Object data) {
        if (isEmpty() || index < 0 || index >= getSize()) {
            System.out.println("Salah Index");
        } else {
            Node ptr = goToIndex(index);
            ptr.data = data;
        }
    }

    @Override
    public String toString() {
        String dataReturn = "";
        Node ptr = head.next;

        if (isEmpty()) {
            dataReturn = "Antrian Kosong";
        } else {
            int count = 1;
            while (ptr != head) {
                dataReturn += count + ". " + ((Customer) ptr.data).getNama() + "\n";
                ptr = ptr.next;
                count++;
            }
        }

        return dataReturn;
    }

    public ArrayList<Object> ambilData() {
        ArrayList<Object> data = new ArrayList();
        Node ptr = head.next;

        if (!isEmpty()) {
            while (ptr != head) {
                data.add(ptr.data);
                ptr = ptr.next;
            }
        }

        return data;
    }

}
