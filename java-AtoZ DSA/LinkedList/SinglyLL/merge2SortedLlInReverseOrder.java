package LinkedList.SinglyLL;

public class merge2SortedLlInReverseOrder {
    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

        Node mergeResult(Node node1, Node node2) {
            Node ans = new Node(-1);
            Node temp = ans;
            while (node1 != null && node2 != null) {
                if (node1.data <= node2.data) {
                    ans.next = node1;
                    ans = ans.next;
                    node1 = node1.next;
                } else {
                    ans.next = node2;
                    ans = ans.next;
                    node2 = node2.next;
                }
            }
            if (node1 != null) {
                ans.next = node1;
            } else {
                ans.next = node2;
            }

            Node next = null;
            Node prev = null;
            Node current = temp.next;
            while (current != null) {
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }
            temp = prev;
            return temp;
        }
        public static void main(String[] args) {
            // Create linked list 1: 1 -> 3 -> 5
            Node node1 = new Node(1);
            node1.next = new Node(3);
            node1.next.next = new Node(5);

            // Create linked list 2: 2 -> 4 -> 6
            Node node2 = new Node(2);
            node2.next = new Node(4);
            node2.next.next = new Node(6);

            // Create an object of GfG class
            merge2SortedLlInReverseOrder gfg = new merge2SortedLlInReverseOrder();

            // Call the mergeResult method to merge the two linked lists
            Node result = gfg.mergeResult(node1, node2);

            // Print the merged linked list
            System.out.println("Merged Linked List:");
            printLinkedList(result);
        }

        // Helper method to print the linked list
        private static void printLinkedList(Node head) {
            while (head != null) {
                System.out.print(head.data + " ");
                head = head.next;
            }
            System.out.println();
        }
    }

