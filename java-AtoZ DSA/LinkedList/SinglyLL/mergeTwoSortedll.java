package LinkedList.SinglyLL;

import java.util.*;

// public class mergeTwoSortedll {
//     static class LinkedListNode {
//         int data;
//         LinkedListNode next;

//         LinkedListNode(int data) {
//             this.data = data;
//         }
//     };

//     public static LinkedListNode sortTwoLists(LinkedList.SinglyLL.mergeTwoSortedll.LinkedListNode first, LinkedList second) {
//         LinkedListNode ans = LinkedListNode(-1);
//         LinkedListNode temp1 = first;
//         LinkedListNode temp3 = ans;
//         while (temp1 != null && temp2 != null) {
//             if (temp1.data <= temp2.data) {
//                 ans.data = temp1.data;
//                 temp1 = temp1.next;
//             } else {
//                 ans.data = temp2.data;
//                 temp2 = temp2.next;
//             }
//             ans = ans.next;
//         }
//         while (temp1 != null) {
//             ans.data = temp1.data;
//             temp1 = temp1.next;
//             ans = ans.next;
//         }
//         while (temp2 != null) {
//             ans.data = temp2.data;
//             temp2 = temp2.next;
//             ans = ans.next;
//         }
//         return ans.next;

//     }

//     private static LinkedListNode LinkedListNode(int i) {
//         return null;
//     }

//     public static void main(String[] args) {
//         LinkedList first = new LinkedList();
//         first.add(1);
//         first.add(2);
//         first.add(4);
//         first.add(9);
//         LinkedList second = new LinkedList();
//         second.add(3);
//         second.add(4);
//         second.add(9);
//         second.add(12);
//         LinkedList ans = sortTwoLists(first, second);

//     }
// }
class Solution {
    public static LinkedListNode<Integer> sortTwoLists(LinkedListNode<Integer> first, LinkedListNode<Integer> second) {
        LinkedListNode<Integer> temp3 = new LinkedListNode<Integer>(-1);
        LinkedListNode<Integer> temp1 = first;
        LinkedListNode<Integer> temp2 = second;
        LinkedListNode<Integer> ans = temp3;
        while (temp1 != null && temp2 != null) {
            if (temp1.data <= temp2.data) {
                ans.next = temp1;
                ans = ans.next;
                temp1 = temp1.next;
            } else {
                ans.next = temp2;
                ans = ans.next;
                temp2 = temp2.next;
            }
        }
        if (temp1 == null)
            ans.next = temp2;
        else
            ans.next = temp1;
        return temp3.next;

    }
}

public class mergeTwoSortedll {
    public static void main(String[] args) {
        // Create two sorted linked lists
        LinkedListNode<Integer> list1 = new LinkedListNode<>(2, new LinkedListNode<>(4, new LinkedListNode<>(6, null)));
        LinkedListNode<Integer> list2 = new LinkedListNode<>(1, new LinkedListNode<>(4, new LinkedListNode<>(9, null)));

        // Call the sortTwoLists method
        LinkedListNode<Integer> sortedList = Solution.sortTwoLists(list1, list2);

        // Print the sorted list
        System.out.println("Sorted List:");
        while (sortedList != null) {
            System.out.print(sortedList.data + " ");
            sortedList = sortedList.next;
        }
    }
}

class LinkedListNode<T> {
    T data;
    LinkedListNode<T> next;

    public LinkedListNode(T data) {
        this.data = data;
    }

    public LinkedListNode(T data, LinkedListNode<T> next) {
        this.data = data;
        this.next = next;
    }
}
