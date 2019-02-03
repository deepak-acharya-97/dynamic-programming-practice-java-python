
// https://www.geeksforgeeks.org/ugly-numbers/
// Method 1 (Simple)
// Loop for all positive integers until ugly number count is smaller than n, if an integer is ugly than increment ugly number count.

// To check if a number is ugly, divide the number by greatest divisible powers of 2, 3 and 5, if the number becomes 1 then it is an ugly number otherwise not.

// For example, let us see how to check for 300 is ugly or not. Greatest divisible power of 2 is 4, after dividing 300 by 4 we get 75. Greatest divisible power of 3 is 3, after dividing 75 by 3 we get 25. Greatest divisible power of 5 is 25, after dividing 25 by 25 we get 1. Since we get 1 finally, 300 is ugly number.

import java.util.*;

public class simplemethod {
    public static int maxDivide(int a, int b) {
        while (a % b == 0)
            a = a / b;
        return a;
    }

    public static boolean isUgly(int num) {
        num = maxDivide(num, 2);
        num = maxDivide(num, 3);
        num = maxDivide(num, 5);
        return num == 1 ? true : false;
    }

    public static int nthUglyNumber(int n) {
        int num = 1, count = 1;
        while (n > count) {
            num++;
            if (isUgly(num))
                count++;
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println(nthUglyNumber(150));
    }
}