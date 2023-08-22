package Leetcode;
import java.io.*;
import java.util.*;
public class subArrayMin {
    // leetcode 907.
    // Brute Force Approach
    // time complicity  O(N^3).. and space O(N);

    public static int MinValue(List<Integer> lst){
        int Min = Integer.MAX_VALUE;
        for(int idx = 0; idx < lst.size(); idx++){
            Min = Math.min(Min,lst.get(idx));
        }
        return Min;
    }
    public static void minmumArray(List<List<Integer>> res){
        int sum = 0;
        for(int idx = 0; idx < res.size(); idx++){
            sum += MinValue(res.get(idx));
        }
        System.out.println(sum);
    }
    public static void subArray(int[] arr){
        List<List<Integer>> res = new ArrayList<>();
        for(int idx =0 ; idx < arr.length; idx++){

            for(int jdx = idx; jdx < arr.length; jdx++){
                List<Integer> list = new ArrayList<>();
                for(int kdx = idx; kdx <= jdx; kdx++){
//                    System.out.print("["+arr[kdx] + "]");
                    list.add(arr[kdx]);
                }
                System.out.println();
                res.add(list);
            }
        }
        System.out.println(res);

        minmumArray(res);

    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int idx = 0; idx < n; idx++) arr[idx] = scn.nextInt();

        subArray(arr);
    }
}
