package Leetcode;
import java.util.*;

public class subArraySumDivisibleK {
    public static int subSum(int[] arr , int k){
        int count = 0;
        for(int st = 0; st < arr.length; st++){
            for(int end = st; end < arr.length; end++){
                int sum  = 0;
                for(int idx = st ; idx <= end; idx++){
                    sum += arr[idx];

                }
                if(sum % k == 0){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        int[] arr = new int[n];
        for(int idx = 0; idx < n; idx++){
            arr[idx] = scn.nextInt();
        }
        System.out.println(subSum(arr, k));
    }
}
