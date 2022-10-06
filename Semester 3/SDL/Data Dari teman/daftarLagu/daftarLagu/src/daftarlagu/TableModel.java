/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daftarlagu;

import java.io.File;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Gregorius Yuristama
 */
public class TableModel extends AbstractTableModel {

    QueueL antrian = new QueueL();

    public TableModel(QueueL antrian) {
        this.antrian = antrian;
    }

    @Override
    public int getRowCount() {
        return antrian.size();
    }

    @Override
    public int getColumnCount() {
        return 1;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        File data = antrian.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return data.getName();
            default:
                return "";
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Judul";
            default:
                return "";
        }
    }

}
