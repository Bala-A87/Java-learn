import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.ArrayList;
import java.util.LinkedList;

public class SetList {
    public static void main(String args[])
    {
        Set<Integer> intset = new HashSet<Integer>();

        intset.add(5);
        intset.add(7);
        intset.add(1);
        intset.add(7);
        intset.add(-3);
        intset.add(3);
        intset.add(11);
        //Notice that it is loosely ordered - based on absolute value
        System.out.println(intset);
        System.out.println(intset.isEmpty());
        System.out.println(intset.size() + "\n");

        System.out.println(intset.contains(5));
        System.out.println(intset.contains(-1) + "\n");

        intset.remove(7);
        System.out.println(intset + "\n");

        intset.clear();
        System.out.println(intset);
        System.out.println(intset.isEmpty());
        System.out.println(intset.size() + "\n");


        Set<Integer> inttreeset = new TreeSet<Integer>();
        inttreeset.add(5);
        inttreeset.add(7);
        inttreeset.add(1);
        inttreeset.add(7);
        inttreeset.add(-3);
        inttreeset.add(3);
        inttreeset.add(11);
        //Strictly ordered
        System.out.println(inttreeset);
        System.out.println(inttreeset.isEmpty());
        System.out.println(inttreeset.size() + "\n");


        //Linked Hash Set - like a Hash Set but faster
        Set<Integer> inthset = new LinkedHashSet<Integer>();
        inthset.add(5);
        inthset.add(7);
        inthset.add(1);
        inthset.add(7);
        inthset.add(-3);
        inthset.add(3);
        inthset.add(11);
        //Not ordered - same order as inserts
        System.out.println(inthset);
        System.out.println(inthset.isEmpty());
        System.out.println(inthset.size() + "\n");


        ArrayList<Integer> alist = new ArrayList<Integer>(); //Like a vector
        alist.add(1);
        alist.add(3);
        System.out.println(alist);
        System.out.println(alist.isEmpty());
        System.out.println(alist.size() + "\n");

        alist.set(1, 5); //parameters: index, element value
        System.out.println(alist + "\n");

        alist.add(3);
        alist.add(2);
        alist.add(6);
        alist.add(7);
        System.out.println(alist.subList(2, 5) + "\n"); //indices are inclusive, exclusive respectively, just like vectors


        LinkedList<Integer> llist = new LinkedList<Integer>(); //Similar to ArrayList, but has different time complexities
        llist.add(1);
        llist.add(3);
        System.out.println(llist);
        System.out.println(llist.isEmpty());
        System.out.println(llist.size() + "\n");

        llist.set(1, 5);
        System.out.println(llist + "\n");

        llist.add(3);
        llist.add(2);
        llist.add(6);
        llist.add(7);
        System.out.println(llist.subList(2, 5) + "\n");
    }
}
