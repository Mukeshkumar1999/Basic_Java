package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Presentage {
    public static void main(String[] args) {
        System.out.println("Taking input of the user");
        Scanner Sc= new Scanner(System.in);
        System.out.println("Enter Hindi marks");
       // int a = Sc.nextInt();
        float a = Sc.nextFloat();
        System.out.println("Enter Math marks");
        // int b = Sc.nextInt();
        float b = Sc.nextFloat();
        System.out.println("Enter English marks");
       // int c =Sc.nextInt();
        float c = Sc.nextFloat();
        System.out.println("Enter Science marks");
        // int d =Sc.nextInt();
        float d = Sc.nextFloat();
        System.out.println("Enter Soccil science marks");
       // int e =Sc.nextInt();
        float e = Sc.nextFloat();
       // int presentage = ((a+b+c+d+e)/5);
        float presentage = ((a+b+c+d+e)/5);
        System.out.println("presentage");
        System.out.println(presentage);







    }


}
