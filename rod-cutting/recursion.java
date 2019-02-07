// We can get the best price by making a cut at different positions and
// comparing the values obtained after a cut. We can recursively call the same
// function for a piece obtained after a cut.

// Let cutRod(n) be the required (best possible price) value for a rod of length
// n. cutRod(n) can be written as following.


import java.util.*;

public class recursion {
    public static int cutRod(int[] price,int n){
        if(n<=0) return 0;
        int maxValue=Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            maxValue=Math.max(maxValue, price[i]+cutRod(price,n-1-i));
        }
        return maxValue;
    }

    public static void main(String[] args) {
        int arr[] = {1, 5, 8, 9, 10, 17, 17, 20};
        System.out.println("Maximum obtainable value = "+cutRod(arr,arr.length));
    }
}

