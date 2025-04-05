package DP;

public class StringConversion {
    public static int findLCS(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();
        int dp[][] = new int[n + 1][m + 1];

        // Fill the LCS dp table
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[n][m]; // Length of the LCS
    }

    public static void main(String[] args) {
        String str1 = "pear";
        String str2 = "sea";
        int lcsLength = findLCS(str1, str2);
        int deletions = str1.length() - lcsLength;
        int insertions = str2.length() - lcsLength;

        System.out.println("Number of deletions: " + deletions);
        System.out.println("Number of insertions: " + insertions);
    }
}
