package recursion;

import java.util.Scanner;

public class printNum {

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int last = scn.nextInt();
        recure(n,last);

    }
    public static void recure(int n, int last){
        if(n == last) {
            return;
        }
        System.out.println(n);
        recure( n+1, last);
    }
}
