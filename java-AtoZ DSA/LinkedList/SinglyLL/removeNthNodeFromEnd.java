package LinkedList.SinglyLL;

public class removeNthNodeFromEnd {
    static class Node {
        int data;
        Node next;
    };

    static Node create(Node head, int x) {
        Node temp, ptr = head;
        temp = new Node();
        temp.data = x;
        temp.next = null;
        if (head == null)
            head = temp;
        else {
            while (ptr.next != null) {
                ptr = ptr.next;
            }
            ptr.next = temp;
        }
        return head;
    }

    static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static Node removeNthNodeEnd(Node head, int n){
        Node start = new Node();
        start.next = head;
        Node fast = start;
        Node slow = start;
        for(int i=1; i<=n; ++i){
            fast = fast.next;
        }
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return start.next;
    }
    public static void main(String[] args) {
        Node head = null;

        head = create(head, 1);
        head = create(head, 2);
        head = create(head, 3);
        head = create(head, 4);
        head = create(head, 5);

        int n = 2;
        head = removeNthNodeEnd(head, n);
        display(head);
    }
}
