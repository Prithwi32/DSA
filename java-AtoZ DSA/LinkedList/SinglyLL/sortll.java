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

    // Using Merge Sort

    public static Node findMiddle(Node head) {
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static Node merge(Node list1, Node list2) {
        Node ans = new Node(-1);
        Node temp = ans;
        while (list1 != null && list2 != null) {
            if (list1.data < list2.data) {
                temp.next = list1;
                temp = list1;
                list1 = list1.next;
            } else {
                temp.next = list2;
                temp = list2;
                list2 = list2.next;
            }
        }
        if (list1 != null) {
            temp.next = list1;
        } else {
            temp.next = list2;
        }
        return ans.next;
    }

    public static Node sortLL(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node middle = findMiddle(head);
        Node left = head;
        Node right = middle.next;
        middle.next = null;

        Node leftsort = sortLL(left);
        Node rightsort = sortLL(right);

        return merge(leftsort, rightsort);
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
        // head = sortLinkedList(head);
        head = sortLL(head);

        System.out.println("Sorted Linked List:");
        printLinkedList(head);
    }
}
