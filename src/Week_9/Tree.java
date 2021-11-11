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

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    '}';
        }
    }

    static void insertNode(Node root, int parent, int newInt) {
    }

    static void delete(Node root, int key) {
    }

    static boolean isBinaryTree(Node root) {
        return false;
    }

    static boolean isBinarySearchTree(Node root) {
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