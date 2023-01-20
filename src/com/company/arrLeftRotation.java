package com.company;
import java.util.Scanner;
public class arrLeftRotation {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("enter size of arr");
        int size = scn.nextInt();
        int[] arr = new int[size];
        for(int idx=0; idx<arr.length; idx++){
            System.out.println("enter element"+" "+idx+":-");
            arr[idx] = scn.nextInt();
        }
        int temp = arr[0];
        for(int idx=1; idx<arr.length; idx++){
            arr[idx-1] = arr[idx];
        }
        arr[arr.length-1] = temp;
        for(int idx=0; idx<arr.length; idx++){
            System.out.print(arr[idx]+" ");
        }
    }
}
