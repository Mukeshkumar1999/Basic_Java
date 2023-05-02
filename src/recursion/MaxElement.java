package recursion;
import java.util.*;
public class MaxElement {
    public static int maxEle(int[] arr ,int idx){
        if(idx == arr.length-1)return arr[idx];

        int max = maxEle(arr, idx+1);
        if(max > arr[idx]){
            return max;
        }else{
            return arr[idx];
        }
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int idx = 0; idx < n; idx++){
            arr[idx] = scn.nextInt();
        }
        System.out.print(maxEle(arr,0));
    }
}
