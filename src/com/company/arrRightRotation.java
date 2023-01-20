package com.company;

import java.util.Scanner;

public class arrRightRotation {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("enter size of arr");
        int size = scn.nextInt();
        int[] arr = new int[size];
        for(int idx=0; idx<arr.length; idx++){
            System.out.println("enter element"+" "+idx+":-");
            arr[idx] = scn.nextInt();
        }
        int temp = arr[arr.length-1];
        for(int idx=arr.length-1; idx>=0; idx--){
            arr[idx] = arr[idx+1];
            System.out.print(arr[idx]+" ");
        }
        arr[0] = temp;
        for(int idx=0; idx<arr.length; idx++){
            System.out.print(arr[idx]+" ");
        }
    }
}
