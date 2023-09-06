package Leetcode;
import java.util.*;
public class NumberOfVisiblePepoleInQueue1944 {
   public static int[] visiblePeople(int[] arr){
       int[] ans = new int[arr.length];
       int count = 0;
//       int rightBiggerEle = Integer.MIN_VALUE;
       for(int idx = 0; idx  < arr.length-1; idx++){
           for(int jdx = idx + 1; jdx < arr.length;jdx++){
//               rightBiggerEle = Math.max(arr[jdx], rightBiggerEle);
               if((arr[idx] > arr[jdx]) && jdx == idx +1) {
                   count++;

               }
               else if((arr[idx] > arr[jdx]) && arr[jdx] > arr[jdx -1]) {
                   count++;
               }else if(arr[jdx] > arr[idx]){
                   count++;
                   break;
               }
           }

           ans[idx] = count;
             count = 0;
       }
       ans[arr.length - 1] = 0;
       return ans;
   }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int idx = 0; idx < n; idx++)arr[idx] = scn.nextInt();

        int[] res = visiblePeople(arr);
        for(int idx : res)System.out.print(idx +" ");
    }
}
