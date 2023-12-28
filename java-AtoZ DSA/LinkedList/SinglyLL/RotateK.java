package LinkedList.SinglyLL;

public class RotateK {
    static class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    };

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

    private static Node findNthNode(Node tail, int k) {
        int cnt = 1;
        while (tail != null) {
            if (cnt == k)
                return tail;
            tail = tail.next;
            cnt++;
        }
        return tail;
    }

    private static Node rotate(Node head, int k) {
        if (head == null || k == 0)
            return head;
        Node temp = head;
        int len = 1;
        while (temp.next != null) {
            len++;
            temp = temp.next;
        }
        if (k % len == 0)
            return head;
        k = k % len;
        temp.next = head;
        Node newTail = findNthNode(head, len - k);
        head = newTail.next;
        newTail.next = null;
        return head;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 24, 56, 2 };
        Node head = convertToLL(arr);
        head = rotate(head, 2);
        print(head);
    }
}
