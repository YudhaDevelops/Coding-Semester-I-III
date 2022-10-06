package MySingleLinkedList;
public class TestMySingleLinkedList {
    public static void main(String[] args) {
        MySingleLinkedList test1;

        System.out.println("Test MySingleLinkedList");
        System.out.println("=======================");
        System.out.println("\nConstructor & toString");
        test1 = new MySingleLinkedList();
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

        System.out.println("\nMethod addAfter() & delAfter()");
        System.out.print("addTail('A')              myLinkedList = ");
        test1.addTail('A');
        System.out.println(test1);
        System.out.print("addAfter(0, 'B')          myLinkedList = ");
        test1.addAfter(0, 'B');
        System.out.println(test1);
        System.out.print("addAfter(0, 'C')          myLinkedList = ");
        test1.addAfter(0, 'C');
        System.out.println(test1);
        System.out.print("addAfter(1, 'D')          myLinkedList = ");
        test1.addAfter(1, 'D');
        System.out.println(test1);
        System.out.print("addAfter(-1, '*')         myLinkedList = ");
        test1.addAfter(-1, '*');
        System.out.print("addAfter(4, '*')          myLinkedList = ");
        test1.addAfter(4, '*');
        System.out.print("delAfter(-1) => " + test1.delAfter(-1) + "         myLinkedList = ");
        System.out.println(test1);
        System.out.print("delAfter(3) => " + test1.delAfter(3) + "          myLinkedList = ");
        System.out.println(test1);
        System.out.print("delAfter(2) => " + test1.delAfter(2) + "          myLinkedList = ");
        System.out.println(test1);
        System.out.print("delAfter(1) => " + test1.delAfter(1) + "          myLinkedList = ");
        System.out.println(test1);
        System.out.print("delAfter(0) => " + test1.delAfter(0) + "          myLinkedList = ");
        System.out.println(test1);
        System.out.print("delHead() => " + test1.delHead() + "            myLinkedList = ");
        System.out.println(test1);
        System.out.print("delAfter(0) => " + test1.delAfter(0) + "          myLinkedList = ");
        System.out.println(test1);

        System.out.println("\nMethod Reverse()");
        System.out.print("addTail() A s/d J         myLinkedList = ");
        for(char i = 'A'; i <= 'J'; i++)
            test1.addTail(i);
        System.out.println(test1);
        System.out.print("Linked List Reversed      myLinkedList = ");
        test1.reverse();
        System.out.println(test1);

        System.out.println("\nMethod setData(), getData(), Search(), dan getSize()");
        System.out.print("setData(4, '*')           myLinkedList = ");
        test1.setData(4,'*');
        System.out.println(test1);
        System.out.print("getData(4) => " + test1.getData(4) + "           myLinkedList = ");
        System.out.println(test1);
        System.out.println("Search *   => " + test1.searchData('*'));
        System.out.println("getSize    => " + test1.getSize());
    }
    
}
