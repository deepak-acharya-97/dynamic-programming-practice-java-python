import java.util.*;

public class factorialtopdown {
    private int MAX_SIZE = 30;
    private int[] dp;

    public factorialtopdown() {
        dp = new int[MAX_SIZE];
        Arrays.fill(dp, -1);
    }

    public int factorial(int n) {
        if (n == 0)
            return 1;
        if (dp[n] != -1)
            return dp[n];
        dp[n] = n * factorial(n - 1);
        return dp[n];
    }

    public static void main(String[] args) {
        factorialtopdown factorialtopdown = new factorialtopdown();
        System.out.println(factorialtopdown.factorial(5));
    }
}