package Leetcode;
import java.util.*;
public class countValidSubarrayOptimize {
    // Both time and space complicity O(N)...
    public static int countValidSubarray(int[] arr){
        int count = 0;
        Stack<Integer> stk = new Stack<>();
        for(int idx = arr.length - 1; idx >= 0; idx--){
            while(stk.size() > 0 && arr[stk.peek()] >= arr[idx]){
                stk.pop();
            }
            int ans = stk.size() > 0 ? stk.peek() : arr.length;
            count += ans - idx;
            stk.push(idx);
        }
        return count;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int idx = 0; idx < n; idx++)arr[idx] = scn.nextInt();
//        for(int idx : arr)System.out.print(idx + " ");
       System.out.println(countValidSubarray(arr));
    }
}
