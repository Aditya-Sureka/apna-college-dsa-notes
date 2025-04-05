package Hashing;

import java.util.*;

public class HashMapBasic {
    public static void main(String[] args) {
        // Create HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // Insert = O(1)
        map.put("India", 100);
        map.put("China", 150);
        map.put("US", 50);
        map.put("Indonesia", 6);
        map.put("Nepal", 5);

        // Iterate
        Set<String> keys = map.keySet();
        System.out.println(keys);

        for (String k : keys) {
            System.out.println("key = " + k + ", value = " + map.get(k));

        }

        // // Get = O(1)
        // int population = map.get("India");
        // System.out.println(population);

        // // ContainsKey = O(1)
        // System.out.println(map.containsKey("India"));

        // // Remove = O(1)
        // System.out.println(map.remove("China"));
        // System.out.println(map);

        // // Size
        // System.out.println(map.size());

    }
}
