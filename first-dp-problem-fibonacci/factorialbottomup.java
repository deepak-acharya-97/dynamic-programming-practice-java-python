import java.util.*;

public class factorialbottomup {
    private static int MAX_VALUE = 30;

    public static int factorial(int n) {
        int[] d = new int[MAX_VALUE];
        d[0] = 1;
        for (int ind = 1; ind <= n; ind++) {
            d[ind] = d[ind - 1] * ind;
        }
        return d[n];
    }

    public static <T> void print(T message) {
        System.out.println(message);
    }

    public static <T> void printLn(T message) {
        System.out.println(message);
    }

    public static void main(String args[]) {
        int number = 5;
        print(factorial(number));
    }
}