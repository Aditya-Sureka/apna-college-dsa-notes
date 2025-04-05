package ArrayList;

import java.util.ArrayList;

public class Monotonic {

    // Brute Force Approach - O(n ^ 2) ->
    // public static boolean MonotonicArraylist(ArrayList<Integer> nums) {
    // for (int i = 0; i < nums.size(); i++) {
    // for (int j = i + 1; j < nums.size(); j++) {
    // if (nums.get(i) == nums.get(j)) {
    // return true;
    // }
    // }
    // }
    // return false;
    // }

    // 2 Pointer approach - O(N)
    public static boolean MonotonicArraylist(ArrayList<Integer> nums) {
        boolean inc = true;
        boolean dec = true;
        for (int i = 0; i < nums.size() - 1; i++) {
            if (nums.get(i) > nums.get(i + 1))
                inc = false;
            if (nums.get(i) < nums.get(i + 1))
                dec = false;
        }
        return inc || dec;
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(1);
        nums.add(2);
        nums.add(2);

        System.out.println(MonotonicArraylist(nums));
    }
}
