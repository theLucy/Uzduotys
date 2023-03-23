package main;

public class MyList<T> {
    private ListNode<T> head;
    private int length = 0;

    /**
     * Creates new list initialized with zero or more values
     *
     * @param values optional list of values to initialize list with.
     */
    @SafeVarargs
    public MyList(T... values) {
        for (T t : values) {
            head = new ListNode<>(t, head);
            length++;
        }
    }

    /**
     * Pushes one or more new values to the list.
     *
     * @param value  first value to push to the list.
     * @param values more optional values to also push to the list.
     */
    @SafeVarargs
    public final void push(T value, T... values) {
        head = new ListNode<>(value, head);
        length++;
        for (T t : values) {
            head = new ListNode<>(t, head);
            length++;
        }
    }

    /**
     * Removes first value in list and returns it.
     *
     * @return first value of the list.
     */
    public T pop() {
        T value = head.val;
        head = head.next;
        length--;
        return value;
    }

    /**
     * Returns first value of the list.
     *
     * @return first value of the list.
     */
    public T poll() {
        return head.val;
    }

    /**
     * Returns size of the list
     *
     * @return size of the list.
     */
    public int size() {
        return length;
    }

    /**
     * Clears the list elements and sets size to zero.
     */
    public void clear() {
        head = null;
        length = 0;
    }

    /**
     * Removes specified elements from the list.
     *
     * @param val value of element in the list to look for and remove.
     */
    public void removeElements(T val) {
        ListNode<T> prehead = new ListNode<>(null, head);
        ListNode<T> current = prehead;

        while (current.next != null)
            if (current.next.val == val) current.next = current.next.next;
            else current = current.next;

        head = prehead.next;
    }

    @Override
    public String toString() {
        ListNode<T> node = head;
        StringBuilder sb = new StringBuilder("List: { ");
        while (node != null) {
            sb.append(node).append(", ");
            node = node.next;
        }
        sb.append("}");
        return sb.toString();
    }

    private static class ListNode<T> {
        private T val;
        private ListNode<T> next;

        private ListNode() {
        }

        private ListNode(T val) {
            this.val = val;
        }

        private ListNode(T val, ListNode<T> next) {
            this.val = val;
            this.next = next;
        }

        @Override
        public String toString() {
            return val.toString();
        }
    }
}
