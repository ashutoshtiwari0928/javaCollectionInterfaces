import java.util.*;
public class listinterfacelearn {
    public static void main(String[] args){
        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        Iterator<Integer> i = l.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
        for (Integer j: l){
            System.out.println(j);
        }
        for (int k=0;k<l.size();k++){
            System.out.println(l.get(k));
        }
        List<Integer> sublist = l.subList(0, 3);
        System.out.println(sublist);
        int size = 10;
        int arr[] = new int[size];
        System.out.println(arr.length);
        size = size*2;
        System.out.println(arr.length);
        List<Integer> arrlist = new ArrayList<>();
        System.out.println(arrlist.size());
        arrlist.add(1);
        System.out.println(arrlist.size());
        for (int a=0;a<100;a++){
            arrlist.add(a);
        }
        System.out.println(arrlist.size());



    }
}
