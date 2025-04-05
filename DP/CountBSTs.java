package DP;

public class CountBSTs {
    public static int CountBST(int n) {
        int dp[] = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i < n + 1; i++) {
            // Ci -> BST (i nodes) -> dp[i]
            for (int j = 0; j < i; j++) {
                int left = dp[j]; // BSTs possible with 'j' nodes in the left subtree
                int right = dp[i - j - 1];  // BSTs possible with 'i - j - 1' nodes in the right subtree
                dp[i] += left * right;  // Total BSTs for 'i' nodes
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(CountBST(n));
    }
}
