package com.company;

import java.util.Scanner;

public class factor {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Eneter size");
        int size = scn.nextInt();
        for(int idx = 1; idx<=size; idx++){
            int n = scn.nextInt();
            System.out.println("Eneter no");
            int  fact = 1;
            for(int idy=1; idy<=n; idy++){
                fact = fact*idy;
            }
            System.out.println(fact);
        }

    }
}
