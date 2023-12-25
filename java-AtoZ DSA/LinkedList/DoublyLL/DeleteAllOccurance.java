package LinkedList.DoublyLL;

public class DeleteAllOccurance {
    static class Node{
    int data;
    Node next;
    Node prev;

    Node(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
    Node(int data, Node prev, Node next){
        this.data = data;
        this.prev = prev;
        this.next = next;
    }
}
    public static Node covertToLL(int arr[]){
        Node head = new Node(arr[0]);
        Node  prev = head;
        for(int i=1; i<arr.length; i++){
            Node temp = new Node(arr[i], prev, null);
            prev.next = temp;
            prev = temp;
        }
        return head;
    }
    public static void print(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
    }

    public static Node deleteOccurance(Node head, int key){
        Node temp = head;
        while (temp != null) {
            if(temp.data == key){
                Node prevNode = temp.prev;
                Node nextNode = temp.next;
                if(temp == head) head = temp.next;
                if(prevNode != null) {
                    prevNode.next = nextNode;
                }
                if(nextNode != null){
                    nextNode.prev = prevNode;
                }
                temp = nextNode;
            }else{
                temp = temp.next;
            }
        }
        return head;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,6,5,6,7};
        Node head = covertToLL(arr);
        head = deleteOccurance(head, 6);
        print(head);
    }
}
