package Leetcode;
import java.io.*;
import java.util.*;
public class PostfixEvaluationAndConversions {
    public static int oprerations(int v2, int v1, char op){
        if(op == '+'){
            return v1 + v2;
        }else if(op == '-'){
            return v1 - v2;
        }else if(op == '*'){
            return v1 * v2;
        }else if(op == '/'){
            return v1 / v2;
        }else{
            return 0;
        }
    }
    public static void postFixConversion(String s){
        Stack<String> infix = new Stack<>();
        Stack<String> prefix = new Stack<>();
        Stack<Integer> value = new Stack<>();

        for(int idx = 0; idx < s.length(); idx++){
            char ch = s.charAt(idx);

            if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
                int v2 = value.pop();
                int v1 = value.pop();
                value.push(oprerations(v2, v1, ch));
                // infix...
                String infixVal2 = infix.pop();
                String infixVal1 = infix.pop();
                infix.push("(" + infixVal1 + ch + infixVal2 + ")");

                // prefix..
                String preVal2 = prefix.pop();
                String preVal1 = prefix.pop();
                prefix.push(ch + preVal1 + preVal2);

            }else{
                value.push(ch - '0');
                infix.push(ch + "");
                prefix.push(ch + "");
            }
        }
        System.out.println(value.pop());
        System.out.println(infix.pop());
        System.out.println(prefix.pop());

    }
    public static void main(String[] args){
       Scanner scn = new Scanner(System.in);
       String str = scn.nextLine();
       postFixConversion(str);
    }
}
