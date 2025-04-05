package Stacks;

import java.util.*;
// Asked in Companies = Microsoft, Amazon, Samsung, Flipkart, Adobe

public class StocksSpan { // O(n)
    public static void stockSpan(int stocks[], int span[]) {
        Stack<Integer> s = new Stack<>();
        span[0] = 1;
        s.push(0);

        for (int i = 1; i < stocks.length; i++) {
            int currPrice = stocks[i]; // span calculation
            while (!s.isEmpty() && currPrice > stocks[s.peek()]) { // currprice comparison with other prices, also
                                                                   // prevhigh calculation
                s.pop(); // elements smaller than currprice ko remove
            }
            if (s.isEmpty()) {
                span[i] = i + 1; // stack is empty
            } else {
                int prevHigh = s.peek();
                span[i] = i - prevHigh;
            }

            s.push(i);
        }

    }

    public static void main(String[] args) {
        int stocks[] = { 100, 80, 60, 70, 60, 85, 100 };
        int span[] = new int[stocks.length];
        stockSpan(stocks, span);

        for (int i = 0; i < span.length; i++) {
            System.out.println(span[i] + " ");
        }

    }
}
