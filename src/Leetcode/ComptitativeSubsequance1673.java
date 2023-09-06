package Leetcode;
import java.util.*;
public class ComptitativeSubsequance1673 {
    public static int[] subsequance(int[] arr, int k){
        int[] ans = new int[k];

        for(int idx = 0; idx < arr.length - k; idx++){
               if(arr[idx] == arr[idx + 1])continue;
            for(int jdx = idx+1; jdx < arr.length - k + 1; jdx++){
                if(arr[jdx] < arr[idx])ans[idx] = arr[jdx];

            }
            ans[idx] = arr[idx];
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        int[] arr = new int[n];
        for(int idx = 0; idx < n; idx++) arr[idx] = scn.nextInt();

        int[] res = subsequance(arr, k);
        for(int idx = 0; idx < res.length; idx++){
            System.out.print(res[idx] + " ");
        }
    }
}
