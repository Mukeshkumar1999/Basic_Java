package com.company;
import java.util.*;

public class daysfind {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter number");
        int day = scn.nextInt();

        switch(day){

            case 1 :
                System.out.print("Sunday");
                break;

            case 2 :
                System.out.print("Monday");
                break;

            case 3 :
                System.out.print("Thuseday");
                break;

            case 4 :
                System.out.print("Wednsday");
                break;

            case 5 :
                System.out.print("Thrusday");
                break;

            case 6 :
                System.out.print("Friday");
                break;

            case 7 :
                System.out.print("Saturday");
                break;

            default:
                System.out.print("Please enter 1 to 7 Number");
                break;
        }
    }
}
