package ArrayList;

import java.util.*;

public class BeautifulArraylist {
    // public static ArrayList<Integer> beautifuLArray(int n) {
    // ArrayList<Integer> ans = new ArrayList<>();
    // ans.add(1);

    // for (int i = 2; i <= n; i++) {
    // ArrayList<Integer> temp = new ArrayList<>();
    // for (Integer e : ans) {
    // if (2 * e <= n)
    // temp.add(e * 2);
    // }
    // for (Integer e : ans) {
    // if (2 * e - 1 <= n)
    // temp.add(e * 2 - 1);
    // }
    // ans = temp;
    // }
    // return ans;
    // }

    public static ArrayList<Integer> beautifulArray(int n) {
        ArrayList<Integer> res = new ArrayList<>();
        divideConque(1, 1, res, n);
        return res;
    }

    private static void divideConque(int start, int increment, ArrayList<Integer> res, int n) {
        if (start + increment > n) {
            res.add(start);
            return;
        }
        divideConque(start, 2 * increment, res, n);
        divideConque(start + increment, 2 * increment, res, n);
    }

    // public static ArrayList<Integer> beautifulArray(int n) {
    // ArrayList<Integer> res = new ArrayList<>();
    // divideConquer(1, 1, res, n);
    // return res;
    // }

    // private static void divideConquer(int str, int inc, ArrayList<Integer> res,
    // int n) {
    // if (str + inc > n) {
    // res.add(str);
    // return;
    // }

    // divideConquer(str, 2 * inc, res, n);
    // divideConquer(str + inc, 2 * inc, res, n);
    // }

    public static void main(String[] args) {
        System.out.println(beautifulArray(5));
    }
}
