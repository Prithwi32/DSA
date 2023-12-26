package LinkedList.SinglyLL;


public class countLengthOfLoop {
    static class Node {
    int num;
    Node next;

    Node(int val) {
        num = val;
        next = null;
    }
}

    static Node insertNode(Node head, int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            return head;
        }
        Node temp = head;
        while (temp.next != null)
            temp = temp.next;

        temp.next = newNode;
        return head;
    }

    static void createCycle(Node head, int pos) {
        Node ptr = head;
        Node temp = head;
        int cnt = 0;
        while (temp.next != null) {
            if (cnt != pos) {
                ++cnt;
                ptr = ptr.next;
            }
            temp = temp.next;
        }
        temp.next = ptr;
    }
    public static int count(Node slow, Node fast){
        int cnt = 1;
        fast = fast.next;
        while(slow != fast){
            fast = fast.next;
            cnt++;
        }
        return cnt;
    }

    private static int countLength(Node head){
        Node fast = head;
        Node slow = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return count(slow, fast);
                }
            }
        return 0;
    }
public static void main(String args[]) {
        Node head = null;

        head = insertNode(head, 1);
        head = insertNode(head, 2);
        head = insertNode(head, 3);
        head = insertNode(head, 4);
        head = insertNode(head, 3);
        head = insertNode(head, 6);
        head = insertNode(head, 10);

        createCycle(head, 2);

        int ans = countLength(head);
        System.out.println("Length of loop cycle is: " + ans);
    }
}


