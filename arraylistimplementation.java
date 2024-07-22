import java.util.*;
public class arraylistimplementation{
        public static void main(String[] args){
        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        System.out.println(l);
        System.out.println(l.size());
        System.out.println(l.contains(2));
        l.remove(Integer.valueOf(1));
        System.out.println(l);
        List<Integer> l1 = new ArrayList<>();
        l1.add(8);
        l1.add(9);
        l1.addAll(l);
        System.out.println(l1);
        l1.addAll(l);
        System.out.println(l1);
        l.add(1);
        l1.addAll(l);
        System.out.println(l1);
        l1.removeAll(l);
        l.addAll(l1);
        l1.removeAll(l);
        l1.add(2);
        l1.add(3);
        l.retainAll(l1);
        System.out.println(l1);
        System.out.println(l);
    }
}