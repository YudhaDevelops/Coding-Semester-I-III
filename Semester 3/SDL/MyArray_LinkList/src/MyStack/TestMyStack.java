package MyStack;
public class TestMyStack {
    public static void main(String[] args) {
        
        MyStack s = new MyStack();
        Integer[] test4 = null;
        double a, b; 
        String c;
        String []input = {"2","3","4","*","-","5","+"};
//        String []input = {"5","3","2","+","1","-"};
//        String []input = {"2", "3", "4", "*", "-", "5","+"};
//        for (int i = 0; i < input.length; i++) {
//            c = input[i];
//            switch(c){
//                case"*":
//                    b = s.pop();
//                    a = s.pop();
//                    s.push((a*b));
//                    break;
//                case"/":
//                    b = s.pop();
//                    a = s.pop();
//                    s.push((a/b));
//                    break;
//                case"+":
//                    b = s.pop();
//                    a = s.pop();
//                    s.push((a+b));
//                    break;
//                case"-":
//                    b = s.pop();
//                    a = s.pop();
//                    s.push((a-b));
//                    break;
//                default:
//                    s.push(Double.valueOf(c));
//            }
//            System.out.println("Stack : " + s);
//            
//        }
        
        System.out.println("         Test Stack          ");
        System.out.println("=============================");
        System.out.println("            MyStack = " + s);
        s.push('A');
        System.out.println("push('A')   MyStack = " + s);
        s.push('B');
        System.out.println("push('B')   MyStack = " + s);
        s.push('C');
        System.out.println("push('C')   MyStack = " + s);
        s.push('C');
        System.out.println("push('C')   MyStack = " + s);
        System.out.println("pop() => " + s.pop() + "  MyStack = " + s);
        System.out.println("peek()=> " + s.peek()+ "  MyStack = " + s);
        System.out.println("pop() => " + s.pop() + "  MyStack = " + s);
        System.out.println("pop() => " + s.pop() + "  MyStack = " + s);
        System.out.println("pop() => " + s.pop() + "  MyStack = " + s);
//        
//        System.out.println("");
//        System.out.println("Test Kurung");
//        System.out.println("============");
//        String s1 = "(a+b) * (c / (d – e))";
//        System.out.println("Jumlah Kurung s1 = " + CobaKurung.cekKurungV1(s1));
//        String s2 = "(()";
//        System.out.println("Jumlah Kurung s1 = " + CobaKurung.cekKurungV1(s2));
//        String s3 = "())";
//        System.out.println("Jumlah Kurung s1 = " + CobaKurung.cekKurungV1(s3));
//        
//        System.out.println("");
        MyUniQueue sUniqueue = new MyUniQueue(10);
        System.out.println("           Test MyUniqueue             ");
        System.out.println("=======================================");
        System.out.println("           MyUniqueue = " + sUniqueue);
        System.out.println(" Test Add ");
        System.out.println("==========");
        sUniqueue.add('A');
        System.out.println("add('A')   MyUniqueue = " + sUniqueue);
        sUniqueue.add('B');
        System.out.println("add('B')   MyUniqueue = " + sUniqueue);
        sUniqueue.add('C');
        System.out.println("add('C')   MyUniqueue = " + sUniqueue);
        sUniqueue.add('C');
        System.out.println("add('C')   MyUniqueue = " + sUniqueue);
        sUniqueue.add('D');
        System.out.println("add('D')   MyUniqueue = " + sUniqueue);
        sUniqueue.add('E');
        System.out.println("add('E')   MyUniqueue = " + sUniqueue);
        System.out.println("=======================================");
        System.out.println(" Test Remove ");
        System.out.println("=============");
        System.out.println("Remove()=> MyUniqueue = " + sUniqueue);
        sUniqueue.remove();
        System.out.println("Remove()=> MyUniqueue = " + sUniqueue);
        sUniqueue.remove();
        System.out.println("Remove()=> MyUniqueue = " + sUniqueue);
        sUniqueue.remove();
        System.out.println("Remove()=> MyUniqueue = " + sUniqueue);
        sUniqueue.remove();
        System.out.println("Remove()=> MyUniqueue = " + sUniqueue);
        System.out.print("Add Sampai 10 :");
        for(char i = 'E'; i < 'N'; i++)
            sUniqueue.add(i);
        System.out.println(sUniqueue);
        System.out.println("Panjang data Yang ada = " + sUniqueue.getSize());
        
        System.out.println("");
        QueueSort sSort = new QueueSort(10);
        System.out.println("Test MySortedQueue");
        System.out.println("           MyUniqueue = " + sSort);
        System.out.println(" Test Add ");
        System.out.println("==========");
        sSort.add('N');
        System.out.println("add('N')   MyUniqueue = " + sSort);
        sSort.add('A');
        System.out.println("add('A')   MyUniqueue = " + sSort);
        sSort.add('M');
        System.out.println("add('M')   MyUniqueue = " + sSort);
        sSort.add('A');
        System.out.println("add('A')   MyUniqueue = " + sSort);
        sSort.add('A');
        System.out.println("add('A')   MyUniqueue = " + sSort);
        sSort.add('N');
        System.out.println("add('N')   MyUniqueue = " + sSort);
        sSort.add('D');
        System.out.println("add('D')   MyUniqueue = " + sSort);
        sSort.add('A');
        System.out.println("add('A')   MyUniqueue = " + sSort);
        System.out.println("");
//        
//        System.out.println("");
//        System.out.println("          Test My Stack Kurung          ");
//        System.out.println("========================================");
//        String sKurung = "(a+b) * (c / (d – e))";
//        System.out.println("Jumlah Kurung sKurung = " + CobaKurung.cekKurungV1(sKurung));
//        String sKurung1 = "(x)";
//        System.out.println("Jumlah Kurung sKurung1 = " + CobaKurung.cekKurungV1(sKurung1));
//        String sKurung2 = "{x}";
//        System.out.println("Jumlah Kurung sKurung2 = " + CobaKurung.cekKurungV1(sKurung2));
//        String sKurung3 = "[x]";
//        System.out.println("Jumlah Kurung sKurung3 = " + CobaKurung.cekKurungV1(sKurung3));
//        String sKurung4 = "({x})";
//        System.out.println("Jumlah Kurung sKurung4 = " + CobaKurung.cekKurungV1(sKurung4));
//        String sKurung5 = "({[x]})";
//        System.out.println("Jumlah Kurung sKurung5 = " + CobaKurung.cekKurungV1(sKurung5));
//        System.out.println("========================================");
//        String sKurung6 = "(";
//        System.out.println("Jumlah Kurung sKurung6 = " + CobaKurung.cekKurungV1(sKurung6));
//        String sKurung7 = "())";
//        System.out.println("Jumlah Kurung sKurung7 = " + CobaKurung.cekKurungV1(sKurung7));
//        String sKurung8 = "{";
//        System.out.println("Jumlah Kurung sKurung8 = " + CobaKurung.cekKurungV1(sKurung8));
//        String sKurung9 = "{}}";
//        System.out.println("Jumlah Kurung sKurung9 = " + CobaKurung.cekKurungV1(sKurung9));
//        String sKurung10 = "[";
//        System.out.println("Jumlah Kurung sKurung10 = " + CobaKurung.cekKurungV1(sKurung10));
//        String sKurung11 = "[]]";
//        System.out.println("Jumlah Kurung sKurung11 = " + CobaKurung.cekKurungV1(sKurung11));
//        String sKurung12 = "({[)}]";
//        System.out.println("Jumlah Kurung sKurung12 = " + CobaKurung.cekKurungV1(sKurung12));
//        String sKurung13 = "({[}])";
//        System.out.println("Jumlah Kurung sKurung13 = " + CobaKurung.cekKurungV1(sKurung13));
//        String sKurung14 = "({[])}";
//        System.out.println("Jumlah Kurung sKurung14 = " + CobaKurung.cekKurungV1(sKurung14));
        
    }
    
}
