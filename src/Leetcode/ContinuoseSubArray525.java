package Leetcode;
import java.util.*;
public class ContinuoseSubArray525 {
    public static int LargerLen(int []arr){
        int maxLen = 0;
        int sum = 0;
        for(int st = 0; st < arr.length; st++){
            for(int end = st; end < arr.length; end++){
                sum += arr[end] == 0 ?-1 : 1;

                if(sum == 0){
                    maxLen = Math.max(maxLen, end - st + 1);
                }
            }
        }
        return maxLen;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] binaryArr = new int[n];
        for(int idx = 0; idx < n; idx++){
            binaryArr[idx] = scn.nextInt();
        }
        System.out.println(LargerLen(binaryArr));
    }
}
