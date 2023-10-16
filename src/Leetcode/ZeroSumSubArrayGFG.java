package Leetcode;
import java.util.*;
public class ZeroSumSubArrayGFG {
    public static int ZeroSum(int[] arr){
        int count = 0;
        for(int idx = 0; idx < arr.length; idx++){
            int sum = 0;
            for(int jdx = idx;  jdx < arr.length; jdx++){
                sum += arr[jdx];
                if(sum == 0){
                    count++;
                }
            }
        }return count;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[]arr = new int[n];
        for(int idx = 0; idx < n ;idx++){
            arr[idx] = scn.nextInt();
        }
        System.out.println(ZeroSum(arr));
    }
}
