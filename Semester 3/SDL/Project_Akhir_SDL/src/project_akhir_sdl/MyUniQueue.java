package project_akhir_sdl;

import javax.swing.JOptionPane;

public class MyUniQueue {

    doubleHeadedLinkedList_generic unique;

    public MyUniQueue() {
        unique = new doubleHeadedLinkedList_generic();
    }

    public <T> void add(T data) {
        if (unique.searchData(((Antrian) data).getNoId()) == true) {
            JOptionPane.showMessageDialog(null, "Nomor Antrian Sudah Di Pakai");
            System.out.println("");
        } else {
            unique.addTail(data);
        }
    }

    public void addData_antrianTeller(String NoId, String nama, String keperluan, boolean status) {
        Antrian a = new Antrian(NoId, nama, keperluan);
        if (unique.searchData(((Antrian) a).getNoId()) == true) {
            JOptionPane.showMessageDialog(null, "Nomor Antrian Sudah Di Pakai");
        } else {
            if (status == true) {
                addKedua(a);
            } else {
                add(a);
            }
            JOptionPane.showMessageDialog(null, "Antrian Teller Sudah Di Tambah");
        }
    }

    public void addData_antrianCs(String NoId, String nama, String keperluan, boolean status) {
        Antrian a = new Antrian(NoId, nama, keperluan);
        if (unique.searchData(((Antrian) a).getNoId()) == true) {
            JOptionPane.showMessageDialog(null, "Nomor Antrian Sudah Di Pakai");
        } else {
            if (status == true) {
                addKedua(a);
            } else {
                add(a);
            }
            JOptionPane.showMessageDialog(null, "Antrian CS Sudah Di Tambah");
        }
    }

    public boolean searchData(String data) {
        return unique.searchData(data);
    }

    public String searchDataId(String data) {
        return unique.searchDataId(data);
    }

    public <T> void addKedua(T data) {
        if (unique.searchData(((Antrian) data).getNoId()) == true) {
            System.out.println("Id Sudah Terpakai");
            System.out.println("");
        } else {
            if (unique.isEmpty() || unique.getSize() <= 1) {
                add(data);
            }else{
                unique.insertAt(1, data);
            }
        }
    }

    public void remove() {
        unique.delHead();
    }

    public <T> Object getData(int i) {
        return unique.getData(i);
    }

    public <T> Object peek() {
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
