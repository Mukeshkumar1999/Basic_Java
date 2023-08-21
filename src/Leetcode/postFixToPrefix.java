package Leetcode;
import java.util.*;

public class postFixToPrefix {
    public static String prefix(String s){
        Stack<String> pre = new Stack<>();
        for(int idx = 0; idx < s.length(); idx++){
            char ch = s.charAt(idx);
            if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
                String val2 = pre.pop();
                String val1 = pre.pop();
                pre.push(ch + val1 + val2);
            }else{
                pre.push(ch + "");
            }
        }return pre.pop();
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        System.out.println(prefix(s));
    }
}
