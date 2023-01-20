package com.company;
import java.util.Scanner;
public class approach1LeftRotate {
    public static int[] rotateLeft(int[] arr, int n ,int d){
        int[] temp = new int[n];

//        track the temp indecex

        int k = 0;

//        store the element d no of index to last index in the temp array

        for(int idx=d; idx<arr.length; idx++){
            temp[k] = arr[idx];
            k++;
        }

        //        store the element 0 no of index to d index in the temp array

        for(int idx=0; idx<d; idx++){
            temp[k] = arr[idx];
            k++;
        }

//        copy the temp array to original array

        for(int idx=0; idx<n; idx++){
            arr[idx]  = temp[idx];
        }
       return arr;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int[] arr = {1,2,3,4,5};
        int n = arr.length;
        System.out.print("Enter d :-");
        int d = scn.nextInt();
        rotateLeft(arr, n ,d);

        for(int idx=0; idx<arr.length; idx++){
            System.out.print(arr[idx]+" ");
        }

    }
}
