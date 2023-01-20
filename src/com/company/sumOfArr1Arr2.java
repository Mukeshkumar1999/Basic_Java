package com.company;
import java.util.Scanner;
public class sumOfArr1Arr2 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter size of row:-");
        int size1  = scn.nextInt();
        System.out.println("Enter size of col:-");
        int size2 = scn.nextInt();
        int[][] arr  = new int [size1][size2];
        for(int row=0; row<size1; row++){
            for(int col=0; col<size2; col++){
//                System.out.println("Enter element");
                arr[row][col] = scn.nextInt();

            }

        }
       for(int idx=0; idx<size1; idx++){
            for(int idy=0; idy<size2; idy++){
                System.out.print(arr[idx][idy]+" ");
            }
            System.out.println();
        }

       // sum of arr...

        for(int idx=0; idx<arr.length; idx++){
            int sum = 0;
            for(int idy=0; idy<arr.length; idy++){
                sum +=  arr[idy][idx] ;

            }
            System.out.print(sum+" ");

        }
    }
}
