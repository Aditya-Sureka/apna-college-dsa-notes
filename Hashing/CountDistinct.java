package Hashing;

import java.util.*;

// Count Distinct Elemenets ->

public class CountDistinct { // O(n)
    public static void main(String[] args) {
        int num[] = { 4, 3, 2, 5, 6, 7, 3, 4, 2, 1 };
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < num.length; i++) {
            set.add(num[i]);
        }

        System.out.println("ans = " + set.size());
    }
}
