package main;

public class Solution {

    public ListNode removeElements(ListNode head, int val) {
        while (head != null && head.val == val) {
            head = head.next;
        }
        ListNode newHead = head;
        ListNode nextValidNode;

        while (head != null) {
            nextValidNode = head.next;
            while (nextValidNode != null && nextValidNode.val == val) {
                nextValidNode = nextValidNode.next;
            }
            head.next = nextValidNode;
            head = nextValidNode;
        }

        return newHead;
    }
}
