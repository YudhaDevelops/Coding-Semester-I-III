package daftarlagu;

import java.io.File;


/**
 *
 * @author Gregorius Yuristama
 */
public class ListNode {

    private File data;
    private ListNode kanan;
    private ListNode kiri;

    public ListNode() {
    }

    public ListNode(File data) {
        this.data = data;
        this.kanan = null;
        this.kiri = null;
    }

    public ListNode(File data, ListNode kanan) {
        this.data = data;
        this.kanan = kanan;
    }

    public ListNode(File data, ListNode kanan, ListNode kiri) {
        this.data = data;
        this.kanan = kanan;
        this.kiri = kiri;
    }

    public File getData() {
        return data;
    }

    public void setData(File data) {
        this.data = data;
    }

    public ListNode getKanan() {
        return kanan;
    }

    public void setKanan(ListNode kanan) {
        this.kanan = kanan;
    }

    public ListNode getKiri() {
        return kiri;
    }

    public void setKiri(ListNode kiri) {
        this.kiri = kiri;
    }

}
