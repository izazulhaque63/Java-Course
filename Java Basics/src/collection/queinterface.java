package collection;

import java.util.LinkedList;
import java.util.Queue;

public class queinterface {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q.remove(1));
        System.out.println(q.offer(1));
        System.out.println(q.element());

    }
}
