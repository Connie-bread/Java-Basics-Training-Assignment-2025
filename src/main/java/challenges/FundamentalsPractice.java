package challenges;

/**
 * FundamentalsPractice - small helper methods + main for manual testing.
 * Students will implement the methods below so unit tests can call them.
 */

import java.util.*;

public class FundamentalsPractice {

    // Ex: helper used by unit tests (students implement)
    public static int sum(int[] arr) {
        int s = 0;
        for (int v : arr) s += v;
        return s;
    }

    // Another example: average of doubles
    public static double average(double[] arr) {
        if (arr.length == 0) return 0.0;
        double s = 0;
        for (double v : arr) s += v;
        return s / arr.length;
    }

    // main stays interactive for manual testing (optional)
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("This is a starter file. Implement methods for unit tests.");
        in.close();
    }
}
