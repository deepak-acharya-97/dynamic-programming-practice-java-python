import java.util.*;

public class dp {
    public static int cutRod(int[] price,int n){
        int val[]=new int[n+1],maxValue;
        val[0]=0;
        for(int i=1; i<=n; i++){
            maxValue=Integer.MIN_VALUE;
            for(int j=0; j<i; j++){
                maxValue=Math.max(maxValue, price[j]+val[i-j-1]);
            }
            val[i]=maxValue;
        }
        return val[n];
    }

    public static void main(String[] args) {
        int arr[] = {1, 5, 8, 9, 10, 17, 17, 20};
        System.out.println("Maximum obtainable value = "+cutRod(arr,arr.length));
    }
}

