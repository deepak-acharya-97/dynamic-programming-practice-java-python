
//https://www.geeksforgeeks.org/binomial-coefficient-dp-9/

import java.util.*;

public class recursion {
    public static int binomialCofficient(int n,int k){
        if(k==0 || k==n) 
            return 1; 
        return binomialCofficient(n-1,k-1)+binomialCofficient(n-1,k);
    }
    
    public static void main(String[] args) {
        int n = 5, k = 2; 
        System.out.printf("Value of C(%d, %d) is %d ",n, k, binomialCofficient(n, k));
    }
}