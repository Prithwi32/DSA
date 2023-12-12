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
public class convertArrayToDll {
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
    private static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1, 4, 6, 2, 7};
        Node head = convertTo2Dll(arr);
        print(head);
    }
}
