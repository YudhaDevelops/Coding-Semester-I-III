package project_akhir_sdl;
public class doubleHeadedLinkedList_generic<T> {

    public class Node {

        private T data;
        private Node next;
        private Node prev;

        public Node(T data) {
            this.data = data;
            next = null;
            prev = null;
        }
    }
    Object b = new Object();
    private Node head = new Node((T) b);
    private int size;

    public doubleHeadedLinkedList_generic() {
        head.next = head;
        head.prev = head;
    }

    public void addAfter(Node pointer, T data) {
        Node addNode = new Node(data);
        addNode.next = pointer.next;
        addNode.prev = pointer;
        pointer.next.prev = addNode;
        pointer.next = addNode;
        size++;
    }

    private void addBefore(Node pointer, T data) {
        Node addNode = new Node(data);
        addNode.next = pointer;
        addNode.prev = pointer.prev;
        pointer.prev.next = addNode;
        pointer.prev = addNode;
        size++;
    }

    public void addHead(T dataBaru) {
        addAfter(head, dataBaru);
    }

    public void addTail(T dataBaru) {
        addBefore(head, dataBaru);
    }

    private T delAt(Node pointer) {
        size--;
        pointer.prev.next = pointer.next;
        pointer.next.prev = pointer.prev;
        size--;
        return pointer.data;
    }

    public T delAt(int index) {
        T returnData = null;
        Node pointer = goToIndex(index);

        if (isEmpty() || index < 0 || index >= getSize()) {
            returnData = null;
        } else {
            Node pointer1, pointer2;
            returnData = pointer.data;
            pointer1 = pointer.prev;
            pointer2 = pointer.next;
            pointer1.next = pointer2;
            pointer2.prev = pointer1;
            size--;
        }

        return returnData;
    }

    public T delHead() {
        T returnData = null;
        Node pointer = head.next.next;

        if (isEmpty()) {
            returnData = null;
        } else if (head.next == head) {
            returnData = head.data;
            head.next = head;
            head.prev = head;
            size--;
        } else {
            returnData = pointer.prev.data;
            pointer.prev = pointer.prev.prev;
            head.next = head.next.next;
            size--;
        }

        return returnData;
    }

    public T delTail() {
        T returnData = null;
        Node pointer = head.prev.prev;

        if (isEmpty()) {
            returnData = null;
        } else if (head.prev == head) {
            returnData = head.data;
            head.next = head;
            head.prev = head;
            size--;
        } else {
            returnData = pointer.next.data;
            pointer.next = pointer.next.next;
            head.prev = head.prev.prev;
            size--;
        }

        return returnData;
    }

    public T getData(int index) {
        Node pointer, pointer1 = head.next;

        for (int i = 0; i < index; i++) {
            pointer1 = pointer1.next;
        }
        if (isEmpty() || index < 0 || index >= getSize()) {
            return null;
        } else {
            pointer = pointer1;
        }
        return pointer.data;
    }

    public int getSize() {
        int sizeList = size;

        return sizeList;
    }

    public Node goToIndex(int index) {
        Node pointer = head.next;

        for (int i = 0; i < index; i++) {
            pointer = pointer.next;
        }

        return pointer;
    }

    public void insertAt(int index, T data) {
        if (index < 0 || index >= getSize()) {
            System.out.println("Salah Index");
        } else {
            Node pointer = goToIndex(index);
            addBefore(pointer, data);
        }

    }

    public boolean isEmpty() {
        if (head.next == head) {
            return true;
        } else {
            return false;
        }
    }

    public boolean searchData(String data) {
        boolean returnData = false;
        Node pointer = head.next;

        while (pointer != head) {
            if (((Antrian)pointer.data).getNoId().equals(data)){
                returnData = true;
                break;
            }
            pointer = pointer.next;
        }

        return returnData;
    }
    
    public String searchDataId(String id) {
        String returnData = "";
        Node pointer = head.next;

        while (pointer != head) {
            if (((Antrian)pointer.data).getNoId()== id) {
                returnData = String.valueOf(((Antrian)pointer.data).getNoId());
                break;
            }
            pointer = pointer.next;
        }

        return returnData;
    }

    public int searchData_generic(String data) {
        boolean returnData = false;
        Node pointer = head.next;
        int urutan = 0;

        while (pointer != head) {
            urutan++;
            if (((Antrian) pointer.data).getNama()== data) {
                returnData = true;
                break;
            }
            pointer = pointer.next;
        }
        if (returnData == true) {
            return urutan;
        }
        return urutan;
    }

    public void setData(int index, T data) {
        if (isEmpty() || index < 0 || index >= getSize()) {
            System.out.println("Salah Index");
        } else {
            Node pointer = goToIndex(index);
            pointer.data = data;
        }
    }

    public Node getPointer(){
        Node pointer = head.next;
        return pointer;
    }
    public Node getHead(){
        Node headed = head;
        return headed;
    }
    
    
    
    @Override
    public String toString() {
        String returnData = "";
        Node pointer = head.next;
        if (isEmpty()) {
            returnData = "Tidak Ada Antrian";
        } else {
            int i = 1;
            System.out.println("Id Antrian \t Nama \t\t Keperluan \t");
            while (pointer != head) {
                returnData +=((Antrian) pointer.data).getNoId() +"\t\t " +((Antrian) pointer.data).getNama()+"\t\t  "+((Antrian) pointer.data).getKeperluan()+"\n";
                pointer = pointer.next;
                i++;
            }
        }

        return returnData;
    }

    public String toStringReverse() {
        Node pointer = head.prev;
        String returnData = "";

        if (isEmpty()) {
            returnData = "Empty";
        } else {
            while (pointer != head) {
                returnData += pointer.data + ", ";
                pointer = pointer.prev;
            }
        }

        return returnData;

    }

}
