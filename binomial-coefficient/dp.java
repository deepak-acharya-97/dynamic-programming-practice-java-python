import java.util.*;

public class dp {
    public static int binomialCofficient(int n, int k) {
        int[][] C = new int[n + 1][k + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= Math.min(i, k); j++) {
                if (j == 0 || j == i) {
                    C[i][j] = 1;
                } else {
                    C[i][j] = C[i - 1][j - 1] + C[i - 1][j];
                }
            }
        }
        return C[n][k];
    }

    public static void main(String[] args) {
        int n = 5, k = 2;
        System.out.printf("Value of C(%d, %d) is %d ", n, k, binomialCofficient(n, k));
    }
}