package LinkedList.DoublyLL;
class Node{
    int data;
    Node next;
    Node back;
    Node(int data1){
        this.data = data1;
        this.next = null;
        this.back = null;
    }
    Node(int data1, Node next1, Node prev1){
        this.data = data1;
        this.next = next1;
        this.back = prev1;
    }
}
public class deleteLl {
    // doublyLinkedList to array
    private static Node convertTo2Dll(int arr[]){
        Node head = new Node(arr[0]);
        Node prev = head;
        for(int i=1; i<arr.length; i++){
            Node temp = new Node(arr[i], null, prev);
            prev.next = temp;
            prev = temp;
        }
    return head;
    }
    // printing
    private static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    // delete head
    private static Node deleteHead(Node head){
        if(head == null || head.next == null) return null;
        Node prev = head;
        head = head.next;
        head.back = null;
        prev.next = null;
        prev = head;
        return head;
    }

    // delete tail
    private static Node deleteTail(Node head){
        if(head == null || head.next == null) return null;
        Node tail = head;
        while(tail.next != null){
            tail = tail.next;
        }
        Node newTail = tail.back;
        newTail.next = null;
        tail.back = null;
        return head;
    }

    // delete element of kth position
    private static Node deleteKthNode(Node head,int k){
        if(head == null) return null;
        int cnt = 0;
        Node KthNode = head;
        while(KthNode != null){
            cnt++;
            if(cnt == k) break;
            KthNode = KthNode.next;
        }
        Node prev = KthNode.back;
        Node front = KthNode.next;

        if(prev == null && front == null) return null;
        else if(prev == null) return deleteHead(head);
        else if(front == null) return deleteTail(head);

        prev.next = front;
        front.back = prev;

        KthNode.next = null;
        KthNode.back = null;

        return head;
    }

    // delete Node in LL
    private static void deleteNode(Node temp){
        Node prev = temp.back;
        Node front = temp.next;

        // edge case if temp is the tail node
        if(front == null){
            prev.next = null;
            temp.back = null;
            return;
        }

        //Disconnect temp from the doubly linked list
        prev.next = front;
        front.back = prev;

        temp.next = null;
        temp.back = null;
        return;
    }
    public static void main(String[] args) {
        int arr[] = {1, 4, 6, 2, 7};
        Node head = convertTo2Dll(arr);
        // head = deleteHead(head);
        // head = deleteTail(head);
        // head = deleteKthNode(head, 5);
        deleteNode(head.next.next);
        print(head);
    }
}
