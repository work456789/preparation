package tree;

public class PreOrderTraversal {

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        for (int i = 1; i <= 7; i++) {
            binaryTree.insertNode(i);
        }
        preorderTraversal(binaryTree.getRoot());
    }
    //with recursion
    static void preorderTraversal(BinaryTree.Node root) {
        if (root != null) {
            System.out.println(root.getData());
            preorderTraversal(root.getLeft());
            preorderTraversal(root.getRight());
        }
    }
}
