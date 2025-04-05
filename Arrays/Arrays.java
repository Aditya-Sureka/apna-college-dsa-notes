package Arrays;
import java.util.*;

public class Arrays {
    public static void maxSubarraysSum(int numbers[]) {

        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];

        prefix[0] = numbers[0];
        // calculate prefix array
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + numbers[i];
        }

        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];

                if (maxSum < currSum) {
                    maxSum = currSum;
                }

            }

        }
        System.out.println("max sum = " + maxSum);

    }

    public static void kadanes(int numbers[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for (int i = 0; i < numbers.length; i++) {
            cs = cs + numbers[i];
            if (cs < 0) {
                cs = Math.min(cs, ms);
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("our max subaaray sum is : " + ms);
    }

    public static void main(String args[]) {
        int numbers[] = { -2, -3, -4, -1, -2, -1, -5, -3 };
        kadanes(numbers);
    }
}

// Reversing an Array
// public static void reverse(int numbers[]) {
// int first = 0, last = numbers.length - 1;

// while (first < last) {
// int temp = numbers[last];
// numbers[last] = numbers[first];
// numbers[first] = temp;

// first++;
// last--;
// }
// }
// int numbers[] = { 2, 4, 6, 8, 10 };

// reverse(numbers);

// // print the array
// for (int i = 0; i < numbers.length; i++) {
// System.out.print(numbers[i] + " ");
// }
// System.out.println();