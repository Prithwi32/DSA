package LinkedList.SinglyLL;

import java.util.PriorityQueue;

import LinkedList.SinglyLL.Add2Nums.ListNode;

public class mergeKLists {
    static class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> p = new PriorityQueue<>((a, b) -> a.val - b.val);
        for (int i = 0; i < lists.length; i++) {
            ListNode x = lists[i];
            while (x != null) {
                p.add(x);
                x = x.next;
            }
        }
        ListNode ans = p.poll();
        ListNode temp = ans;
        while (p.size() > 0) {
            temp.next = p.poll();
            temp = temp.next;
        }
        if (temp != null) {
            temp.next = null;
        }
        return ans;
    }

    public static void main(String[] args) {
        // Create linked list 1: 1 -> 4 -> 5
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(4);
        list1.next.next = new ListNode(5);

        // Create linked list 2: 1 -> 3 -> 6
        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(6);

        // Create linked list 3: 2 -> 7 -> 8
        ListNode list3 = new ListNode(2);
        list3.next = new ListNode(7);
        list3.next.next = new ListNode(8);

        // Create an array of linked lists
        ListNode[] listsArray = { list1, list2, list3 };

        // Create an instance of the mergeKLists class
        mergeKLists mergeListsObject = new mergeKLists();

        // Call the mergeKLists method to merge the array of linked lists
        ListNode result = mergeListsObject.mergeKLists(listsArray);

        // Print the merged linked list
        System.out.println("Merged Linked List:");
        printLinkedList(result);
    }

    // Helper method to print the linked list
    private static void printLinkedList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }
}

