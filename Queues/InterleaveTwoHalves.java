package Queues;

import java.util.*;

public class InterleaveTwoHalves { // O(n)
    public static void interLeave(Queue<Integer> q) {
        Queue<Integer> FirstHalf = new LinkedList<>();
        int size = q.size();

        for (int i = 0; i < size / 2; i++) {
            FirstHalf.add(q.remove()); // First 5 elements will be added in this queue
        }

        while (!FirstHalf.isEmpty()) {
            q.add(FirstHalf.remove()); // Adding those first 5 elements in OG queue
            q.add(q.remove()); // Remaining 5 elements are removed frm OG queue & again added in it from REAR
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);

        interLeave(q);

        // Print Q
        while (!q.isEmpty()) {
            System.out.print(q.remove() + " ");
        }
        System.out.println();
    }
}
