package com.company;
import java.util.Scanner;

public class rightpalindrome {
    public static void pattern(int n){
        for(int idx=0; idx<n-3; idx++){
            for(int idy=0; idy<=idx; idy++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        for(int idx=n-1; idx>=0; idx--){
            for(int idy=0; idy<=idx-1; idy++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the row & col:-");
        int n = scn.nextInt();
        pattern(n);
    }
}
