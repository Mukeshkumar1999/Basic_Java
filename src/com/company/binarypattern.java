package com.company;
import java.util.Scanner;
public class binarypattern {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter size");
        int size = scn.nextInt();

        for(int idx =0; idx<size; idx++){
            for(int idy=size-1; idy>=idx; idy--){
                if((idx+idy)%2 == 0){
                    System.out.print("0"+" ");
                }
                else{
                    System.out.print("1"+" ");
                }
            }
            System.out.println();
        }
    }
}
