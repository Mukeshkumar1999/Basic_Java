package Leetcode;
import java.util.*;
public class NumberOfValidSubArray {

    // pepcoding Questions..
    // Brute force approach...
    public static boolean isCheck(ArrayList<Integer> ans){

        if(ans.size() == 1){
            return true;
        }
        for(int idx = 1; idx < ans.size(); idx++){
                if(ans.get(0) > ans.get(idx))return false;
        }
        return true;
    }
    public static void countValidSubarray(int[] arr){
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        int count = 0;
        for(int st = 0; st < arr.length; st++){
            for(int end = st; end < arr.length; end++){
                ArrayList<Integer> ans = new ArrayList<>();
                for(int idx = st; idx <= end; idx++){
                    ans.add(arr[idx]);
                }
                res.add(ans);
            }

        }
//        for(ArrayList<Integer> idx : res){
//            System.out.println(idx + ",");
//        }
         for(int idx = 0; idx < res.size(); idx++){
             if(isCheck(res.get(idx)) == true){
                 count++;
             }
         }
         System.out.println(count);
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int idx = 0; idx < n; idx++)arr[idx] = scn.nextInt();
//        for(int idx : arr)System.out.print(idx + " ");
        countValidSubarray(arr);
    }
}
