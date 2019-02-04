
// Method 4 ( Using power of the matrix {{1,1},{1,0}} )
// This another O(n) which relies on the fact that if we n times multiply the
// matrix M = {{1,1},{1,0}} to itself (in other words calculate power(M, n )),
// then we get the (n+1)th Fibonacci number as the element at row and column (0,
// 0) in the resultant matrix.

import java.util.*;

public class powerofmatrix {
    public static int fib(int n) {
        int F[][] = new int[][] { { 1, 1 }, { 1, 0 } };
        if (n == 0)
            return 0;
        power(F, n - 1);
        return F[0][0];
    }

    public static void multiply(int[][] F, int[][] M) {
        int FxM00 = F[0][0] * M[0][0] + F[0][1] * M[1][0];
        int FxM01 = F[0][0] * M[0][1] + F[0][1] * M[1][1];
        int FxM10 = F[1][0] * M[0][0] + F[1][1] * M[1][0];
        int FxM11 = F[1][0] * M[0][1] + F[1][1] * M[1][1];
        F[0][0] = FxM00;
        F[0][1] = FxM01;
        F[1][0] = FxM10;
        F[1][1] = FxM11;
    }

    public static void power(int F[][], int n) {
        int[][] M = new int[][] { { 1, 1 }, { 1, 0 } };
        for (int i = 2; i <= n; i++) {
            multiply(F, M);
        }
    }

    public static void main(String[] args) {
        System.out.println(fib(9));
    }
}