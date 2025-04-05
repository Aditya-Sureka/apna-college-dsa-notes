package Recursion;
public class RecursionBasics {
    public static void printDec(int n) {
        if (n == 10) {
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        printDec(n + 1);
    }

    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        int fnm1 = fact(n - 1);
        int fn = n * fact(n - 1);
        return fn;
    }

    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        int snm1 = sum(n - 1);
        int sn = n + sum(n - 1);
        return sn;
    }

    // calculate nth term in fibonacci
    public static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int fnm1 = fibonacci(n - 1);
        int fnm2 = fibonacci(n - 2);
        int fn = fnm1 + fnm2;
        return fn;
    }

    public static boolean isSorted(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return isSorted(arr, i + 1);
    }

    public static int firstOccurence(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return firstOccurence(arr, key, i + 1);
    }

    public static int lastOccurence(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        int isFound = lastOccurence(arr, key, i + 1);
        if (isFound == -1 && arr[i] == key) {
            return i;
        }
        return isFound;
    }

    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        // int xnm1 = power(x, n - 1);
        // int xn = x * xnm1;
        // return xn;
        return x * power(x, n - 1);

    }

    // More optimized version of power problem ->
    public static int optimizedPower(int a, int n) {
        if (n == 0) {
            return 1;
        }
        int halfPower = optimizedPower(a, n / 2);
        int halfPowerSq = halfPower * halfPower;

        // n is odd
        if (n % 2 != 0) {
            halfPowerSq = a * halfPowerSq;
        }
        return halfPowerSq;
    }

    // Tiling problem ->
    public static int tilingProblem(int n) { // 2 * n
        // base case
        if (n == 0 || n == 1) {
            return 1;
        }
        // Vertical choice
        // int fnm1 = tilingProblem(n - 1); // Vertical tiles

        // // horizontal choice
        // int fnm2 = tilingProblem(n - 2);// horizontal tiles

        // int totWays = fnm1 + fnm2;
        // return totWays;
        return tilingProblem(n - 1) + tilingProblem(n - 2);
    }

    // Remove duplicates in string
    public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean map[]) {
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        if (map[currChar - 'a'] == true) {
            // currChar contains duplicate
            removeDuplicates(str, idx + 1, newStr, map);
        } else {
            map[currChar - 'a'] = true;
            removeDuplicates(str, idx + 1, newStr.append(currChar), map);
        }

    }

    // Friends Pairing problem ->
    public static int friendsPairing(int n) {
        // Base case
        if (n == 1 || n == 2) {
            return n;
        }
        // this way is also applicable, below return statement is just compact versions
        // int fnm1 = friendsPairing(n - 1); // Single
        // int fnm2 = friendsPairing(n - 2); // Paired

        // int totWays = friendsPairing(n - 1) + (n - 1) * friendsPairing(n - 2);
        // return totWays;
        return friendsPairing(n - 1) + (n - 1) * friendsPairing(n - 2);
    }

    // Binary String Problem ->
    public static void printBinaryString(int n, int lastPlace, String str) {
        // Base case
        if (n == 0) {
            System.out.println(str);
            return;
        }
        // kaam
        printBinaryString(n - 1, 0, str + "0");

        if (lastPlace == 0) {
            printBinaryString(n - 1, 1, str + "1");
        }
    }

    public static void main(String[] args) {
        printBinaryString(3, 0, "");
    }
}
