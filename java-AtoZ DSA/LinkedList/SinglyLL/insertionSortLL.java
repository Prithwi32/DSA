package LinkedList.SinglyLL;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class insertionSortLL {
    public static Node insertionSortLinkedList(Node head) {
        if (head == null || head.next == null) {
            return head; // Already sorted or empty list
        }

        Node sortedHead = null; // Head of the sorted list
        Node current = head;

        while (current != null) {
            Node nextNode = current.next; // Store the next node before we disconnect current node

            if (sortedHead == null || current.data < sortedHead.data) {
                // Insert at the beginning of the sorted list
                current.next = sortedHead;
                sortedHead = current;
            } else {
                // Traverse the sorted list to find the correct position
                Node prev = null;
                Node currentSorted = sortedHead;

                while (currentSorted != null && currentSorted.data < current.data) {
                    prev = currentSorted;
                    currentSorted = currentSorted.next;
                }

                // Insert the current node into the sorted position
                if (prev != null) {
                    prev.next = current;
                    current.next = currentSorted;
                } else {
                    // If prev is null, current is the new head of the sorted list
                    current.next = sortedHead;
                    sortedHead = current;
                }
            }

            current = nextNode; // Move to the next unsorted node
        }

        return sortedHead;
    }

    public static void printLinkedList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Creating a sample linked list: 4 -> 2 -> 1 -> 3
        Node head = new Node(4);
        head.next = new Node(2);
        head.next.next = new Node(1);
        head.next.next.next = new Node(3);

        System.out.println("Original Linked List:");
        printLinkedList(head);

        Node sortedHead = insertionSortLinkedList(head);

        System.out.println("\nLinked List after Insertion Sort:");
        printLinkedList(sortedHead);
    }
}
