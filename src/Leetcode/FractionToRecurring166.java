package Leetcode;
import java.util.*;
public class FractionToRecurring166 {
    public static String fractionValue(int num, int dnt){
        StringBuilder sb = new StringBuilder();
        Map<Integer,Integer> map = new HashMap<>();
       int q = num / dnt;
       int r = num % dnt;
       sb.append(q);
       if( r == 0){
           return sb.toString();
       }else{
           sb.append(".");
           while(r != 0){
               if(map.containsKey(r)){
                   int len = map.get(r);
                   sb.insert(len,"(");
                   sb.append(")");
                   break;
               }
               map.put(r, sb.length());
               r *= 10;
               q = r / dnt;
               r = r % dnt;
               sb.append(q);

           }
       }

        return sb.toString();
    }
    public static void main (String[] args){
        Scanner scn = new Scanner(System.in);
        int numerator = scn.nextInt();
        int denominator = scn.nextInt();
        System.out.println(fractionValue(numerator,denominator));

    }
}
