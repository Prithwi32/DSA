package LinkedList.DoublyLL;

public class oddEvenLL {
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

    public static Node SegregateOddEven(Node head){
        Node odd = head;
        Node even = head.next;
        Node evenHead = head.next;
        while(even != null && even.next != null){
            if(head == null || head.next == null) return head;
            odd.next = odd.next.next;
            even.next = even.next.next;

            odd = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }

    public static Node EvenOdd(Node head){
        Node d = new Node(-1);
        Node current = head;
        Node ans = d;
        while(current!=null){
            if(current.data % 2 == 0){
                d.next= new Node(current.data);
                d = d.next;
            }
            current = current.next;
        }
        current = head;
        while(current!=null){
            if(current.data % 2 != 0){
                d.next= new Node(current.data);
                d = d.next;
            }
            current = current.next;
        }
        return ans.next;
    }
    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 2, 4};
        Node head = convertArrayToDll(arr);
        // head = SegregateOddEven(head);                    // 1 5 4 3 2
        head = EvenOdd(head);                               // 2 4 1 3 5
        print(head);
    }
}
