package project_akhir_v2.pkg0;

import java.util.ArrayList;

public class Tree {

    ArrayList<TreeNode> listData = new ArrayList<>();
    TreeNode root,temp;
    String dataPrint = "";
    TreeNode parent;
    static int jumlahTree = 0;
    String hasilPencarian_kata, hasilPencarian_arti;
    

    public Tree() {
        this.root = null;
    }

    public Tree(TreeNode node) {
        this.root = node;
    }

    public ArrayList<TreeNode> getListData() {
        return listData;
    }

    public void insert(String dataNode, String arti) {
        if (root == null) {
            root = new TreeNode(dataNode, arti);
            System.out.println("Data root = " + root.getData());
        } else {
            insertHelper(root, dataNode, arti);
        }
    }

    public void insertHelper(TreeNode pointer, String kata, String arti){
        if(kata.compareTo(pointer.getData()) < 1){
            if(pointer.getLeftNode() != null){
                insertHelper(pointer.getLeftNode(), kata, arti);
            }else{
                TreeNode newNode = new TreeNode(kata, arti);
                pointer.setLeftNode(newNode);
                newNode.setParent(pointer);
            }
        }else{
            if(pointer.getRightNode() != null)
                insertHelper(pointer.getRightNode(), kata, arti);
            else{
                TreeNode newNode = new TreeNode(kata, arti);
                pointer.setRightNode(newNode);
                newNode.setParent(pointer);
            }
        }
    }

    public void inOrderTraversal() {
        listData.clear();
        inorderHelper(this.getRoot());
    }

    public void inorderHelper(TreeNode localRoot) {
        if (localRoot != null) {
            inorderHelper(localRoot.getLeftNode());
            listData.add(localRoot);
            inorderHelper(localRoot.getRightNode());
        }
    }

    public void inOrderTraversal_Revese() {
        listData.clear();
        inorderHelper_Revese(this.getRoot());
    }

    public void inorderHelper_Revese(TreeNode localRoot) {
        if (localRoot != null) {
            inorderHelper_Revese(localRoot.getRightNode());
            listData.add(localRoot);
            inorderHelper_Revese(localRoot.getLeftNode());
        }
    }

