package DP;
// 0-1 Knapsack ->

public class Knapsack {
    public static int knapsack(int val[], int wt[], int W, int n, int dp[][]) {
        if (W == 0 || n == 0) { // Capacity or no. of iteam = 0
            return 0;
        }
        // Memoization starts-> 'M' FOR MEMOIZATION LINES
        if (dp[n][W] != -1) {
            return dp[n][W];
        }
        if (wt[n - 1] <= W) { // Valid
            // include
            int ans1 = val[n - 1] + knapsack(val, wt, W - wt[n - 1], n - 1, dp);
            // exclude
            int ans2 = knapsack(val, wt, W, n - 1, dp);
            // 'M'
            dp[n][W] = Math.max(ans1, ans2); // Max Profit 
            return dp[n][W];
        } else { // not valid
            // 'M'
            dp[n][W] = knapsack(val, wt, W, n - 1, dp);
            return dp[n][W];
        }
    }

    public static void print(int dp[][]) {
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static int knapSackTab(int val[], int wt[], int W) {
        int n = val.length;
        int dp[][] = new int[n + 1][W + 1];
        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = 0; // 0th row
        }
        for (int j = 0; j < dp[0].length; j++) {
            dp[0][j] = 0; // 0th col
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < W + 1; j++) {
                int v = val[i - 1]; // ith item val
                int w = wt[i - 1]; // ith item wt
                if (w <= j) { // valid
                    int incProfit = v + dp[i - 1][j - w];
                    int excProfit = dp[i - 1][j];
                    dp[i][j] = Math.max(incProfit, excProfit);
                } else { // invalid
                    int excProfit = dp[i - 1][j];
                    dp[i][j] = excProfit;
                }
            }
        }
        print(dp);
        return dp[n][W];
    }

    public static void main(String[] args) {
        int val[] = { 15, 14, 10, 45, 30 };
        int wt[] = { 2, 5, 1, 3, 4 };
        int W = 7;
        // 'M'
        int dp[][] = new int[val.length + 1][W + 1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }
        // System.out.println(knapsack(val, wt, W, val.length, dp));
        System.out.println(knapSackTab(val, wt, W));
    }
}
