package main;

public class App {

    public static void main(String[] args) {
        MyList<Integer> list1 = new MyList<>(1, 2, 6, 3, 4, 5, 6);
        MyList<Integer> list2 = new MyList<>();
        MyList<Integer> list3 = new MyList<>(7, 7, 7, 7);

        println("Lists before removal:");
        println(list1);
        println(list2);
        println(list3);

        list1.removeElements(6);
        list2.removeElements(1);
        list3.removeElements(7);

        println("Lists after removal:");
        println(list1);
        println(list2);
        println(list3);

    }

    public static void println(Object value) {
        System.out.println(value);
    }
}