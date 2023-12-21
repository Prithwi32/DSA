package LinkedList.SinglyLL;

public class DeleteMiddleOfLL {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
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

    // Tortoise and Hair algo used
    private static Node deleteMiddle(Node head) {
        if (head == null || head.next == null)
            return head;
        Node fast = head;
        Node slow = head;
        // Node prevSlow = null;
        fast = fast.next.next;;
        while (fast != null && fast.next != null) {
            // prevSlow = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        // prevSlow.next = slow.next;
        slow.next = slow.next.next;
        return head;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 1, 4, 5 };
        Node head = convertToLL(arr);
        head = deleteMiddle(head);
        print(head);
    }
}