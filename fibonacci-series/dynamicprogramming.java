
// Method 2 ( Use Dynamic Programming )
// We can avoid the repeated work done is the method 1 by storing the Fibonacci
// numbers calculated so far.

import java.util.*;

public class dynamicprogramming {
    public static int nthFibonacci(int n) {
        int f[] = new int[n + 2];
        f[0] = 0;
        f[1] = 1; // base cases
        for (int ind = 2; ind <= n; ind++) {
            f[ind] = f[ind - 1] + f[ind - 2];
        }
        return f[n];
    }

    public static void main(String[] args) {
        System.out.println(nthFibonacci(9));
    }
}