package Week_9;

import java.util.*;

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
            return "Node{" + "data=" + data + '}';
        }
    }

    static void insertNode(Node root, int parent, int newInt) {
        if (root.data == parent) {
            if (root.children == null) {
                root.children = new ArrayList<>();
            }
            root.children.add(new Node(newInt, root, null));
        } else {
            for (int i = 0; i < root.children.size(); i++) {
                insertNode(root.children.get(i), parent, newInt);
            }
        }
    }

    static void delete(Node root, int key) {
        if (root.data == key) {
            if (root.children == null) {
                root.parent.children.remove(root);
            } else {
                root.data = root.children.get(0).data;
                if (root.children.size() == 1) {
                    if (root.children.get(0).children != null) {
                        root.children.addAll(root.children.get(0).children);
                        root.children.remove(0);
                    }
                    else root.children = null;
                } else {
                    root.children.addAll(root.children.get(0).children);
                    root.children.remove(0);
                }
            }
        } else {
            for (int i = 0; i < root.children.size(); i++) {
                delete(root.children.get(i), key);
            }
        }
    }

    static boolean isBinaryTree(Node root) {
        if (root == null) return true;
        if (root.children != null) {
            if (root.children.size() > 2) return false;
            for (int i = 0; i < root.children.size(); i++) {
                if (!isBinaryTree(root.children.get(i))) return false;
            }
        }
        return true;
    }

    static boolean isBinarySearchTree(Node root) {
        return isBinarySearchTreeUtil(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    static boolean isBinarySearchTreeUtil(Node root, int min, int max) {
        if (root == null) return true;
        if (root.children != null && root.children.size() > 2) return false;
        if (root.data < min || root.data > max) return false;
        if (root.children != null) {
            if (root.children.size() == 1) return isBinarySearchTreeUtil(root.children.get(0), min, root.data - 1);
            if (root.children.size() == 2) return (isBinarySearchTreeUtil(root.children.get(0), min, root.data - 1)
                    && isBinarySearchTreeUtil(root.children.get(1), root.data + 1, max));
        }
        return true;
    }

    static boolean isMaxBinaryHeap(Node root) {
        if (!isBinaryTree(root)) return false;
        if (root == null) return true;
        int count = countNodesBT(root);
        return isCompleteUtil(root, 1, count) && isHeapUtil(root);
    }

    static int countNodesBT(Node root) {
        if (root == null) return 0;
        return (1 + countNodesBT(root.children.get(0)) + countNodesBT(root.children.get(1)));
    }

    static boolean isCompleteUtil(Node root, int index, int count) {
        if (root == null) return true;
        if (index > count) return false;
        return (isCompleteUtil(root.children.get(0), 2 * index, count)
                && isCompleteUtil(root.children.get(1), 2 * index + 1, count));
    }

    static boolean isHeapUtil(Node root) {
        if (root.children == null) return true;
        if (root.children.size() == 1) {
            return root.data >= root.children.get(0).data;
        } else {
            if (root.data >= root.children.get(0).data && root.data >= root.children.get(1).data)
                return isHeapUtil(root.children.get(0)) && isHeapUtil(root.children.get(1));
        }
        return false;
    }

    static int height(Node root) {
        int height = 0;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node tmp = q.remove();
            if (tmp == null) height++;
            if (tmp != null) q.addAll(tmp.children);
            else if (!q.isEmpty()) q.add(null);
        }
        return height;
    }

    static void LevelOrder(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            Node tmp = q.remove();
            System.out.println(tmp);
            if (tmp.children != null) {
                q.addAll(tmp.children);
            }
        }
    }

    static public void preorder(Node root) {
        System.out.println(root);
        if (root.children != null) {
            for (int i = 0; i < root.children.size(); i++) {
                preorder(root.children.get(i));
            }
        }
    }

    static public void postorder(Node root) {
        if (root.children != null) {
            for (int i = 0; i < root.children.size(); i++) {
                postorder(root.children.get(i));
            }
        }
        System.out.println(root);
    }

    public static void main(String[] args) {
    }
}