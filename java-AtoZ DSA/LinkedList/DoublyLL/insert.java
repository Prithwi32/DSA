package LinkedList.DoublyLL;

public class insert {
    public static class Node {
        public int data;
        public Node next;
        public Node prev;

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

    public static Node insertHead(Node head, int value) {
        Node newHead = new Node(value, head, null);
        head.prev = newHead;
        return newHead;
    }

    private static Node insertBeforeTail(Node head, int value) {
        if (head.next == null)
            insertHead(head, value);
        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        Node prev = tail.prev;
        Node newNode = new Node(value, tail, prev);
        prev.next = newNode;
        tail.prev = newNode;
        return head;
    }

    private static Node insertAtPosition(Node head, int value, int k) {
        if (k == 1)
            return insertHead(head, value);
        Node temp = head;
        int cnt = 0;
        while (temp.next != null) {
            cnt++;
            if (cnt == k)
                break;
            temp = temp.next;
        }
        Node prev = temp.prev;
        Node newNode = new Node(value, temp, prev);
        prev.next = newNode;
        temp.prev = newNode;
        return head;
    }

    // head is never told to change
    private static void insertBeforeNode(Node node, int value) {
        if (node.next == null);
        Node prev = node.prev;
        Node newNode = new Node(value, node, prev);
        prev.next = newNode;
        node.prev = newNode;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 2, 4 };
        Node head = convertArrayToDll(arr);
        // head = insertHead(head, 8); // 8 1 3 5 2 4
        // head = insertBeforeTail(head, 8); // 1 3 5 2 8 4
        // head = insertAtPosition(head, 8, 3); // 1 3 8 5 2 4
        insertBeforeNode(head.next.next, 8);  // 1 3 8 5 2 4
        print(head);
    }
}
