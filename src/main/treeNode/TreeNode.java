package main.treeNode;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class TreeNode<T> implements Serializable {
    private T root;
    private List<TreeNode<T>> chirldren=new ArrayList<TreeNode<T>>();
    private String left;
    private String right;

    public TreeNode(){};
    public TreeNode(T root) {
        this.root = root;
    }
    public void addNode(TreeNode<T> node){
        chirldren.add(node);
    }

    public T getRoot() {
        return root;
    }

    public void setRoot(T root) {
        this.root = root;
    }

    public List<TreeNode<T>> getchirldren() {
        return chirldren;
    }

    public void setchirldren(List<TreeNode<T>> chirldren) {
        this.chirldren = chirldren;
    }

    public String getLeft() {
        return left;
    }

    public void setLeft(String left) {
        this.left = left;
    }

    public String getRight() {
        return right;
    }

    public void setRight(String right) {
        this.right = right;
    }
}
