/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package antrianapotek;

/**
 *
 * @author Michael
 */
public class Customer{
    private String nama;

    public Customer(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

//    @Override
//    public int compareTo(Object other) {
//        if (nama.equals(((Customer)other).getNama())) {
//            return 1;
//        }
//        else{
//            return 0;
//        }
//    }
    
}
