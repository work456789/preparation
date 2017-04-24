package tree;

public class BinaryTree {
    private Node root;
    private int size;

    public BinaryTree() {
    }

    public BinaryTree(Node root) {
        this.root = root;
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    class Node {
        private int data;
        private Node left, right;

        public Node(int data) {
            this.data = data;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getLeft() {
            return left;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public Node getRight() {
            return right;
        }

        public void setRight(Node right) {
            this.right = right;
        }
    }

    void insertNode(int data) {
        if (root == null) {
            root = new Node(data);
        } else {
            insertNode(root, new Node(data));
        }
    }

    private Node insertNode(Node currentParent, Node newNode) {
        if (currentParent == null) {
            return newNode;
        } else if (newNode.getData() > currentParent.getData()) {
            currentParent.right = insertNode(currentParent.right, newNode);
        } else if (newNode.getData() < currentParent.getData()) {
            currentParent.left = insertNode(currentParent.left, newNode);
        }

        return currentParent;
    }

}
