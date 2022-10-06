/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andreas
 */
public class TestTime {
    public static void main(String[] args) {
        long start, stop;
        int  BIG = 50, i, j, idx;

        System.out.println("TEST MyArrayGrow");
        System.out.println("================");
        MyArrayGrow test = new MyArrayGrow(1100);
        for (i=0; i<100; i++)
            test.addRear('z');

        start = System.nanoTime();
        for (j=0; j<BIG; j++) {
            for (i = 0; i < 1000; i++)
                test.addFront('a');
            for (i = 0; i < 1000; i++)
                test.delFront();
        }
        stop = System.nanoTime();
        System.out.println("Add & Del Front  : " + (stop-start)/1000);

        start = System.nanoTime();
        for (j=0; j<BIG; j++) {
            for (i = 0; i < 1000; i++) {
                idx = (int) (test.getSize() * Math.random());
                test.insertAt(idx, 'a');
            }
            for (i = 0; i < 1000; i++) {
                idx = (int) (test.getSize() * Math.random());
                test.delAt(idx);
            }
        }
        stop = System.nanoTime();
        System.out.println("Add & Del Middle : " + (stop-start)/1000);

        start = System.nanoTime();
        for (j=0; j<BIG; j++) {
            for (i = 0; i < 1000; i++)
                test.addRear('a');
            for (i = 0; i < 1000; i++)
                test.delRear();
        }
        stop = System.nanoTime();
        System.out.println("Add & Del Rear   : " + (stop-start)/1000);

        System.out.println("BIG data ... and Grow");
        start = System.nanoTime();
        for (i = 0; i < 1000*BIG; i++)
            test.addFront('a');
        for (i = 0; i < 1000*BIG; i++)
            test.delFront();
        stop = System.nanoTime();
        System.out.println("Add & Del Front  : " + (stop-start)/1000);

        test = new MyArrayGrow(1100);       // reset ulang
        for (i=0; i<100; i++)               // untuk test
            test.addRear('z');              // grow berikutnya
        start = System.nanoTime();
            for (i = 0; i < 1000*BIG; i++) {
                idx = (int) (test.getSize() * Math.random());
                test.insertAt(idx, 'a');
            }
            for (i = 0; i < 1000*BIG; i++) {
                idx = (int) (test.getSize() * Math.random());
                test.delAt(idx);
            }
        stop = System.nanoTime();
        System.out.println("Add & Del Middle : " + (stop-start)/1000);

        test = new MyArrayGrow(1100);       // reset ulang
        for (i=0; i<100; i++)               // untuk test
            test.addRear('z');              // grow berikutnya
        start = System.nanoTime();
            for (i = 0; i < 1000*BIG; i++)
                test.addRear('a');
            for (i = 0; i < 1000*BIG; i++)
                test.delRear();
        stop = System.nanoTime();
        System.out.println("Add & Del Rear   : " + (stop-start)/1000);

        System.out.println();
        System.out.println("TEST MyCirularArrayGrow");
        System.out.println("=======================");
        MyCircularArrayGrow test1 = new MyCircularArrayGrow (1100);
        for (i=0; i<100; i++)
            test1.addRear('z');

        start = System.nanoTime();
        for (j=0; j<BIG; j++) {
            for (i = 0; i < 1000; i++)
                test1.addFront('a');
            for (i = 0; i < 1000; i++)
                test1.delFront();
        }
        stop = System.nanoTime();
        System.out.println("Add & Del Front  : " + (stop-start)/1000);

        start = System.nanoTime();
        for (j=0; j<BIG; j++) {
            for (i = 0; i < 1000; i++)
                test1.addRear('a');
            for (i = 0; i < 1000; i++)
                test1.delRear();
        }
        stop = System.nanoTime();
        System.out.println("Add & Del Rear   : " + (stop-start)/1000);

        System.out.println("BIG data ... and Grow");
        start = System.nanoTime();
        for (i = 0; i < 1000*BIG; i++)
            test1.addFront('a');
        for (i = 0; i < 1000*BIG; i++)
            test1.delFront();
        stop = System.nanoTime();
        System.out.println("Add & Del Front  : " + (stop-start)/1000);

        test1 = new MyCircularArrayGrow(1100);       // reset ulang
        for (i=0; i<100; i++)               // untuk test
            test1.addRear('z');              // grow berikutnya
        start = System.nanoTime();
        for (i = 0; i < 1000*BIG; i++)
            test1.addRear('a');
        for (i = 0; i < 1000*BIG; i++)
            test1.delRear();
        stop = System.nanoTime();
        System.out.println("Add & Del Rear   : " + (stop-start)/1000);

        System.out.println();
        System.out.println("TEST MySingleLinkedList");
        System.out.println("=======================");
        MySingleLinkedList test2 = new MySingleLinkedList();
        for (i=0; i<100; i++)
            test2.addTail('z');

        start = System.nanoTime();
        for (j=0; j<BIG; j++) {
            for (i = 0; i < 1000; i++)
                test2.addHead('a');
            for (i = 0; i < 1000; i++)
                test2.delHead();
        }
        stop = System.nanoTime();
        System.out.println("Add & Del Front  : " + (stop-start)/1000);

        start = System.nanoTime();
        for (j=0; j<BIG; j++) {
            for (i = 0; i < 1000; i++) {
                idx = (int) (test.getSize() * Math.random());
                test2.addAfter(idx, 'a');
            }
            for (i = 0; i < 1000; i++) {
                idx = (int) (test.getSize() * Math.random());
                test2.delAfter(idx);
            }
        }
        stop = System.nanoTime();
        System.out.println("Add & Del Middle : " + (stop-start)/1000);

        start = System.nanoTime();
        for (j=0; j<BIG; j++) {
            for (i = 0; i < 1000; i++)
                test2.addTail('a');
            for (i = 0; i < 1000; i++)
                test2.delTail();
        }
        stop = System.nanoTime();
        System.out.println("Add & Del Rear   : " + (stop-start)/1000);

        System.out.println("BIG data ... and Grow");
        start = System.nanoTime();
        for (i = 0; i < 1000*BIG; i++)
            test2.addHead('a');
        for (i = 0; i < 1000*BIG; i++)
            test2.delHead();
        stop = System.nanoTime();
        System.out.println("Add & Del Front  : " + (stop-start)/1000);

        start = System.nanoTime();
        for (i = 0; i < 1000*BIG; i++) {
            idx = (int) (test.getSize() * Math.random());
            test2.addAfter(idx, 'a');
        }
        for (i = 0; i < 1000*BIG; i++) {
            idx = (int) (test.getSize() * Math.random());
            test2.delAfter(idx);
        }
        stop = System.nanoTime();
        System.out.println("Add & Del Middle : " + (stop-start)/1000);

        start = System.nanoTime();
        for (i = 0; i < 1000*BIG; i++)
            test2.addTail('a');
        for (i = 0; i < 1000*BIG; i++)
            test2.delTail();
        stop = System.nanoTime();
        System.out.println("Add & Del Rear   : " + (stop-start)/1000);

        System.out.println();
        System.out.println("TEST MyCircularHeadedDoubleLinkedList");
        System.out.println("=====================================");
        MyCircularHeadedDoubleLinkedList test3 = new MyCircularHeadedDoubleLinkedList();
        for (i=0; i<100; i++)
            test3.addTail('z');

        start = System.nanoTime();
        for (j=0; j<BIG; j++) {
            for (i = 0; i < 1000; i++)
                test3.addHead('a');
            for (i = 0; i < 1000; i++)
                test3.delHead();
        }
        stop = System.nanoTime();
        System.out.println("Add & Del Front  : " + (stop-start)/1000);

        start = System.nanoTime();
        for (j=0; j<BIG; j++) {
            for (i = 0; i < 1000; i++) {
                idx = (int) (test.getSize() * Math.random());
                test3.insertAt(idx, 'a');
            }
            for (i = 0; i < 1000; i++) {
                idx = (int) (test.getSize() * Math.random());
                test3.delAt(idx);
            }
        }
        stop = System.nanoTime();
        System.out.println("Add & Del Middle : " + (stop-start)/1000);

        start = System.nanoTime();
        for (j=0; j<BIG; j++) {
            for (i = 0; i < 1000; i++)
                test3.addTail('a');
            for (i = 0; i < 1000; i++)
                test3.delTail();
        }
        stop = System.nanoTime();
        System.out.println("Add & Del Rear   : " + (stop-start)/1000);

        System.out.println("BIG data ... and Grow");
        start = System.nanoTime();
        for (i = 0; i < 1000*BIG; i++)
            test3.addHead('a');
        for (i = 0; i < 1000*BIG; i++)
            test3.delHead();
        stop = System.nanoTime();
        System.out.println("Add & Del Front  : " + (stop-start)/1000);

        start = System.nanoTime();
        for (i = 0; i < 1000*BIG; i++) {
            idx = (int) (test.getSize() * Math.random());
            test3.insertAt(idx, 'a');
        }
        for (i = 0; i < 1000*BIG; i++) {
            idx = (int) (test.getSize() * Math.random());
            test3.delAt(idx);
        }
        stop = System.nanoTime();
        System.out.println("Add & Del Middle : " + (stop-start)/1000);

        start = System.nanoTime();
        for (i = 0; i < 1000*BIG; i++)
            test3.addTail('a');
        for (i = 0; i < 1000*BIG; i++)
            test3.delTail();
        stop = System.nanoTime();
        System.out.println("Add & Del Rear   : " + (stop-start)/1000);
    }
}

