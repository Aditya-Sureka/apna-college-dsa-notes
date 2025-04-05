package Assignment;
//2D ARRAYS
public class Arrays {
    public static void main(String[] args) {
        int arr[][] = { { 4, 7, 8 },
                { 8, 8, 7 } };

        int countOf7 = 0;
        for (int i = 0; i < arr.length; i++) { // iterate through each row
            for (int j = 0; j < arr[0].length; j++) { // iterate through each column of same row
                if (arr[i][j] == 7) {
                    countOf7++;
                }
            }
        }
        System.out.println("count of 7 is : " + countOf7);

        // Sum of 2nd row elements problm ->
        int nums[][] = { { 1, 4, 9 }, { 11, 4, 3 }, { 2, 2, 3 } };
        int sum = 0;

        for (int j = 0; j < nums[0].length; j++) {
            sum += nums[1][j];
        }
        System.out.println("sum is : " + sum);

    }
}
