package DP;

import java.util.*;

public class ClimbingStairs {
    // Memoization - O(n) || Recursion - O(2 ^ n) = 10 ^5
    public static int countWays(int n, int ways[]) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }
        if (ways[n] != -1) {
            return ways[n];
        }
        ways[n] = countWays(n - 1, ways) + countWays(n - 2, ways);
        return ways[n];
    }

    public static int countWaysTab(int n) {
        int dp[] = new int[n + 1];
        dp[0] = 1; // Base case 

        //tabulation loop
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                dp[i] = dp[i - 1] + 0;
            } else {
                dp[i] = dp[i - 1] + dp[i - 2];
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 5; // n = 3 has 3 WAYS & n = 4 has 4 WAYS, SO TOTAL = 5 + 3 = 8 WAYS
        int ways[] = new int[n + 1]; // calculating for 0 TO n so [n + 1]
        Arrays.fill(ways, -1); // [-1, -1, -1]
        System.out.println(countWays(n, ways));
        System.out.println(countWaysTab(n));
    }
}
