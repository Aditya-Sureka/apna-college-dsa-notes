package Hashing;

import java.util.*;

// HashSet is implemented using Hashmap

public class HashSetBasic {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(4);
        set.add(2);
        set.add(1); // [1, 2, 4] AS DUPLICATES ARE NOT ALLOWED

        // System.out.println(set);

        // Iterator on  HashSets -> 
        HashSet<String> cities = new HashSet<>();

        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Noida");
        cities.add("Bengaluru");

        System.out.println(cities);
        // Using Iterator ->
        // Iterator it = cities.iterator();
        // while (it.hasNext()) {
        //     System.out.println(it.next());

        // }

        // Using Enhanced For loop ->
        // for (String city : cities) {
        //     System.out.println(it.next());
        // }

        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Delhi");
        lhs.add("Mumbai");
        lhs.add("Noida");
        lhs.add("Bengaluru");

        System.out.println(lhs);

        TreeSet<String> ts = new TreeSet<>();
        ts.add("Delhi");
        ts.add("Mumbai");
        ts.add("Noida");
        ts.add("Bengaluru");
        System.out.println(ts);

    }
}
