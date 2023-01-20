package com.company;
import java.util.Scanner;
public class plusPattern {
    public static void main(String[] args){
        Scanner scn =new Scanner(System.in);
        System.out.println("Enter no");
        int n = scn.nextInt();
        for(int idx=0; idx<n; idx++){
          for(int idy=0; idy<n; idy++){
              if(idx == 2 || idy ==2){
                  System.out.print("*"+" ");
              }
              else{
                  System.out.print(" "+" ");
              }
          }
          System.out.println();
        }
    }
}
