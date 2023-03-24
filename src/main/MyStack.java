package main;

public class MyStack {
    private ListNode head;
    
    public final void push(int value) {
        head = new ListNode(value, head);
    }

    public int pop() {
        int value = head.val;
        head = head.next;
        return value;
    }

    public int top() {
        return head.val;
    }

    public boolean empty() {
        return head == null;
    }


    private static class ListNode {
        private final int val;
        private final ListNode next;


        private ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
