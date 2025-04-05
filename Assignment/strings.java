package Assignment;

import java.util.Arrays;

public class strings {
    public static void main(String[] args) {
        // Finding whether a String is anagram or not problem ->  anagram is same character in both string but different order.
        String str1 = "earth";
        String str2 = "heart";

        // Convert Strings to lowercase.Why? so that we dont have to check separately
        // for lower & uppercase.
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // First check - if the length are the same
        if (str1.length() == str2.length()) {
            // convert strings into char array
            char[] str1charArray = str1.toCharArray();
            char[] str2charArray = str2.toCharArray();
            // sort the char array
            Arrays.sort(str1charArray);
            Arrays.sort(str2charArray);
            // if the sorted char arrays are saame or identical then strings are anagram

            boolean result = Arrays.equals(str1charArray, str2charArray);
            if (result) {
                System.out.println(str1 + " and " + str2 + " are anagram of each other.");
            } else {
                System.out.println(str1 + " and " + str2 + " are not anagram of each other.");
            }
        } else {
            // case when length are not equal
            System.out.println(str1 + " and " + str2 + "are not anagrams of each other.");
        }

    }
}
