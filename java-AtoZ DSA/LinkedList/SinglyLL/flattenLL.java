package LinkedList.SinglyLL;

public class flattenLL {
    static class Node {
        int data;
        Node next;
        Node child;

            Node(int data){
                this.data = data;
                this.next = null;
                this.child = null;
            }
    }

    static Node flatten(Node head) {
        if (head == null || head.next == null)
            return head;
        head.next = flatten(head.next);
        head = merge(head, head.next);
        return head;
    }

static Node merge(Node l1, Node l2) {
    Node temp = new Node(-1);
    Node ans = temp;

    while (l1 != null && l2 != null) {
        if (l1.data < l2.data) {
            temp.child = l1;
            temp = temp.child;
            l1 = l1.child;
        } else {
            temp.child = l2;
            temp = temp.child;
            l2 = l2.child;
        }
    }

    if (l1 != null) temp.child = l1;
    else temp.child = l2;

    return ans.child;
}

    public static void main(String[] args) {
        // Create a sample linked list with nodes and child nodes
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.child = new Node(7);
        head.next.child.next = new Node(8);
        head.next.child.next.child = new Node(11);
        head.next.child.next.child.next = new Node(14);
        head.next.next.next = new Node(4);
        head.next.next.next.child = new Node(9);
        head.next.next.next.child.next = new Node(12);

        // Create an instance of the flattenLL class
        // flattenLL flattener = new flattenLL();

        // Flatten the linked list
        // Node flattenedList = flattener.flatten(head);

        Node ans = flatten(head);

        // Print the flattened linked list
        System.out.println("Flattened Linked List:");
        while (ans != null) {
            System.out.print(ans.data + " ");
            ans = ans.child;
        }
    }
}
