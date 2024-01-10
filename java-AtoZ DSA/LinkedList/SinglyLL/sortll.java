package LinkedList.SinglyLL;

import java.util.ArrayList;
import java.util.Collections;

// T.C: O(log(N) * (N+N/2))
// S.C: Recursive Stack Space
public class sortll {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // brute force approach
    public static Node sortLinkedList(Node head) {
        Node temp = head;
        ArrayList<Integer> l = new ArrayList<>();
        while (temp != null) {
            l.add(temp.data);
            temp = temp.next;
        }
        temp = head;
        Collections.sort(l);
        for (int i = 0; i < l.size(); i++) {
            temp.data = l.get(i);
            temp = temp.next;
        }
        return head;
    }

    // Utility function to print the linked list
    public static void printLinkedList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Creating a sample linked list
        Node head = new Node(4);
        head.next = new Node(22);
        head.next.next = new Node(1);
        head.next.next.next = new Node(3);

        System.out.println("Original Linked List:");
        printLinkedList(head);

        // Applying the brute force sorting approach
        head = sortLinkedList(head);

        System.out.println("Sorted Linked List:");
        printLinkedList(head);
    }
}
