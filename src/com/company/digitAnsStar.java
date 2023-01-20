package com.company;
import java.util.Scanner;
public class digitAnsStar {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter no:-");
        int n = scn.nextInt();
        for (int idx = 1; idx <= n; idx++) {
            for (int idy = 1; idy <= idx; idy++) {
                if (idy % 2 == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(idx);
                }

            }
            System.out.println();
        }
    }
}