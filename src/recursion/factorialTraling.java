package recursion;
import java.util.*;

public class factorialTraling {
    public static int factorial(int n){
        if(n == 0){
            return 1;
        }else{
            return n * factorial(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int fact = factorial(n);
        System.out.println(fact);
        int count = 0;
        while(fact > 0){
            int digit = fact % 10;
            if(digit == 0){
                count++;
            }
            fact /= 10;
        }
        System.out.println(count);
    }
}
