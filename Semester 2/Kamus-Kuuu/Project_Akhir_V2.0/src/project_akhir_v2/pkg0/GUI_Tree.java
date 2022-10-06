package project_akhir_v2.pkg0;

import java.util.ArrayList;

public class GUI_Tree extends Tree{
    ArrayList<TreeNode> daftarList = new ArrayList<>();

    public void hapus(TreeNode node){
        System.out.println("node \n" + node.getData() + ":" + node.getArti());
        boolean cek = false;
        if (node != null) {
            if (!isLeaf(node)
                    && (node.getLeftNode() != null && node.getRightNode() != null)) {
                cek = delete_2_anak(node);
            } else if (!isLeaf(node)
                    && (node.getLeftNode() != null || node.getRightNode() != null)) {
                cek = delete_1_anak(node);
            } else {
                cek = delete_0_anak(node);
            }
        }
        System.out.println(cek);
    }
    
}
