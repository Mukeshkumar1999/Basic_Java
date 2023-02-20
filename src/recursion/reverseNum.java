package recursion;
import java.util.*;
public class reverseNum {
    public static void  reverse(int n ){
        if(n == 0){   // base case
            return;
        }

        System.out.println(n);  // work;

        reverse(n-1);  // faith
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        reverse(n);

    }
}
