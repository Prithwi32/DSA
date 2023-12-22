package LinkedList.SinglyLL;

public class Add1ToLl {
    public static class Node {
		public int data;
		public Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
	}
    }

    // public static Node reverse(Node head){
	// Iterative Method : O(3N)
	// 	Node prev = null;
	// 	Node temp = head;
	// 	while(temp != null){
	// 		Node front = temp.next;
	// 		temp.next = prev;
	// 		prev = temp;
	// 		temp = front;
	// 	}
	// 	return prev;
	// }

    public static int helper(Node temp){
		if(temp == null) return 1;
		int carry = helper(temp.next);
		temp.data += carry;
		if(temp.data < 10){
			return 0;
		}
		temp.data = 0;
		return 1;
	}

public static Node addNode(Node head) {
    //     Node head1 = reverse(head);
	// 	Node temp = head;
	// 	int c = 1;
	// 	while(temp != null){
	// 		temp.data += c;
	// 		if(temp.data < 10){
	// 			c = 0;
	// 			break;
	// 		}else{
    //             temp.data = 0;
	// 			c = 1;
	// 		}
	// 		temp = temp.next;
	// 	}
	// 	if(c == 1){
	// 		Node newHead = new Node(1);
	// 		head1 = reverse(head);
	// 		newHead.next = head;
	// 	    return newHead;
	// 	}
	// 	head = reverse(temp);
	// 	return head;

	// Recursive Method: O(N)
	int carry = helper(head);
	if(carry == 1){
		Node newHead = new Node(1);
		newHead.next = head;
		return newHead;
	}
	return head;
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

    // traversal in LL -> O(N)
    private static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 9, 9, 9, 9 };
        Node head = convertToLL(arr);
        head = addNode(head);
        print(head);
    }
}
// Iterative approach =>    T.C: O(3N) + S.C = O(1)
// Recursive approach =>    T.C: O(N) + S.C = recursive stack space used

