package LinkedList.SinglyLL;

    class Node {
        int val;
        Node next, random;

        public Node(int val) {
            this.val = val;
            this.next = this.random = null;
        }
    }

    public class CopyLLWithRandomPointers {
        public static void insertCopyNode(Node head) {
            Node temp = head;
            while (temp != null) {
                Node copy = new Node(temp.val);
                copy.next = temp.next;
                temp.next = copy;
                temp = temp.next.next;
            }
        }

        public static void linkRandom(Node head) {
            Node temp = head;
            while (temp != null) {
                Node copy = temp.next;
                if (temp.random != null) {
                    copy.random = temp.random.next;
                } else {
                    copy.random = null;
                }
                temp = temp.next.next;
            }
        }

        public static Node linkNext(Node head) {
            Node temp = head;
            Node dummy = new Node(-1);
            Node res = dummy;
            while (temp != null) {
                res.next = temp.next;
                temp.next = temp.next.next;
                res = res.next;
                temp = temp.next;
            }
            return dummy.next;
        }

        public Node copyRandomList(Node head) {
            if (head == null) {
                return null;
            }

            insertCopyNode(head);
            linkRandom(head);
            return linkNext(head);
        }

        // Helper method to print a linked list
        public static void printLinkedList(Node head) {
            Node temp = head;
            while (temp != null) {
                System.out.print("Data: " + temp.val);
                if (temp.random != null) {
                    System.out.print(", Random: " + temp.random.val);
                }
                System.out.println();
                temp = temp.next;
            }
        }

        public static void main(String[] args) {
            // Create a sample linked list
            Node head = new Node(1);
            head.next = new Node(2);
            head.next.next = new Node(3);

            // Set random pointers
            head.random = head.next.next;
            head.next.random = head;

            // Print the original linked list
            System.out.println("Original Linked List:");
            printLinkedList(head);

            // Clone the linked list
            CopyLLWithRandomPointers obj = new CopyLLWithRandomPointers();
            Node clonedHead = obj.copyRandomList(head);

            // Print the cloned linked list
            System.out.println("\nCloned Linked List:");
            printLinkedList(clonedHead);
        }
    }

