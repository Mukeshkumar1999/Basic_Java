package recursion;
import java.util.*;
public class increasing {
    public static void printNum(int n){
        if(n == 0)return ;
        printNum(n-1);
        System.out.println(n);
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printNum(n);
    }
}
