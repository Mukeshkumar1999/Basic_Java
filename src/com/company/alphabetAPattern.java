package com.company;
import java.util.Scanner;
public class alphabetAPattern {
    public static void patternA(int n){
        for(int idx=0; idx<1; idx++){
            for(int idy=0; idy<=2; idy++){
                if(idy==0 || idy==1){
                    System.out.print("*"+" ");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for(int idx=0; idx<n; idx++){
            for(int idy=0; idy<n/2; idy++){
                if(idx==n/2 || idy==0 || idy==2){
                    System.out.print("*"+" ");
                }
                else{
                    System.out.print(" "+" ");
                }

            }
            System.out.println();
        }
    }
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter row & col:-");
        int n = scn.nextInt();
        patternA(n);
    }
}
