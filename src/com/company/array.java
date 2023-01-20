package com.company;

public class array {
    public static void main(String[]args){
        int[][] arr = {{1,2,3},{2,4,5}};
        for(int idx = 0; idx<2; idx++){
            for(int idy=0; idy<3; idy++){
                System.out.print(arr[idx][idy]+"\t");
            }
            System.out.println();
        }
    }
}
