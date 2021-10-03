import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.Scanner;

public class insert_random {

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

    static void printLinkedList(insert_random.SinglyLinkedListNode head) {
        while (head != null){
            System.out.println(head.data);
            head = head.next;
        }
    }

        /*
         * Complete the 'insertNodeAtPosition' function below.
         *
         * The function is expected to return an INTEGER_SINGLY_LINKED_LIST.
         * The function accepts following parameters:
         *  1. INTEGER_SINGLY_LINKED_LIST llist
         *  2. INTEGER data
         *  3. INTEGER position
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

        public static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode llist, int data, int position) {
            SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
            if(position == 0){
                newNode.next = llist;
                return newNode;
            }
            if(llist == null){
                return newNode;
            }
            SinglyLinkedListNode tmp = llist;
            while(true){
                if(position == 1) break;
                tmp = tmp.next;
                position--;
            }
            newNode.next = tmp.next;
            tmp.next = newNode;
            return llist;


        }


    public static void main(String[] args) throws IOException {
        SinglyLinkedList llist = new SinglyLinkedList();
        Scanner sc = new Scanner(System.in);

        int llistCount = sc.nextInt();

        for (int i = 0; i < llistCount; i++) {
            int llistItem = sc.nextInt();
            llist.insertNode(llistItem);
        }

        int data = sc.nextInt();

        int position = sc.nextInt();

        SinglyLinkedListNode llist_head = insertNodeAtPosition(llist.head, data, position);

        printLinkedList(llist.head);

        sc.close();
    }
}
