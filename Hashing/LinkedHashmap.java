package Hashing;

import java.util.*;

public class LinkedHashmap {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("India", 100);
        lhm.put("China", 150);
        lhm.put("US", 50);

        // TreeMap ->
        TreeMap<String, Integer> tm = new TreeMap<>();
        tm.put("India", 100); // Sorting done on basis on alphabetical order
        tm.put("China", 150);
        tm.put("US", 50);

        System.out.println(lhm);
        System.out.println(tm);

    }
}
