package com.company;
import java.util.Scanner;
public class leftTringle {
    public static void patterLeft(int n){
        for(int idx=0; idx<n; idx++){
            for(int space=n-1; space>idx; space--){
                System.out.print(" ");
            }
            for(int idy=0; idy<=idx; idy++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int idx=n-1; idx>=0; idx--){
            for(int space=n-1; space>=idx; space--){
                System.out.print(" ");
            }
            for(int idy=0; idy<idx; idy++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter row&col:-");
        int n = scn.nextInt();
        patterLeft(n);
    }
}
