package LinkedList.DoublyLL;

import java.util.HashMap;
import java.util.Map;

public class FindPairsWithGivenSum {
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

    private static Node findTail(Node head){
        Node tail = head;
        while(tail.next != null){
            tail = tail.next;
        }
        return tail;
    }

    private static Map<Integer, Integer> findPairs(Node head, int k){
        Map<Integer, Integer> mpp = new HashMap<>();
        if(head == null) return mpp;
        Node left = head;
        Node right = findTail(head);
        while(left.data < right.data){
            if(left.data + right.data == k ){
                mpp.put(left.data, right.data);
                left = left.next;
                right = right.prev;
            }else if(left.data + right.data < k){
                left = left.next;
            }else{
                right = right.prev;
            }
        }
        return mpp;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 9 };
        Node head = convertArrayToDll(arr);
        Map<Integer, Integer> mpp = new HashMap<>();
        mpp = findPairs(head, 5);
        mpp.forEach((key, value) -> System.out.println("{" + key + "," + value + "}" ));
    }
}
