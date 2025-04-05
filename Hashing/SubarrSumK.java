package Hashing;

import java.util.*;

// Subarray Sum equal to K ->

public class SubarrSumK {
    public static void main(String[] args) { // O(n)
        int arr[] = { 10, 2, -2, -20, 10 };
        int k = -10;

        HashMap<Integer, Integer> map = new HashMap<>();
        //(sum, count)
        map.put(0, 1); // If my Subarray sum becomes equal to K

        int sum = 0;
        int ans = 0;

        for (int j = 0; j < arr.length; j++) {
            sum += arr[j]; // sum(j)
            if (map.containsKey(sum - k)) { // sum(j) - k
                ans += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1); // if exist then count is increased by 1 or if not exist,then 0 
        }
        System.out.println(ans);

    }
}
