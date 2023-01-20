package com.company;
import java.util.Scanner;
public class apositePalindrome {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter number of row & col:-");
                int  n = scn.nextInt();
        for(int idx=0; idx<n; idx++){
            for(int space=0; space<idx; space++){
                System.out.print(" ");
            }
            for(int idy=n; idy>idx; idy--){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
