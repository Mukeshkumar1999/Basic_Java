package Leetcode;
import java.util.*;
public class MinimumSubarraySum53 {
    public static int minSum(int[]arr){
        // Kadans algorithm...
        int sum = 0; int MinSum = Integer.MAX_VALUE;

        for(int idx =0; idx < arr.length; idx++){
            sum = Math.min(arr[idx], sum + arr[idx]);
            MinSum = Math.min(MinSum, sum);
        }
        return MinSum;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int idx = 0; idx < n; idx++)arr[idx] = scn.nextInt();

        System.out.println(minSum(arr));
    }
}
