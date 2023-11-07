package twoPointers.linkedList;

public class LinkedList {
    LinkedListNode head;

    public LinkedList() {
        this.head = null;
    }

    public void insertNodeAtHead(int data) {
        if (this.head != null) {
            head.next = this.head;
        }
        this.head = new LinkedListNode(data);
    }

    public static LinkedListNode removeNthLastNode(LinkedListNode head, int n) {
        if (head == null) return head;
        LinkedListNode left = head;
        LinkedListNode right = head;
        for (int i = 0; i < n; i++){
            if (right == null) return head;
            right = right.next;
        }

        while(right != null && right.next != null) {
            left = left.next;
            right = right.next;
        }
        if (left == head && right == null)
            head = head.next;
        left.next = left.next.next;
        return head;
    }
}
