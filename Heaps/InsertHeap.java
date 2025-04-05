package Heaps;

import java.security.PublicKey;
import java.util.*;

public class InsertHeap {
    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) { // O(log n)
            // add at last idx
            arr.add(data);

            int x = arr.size() - 1; // x -> child idx
            int par = (x - 1) / 2; // par -> parent idx

            while (arr.get(x) < arr.get(par)) { // child < par  // O(log n)
                // swap
                int temp = arr.get(x); // temp me child ki value
                arr.set(x, arr.get(par)); // child me parent ki value
                arr.set(par, temp); // parent me child ki value

                x = par;
                par = (x - 1) / 2;

            }
        }

        public int peek() { // Peek Function
            return arr.get(0); // minimum element will always be root which has idx 0
        }

        private void heapify(int i) { // Fixes its heap
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            int minIdx = i; // Root

            if (left < arr.size() && arr.get(minIdx) > arr.get(left)) {
                minIdx = left;
            }
            if (right < arr.size() && arr.get(minIdx) > arr.get(right)) {
                minIdx = right;
            }

            if (minIdx != i) { // As minIdx value changes, Swapping is required
                // swap
                int temp = arr.get(i);
                arr.set(i, arr.get(minIdx));
                arr.set(minIdx, temp); 

                heapify(minIdx);
            }
        }

        public int remove() {
            int data = arr.get(0);

            //step 1 = swap first & last
            int temp = arr.get(0); // temp me first ki value
            arr.set(0, arr.get(arr.size() - 1)); // first me last ki value
            arr.set(arr.size() - 1, temp); // last me first ki value

            //step 2 = delete last
            arr.remove(arr.size() - 1);

            //step 3 = Heapify
            heapify(0);
            return data;
        }

        public boolean isEmpty() {
            return arr.size() == 0;
        }
    }

    public static void main(String[] args) {
        Heap h = new Heap();
        h.add(3);
        h.add(4);
        h.add(1);
        h.add(5);

        while (!h.isEmpty()) {
            System.out.println(h.peek());
            h.remove();

        }

    }
}
