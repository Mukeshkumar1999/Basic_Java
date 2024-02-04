package Leetcode;
import java.util.*;
public class FindMinimumNuberOprionemptyArr2870 {
    public static int EmptyArrTotalOp(int[] arr ){
        int opCount = 0;
        for(int idx = 0; idx < arr.length; idx++){
            if(arr[idx] == 0)continue;
            int count = 1;
            for(int jdx = idx +1; jdx < arr.length; jdx++){
                if(arr[idx] == arr[jdx])count++;
                if(count == 2 || count ==3){
                    opCount++;
                    for(int kdx = idx+1; kdx <= jdx; kdx++){
                        if(arr[kdx] == arr[idx]){
                            arr[kdx] = 0;
                        }

                    }
                    arr[idx] = 0;
                    break;
                }
                count = 1;
            }
        }
        for(int val : arr){
            System.out.print(val +" ");
        }
        System.out.println("hi");
//        for(int idx = 0; idx < arr.length; idx++){
//            if(arr[idx] > 0)return -1;
//        }
        return opCount;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int idx = 0; idx < n ;idx++){
            arr[idx] = scn.nextInt();
        }
        System.out.println(EmptyArrTotalOp(arr));
    }
}
