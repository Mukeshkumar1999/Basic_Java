package Leetcode;
import java.util.*;
public class prefixToInfix {
    public static String infixConversion(String s){
       Stack<String> infix = new Stack<>();
       for(int idx = s.length() - 1; idx >= 0; idx--){
           char ch = s.charAt(idx);
           if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
               String val2  = infix.pop();
               String val1 = infix.pop();
               infix.push("(" + val2 + ch + val1 + ")");
           }else {
               infix.push(ch +"");
           }
       }
         return infix.pop();

    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        System.out.println(infixConversion(s));
    }
}
