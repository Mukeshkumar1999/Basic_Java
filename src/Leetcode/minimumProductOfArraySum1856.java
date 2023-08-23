package Leetcode;
import java.util.*;
public class minimumProductOfArraySum1856 {
    public static void subArray(int[] arr){
        int totalans = Integer.MIN_VALUE;
        for(int st = 0; st < arr.length; st++){
            for(int end = st ; end < arr.length; end++){
                int minVal = Integer.MAX_VALUE;
                int sumVal = 0;
               for(int idx = st; idx <= end; idx++){
//                   System.out.print(arr[idx]);
                  minVal = Math.min(minVal, arr[idx]);
                  sumVal += arr[idx];
                  if(idx == end){
                      totalans = Math.max(totalans, (minVal * sumVal));
                  }
               }
               System.out.println();
            }

        }
        System.out.println(totalans);
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int idx = 0; idx < arr.length; idx++)arr[idx] = scn.nextInt();

        subArray(arr);
    }
}
