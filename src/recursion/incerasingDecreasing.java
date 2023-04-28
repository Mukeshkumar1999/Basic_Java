package recursion;
import java.util.*;
public class incerasingDecreasing {
    public static void printIncerDecrese(int n){
        if(n == 0)return;
        System.out.println(n);
        printIncerDecrese(n-1);
        System.out.println(n);
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printIncerDecrese(n);
    }
}
