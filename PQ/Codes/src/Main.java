import java.util.ArrayList;
import java.util.PriorityQueue;


class HelloWorld {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        System.out.println(list1.equals(list2));
    }
}