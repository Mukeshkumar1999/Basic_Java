package Leetcode;
import java.util.*;
public class largesetSubWithOsum {
    public static int longSubArray(int[] arr){
        int sum = 0; int  maxLen = 0;
        for(int st = 0; st < arr.length; st++){
            sum += arr[st];
            for(int end = st + 1; end < arr.length; end++){
                sum += arr[end];
                if(sum == 0){
                    int len = end - st + 1;
                    maxLen = Math.max(maxLen, len);
                }
            }
            sum = 0;
        }
        return maxLen;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int idx = 0; idx < n; idx++){
            arr[idx] = scn.nextInt();
        }
        System.out.println(longSubArray(arr));

    }
}
