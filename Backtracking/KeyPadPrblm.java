// package Backtracking;

// public class KeyPadPrblm {
//     final static char[][] digits = { {}, {}, { 'a', 'b', 'c' }, { 'd', 'e', 'f' }, { 'g', 'h', 'i' }, { 'j', 'k', 'l' },
//             { 'm', 'n', 'o' }, { 'p', 'q', 'r', 's' }, { 't', 'u', 'v' }, { 'w', 'x', 'y', 'z' } };

//     public static void letterCombinations(String D) {
//         int len = D.length();
//         if (len == 0) {
//             System.out.println("");
//             return;
//         }
//         bfs(0, len, new StringBuilder(), D);
//     }

//     public static void bfs(int pos, int len, StringBuilder sb, String D) {
//         if (pos == len) {
//             System.out.println(sb.toString());
//         } else {
//             char[] letters = digits[Character.getNumericValue(D.charAt(pos))];
//             for (int i = 0; i < letters.length; i++)
//                 bfs(pos + 1, len, new StringBuilder(sb).append(letters[i]), D);
//         }
//     }

//     public static void main(String[] args) {
//         letterCombinations("123");
//     }
// }
//TIME COMPLEXITY -> THETA(3 ^ N) AVG CASE, SPACE COMPLEXITY -> 0(N)

//ANOTHER APPROACH -> SAME ANSWER ->

package Backtracking;

public class KeyPadPrblm {

    public static void combinations(String digits, String letters, int idx, String[] keypad) {
        if (idx == digits.length()) {
            System.out.print(letters + " ");
            return;
        }
        char digit = digits.charAt(idx);

        for (char letter : keypad[digit - '0'].toCharArray()) {
            combinations(digits, letters + letter, idx + 1, keypad);
        }
    }

    public static void main(String[] args) {
        String digits = "829";
        String[] keypad = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

        combinations(digits, "", 0, keypad);
    }
}
