
// Method 3 ( Space Optimized Method 2 )
// We can optimize the space used in method 2 by storing the previous two
// numbers only because that is all we need to get the next Fibonacci number in
// series.

import java.util.*;

public class spaceoptimized {
    public static int fibo(int n) {
        int n1 = 0, n2 = 1, n3;
        if (n == 0)
            return n1;
        for (int i = 2; i <= n; i++) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
        return n2;
    }

    public static void main(String[] args) {
        System.out.println(fibo(9));
    }
}