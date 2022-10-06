package BinaryTree;

public class TestMyMinHeap {
    public static void main(String[] args) {
        MyMinHeap test = new MyMinHeap(2);
        System.out.print("            MinHeapQueue : ");
        System.out.println(test);
        test.addData(5);
        System.out.print("addData 5    MinHeapQueue : ");
        System.out.println(test);
        test.addData(7);
        System.out.print("addData 7    MinHeapQueue : ");
        System.out.println(test);
        test.addData(11);
        System.out.print("addData 11    MinHeapQueue : ");
        System.out.println(test);
        test.addData(6);
        System.out.print("addData 6    MinHeapQueue : ");
        System.out.println(test);
        test.addData(13);
        test.addData(14);
        test.addData(9);
        test.addData(13);
        test.addData(15);
        test.addData(17);
        System.out.print("add some data  MinHeapQueue : ");
        System.out.println(test);
        System.out.print("setData(2,20)  MinHeapQueue : ");
        test.setData(2, 20);
        System.out.println(test);
        System.out.print("setData(3,1)  MinHeapQueue : ");
        test.setData(3, 1);
        System.out.println(test);
        System.out.print("del Data => " + test.delData() + "  MinHeapQueue : ");
        System.out.println(test);
        System.out.print("del Data => " + test.delData() + "  MinHeapQueue : ");
        System.out.println(test);
        System.out.print("del Data => " + test.delData() + "  MinHeapQueue : ");
        System.out.println(test);
        System.out.print("del Data => " + test.delData() + "  MinHeapQueue : ");
        System.out.println(test);
        System.out.print("del Data => " + test.delData() + "  MinHeapQueue : ");
        System.out.println(test);

    }
    
}
