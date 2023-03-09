package main;

import java.util.List;

public class App {
    public static void main(String[] args) {
        int[] l1 = {2, 4, 3};
        int[] l2 = {5, 6, 4};

        ListNode rootNode1 = new ListNode(l1[0]);
        ListNode rootNode2 = new ListNode(l2[0]);

        /* Make 1st linked list */
        ListNode tempNode = rootNode1;

        for (int i = 1; i < l1.length; i++) {
            tempNode.next = new ListNode(l1[i]);
            tempNode = tempNode.next;
        }

        /* Make 2nd linked list */

        tempNode = rootNode2;

        for (int i = 1; i < l2.length; i++) {
            tempNode.next = new ListNode(l2[i]);
            tempNode = tempNode.next;
        }

        /* Call method to retrieve sum linked list */

        tempNode = addTwoNumbers(rootNode1, rootNode2);

        /* TEST: iterate result linked list */

        do {
            System.out.println((char) tempNode.val);
            tempNode = tempNode.next;
            if (tempNode != null && tempNode.next == null) {
                System.out.println((char) tempNode.val);
            }
        } while (tempNode != null && tempNode.next != null);

    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        /* Iterate 1st linked list */

        StringBuilder sb = new StringBuilder();
        int number1;
        int number2;

        ListNode tempNode = l1;

        do {
            sb.append(tempNode.val);
            tempNode = tempNode.next;
            if (tempNode != null && tempNode.next == null) {
                sb.append(tempNode.val);
            }
        } while (tempNode != null && tempNode.next != null);

        number1 = Integer.parseInt(sb.reverse().toString());

        /* Iterate 2nd linked list */

        sb = new StringBuilder();

        tempNode = l2;

        do {
            sb.append(tempNode.val);
            tempNode = tempNode.next;
            if (tempNode != null && tempNode.next == null) {
                sb.append(tempNode.val);
            }
        } while (tempNode != null && tempNode.next != null);

        number2 = Integer.parseInt(sb.reverse().toString());

        /* Building result linked list */

        int sum = number1 + number2;

        sb = new StringBuilder(String.valueOf(sum));
        sb.reverse();

        char[] digits = sb.toString().toCharArray();

        ListNode rootNodeResult = new ListNode(digits[0]);

        tempNode = rootNodeResult;

        for (int i = 1; i < digits.length; i++) {
            tempNode.next = new ListNode(digits[i]);
            tempNode = tempNode.next;
        }

        return rootNodeResult;
    }
}