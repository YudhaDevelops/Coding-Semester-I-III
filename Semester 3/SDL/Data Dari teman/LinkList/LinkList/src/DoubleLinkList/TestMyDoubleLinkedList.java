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
public class TestMyDoubleLinkedList {
    public static void main(String[] args) {
        MyDoubleLinkedList test1;

        System.out.println("Test MyDoubleLinkedList");
        System.out.println("=======================");
        System.out.println("\nConstructor() & toString");
        test1 = new MyDoubleLinkedList();
        System.out.print("Inisialisasi              myLinkedList = ");
        System.out.println(test1);

        System.out.println("\nMethod addTail() & delTail()");
        System.out.print("addTail('A')              myLinkedList = ");
        test1.addTail('A');
        System.out.println(test1);
        System.out.print("addTail('B')              myLinkedList = ");
        test1.addTail('B');
        System.out.println(test1);
        System.out.print("delTail() => " + test1.delTail() + "            myLinkedList = ");
        System.out.println(test1);
        System.out.print("delTail() => " + test1.delTail() + "            myLinkedList = ");
        System.out.println(test1);
        System.out.print("delTail() => " + test1.delTail() + "            myLinkedList = ");
        System.out.println(test1);

        System.out.println("\nMethod addHead() & delHead()");
        System.out.print("addHead('A')              myLinkedList = ");
        test1.addHead('A');
        System.out.println(test1);
        System.out.print("addHead('B')              myLinkedList = ");
        test1.addHead('B');
        System.out.println(test1);
        System.out.print("delHead() => " + test1.delHead() + "            myLinkedList = ");
        System.out.println(test1);
        System.out.print("delHead() => " + test1.delHead() + "            myLinkedList = ");
        System.out.println(test1);
        System.out.print("delHead() => " + test1.delHead() + "            myLinkedList = ");
        System.out.println(test1);

        System.out.println("\nMethod lainnya");
        System.out.print("addTail() A s/d G         myLinkedList = ");
        for(char i = 'A'; i <= 'G'; i++)
            test1.addTail(i);
        System.out.println(test1);
        System.out.print("toStringReverse           myLinkedList = ");
        System.out.println(test1.toStringReverse());
        System.out.print("setData(3, '*')           myLinkedList = ");
        test1.setData(3,'*');
        System.out.println(test1);
        System.out.print("getData(3) => " + test1.getData(3) + "           myLinkedList = ");
        System.out.println(test1);
        System.out.println("Search *   => " + test1.searchData('*'));
        System.out.println("Search Z   => " + test1.searchData('Z'));
        System.out.println("getSize    => " + test1.getSize());

    }
}
