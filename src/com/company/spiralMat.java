package com.company;
import java.util.Scanner;
public class spiralMat {
    public static void spiralMatrix(int[][] mat){
        int t = mat.length * mat[0].length;
//        System.out.println(t);
        int cnt = 0;
        int minR = 0;
        int minC = 0;
        int maxR = mat.length - 1;
        int maxC = mat[0].length - 1;
        while(cnt < t){

//            bottom wall ..
            for(int i = maxC, j = maxR; i >= minC && cnt < t; i--){
                System.out.print(mat[j][i]+" ");
                cnt++;
            }
            maxR--;

//             left wall...
            for(int i = maxR, j = minC; i >= minR && cnt < t; i--){
                System.out.print(mat[i][j]+" ");
                cnt++;
            }
            minC++;
//            top wall ...
            for(int i = minC, j = minR; i <= maxC && cnt < t; i++){
                System.out.print(mat[j][i]+" ");
                cnt++;
            }
            minR++;

//            right wall...
            for(int i = minR, j = maxC; i <= maxR && cnt < t; i++){
                System.out.print(mat[i][j]+" ");
                cnt++;
            }
            maxC--;
        }

    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter rows");
        int m = scn.nextInt();
        System.out.print("Enter cols");
        int n = scn.nextInt();
        int[][] mat = new int[m][n];
        for(int row = 0; row < m; row++){
            for(int col = 0 ; col < n; col++){
                mat[row][col] = scn.nextInt();
            }
        }
//        print matrix...
//        for(int row = 0; row < m; row++){
//            for(int col = 0; col < n; col++){
//                System.out.print(mat[row][col]+" ");
//            }
//            System.out.println();
//        }

//        spriral comcept..

         spiralMatrix(mat);



    }
}
