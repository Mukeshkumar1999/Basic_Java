package com.company;
import java.util.Scanner;
public class Xpattern {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter no");
        int n = scn.nextInt();
        int k = n*2-1;
        for(int idx=0; idx<k; idx++){
            for(int idy=0; idy<k; idy++){
                if(idy == idx || idy == (k-1)-idx){
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" "+" ");
                }           }
            System.out.println();
        }
    }
}
