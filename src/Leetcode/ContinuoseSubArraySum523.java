package Leetcode;
import java.util.*;
public class ContinuoseSubArraySum523 {
    public static boolean continuose(int[]arr , int k ){
        int MinLen = arr.length;
        if(arr.length < 2)return false;
        for(int idx = 0; idx < arr.length-1; idx++){
            int sum = arr[idx];
            for(int jdx = idx+1; jdx < arr.length; jdx++){
                sum += arr[jdx];
                if(sum % k == 0){
                    MinLen = Math.min(MinLen, jdx - idx +1);
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[] arr = new int[n];
        for(int idx = 0; idx < n; idx++){
            arr[idx] = scn.nextInt();
        }
        System.out.println(continuose(arr, m));
    }
}
