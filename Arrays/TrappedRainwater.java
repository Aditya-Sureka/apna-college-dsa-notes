package Arrays;
public class TrappedRainwater {
    public static int trappedRainwater(int height[]) {
        int n = height.length;
        // calculate left max boundary = auxillary array
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);

        }
        System.out.println("left ->");
        for (int i = 0; i < n; i++)
            System.out.print(leftMax[i] + ", ");

        System.out.println("");

        // calculate right max boundary = auxillary array
        System.out.println("right ->");
        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }
        for (int i = 0; i < n; i++)
            System.out.print(rightMax[i] + ", ");

        System.out.println("");

        int trappedwater = 0;
        // loop
        System.out.println("water->");
        for (int i = 0; i < n; i++) {
            // waterlevel = min(leftmax bound, rightmax bound)
            int waterlevel = Math.min(leftMax[i], rightMax[i]);

            // trapped water = waterlevel - height[i]
            trappedwater += waterlevel - height[i];
            System.out.print(waterlevel + ", ");
        }
        return trappedwater;
    }

    public static void main(String args[]) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        for (int i = 0; i < height.length; i++)
            System.out.print(height[i] + ", ");
        System.out.println("");
        System.out.println("Total water is = " + trappedRainwater(height));
    }
}
