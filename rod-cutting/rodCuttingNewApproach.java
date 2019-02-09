import java.util.*;

public class rodCuttingNewApproach {
    public static void fill(int[][] dp, int val) {
        for (int i = 0; i < dp.length; i++)
            for (int j = 0; j < dp[0].length; j++)
                dp[i][j] = val;
    }

    public static int rodCutting(int[] val, int len) {
        int[][] rod = new int[val.length + 1][len + 1];
        fill(rod, 0);
        for (int i = 0; i <= val.length; i++) {
            for (int j = 0; j <= len; j++) {
                System.out.println((i) + " " + j + " " + (i - 1) + " " + (j - i));
                if (j == 0 || i == 0) {
                    rod[i][j] = 0;
                } else if (i >= 1 && j - i > 0) {
                    rod[i][j] = Math.max(rod[i - 1][j], val[j - 1] + rod[i][j - i]);
                } else {
                    rod[i][j] = rod[i - 1][j];
                }
            }
        }
        return rod[val.length][len];
    }

    public static void main(String[] args) {
        int arr[] = { 1, 5, 8, 9, 10, 17, 17, 20 };
        System.out.println("Maximum obtainable value = " + rodCutting(arr, 8));
    }
}