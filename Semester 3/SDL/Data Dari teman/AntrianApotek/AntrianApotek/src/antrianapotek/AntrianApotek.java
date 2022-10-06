/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package antrianapotek;

/**
 *
 * @author Michael
 */
public class AntrianApotek {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyQueue test = new MyQueue();
        test.add("Michael");
        test.add("Aldo");
        test.add("Adit");
        System.out.println(test);
        test.remove();
        System.out.println(test);
        System.out.println(test.search("Adit"));
    }
    
}
