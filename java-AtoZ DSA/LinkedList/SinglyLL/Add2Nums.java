package LinkedList.SinglyLL;

/*
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
    You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 */
public class Add2Nums {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode prev;

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        ListNode(int val, ListNode next, ListNode prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
        public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode t1 = l1;
            ListNode t2 = l2;
            ListNode dummyNode = new ListNode(-1);
            ListNode current = dummyNode;
            int sum = 0, carry = 0;
            while (t1 != null || t2 != null) {
                sum = carry;
                if (t1 != null)
                    sum += t1.val;
                if (t2 != null)
                    sum += t2.val;

                ListNode newNode = new ListNode(sum % 10);
                carry = sum / 10;
                current.next = newNode;
                current = current.next;

                if (t1 != null)
                    t1 = t1.next;
                if (t2 != null)
                    t2 = t2.next;
            }
            if (carry != 0) {
                ListNode newNode = new ListNode(carry);
                current.next = newNode;
            }
            return dummyNode.next;
        }

        public static ListNode convertArrayToDll(int[] arr) {
            ListNode head = new ListNode(arr[0]);
            ListNode prev = head;
            for (int i = 1; i < arr.length; i++) {
                ListNode temp = new ListNode(arr[i], null, prev);
                prev.next = temp;
                prev = temp;
            }
            return head;
        }

        public static void print(ListNode head) {
            ListNode temp = head;
            while (temp != null) {
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
        }

    public static void main(String[] args) {
        int arr1[] = { 5, 1, 6, 6};
        int arr2[] = { 6, 7, 3, 4 };
        ListNode head1 = convertArrayToDll(arr1);
        ListNode head2 = convertArrayToDll(arr2);
        ListNode head = addTwoNumbers(head1, head2);
        print(head);
    }
}
