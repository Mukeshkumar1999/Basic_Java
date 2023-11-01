package Leetcode;
import java.util.*;
public class subSetCountDivisibleByM {
    public static int subSetCount(int[] arr ,int m){
        int count = 0;
        for(int idx = 0; idx < arr.length; idx++){
            int sum = 0;
            for(int jdx = idx; jdx < arr.length; jdx++){
                sum += arr[jdx];
                if(sum % m == 0){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[] arr = new int[n];
        for(int idx = 0; idx < n; idx++){
            arr[idx] = scn.nextInt();
        }
        System.out.println(subSetCount(arr, m));
    }
}
