package main;

import java.util.HashSet;
import java.util.Set;

public class App {

    public static void main(String[] args) {
        ListNode<Integer> node4 = new ListNode<>(-4);
        ListNode<Integer> node3 = new ListNode<>(0, node4);
        ListNode<Integer> node2 = new ListNode<>(2, node3);
        ListNode<Integer> node1 = new ListNode<>(3, node2);

        node4.next = node1;

        System.out.println(hasCycle(node1));

    }

    public static <T> boolean hasCycle(ListNode<T> head) {
        Set<ListNode<T>> nodes = new HashSet<>();
        while (head != null) {
            if (!nodes.add(head))
                return true;
            head = head.next;
        }
        return false;
    }

    static class ListNode<T> {
        T val;
        ListNode<T> next;

        ListNode(T x) {
            val = x;
            next = null;
        }

        ListNode(T x, ListNode<T> n) {
            val = x;
            next = n;
        }
    }
}