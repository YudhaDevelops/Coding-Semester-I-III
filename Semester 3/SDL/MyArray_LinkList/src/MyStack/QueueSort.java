package MyStack;

//import MyCircularArray.MyCircularArray;
//import MyDoubleLinkedList.MyDoubleLinkedList;
import MyCircularHeadedDoubleLinkedList.MyCircularHeadedDoubleLinkedList;

public class QueueSort {
//    MyDoubleLinkedList unique;
    MyCircularHeadedDoubleLinkedList unique;

    public QueueSort(int maxQueue) {
        unique = new MyCircularHeadedDoubleLinkedList();
    }
    
    public void add(char data) {
        unique.addHead(data);
//        int index =0;
//        boolean ada = false;
//        if(!unique.isEmpty()){
//            for (int i = 0; i < unique.getSize(); i++) {
//                if (data  < unique.getData(i)) {
//                    index = i;
//                    break;
//                }else if(data == unique.getData(i)){
//                    ada=true;
//                    index = i;
//                    break;
//                }
//            }
//                unique.insertAt(index, data);
//        }
//        else{
//            unique.addTail(data);
//        }
        
        for (int i = 0; i < unique.getSize()-1; i++){
            for (int j = 0; j < unique.getSize()-i-1; j++){
                if (unique.getData(j) > unique.getData(j+1)){
                    char temp = unique.getData(j);
                    unique.setData(j, unique.getData(j+1));
                    unique.setData(j+1, temp);
                }
            }
        }

    }
    
    public void remove() {
        unique.delTail();
    }
    
    public char peek() {
        return unique.getData(0);
    }
    
    public int getSize() {
        return unique.getSize();
    }
    
    public boolean isEmpty() {
        return unique.isEmpty();
    }
    
    public boolean isFull() {
        return unique.isEmpty();
    }

    @Override
    public String toString() {
        return unique.toString();
    }
    
}
