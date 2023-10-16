package Leetcode;

import java.util.*;

public class SubArrayWithGivenSumGFG {
    public static ArrayList<Integer> GivenSum(int[] arr, int num){
        ArrayList<Integer> li = new ArrayList<>();
        for(int left = 0; left < arr.length; left++){
           int sum = 0;
            for(int right = left; right < arr.length; right++){
                sum += arr[right];
                if(sum == num){
                    li.add(left +1);
                    li.add(right + 1);
                    return li;
                }
            }
        }
//        System.out.print(li);
        if(li.size() == 0) li.add(-1);
        return li;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int s = scn.nextInt();
        int[]arr = new int[n];
        for(int idx = 0; idx < n ;idx++){
            arr[idx] = scn.nextInt();
        }
        ArrayList<Integer> list = GivenSum(arr,s);
        for(int val : list){
            System.out.print(val+" ");
        }
    }
}
