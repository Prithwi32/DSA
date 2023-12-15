package LinkedList.SinglyLL;

import java.util.*;

public class insertBeforeValue {
    public static class Node {
        int data;
        Node next;

        Node(int data1) {
            this.data = data1;
            this.next = null;
        }

        Node(int data2, Node next2) {
            this.data = data2;
            this.next = next2;
        }
    }

    // Function to print the linked list
    public static void printLL(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    // Function to insert a new node with data 'el' after the node with data 'val'
    public static Node insertAtK(Node head, int el, int val) {
        if (head == null) {
            return null;
        }

        // Insert at the beginning if the value matches the head's data
        if (head.data == val) {
            return new Node(el, head);
        }

        Node temp = head;
        while (temp.next != null) {
            // Insert at the current position if the next node has the desired value
            if (temp.next.data == val) {
                Node newNode = new Node(el, temp.next);
                temp.next = newNode;
                break;
            }
            temp = temp.next;
        }
        return head;
    }

    public static void main(String[] args) {
        // Initialize list with values
        ArrayList<Integer> arr = new ArrayList<Integer>() {
            {
                add(0);
                add(1);
                add(2);
            }
        };
        int el = 5;
        int val = 2;

        // Create a linked list with the given array list
        Node head = new Node(arr.get(0));
        head.next = new Node(arr.get(1));
        head.next.next = new Node(arr.get(2));

        // Insert a new node with data 'el' after the node with data 'val'
        head = insertAtK(head, el, val);

        // Print the modified linked list
        printLL(head);
    }
}
