package Hashing;

import java.util.*;

public class ItineraryTickets { // O(n)
    public static String getStart(HashMap<String, String> tickets) { // (From, To)
        HashMap<String, String> revMap = new HashMap<>(); //(To, From) 
        // ("Chennai", "Bengaluru") → revMap.put("Bengaluru", "Chennai")

        for (String key : tickets.keySet()) {
            revMap.put(tickets.get(key), key); // (Value, key)
        }

        for (String key : tickets.keySet()) {
            if (!revMap.containsKey(key)) {
                return key; // Starting point
                //The starting city will be the one that does not appear as a destination (To).
                //Traverse through all the keys in the original tickets map and check if the key (origin city) is not present in revMap.
                //If it is missing, it is the starting city.
            }
        }
        return null;
    }

    public static void main(String[] args) {
        HashMap<String, String> tickets = new HashMap<>();
        tickets.put("Chennai", "Bengaluru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");

        String start = getStart(tickets);
        System.out.print(start);
        for (String key : tickets.keySet()) {
            System.out.print(" -> " + tickets.get(start));
            start = tickets.get(start);
        }
        System.out.println();

    }
}
