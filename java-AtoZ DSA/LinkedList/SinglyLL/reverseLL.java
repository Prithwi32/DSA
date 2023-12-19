package LinkedList.SinglyLL;

import java.util.Stack;

public class reverseLL {
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

    private static Node convertToLL(int arr[]) {
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    // traversal in LL -> O(N)
    private static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    // Using STACK
    public static Node reverseBrute(Node head){
        Node temp = head;
        Stack<Integer> st = new Stack<>();
        while(temp != null){
            st.push(temp.data);
            temp = temp.next;
        }
        temp = head;
        while(temp != null){
            temp.data = st.pop();
            temp = temp.next;
        }
        return head;
    }

    // Using Iterative Method
    public static Node reverseOpti1(Node head){
        Node temp = head;
        Node prev = null;
        while(temp != null){
            Node front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }

    // Using Recursive Approach
    public static Node reverseOpti2(Node head){
        if(head == null || head.next == null) return head;
        Node newHead = reverseOpti2(head.next);
        Node front = head.next;
        front.next = head;
        head.next = null;
        return newHead;
    }
    public static void main(String[] args) {
        int arr[] = { 1, 24, 56, 2 };
        Node head = convertToLL(arr);
        // head = reverseBrute(head);
        // head = reverseOpti1(head);
        head = reverseOpti2(head);
        print(head);
    }
}
