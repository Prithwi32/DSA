package LinkedList.SinglyLL;
public class basics {
    public static class Node{
    int data;            // the data value
    Node next;           // the reference to the next Node in the linked list

    // Constructors
    Node(int data1, Node next1){
        this.data = data1;        // Initialize data with the provided value
        this.next = next1;        // Initialize next with the provided reference
    }

    Node(int data1){
        this.data = data1;
        this.next = null;      // Initialize next with the provided reference
    }
}
    public static void main(String[] args) {
        int arr[] = {1, 2, 5, 8, 4};
        // Creating a new Node with the value from the array
        Node obj = new Node(arr[3]);
        // Printing the data stored in the Node
        System.out.println(obj.data);
    }
}
