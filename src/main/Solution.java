package main;

public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode next1;
        ListNode next2;
        ListNode current = head;
        ListNode previous = null;

        while (current != null) {
            next1 = current.next;
            current.next = previous;
            if (next1 == null) return current;
            next2 = next1.next;
            next1.next = current;
            if (next2 == null) return next1;
            previous = next1;
            current = next2;

        }
        return current;
    }
}
