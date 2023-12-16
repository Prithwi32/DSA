package LinkedList.DoublyLL;
import java.util.Stack;

public class reverseDll {
    public static class Node {
        public int data;
        public Node next;
        public Node prev;

        Node()
        {
            this.data = 0;
            this.next = null;
            this.prev = null;
        }

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
            this.prev = null;
        }

        public Node(int data, Node next, Node prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }

    public static Node convertArrayToDll(int[] arr) {
        Node head = new Node(arr[0]);
        Node prev = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i], null, prev);
            prev.next = temp;
            prev = temp;
        }
        return head;
    }

    public static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    // brute force solution
    public static Node reverseDllUsingStack(Node head){
        Stack<Integer> st = new Stack<>();
        Node temp = head;
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

    // optimal solution
    public static Node reverseDll(Node head){
        if(head == null || head.next == null) return head;
        Node temp = head;
        while(temp != null){
            Node swap = new Node();
            if(temp.next == null) head = temp;
            swap.next = temp.next;
            temp.next = temp.prev;
            temp.prev = swap.next;
            temp = swap.next;
        }
        return head;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 2, 4 };
        Node head = convertArrayToDll(arr);
        head = reverseDllUsingStack(head);
        // head = reverseDll(head);
        print(head);
    }
}
