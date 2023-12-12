package LinkedList.SinglyLL;

class Node {
    int data;
    Node next;

    Node(int data1) {
        this.data = data1;
        this.next = null;
    }
};

public class ArrayToLL {
    private static Node convertArray2LL(int arr[]) {
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    // Length of LL -> O(n)
    private static int countLen(Node head) {
        int cnt = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            cnt++;
        }
        return cnt;
    }

    // Search element in LL -> O(n)
    private static int searchEle(Node head, int val) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == val) return 1;
            temp = temp.next;
        }
        return 0;
    }

    public static void main(String[] args) {
        int arr[] = { 12, 5, 4, 8 };
        Node head = convertArray2LL(arr);
        // System.out.println(head.data);

        // traversal in LL -> O(N)
        // Node temp = head;
        // while(temp != null){
        // System.out.print(temp.data + " ");
        // temp = temp.next;
        // }

        int length = countLen(head);
        // System.out.println(length);

        int check = searchEle(head, 5);
        System.out.println(check);
    }
}
