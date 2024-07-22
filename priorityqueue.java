import java.util.*;
public class priorityqueue {
    public static void main(String[] args){
        Queue<Integer> q = new PriorityQueue<>();
        q.add(30);
        q.add(40);
    
        q.add(10);
        System.out.println(q);
        q.add(20);
        System.out.println(q);
        System.out.println(q.peek());
    }
}
    