package project_akhir_v2.pkg0;

public class TreeNode {
    private String data;
    private String arti;
    TreeNode leftNode;
    TreeNode rightNode;
    TreeNode parent;

    public TreeNode(String data,String arti) {
        this.data = data;
        this.arti = arti;
    }

    public TreeNode(String data) {
        this.data = data;
    }
    
    public TreeNode(){
        data = null;
        arti = null;
        leftNode = null;
        rightNode = null;
    }
    
    public String getData() {
        return data;
    }

    public String getArti() {
        return arti;
    }

    public void setArti(String arti) {
        this.arti = arti;
    }

    public void setData(String data) {
        this.data = data;
    }

    public TreeNode getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(TreeNode leftNode) {
        this.leftNode = leftNode;
    }

    public TreeNode getRightNode() {
        return rightNode;
    }

    public void setRightNode(TreeNode rightNode) {
        this.rightNode = rightNode;
    }

    public TreeNode getParent() {
        return parent;
    }

    public void setParent(TreeNode parent) {
        this.parent = parent;
    }
    
   
}
