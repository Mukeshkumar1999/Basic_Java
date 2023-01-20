package com.company;
import java.util.Scanner;
public class insertArray {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("enter size of arr");
        int size = scn.nextInt();
        int[] arr = new int[size];
        for(int idx=0; idx<arr.length; idx++){
            System.out.println("enter element"+" "+idx+":-");
            arr[idx] = scn.nextInt();
        }

        System.out.println("Enter insert value :-");
         int x = scn.nextInt();
        System.out.println("Enter Index value :-");
        int idy = scn.nextInt();
        for(int idx=arr.length;  idx > idy; idx--){
               arr[idx] = arr[idx-1];

        }
           arr[idy] = x;
        for(int idx=0; idx<arr.length; idx++){
            System.out.print(arr[idx]+" ");
        }
    }
}
