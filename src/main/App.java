package main;

public class App {

    public static ListNode makeList(int... values) {
        ListNode tail = new ListNode(values[values.length - 1]);
        ListNode node = null;
        for (int i = 0; i < values.length - 1; i++) {
            node = new ListNode(values[values.length - 1 - 1 - i], tail);
            tail = node;
        }
        return node;
    }

    public static void printList(ListNode head) {
        System.out.print("List: { ");
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println("}");
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        ListNode node1 = makeList(1, 2, 2, 1);
        ListNode node2 = makeList(1, 2);

        System.out.println(sol.isPalindrome(node1)); // Expected true
        System.out.println(sol.isPalindrome(node2)); // Expected false

    }
}