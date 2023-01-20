package com.company;
import java.util.Scanner;
public class Arnstrong {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter num");
        int num = scn.nextInt();
        int  res = 0;
        for(int idx=num; idx>0; idx/=10){
            int digit = idx%10;
            int cube = digit*digit*digit;
           res = res + cube;
        }
        if(num == res){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
