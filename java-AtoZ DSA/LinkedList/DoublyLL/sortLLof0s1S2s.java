package LinkedList.DoublyLL;

public class sortLLof0s1S2s {
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

    public static Node sort(Node head) {
        // My try : swapping logic
        // Node temp = head;
        // while(temp != null){
        // if(head == null || head.next == null) return head;
        // if(temp.data > temp.next.data){
        // int swap = temp.data;
        // temp.data = temp.next.data;
        // temp.next.data = swap;

        // temp = temp.next;
        // }
        // }
        // return head;

        // Brute approach - TC: O(2N) sc:O(1)
        // Node temp = head;
        // int cnt0 = 0, cnt1 = 0, cnt2 = 0;
        // while(temp != null){
        // if(temp.data == 0) cnt0++;
        // else if(temp.data == 1) cnt1++;
        // else if(temp.data == 2) cnt2++;

        // temp = temp.next;
        // }
        // temp = head;
        // while(temp != null){
        // if(head == null || head.next == null) return head;
        // if(cnt0 > 0){
        // cnt0--;
        // temp.data = 0;
        // }
        // else if(cnt1 > 0){
        // cnt1--;
        // temp.data = 1;
        // }
        // else{
        // cnt2--;
        // temp.data = 2;
        // }
        // temp = temp.next;
        // }
        // return head;

        // Optimal solution
        // similar to dutch national flags
        Node temp = head;
        Node zero = new Node(-1);
        Node zeroHead = zero;
        Node one = new Node(-1);
        Node oneHead = one;
        Node two = new Node(-1);
        Node twoHead = two;

        while (temp != null) {
        if (head == null || head.next == null)
        return head;
        if (temp.data == 0) {
        zero.next = temp;
        zero = zero.next;
        } else if (temp.data == 1) {
        one.next = temp;
        one = one.next;
        } else {
        two.next = temp;
        two = two.next;
        }
        temp = temp.next;
        }

        zero.next = (oneHead.next != null) ? (oneHead.next) : (twoHead.next);
        one.next = (twoHead.next);
        // // Set the next of the last element to null to avoid cycles
        two.next = null;
        // // The new head will be the next element of the zero partition
        // // head node zero is a dummy node created for the zero partition,
        // // and the actual sorted list starts from its next node
        Node newHead = zeroHead.next;
        return newHead;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 0, 0, 2, 1 };
        Node head = convertArrayToDll(arr);
        head = sort(head);
        print(head);
    }
}