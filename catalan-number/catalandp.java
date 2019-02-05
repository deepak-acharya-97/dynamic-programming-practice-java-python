
// Dynamic Programming Solution
// We can observe that the above recursive implementation does a lot of repeated
// work (we can the same by drawing recursion tree). Since there are overlapping
// subproblems, we can use dynamic programming for this. Following is a Dynamic
// programming based implementation .

import java.util.*;

public class catalandp {
    public static int catalandparroach(int n) {
        int[] catalan = new int[n + 1];
        Arrays.fill(catalan, 0);
        catalan[0] = 1;
        catalan[1] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                catalan[i] += catalan[j] * catalan[i - 1 - j];
            }
        }
        return catalan[n];
    }

    public static void main(String[] args) {
        System.out.println(catalandparroach(9));
    }
}