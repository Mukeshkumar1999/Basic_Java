package recursion;
import java.util.*;

public class DiaplayArr {
    public static void disArr(int[] arr , int idx){
        if(idx == arr.length) return;
        System.out.print(arr[idx]+"  ");
        disArr(arr, idx+1);
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter size of array");
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int idx = 0; idx < n; idx++){
            System.out.print("fill the  array");
            arr[idx] = scn.nextInt();
        }
        disArr(arr, 0);
    }
}
