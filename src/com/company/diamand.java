package com.company;
import java.util.Scanner;

public class diamand {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter numbet");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int idx;
        int space;
        int idy;
        for( idx=0; idx<n; idx++){
            for( space=3; space>idx; space--){
                System.out.print(" ");

            }
            for( idy=0; idy<=idx; idy++){
                System.out.print("*");
            }
            for( idy=0; idy<idx; idy++){
                System.out.print("*");
            }
            System.out.println();
        }
        for( space=0; space<=idx; space++){
            System.out.print(" ");
        }
        for( idy=3; idy>idx; idy--){
            System.out.print("*");
        }
        for( idy=2; idy>idx; idy--){
            System.out.print("*");
        }
        System.out.println();
    }
}
