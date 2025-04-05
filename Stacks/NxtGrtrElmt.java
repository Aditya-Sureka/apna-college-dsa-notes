package Stacks;

import java.util.*;

//4 Variations of this problem = next Greater Right, next Greater Left, next Smaller Right, next Smaller Right

public class NxtGrtrElmt {
    public static void main(String[] args) {
        int arr[] = { 6, 8, 0, 1, 3 };
        Stack<Integer> s = new Stack<>();
        int nextGenerator[] = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) { // Reverse this for loop from 0 to n if next greater left
            // Step 1 - While Stack is not empty and top element in stack is smaller than
            // equal to array's element

            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) { // change this condition if its next Smaller Right
                s.pop();
            }
            // In the case of next smaller left u need to reverse the for loop as well as
            // change this while loop condition

            // Step 2 - If my Stack is Empty then nextGenerator = -1 else put that value in
            // stack
            if (s.isEmpty()) {
                nextGenerator[i] = -1;

            } else {
                nextGenerator[i] = arr[s.peek()];
            }

            // Step 3- Push element in Stack
            s.push(i);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(nextGenerator[i] + " ");
        }
        System.out.println();
    }
}
