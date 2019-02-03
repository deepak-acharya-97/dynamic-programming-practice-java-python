import java.util.*;

public class waystogetsum {
    private static int[] dp;
    private static int maxSize = 30;

    public static void initialize() {
        dp = new int[maxSize];
        Arrays.fill(dp, -1);
    }

    public static int numberOfWays(int sum) {
        if (sum < 0)
            return 0;
        if (sum == 0)
            return 1;
        if (dp[sum] != -1)
            return dp[sum];
        return dp[sum] = numberOfWays(sum - 1) + numberOfWays(sum - 3) + numberOfWays(sum - 5);
    }

    public static void main(String args[]) {
        // Number Of ways to get sum equal to n by using 1, 3 and 5, [Repitition
        // Allowed]
        initialize();
        System.out.println(numberOfWays(6));
    }
}