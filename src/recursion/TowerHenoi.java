package recursion;
import java.util.*;
public class TowerHenoi {
    public static void hanoi(int n , int tower1, int tower2, int tower3){
        if(n == 0)return;

        hanoi(n-1,tower1, tower3, tower2);
        System.out.println(n +"["+tower1+" -> "+tower2+"]");
        hanoi(n-1, tower3, tower2, tower1);
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int tower1 = scn.nextInt();
        int tower2 = scn.nextInt();
        int tower3 = scn.nextInt();
        hanoi(n,tower1, tower2, tower3);
    }
}
