package Greedy;

import java.util.*;

public class ActivitySelection { // IMPORTANT QUESTION
    public static void main(String[] args) {
        int start[] = { 1, 3, 0, 5, 8, 5 };
        int end[] = { 2, 4, 6, 7, 9, 9 };

        // sorting -> if sorted nhi hai only then
        int activities[][] = new int[start.length][3];
        for (int i = 0; i < start.length; i++) {
            activities[i][0] = i; // 0th column
            activities[i][1] = start[i]; // 1st column
            activities[i][2] = end[i]; // 2nd column
        }

        // labda function -> shortform of big fxn , Comparator is an interface for
        // sorting java objects , o[2] = sorting done on 2nd column i.e. end time..
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));

        // end time basis sorting
        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        // 1st Activity
        maxAct = 1;
        ans.add(activities[0][0]);
        int lastEnd = activities[0][2];
        for (int i = 1; i < end.length; i++) {
            if (activities[i][1] >= lastEnd) {
                // activity select
                maxAct++;
                ans.add(activities[i][0]);
                lastEnd = activities[i][2];
            }
        }

        System.out.println("max activities = " + maxAct);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print("A" + ans.get(i) + " ");
        }
        System.out.println();
    }
}
