package MyStack;
public class Test_stact_generic {
   public static void main(String[] args) {
       Mahasiswa m1, m2, m3, m4;
       
       m1 = new Mahasiswa(39);
       m2 = new Mahasiswa(49);
       m3 = new Mahasiswa(59);
       m4 = new Mahasiswa(69);
       
       MyStack_generic s = new MyStack_generic();
       MyStack_generic s2 = new MyStack_generic();
       System.out.println("Tambah Data");
       s.push_dariBlakang(m1);
       s.push_dariBlakang(m2);
       s.push_dariBlakang(m3);
       s.push_dariBlakang(m4);
       System.out.println(s.getSize());
       System.out.println(s.toString());
       System.out.println("");
       System.out.println("Hapus Data");
       s.pop();
       System.out.println(s.getSize());
       System.out.println(s.search(59));
       System.out.println(s.toString());
    }
    
}
