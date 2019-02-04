// https://www.geeksforgeeks.org/program-for-nth-fibonacci-number/

// Method 1 ( Use recursion )
// A simple method that is a direct recursive implementation mathematical
// recurrence relation given above.

import java.util.*;

public class recursion {
    public static int nthFibonacci(int n) {
        if (n <= 1)
            return n;
        return nthFibonacci(n - 1) + nthFibonacci(n - 2);
    }

    public static void main(String args[]) {
        System.out.println(nthFibonacci(9));
    }
}