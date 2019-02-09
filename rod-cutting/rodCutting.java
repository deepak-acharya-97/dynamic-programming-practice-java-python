import java.util.*;

public class rodCutting {

    public static void main(String[] args) {
        int arr[] = { 1, 5, 8, 9, 10, 17, 17, 20 };
        int n = arr.length;
        int dp[][] = new int[100][100];
        for (int i = 0; i <= n; i++)
            for (int j = 0; j <= n; j++)
                dp[i][j] = -1;
        int result = CutRod(arr, 8, 8, dp);
        System.out.println("Number of ways are " + result);
    }

    public static int CutRod(int val[], int n, int l, int dp[][]) {
        System.out.println("N = " + n + " L = " + l);
        if (dp[n][l] != -1)
            return dp[n][l];
        if (n == 0 || l <= 0)
            return 0;
        dp[n][l] = Math.max(CutRod(val, l - n, l - n, dp) + val[n - 1], CutRod(val, n - 1, l, dp));
        return dp[n][l];
    }
}