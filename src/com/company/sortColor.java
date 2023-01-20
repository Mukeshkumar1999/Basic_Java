package com.company;
import java.util.Scanner;
public class sortColor {
    public static void swap(int arr[],int i,int count){
        int temp = arr[i];
        arr[i] = arr[count];
        arr[count] = temp;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter array size");
        int size = scn.nextInt();
        int[] arr = new int[size];
        for(int idx = 0; idx < arr.length; idx++){
            arr[idx] = scn.nextInt();
        }
          sortArr(arr);
        for(int idx = 0; idx <arr.length; idx++){
            System.out.print(arr[idx]+" ");
        }
    }
    public static void sortArr(int[] arr){
        int count = 0;
        for(int idx = 0; idx < arr.length; idx++){
            if(arr[idx] == 0){
                swap(arr, idx, count);
                count++;
            }
        }
        for(int jdx = 0; jdx < arr.length; jdx++){
            if(arr[jdx] == 1){
                swap(arr, jdx, count);
                count++;
            }
        }
    }

}
