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

        ListNode node1 = makeList(1, 2, 3, 4, 5);
        ListNode node2 = makeList(1, 2);
        ListNode node3 = null;

        printList(node1);
        printList(node2);
        printList(node3);

        node1 = sol.reverseList(node1);
        node2 = sol.reverseList(node2);
        node3 = sol.reverseList(node3);

        printList(node1);
        printList(node2);
        printList(node3);
    }
}