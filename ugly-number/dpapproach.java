// https://www.geeksforgeeks.org/ugly-numbers/
// Method 2 (Use Dynamic Programming)
// Here is a time efficient solution with O(n) extra space. The ugly-number
// sequence is 1, 2, 3, 4, 5, 6, 8, 9, 10, 12, 15, …
// because every number can only be divided by 2, 3, 5, one way to look at the
// sequence is to split the sequence to three groups as below:
// (1) 1×2, 2×2, 3×2, 4×2, 5×2, …
// (2) 1×3, 2×3, 3×3, 4×3, 5×3, …
// (3) 1×5, 2×5, 3×5, 4×5, 5×5, …

// We can find that every subsequence is the ugly-sequence itself (1, 2, 3, 4,
// 5, …) multiply 2, 3, 5. Then we use similar merge method as merge sort, to
// get every ugly number from the three subsequence. Every step we choose the
// smallest one, and move one step after.

import java.util.*;
import java.*;

public class dpapproach {
    public static int minimumOfThreeNumbers(int num1, int num2, int num3) {
        return Math.min(num1, Math.min(num2, num3));
    }

    public static int nthUglyNumber(int n) {
        int[] ugly = new int[n];
        int i2 = 0, i3 = 0, i5 = 0, nextMultipleOf2 = 2, nextMultipleOf3 = 3, nextMultipleOf5 = 5, nextUglyNumber = 1;
        for (int ind = 1; ind < n; ind++) {
            nextUglyNumber = minimumOfThreeNumbers(nextMultipleOf2, nextMultipleOf3, nextMultipleOf5);
            ugly[ind] = nextUglyNumber;
            if (nextUglyNumber == nextMultipleOf2) {
                i2++;
                nextMultipleOf2 = ugly[i2] * 2;
            }
            if (nextUglyNumber == nextMultipleOf3) {
                i3++;
                nextMultipleOf3 = ugly[i3] * 3;
            }
            if (nextUglyNumber == nextMultipleOf5) {
                i5++;
                nextMultipleOf5 = ugly[i5] * 5;
            }
        }
        return nextUglyNumber;
    }

    public static void main(String[] args) {
        System.out.println(nthUglyNumber(150));
    }
}