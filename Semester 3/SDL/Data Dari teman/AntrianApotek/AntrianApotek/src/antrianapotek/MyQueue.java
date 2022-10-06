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
public class MyQueue {
    Customer c;
    MyCircularHeadedDoubleLinkedList myQueue;

    public MyQueue() {
        myQueue = new MyCircularHeadedDoubleLinkedList();
    }

    public void add(String nama) {
        this.c = new Customer(nama);
        myQueue.addTail(c);
    }

    public void remove() {
        myQueue.delHead();
    }

    public int getSize() {
        return myQueue.getSize();
    }

    public boolean isEmpty() {
        return myQueue.isEmpty();
    }

    public String peek() {
        return ((Customer) myQueue.getData(myQueue.getSize() - 1)).getNama();
    }

    public String toString() {
        return myQueue.toString();
    }

    public int search(String nama) {
        return myQueue.searchData(nama);
    }

    public ArrayList<Object> ambilData() {
        return myQueue.ambilData();
    }
}
