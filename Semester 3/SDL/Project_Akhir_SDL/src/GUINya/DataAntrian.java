package GUINya;

import javax.swing.JOptionPane;
import project_akhir_sdl.Antrian;
import project_akhir_sdl.MyUniQueue;

public class DataAntrian {
    MyUniQueue dataTeller = new MyUniQueue();
    MyUniQueue dataCs = new MyUniQueue();
    
    
    
    public void addData_antrianCs(String NoId,String nama, String keperluan){
        Antrian a = new Antrian(NoId,nama,keperluan);
    }
    
}
