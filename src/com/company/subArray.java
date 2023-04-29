package com.company;
import java.util.*;
public class subArray {
    public static void printSubArray(int[]arr,int k){
        int count = 0;
        for(int start = 0; start < arr.length; start++){
            for(int end = start; end < arr.length; end++){
                int sum = 0;
                for(int idx = start; idx <= end; idx++){
                    sum += arr[idx];
//                    System.out.print(arr[idx]+" ");
                }
                if(sum == k){
                    count++;
                }
//                System.out.println(sum);
//                System.out.println();
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        int[] arr = new int[n];
        for (int idx = 0; idx < n; idx++) {
            arr[idx] = scn.nextInt();
        }
        printSubArray(arr,k);
    }
}
