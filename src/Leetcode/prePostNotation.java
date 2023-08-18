package Leetcode;
import java.io.*;
import java.util.*;

public class prePostNotation {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();

        Stack<Character> oprtr = new Stack<>();
        Stack<String> pre = new Stack<>();
        Stack<String> post = new Stack<>();

        for(int idx = 0; idx < exp.length(); idx++){
            char ch = exp.charAt(idx);
            if(ch == '('){
                oprtr.push(ch);
            }else if(ch >= '0' && ch <= '9' || ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z'){
                pre.push(ch + "");    // character to string conversions..
                post.push(ch + "");
            }else if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
                while(oprtr.size() > 0 && oprtr.peek() != '(' && precedence(ch) <= precedence(oprtr.peek())){
                    char opt = oprtr.pop();
                    // postfix...
                    String postval2 = post.pop();
                    String postval1 = post.pop();
                    String postOpt = postval1 + postval2 + opt;
                    post.push(postOpt);
                    // prefix...

                    String preval2 = pre.pop();
                    String preval1 = pre.pop();
                    String preOpt = opt + preval1 + preval2;
                    pre.push(preOpt);
                }
                oprtr.push(ch);
            }else if(ch == ')'){
                while(oprtr.peek() != '('){
                    char opt = oprtr.pop();
                    // postfix...
                    String postval2 = post.pop();
                    String postval1 = post.pop();
                    String postOpt =  postval1 + postval2 + opt;
                    post.push(postOpt);
                    // prefix...

                    String preval2 = pre.pop();
                    String preval1 = pre.pop();
                    String preOpt = opt + preval1 + preval2;
                    pre.push(preOpt);
                }
                oprtr.pop();
            }
        }
        while(oprtr.size() > 0){
            char opt = oprtr.pop();
            // postfix...
            String postval2 = post.pop();
            String postval1 = post.pop();
            String postOpt =  postval1 + postval2 + opt ;
            post.push(postOpt);
            // prefix...

            String preval2 = pre.pop();
            String preval1 = pre.pop();
            String preOpt = opt + preval1 + preval2;
            pre.push(preOpt);
        }
        System.out.println(post.peek());
        System.out.println(pre.peek());
    }
    public static int precedence(char op){
        if(op == '+' || op == '-'){
            return 1;
        }else if(op == '*' || op == '/'){
            return 2;
        }else{
            return 0;
        }
    }
}
