package Leetcode;
import java.util.*;
public class DistributeCandidate575 {
    public static int distribute(int[] arr){
        int len = arr.length /2, count = 1;
        for(int idx = 1; idx < arr.length; idx++){
            if(arr[idx] != arr[idx -1]){
                count++;
            }
        }
        System.out.println(count);
        return  Math.min(len, count);
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int idx = 0; idx < n; idx++){
            arr[idx] = scn.nextInt();
        }
        System.out.println(distribute(arr));
    }
}
