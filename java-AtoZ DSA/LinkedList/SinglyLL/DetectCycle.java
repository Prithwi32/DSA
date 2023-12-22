package LinkedList.SinglyLL;

public class DetectCycle {
    public static class Node {
        public int data;
        public Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

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

    static void createCycle(Node head, int a, int b) {
        int cnta = 0, cntb = 0;
        Node p1 = head;
        Node p2 = head;
        while (cnta != a || cntb != b) {
            if (cnta != a) {
                p1 = p1.next;
                ++cnta;
            }
            if (cntb != b) {
                p2 = p2.next;
                ++cntb;
            }
        }
        p2.next = p1;
    }

    public static boolean cycleDetect(Node head){
        Node fast = head;
        Node slow = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(fast == slow) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4 };
        Node head = convertToLL(arr);
        createCycle(head,1,3);//creating cycle in the list
        if(cycleDetect(head) == true)
        System.out.println("Cycle detected");
        else
        System.out.println("Cycle not detected");
    }
}
