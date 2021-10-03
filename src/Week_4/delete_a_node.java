import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.Scanner;

public class delete_a_node {

    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static class SinglyLinkedList {
        public SinglyLinkedListNode head;
        public SinglyLinkedListNode tail;

        public SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
            SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
            }

            this.tail = node;
        }
    }

    static void printLinkedList(delete_a_node.SinglyLinkedListNode head) {
        while (head != null){
            System.out.println(head.data);
            head = head.next;
        }
    }



    /*
     * Complete the 'deleteNode' function below.
     *
     * The function is expected to return an INTEGER_SINGLY_LINKED_LIST.
     * The function accepts following parameters:
     *  1. INTEGER_SINGLY_LINKED_LIST llist
     *  2. INTEGER position
     */

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */

    public static SinglyLinkedListNode deleteNode(SinglyLinkedListNode llist, int position) {
        SinglyLinkedListNode tmp = llist;
        int count = 0;
        while(tmp != null){
            count++;
            tmp = tmp.next;
        }
        tmp = llist;
        if(count == 1) return null;
        if(position == 0){
            return llist.next;
        }
        while(true){
            if(position == 1) break;
            position--;
            tmp = tmp.next;
        }
        tmp.next = tmp.next.next;
        return llist;
    }



    public static void main(String[] args) throws IOException {
        SinglyLinkedList llist = new SinglyLinkedList();
        Scanner scanner = new Scanner(System.in);

        int llistCount = scanner.nextInt();

        for (int i = 0; i < llistCount; i++) {
            int llistItem = scanner.nextInt();

            llist.insertNode(llistItem);
        }

        int position = scanner.nextInt();
        SinglyLinkedListNode llist1 = deleteNode(llist.head, position);

        printLinkedList(llist.head);

        scanner.close();
    }
}
