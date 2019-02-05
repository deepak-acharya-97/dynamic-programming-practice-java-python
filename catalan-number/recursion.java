// https://www.geeksforgeeks.org/program-nth-catalan-number/

// Catalan numbers are a sequence of natural numbers that occurs in many
// interesting counting problems like following.
// 1) Count the number of expressions containing n pairs of parentheses which
// are correctly matched. For n = 3, possible expressions are ((())), ()(()),
// ()()(), (())(), (()()).

// 2) Count the number of possible Binary Search Trees with n keys (See this)

// 3) Count the number of full binary trees (A rooted binary tree is full if
// every vertex has either two children or no children) with n+1 leaves.

public class recursion {
    public static int catalan(int n) {
        int res = 0;
        if (n <= 1)
            return 1;
        for (int i = 0; i < n; i++) {
            res += catalan(i) * catalan(n - 1 - i); // C(n+1)=Summation [i=0 to n] C(i)*C(n-i). Therefor C(n) =
                                                    // Summation [i=0 to n] C(i)*C(n-1-i)
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(catalan(9));
    }
}