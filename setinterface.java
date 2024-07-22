import java.util.*;

public class setinterface {
    public static void main(String[] args) {
        // Set<Integer> set = new HashSet<>(); //O(1)
        // Set<Integer> set = new LinkedHashSet<>(); //O(n)
        Set<Integer> set = new TreeSet<>(); //O(logn)
        set.add(10);
        set.add(10);
        set.add(10);
        set.add(10);
        System.out.println(set);
        set.add(20);
        set.add(5);
        System.out.println(set);
        System.out.println(set.size()); 

    }
}
