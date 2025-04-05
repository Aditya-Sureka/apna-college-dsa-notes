package Assignment;

public class BinarySearch {
    public static int search(int nums[], int target) {
        int n = nums.length;
        // min will have index of minimum element of nums
        int min = minSearch(nums);
        // find in sorted left
        if (nums[min] <= target && target <= nums[n - 1]) {
            return search(nums, min, n - 1, target); // rangw will be decided from here
        }
        // find in sorted right
        else {
            return search(nums, 0, min, target);
        }
    }

    // binary search to find target in left to right boundary
    // helper function
    public static int search(int nums[], int left, int right, int target) {
        int l = left;
        int r = right;

        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }

    // smallest element index

    public static int minSearch(int nums[]) { // 0, 1, 2, 4, 5, 6, 7
        int n = nums.length; // 7
        int left = 0;
        int right = n - 1; // right = 6
        while (left < right) { // 0 < 6
            int mid = left + (right - left) / 2; // 0 + 6/2 = 3 -> mid
            if (mid > 0 && nums[mid - 1] > nums[mid]) {
                return mid;
            } else if (nums[left] <= nums[mid] && nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;

    }

    // Another Approach

    // public static int binarySearch(int[] nums, int low, int high, int target) {
    // if (low > high)
    // return -1; // Base case.

    // // Perform the steps:
    // int mid = (low + high) / 2;
    // if (nums[mid] == target)
    // return mid;
    // else if (target > nums[mid])
    // return binarySearch(nums, mid + 1, high, target);
    // return binarySearch(nums, low, mid - 1, target);
    // }

    // public static int search(int[] nums, int target) {
    // return binarySearch(nums, 0, nums.length - 1, target);
    // }

    public static void main(String args[]) {
        int nums[] = { 0, 1, 2, 4, 5, 6, 7 };

        // System.out.println(minSearch(nums));
        System.out.println(search(nums, 0, 7, 4));
        // int[] a = {0, 1, 2, 4, 5, 6, 7};
        // int target = 8;
        // int ind = search(a, target);
        // if (ind == -1)
        // System.out.println("The target is not present.");
        // else
        // System.out.println("The target is at index: " + ind);
    }
}
