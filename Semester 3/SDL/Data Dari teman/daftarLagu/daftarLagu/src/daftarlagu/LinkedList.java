package daftarlagu;

import java.io.File;

/**
 *
 * @author Gregorius Yuristama
 */
public class LinkedList {

    private ListNode head;
    private int size;

    public LinkedList() {
        head = new ListNode();
        head.setKanan(head);
        head.setKiri(head);
        size = 0;
    }

    private ListNode addBefore(File data, ListNode node) {
        ListNode baru = new ListNode(data);
        if (isEmpty()) {
            head.setKanan(baru);
            head.setKiri(baru);

            baru.setKanan(head);
            baru.setKiri(head);

        } else {
            baru.setKanan(node);
            baru.setKiri(node.getKiri());

            node.getKiri().setKanan(baru);
            node.setKiri(baru);
        }
        size++;
        return node;
    }

    public void addFirst(File data) {
        addBefore(data, head.getKanan());
    }

    public void addLast(File data) {
        addBefore(data, head);
    }

    public File remove(ListNode node) {
        node.getKanan().setKiri(node.getKiri());
        node.getKiri().setKanan(node.getKanan());

        node.setKiri(null);
        node.setKanan(null);

        size--;
        return node.getData();
    }

    public File removeFirst() {
        if (isEmpty()) {
            return null;
        } else {
            return remove(head.getKanan());
        }
    }

    public File removeLast() {
        if (isEmpty()) {
            return null;
        } else {
            return remove(head.getKiri());
        }
    }

    public int size() {
        return size;
    }

    public ListNode getHead() {
        return head;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public ListNode baca(int index) {
        if (isEmpty()) {
            return null;
        }
        if (index > size) {
            return null;
        } else {
            ListNode cari = head.getKanan();
            int i = 0;
            while (i != index) {
                if (cari.getKanan() == null) {
                    return null;
                }
                cari = cari.getKanan();
                i++;
            }
            return cari;
        }

    }

    @Override
    public String toString() {
        String array = "";
        ListNode cetak = head.getKanan();
        while (cetak != head) {
            array = array + cetak.getData() + ", ";
            cetak = cetak.getKanan();
        }
        return array;
    }

}
