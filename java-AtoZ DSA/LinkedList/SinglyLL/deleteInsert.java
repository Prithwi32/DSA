package LinkedList.SinglyLL;

class Node {
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

public class deleteInsert {
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

    // delete head
    private static Node removeHead(Node head) {
        if (head == null)
            return head;
        head = head.next;
        return head;
    }

    // delete tail
    private static Node removeTail(Node head) {
        if (head == null || head.next == null)
            return null;
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }

    // delete kth element in LL : TC = O(k)
    private static Node removeK(Node head, int k) {
        if (head == null)
            return head;
        if (k == 1) {
            head = head.next;
            return head;
        }
        int cnt = 0;
        Node temp = head;
        Node prev = null;
        while (temp != null) {
            cnt++;
            if (cnt == k) {
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }

    // delete given element in LL
    /**
     * leetcode question
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode(int x) { val = x; }
     * }
     */
    // public void deleteNode(ListNode node) {
    // node.val = node.next.val;
    // node.next = node.next.next;
    // }

    private static Node removeEle(Node head, int val) {
        if (head == null)
            return head;
        if (head.data == val) {
            head = head.next;
            return head;
        }
        Node temp = head;
        Node prev = null;
        while (temp != null) {
            if (temp.data == val) {
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }

    // inserting head
    private static Node insertHead(Node head, int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
        return head;
    }

    // inserting tail
    private static Node insertTail(Node head, int val) {
        if (head == null) {
            return new Node(val);
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        Node newNode = new Node(val);
        temp.next = newNode;
        return head;
    }

    // given value insert it at position k
    private static Node insertK(Node head, int val, int k) {
        if (head == null) {
            if (k == 1) {
                return new Node(val, head);
            } else {
                return head;
            }
        }
        if (k == 1) {
            return new Node(val, head);
        }
        int cnt = 0;
        Node temp = head;
        while (temp.next != null) {
            cnt++;
            if (cnt == (k - 1)) {
                Node x = new Node(val, temp.next);
                temp.next = x;
                break;
            }
            temp = temp.next;
        }
        return head;
    }

    // given value insert it before x
    private static Node insertBeforeX(Node head, int val, int x) {
        if (head == null) {
            return null;
        }
        if (head.data == x) {
            return new Node(val, head);
        }
        Node temp = head;
        while (temp.next != null) {
            if (temp.next.data == x) {
                Node newNode = new Node(val, temp.next);
                temp.next = newNode;
                break;
            }
            temp = temp.next;
        }
        return head;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 24, 56, 2 };
        Node head = convertToLL(arr);
        // head = removeHead(head);
        // System.out.println("Head after deletion : ");
        // head = removeTail(head);
        // System.out.println("after deletion of tail: ");
        // head = removeK(head, 7);
        // System.out.println("After deleting key in LL: ");
        // head = removeEle(head, 1);
        // System.out.println("After deleting value in LL: ");
        // head = insertHead(head, 100);
        // head = insertHead(head, 100);
        // System.out.println("After inserting head: ");
        // head = insertTail(head, 100);
        // System.out.println("After inserting tail: ");
        // head = insertK(head, 100, 2);
        head = insertBeforeX(head, 100, 2);
        print(head);
    }
}
