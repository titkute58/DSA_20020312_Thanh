
import java.lang.reflect.Array;
import java.util.*;
import java.io.*;
import java.util.Queue;

class Node {
    Node left;
    Node right;
    int data;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

public class HKR_homework {

    /*
    class Node 
        int data;
        Node left;
        Node right;
    */
    public static int height(Node root) {
        int l = 0, r = 0;
        if(root.left != null) {
            l = height(root.left) + 1;
        }
        if(root.right != null) {
            r = height(root.right) + 1;
        }

        return Math.max(r, l);
    }

    public static Node BST_insert(Node root,int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }

        if (root.data > data) {
            root.left = BST_insert(root.left,data);
        }
        if(root.data < data) {
            root.right = BST_insert(root.right,data);
        }
        return root;
    }

    public static Node lca(Node root, int v1, int v2) {
        if(root.data < v1 && root.data < v2) {
            return lca(root.right,v1,v2);
        }

        if(root.data > v1 && root.data > v2) {
            return lca(root.left,v1,v2);
        }


        return root;
    }

    public static int c = 0;
    public static int[] a = new int[10001];
    public static int[] inOrder(Node root) {
        if(root == null){

        }else{
            inOrder(root.left);
            a[c++] = root.data;
            inOrder(root.right);
        }
        return a;
    }

    public static boolean checkBST(Node root) {
        int[] a = inOrder(root);
        for(int i = 0;i < c-1;i++) {
            if(a[i] >= a[i+1]) return false;
        }
        return true;
    }

    public static Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        } else {
            Node cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        int height = height(root);
        System.out.println(height);
    }
}