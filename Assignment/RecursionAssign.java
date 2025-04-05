package Assignment;

public class RecursionAssign {
    public static void allOccurences(int arr[], int key, int i) {

        // Base case
        if (i == arr.length) {
            return;
        }
        // kaam
        if (arr[i] == key) {
            System.out.print(i + " ");
        }
        allOccurences(arr, key, i + 1);
    }

    // Print digits of given string ->
    static String digits[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

    public static void printDigits(int number) {
        if (number == 0) {
            return;
        }

        int lastDigit = number % 10; // extracts last digit
        printDigits(number / 10); // Extracts quotient -> 123,12,1
        System.out.print(digits[lastDigit] + " ");
    }

    // Length of a String ->
    public static int length(String str) {
        // Base case
        if (str.length() == 0) {
            return 0;
        }
        // Kaam
        return length(str.substring(1)) + 1; // substring start with index 1, reduces size of recursive iteration
        // apna college -> pna college -> na college -> a college and so on...
    }

    // Count of substring start & end with same char Problem ->
    public static int countSubstrs(String str, int i, int j, int n) {
        if (n == 1) {
            return 1;
        }
        if (n <= 0) {
            return 0;
        }

        int res = countSubstrs(str, i + 1, j, n - 1) +
                countSubstrs(str, i, j - 1, n - 1) -
                countSubstrs(str, i + 1, j - 1, n - 2);

        if (str.charAt(i) == str.charAt(j)) {
            res++;
        }
        return res;
    }

    public static void main(String[] args) {
        // int arr[] = { 3, 2, 4, 5, 6, 2, 7, 2, 2 };
        // int key = 2;
        // allOccurences(arr, key, 0);
        // System.out.println();
        // printDigits(1234);
        // System.out.println();
        // String str = "apna college";
        // System.out.println(length(str));
        String str = "abcab";
        int n = str.length();
        System.out.print(countSubstrs(str, 0, n - 1, n));
    }
}
