
public class TestMyMaxHeap {
    public static void main(String[] args) {
        MyMaxHeap test = new MyMaxHeap(20);
        System.out.println("            MaxHeapQueue : ");
        System.out.println(test);
        test.addData(5);
        System.out.println("addData 5    MaxHeapQueue : ");
        System.out.println(test);
        test.addData(7);
        System.out.println("addData 7    MaxHeapQueue : ");
        System.out.println(test);
        test.addData(11);
        System.out.println("addData 11    MaxHeapQueue : ");
        System.out.println(test);
        test.addData(6);
        System.out.println("addData 6    MaxHeapQueue : ");
        System.out.println(test);
        test.addData(13); test.addData(14); test.addData(9);
        test.addData(13); test.addData(15); test.addData(17);
        System.out.println("add some data  MaxHeapQueue : ");
        System.out.println(test);
        System.out.println("setData(2,20)  MaxHeapQueue : ");
        test.setData(2, 20);
        System.out.println(test);
        System.out.println("setData(3,1)  MaxHeapQueue : ");
        test.setData(3, 1);
        System.out.println(test);
        System.out.println("del Data => " + test.delData() + "  MaxHeapQueue : ");
        System.out.println(test);
        System.out.println("del Data => " + test.delData() + "  MaxHeapQueue : ");
        System.out.println(test);
        System.out.println("del Data => " + test.delData() + "  MaxHeapQueue : ");
        System.out.println(test);
        System.out.println("del Data => " + test.delData() + "  MaxHeapQueue : ");
        System.out.println(test);
        System.out.println("del Data => " + test.delData() + "  MaxHeapQueue : ");
        System.out.println(test);
    }
}
