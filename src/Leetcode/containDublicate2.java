package Leetcode;
import java.util.*;
public class containDublicate2 {
    public static boolean Dublicate(int[] arr, int k){
        for(int idx = 0; idx < arr.length; idx++){
            for(int jdx = idx + 1; jdx < arr.length; jdx++){
                if(arr[idx] == arr[jdx] && (Math.abs(idx - jdx)) <= k){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        int []arr = new int[n];
        for(int idx = 0; idx < n;idx++){
            arr[idx]=  scn.nextInt();
        }
        System.out.println(Dublicate(arr,k));

    }
}