    public String getDataPrint() {
        return dataPrint;
    }

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }

    public void leaf() {
        getLeaf(this.getRoot());
    }

    private int getLeaf(TreeNode node) {
        if (node == null) {
            return 0;
        }
        if (node.getLeftNode() == null && node.getRightNode() == null) {
            System.out.print(node.getData() + " ");
            return 1;
        } else {
            return getLeaf(node.getLeftNode()) + getLeaf(node.getRightNode());
        }
    }

    public boolean isLeaf(TreeNode data) {
        boolean cek = false;
        TreeNode ptr = data;
        if (ptr.getLeftNode() == null && ptr.getRightNode() == null) {
            cek = true;
        }
        return cek;
    }

    public boolean delete(String data) {
        boolean cek = false;
        TreeNode node = Search_Node(data);
        System.out.println("node \n" + node.getData() + ":" + node.getArti());
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
        return cek;
    }

    public boolean delete_0_anak(TreeNode data) {
        TreeNode parent = data.getParent();
        if (parent.getLeftNode() == data) {
            parent.setLeftNode(null);
            data.setParent(null);
        } else {
            parent.setRightNode(null);
            data.setParent(null);
        }
        return true;
    }
    
    public boolean delete_1_anak(TreeNode data) {
        TreeNode parent = data.getParent();
        TreeNode temp = data;

        if (temp != root) {
            if (parent.getLeftNode() == temp) {
                if (temp.getLeftNode() != null) { //jika cabang kiri temp tidak null
                    parent.setLeftNode(temp.getLeftNode());
                    temp.getLeftNode().setParent(parent);
                } else {
                    parent.setLeftNode(temp.getRightNode());
                    temp.getRightNode().setParent(parent);
                }
                temp.setParent(null);
            } else {
                if (temp.getLeftNode() != null) { //jika cabang kanan temp tidak null
                    parent.setRightNode(temp.getLeftNode());
                    temp.getLeftNode().setParent(parent);
                } else {
                    parent.setRightNode(temp.getRightNode());
                    temp.getRightNode().setParent(parent);
                }
                temp.setParent(null);
            }
        } else {
            if (data.getRightNode() != null) {//cabang kanan ada ==> cabang kiri kosong
                TreeNode n = GetSuccessor(temp);
                if (n != null) {
                    root.setData(n.getData());
                    root.setArti(n.getArti());
                } else { //temp = root
                    if (isLeaf(temp.getRightNode())) {
                        root.setData(temp.getRightNode().getData());
                        root.setArti(temp.getRightNode().getArti());
                        root.setRightNode(null);
                    } else {
                        root.setData(temp.getRightNode().getData());
                        root.setArti(temp.getRightNode().getArti());
                        root.setRightNode(temp.getRightNode().getRightNode());
                        temp.getRightNode().setParent(root);
                    }
                }
            } else {//cabang kiri ada ==> cabang kanan kosong
                TreeNode n = getPredeccessor(temp);
                if (n != null) {
                    root.setData(n.getData());
                    root.setArti(n.getArti());
                } else { // temp = root
                    if (isLeaf(temp.getLeftNode())) {
                        root.setData(temp.getLeftNode().getData());
                        root.setArti(temp.getLeftNode().getArti());
                        root.setLeftNode(null);
                    } else {
                        root.setData(temp.getLeftNode().getData());
                        root.setArti(temp.getLeftNode().getArti());
                        root.setLeftNode(temp.getLeftNode().getLeftNode());
                        temp.getLeftNode().setParent(root);
                    }
                }
            }
        }
        return true;
    }

    public boolean delete_2_anak(TreeNode node) {
        boolean cek = false;
        TreeNode parent = node.getParent();
        TreeNode temp = node;
        if (node != root) {
            if (parent.getRightNode() == temp) {
                if (temp.getRightNode() != null) {
                    parent.setRightNode(temp.getRightNode());                    // cabang kanan parent ambil cabang kanan temp
                    temp.getRightNode().setParent(parent);                      //cabang kanan temp ambil parent 
                    temp.getRightNode().setLeftNode(temp.getLeftNode());
                    temp.getLeftNode().setParent(temp.getRightNode());

                } else {
                    parent.setLeftNode(temp.getLeftNode());
                    temp.getLeftNode().setParent(parent);
                    temp.getLeftNode().setRightNode(temp.getRightNode());
                    temp.getRightNode().setParent(temp.getLeftNode());
                }
                temp.setParent(null);
                cek = true;
            } else if (parent.getLeftNode() == temp) {
                if (isLeaf(temp.getRightNode())) {
                    TreeNode GetSuccessor = GetSuccessor(temp);
                    temp.setData(GetSuccessor.getData());
                    temp.setArti(GetSuccessor.getArti());
                    temp.setRightNode(null);
                } else {
                    TreeNode GetSuccessor = GetSuccessor(temp);
                    temp.setData(GetSuccessor.getData());
                    temp.setArti(GetSuccessor.getArti());
                }
                cek = true;
            }
        } else {
            TreeNode getPredeccessor = getPredeccessor(temp);
            root.setData(getPredeccessor.getData());
            root.setArti(getPredeccessor.getArti());
            cek = true;
        }
        return cek;
    }

    public TreeNode Search_Node(String data) {
        TreeNode pointer = root;
        if (String.valueOf(pointer.getData()).equals(data)) {
            pointer = root;
        } else {
            while (!pointer.getData().equals(data)) {
                if (data.compareTo(pointer.getData()) < 1) 
                    pointer = pointer.getLeftNode();
                 else 
                    pointer = pointer.getRightNode();
                
                if (pointer == null) {
                    return null;
                }
            }
        }
        hasilPencarian_arti = pointer.getArti();
        hasilPencarian_kata = pointer.getData();
        if(pointer != null)
            System.out.println("Node ada");
        return pointer;
    }

    public String getHasilPencarian_kata() {
        return hasilPencarian_kata;
    }

    public String getHasilPencarian_arti() {
        return hasilPencarian_arti;
    }

    public TreeNode GetSuccessor(TreeNode node) {
        TreeNode Current, Successor, SuccessorParent;
        Successor = node;
        SuccessorParent = node;
        Current = node.getRightNode();
        while (Current != null) {
            SuccessorParent = Successor;
            Successor = Current;
            Current = Current.getLeftNode();
        }

        if (Successor != node.getRightNode()) {
            SuccessorParent.setLeftNode(Successor.getRightNode());
            Successor.setRightNode(node.getRightNode());
        } else {
            Successor = null;
        }
        return Successor;
    }

    public TreeNode getPredeccessor(TreeNode node) {
        TreeNode Current, Predeccessor, PredeccessorParent;
        Predeccessor = node;
        PredeccessorParent = node;
        Current = node.getLeftNode();
        while (Current != null) {
            PredeccessorParent = Predeccessor;
            Predeccessor = Current;
            Current = Current.getRightNode();
        }
        if (Predeccessor != node.getLeftNode()) {
            PredeccessorParent.setRightNode(Predeccessor.getLeftNode());
            Predeccessor.setLeftNode(node.getLeftNode());
        } else {
            Predeccessor = null;
        }
        return Predeccessor;
    }
    
}
