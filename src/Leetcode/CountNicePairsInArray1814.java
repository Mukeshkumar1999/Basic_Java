package Leetcode;
import java.util.*;
public class CountNicePairsInArray1814 {
    public static int reverse(int num){
        int ans = 0;
        while(num != 0){
            int val = num % 10;
            ans = (ans * 10) + val;
            num = num /10;
        }
        return ans;
    }
    public static int CountGoodPairs(int[] arr){
        int count = 0;
        for(int idx = 0; idx < arr.length-1; idx++){
            for(int jdx = idx +1; jdx < arr.length; jdx++){
                if(arr[idx] + reverse(arr[jdx]) == arr[jdx] + reverse(arr[idx])){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int idx = 0; idx < n; idx++){
            arr[idx] = scn.nextInt();
        }
        System.out.println(CountGoodPairs(arr));
    }
}
