package recursion;
import java.util.*;

public class power {
    public static int powerOfNum(int a, int z){
        if(z == 0)return 1;

        int p = powerOfNum(a,z-1);
        int q = a * p;
        return q;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int pow = scn.nextInt();
       System.out.println(powerOfNum(n, pow));
    }
}
