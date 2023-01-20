package com.company;
import java.util.Scanner;
public class sandglassStarPattern {
    public static void sandglassPattern(int n){
        for(int idx=0; idx<n; idx++){
            for(int space=0; space<idx; space++){
                System.out.print(" ");
            }
            for(int idy=n; idy>idx; idy--){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        for(int idx=n-1; idx>=0; idx--){
            for(int space=0; space<idx; space++){
                System.out.print(" ");
            }
            for(int idy=n; idy>idx; idy--){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter row & col :-");
        int n = scn.nextInt();
        sandglassPattern(n);
    }
}
