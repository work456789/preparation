package tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//https://www.youtube.com/watch?annotation_id=annotation_994734&feature=iv&src_vid=UcOxGmj45AA&v=M6lYob8STMI
//http://www.geeksforgeeks.org/binary-search-tree-set-1-search-and-insertion/
public class BinarySearchTree {
    public static Node root;

    public BinarySearchTree() {
        this.root = null;
    }

    public static void main(String arg[]) {
        BinarySearchTree b = new BinarySearchTree();
        b.insert(3);
        b.insert(8);
        b.insert(1);
        b.insert(4);
        b.insert(6);
        b.insert(2);
        b.insert(10);
        b.insert(9);
        b.insert(20);
        b.insert(25);
        b.insert(15);
        b.insert(16);
        System.out.println("Original Tree : ");
        BinaryTreePrinter.printNode(root);
        System.out.println("");
        System.out.println("InOrder recursive traversal : ");
        b.display(root);
        System.out.println("");
        System.out.println("InOrder iterative traversal : ");
        inOrderIter(root);
        System.out.println("");
        System.out.println("PreOrder recursive traversal : ");
        preOrderRecursive(root);
        System.out.println("");
        System.out.println("PreOrder iterative traversal : ");
        preOrderIter(root);
        System.out.println("");
        System.out.println("PostOrder recursive traversal : ");
        postOrderRecursive(root);
        System.out.println("");
        System.out.println("PostOrder iterative traversal : ");
        postOrderIterative(root);
        System.out.println("");
        System.out.println("LevelOrder traversal : ");
        levelOrderTraversal(root);
        System.out.println("");
//        System.out.println("Check whether Node with value 4 exists : " + b.find(4));
//        System.out.println("Delete Node with no children (2) : " + b.delete(2));
//        b.display(root);
//        System.out.println("\n Delete Node with one child (4) : " + b.delete(4));
//        b.display(root);
//        System.out.println("\n Delete Node with Two children (10) : " + b.delete(10));
//        b.display(root);
    }

    //inorder traversal recursive
    void display(Node root) {
        if (root != null) {
            display(root.left);
            System.out.print(" " + root.data);
            display(root.right);
        }
    }

    void insert(int data) {
        Node newNode = new Node(data);
        if (root == null) {
            root = newNode;
        } else {
            Node currentNode = root;
            Node parent;
            while (true) {
                parent = currentNode;
                if (data < currentNode.getData()) {
                    currentNode = currentNode.left;
                    if (currentNode == null) {
                        parent.left = newNode;
                        return;
                    }
                } else {
                    currentNode = currentNode.right;
                    if (currentNode == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    static void inOrderIter(Node root) {
        if (root == null) {
            return;
        }
        Node currentNode = root;
        Stack<Node> s = new Stack<>();
        while (!s.isEmpty() || currentNode != null) {
            if (currentNode != null) {
                s.push(currentNode);
                currentNode = currentNode.left;
            } else {
                Node n = s.pop();
                System.out.println(n.data);
                currentNode = n.right;
            }
        }
    }

    static void preOrderRecursive(Node root) {
        if (root == null) {
            return;
        }
        System.out.println(root.data);
        preOrderRecursive(root.left);
        preOrderRecursive(root.right);
    }

    static void preOrderIter(Node root) {
        if (root == null) {
            return;
        }
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while (!stack.empty()) {
            Node currentNode = stack.pop();
            System.out.println(currentNode.data);

            if (currentNode.right != null) {
                stack.push(currentNode.right);
            }
            if (currentNode.left != null) {
                stack.push(currentNode.left);
            }
        }
    }

    static void postOrderRecursive(Node root) {
        if (root == null) {
            return;
        }
        postOrderRecursive(root.left);
        postOrderRecursive(root.right);
        System.out.println(root.data);
    }

    static void postOrderIterative(Node root) {
        if (root == null) {
            return;
        }

        Stack<Node> stack = new Stack<>();
        Node current = root;

        while (true) {
            while(current != null) {
                if (current.right != null) {
                    stack.push(current.right);
                }
                stack.push(current);
                current = current.left;
                continue;
            }

            if (stack.isEmpty()) {
                return;
            }
            current = stack.pop();

            if (current.right != null && !stack.isEmpty() && current.right == stack.peek()) {
                stack.pop();
                stack.push(current);
                current = current.right;
            } else {
                System.out.println(current.data + " ");
                current = null;
            }
        }
    }

    static void levelOrderTraversal(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            Node tempNode = queue.poll();
            System.out.println(tempNode.data + " ");
            if (tempNode.left != null) {
                queue.add(tempNode.left);
            }
            if (tempNode.right != null) {
                queue.add(tempNode.right);
            }
        }
    }

}
