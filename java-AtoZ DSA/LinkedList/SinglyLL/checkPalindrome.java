package LinkedList.SinglyLL;

import java.util.Stack;

public class checkPalindrome {
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

    public static boolean checkBrute(Node head) {
        Stack<Integer> st = new Stack<>();
        Node temp = head;
        while (temp != null) {
            st.push(temp.data);
            temp = temp.next;
        }
        temp = head;
        while (temp != null) {
            if (temp.data != st.pop()) {
                return false;
            }
            temp = temp.next;
        }
        return true;
    }

    public static Node reverse(Node head){
        if(head == null || head.next == null) return head;
        Node prev = null;
        Node temp = head;
        while(temp != null){
            Node front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }
    public static boolean isPalindrome(Node head) {
        if(head == null || head.next == null) return true;
        Node fast = head;
        Node slow = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node newNode = reverse(slow.next);
        Node first = head;
        Node second = newNode;
        while(second != null){
            if(first.data != second.data){
                return false;
            }
            first = first.next;
            second = second.next;
        }
        reverse(newNode);
        return true;
    }
    // Tortoise and Hair Algorithm
    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 1, 5 };
        Node head = convertToLL(arr);
        // boolean ans = checkBrute(head);
        // System.out.println(ans);
        boolean ans = isPalindrome(head);
        System.out.println(ans);

        // print(head);
    }
}
