package Week_9;

import java.util.List;

public class Tree {
    Node root;

    public Tree() {
        root = null;
    }

    static class Node {
        int data;
        boolean visited;
        Node parent;
        List<Node> children;

        public Node(int data, Node parent, List<Node> children) {
            this.data = data;
            this.parent = parent;
            this.children = children;
            this.visited = false;
        }

        public Node(int data) {
            this.data =data;
        }

        public Node(int data, Node parent){
            this.data = data;
            this.parent = parent;
        }

        public List<Node> getChildren() {
            return children;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public boolean isRoot() {
            return this.parent == null;
        }

        public boolean isLeaf() {
            return this.children.size() == 0;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    '}';
        }
    }

    static void insertNode(Node root, int parent, int newInt) {
        if(root == null) {

        }
    }

    static void delete(Node root, int key) {
    }

    static boolean isBinaryTree(Node root) {
        if(root.children.size()>2)
            return false;
        for(Node x: root.getChildren()){
            if(!isBinaryTree(x))
                return false;
        }
        return true;
    }

    static boolean isBinarySearchTree(Node root) {
        if(isBinaryTree(root)){
            if(root.getChildren().get(0).data > root.data ||
                    root.getChildren().get(1).data <= root.data){
                return false;
            }
            if(!isBinarySearchTree(root.getChildren().get(0)) || !isBinarySearchTree(root.getChildren().get(1)))
                return false;
        }
        return false;
    }

    static boolean isMaxBinaryHeap(Node root) {
        return false;
    }

    static int height(Node root) {

        return 0;
    }

    static void print(Node root) {
        // In cây theo từng tầng một
    }

    static public void preorder(Node root) {
    }

    static public void postorder(Node root) {
    }

    public static void main(String[] args) {
    }
}