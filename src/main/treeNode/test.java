package main.treeNode;

public class test {
    public static void main(String[] args) {
        TreeNode<String> node = new TreeNode<>("root");
        TreeNode<String> chirld = new TreeNode<>("chirld");
        node.addNode(chirld);
        System.out.println(node.toString());
        new Thread();
    }
}
