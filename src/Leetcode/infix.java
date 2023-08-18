package Leetcode;
import java.util.*;

public class infix {
    public static int operations(int v1, int v2, char sign){
        int v5 = 0;
        if(sign == '+'){
            v5 = v1 + v2;
        }else if(sign == '-'){
          v5 = v2 - v1;
        }else if(sign == '*'){
            v5 = v2 * v1;
        }else if(sign == '/'){
            v5 = v2 / v1;
        }
        return v5;
    }
    public static int precedence(char op){
        int v6 = 0;
        if(op == '+'){
           v6 =  1;
        }else if(op == '-'){
            v6 = 1;

        }else if(op == '*'){
            v6 = 2;
        }else{
            v6 = 2;
        }
        return v6;

    }
    public static int Arithmatic(String s){
        Stack<Integer> operand = new Stack<>();
        Stack<Character> operation = new Stack<>();
        for(int idx = 0; idx < s.length(); idx++){
            char ch = s.charAt(idx);
            if(ch == '('){
                operation.push(ch);

            }else if(Character.isDigit(ch)){
                operand.push(ch - '0');
            }else if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
                while(operation.size() > 0 && operation.peek() != '(' && precedence(ch) <= precedence(operation.peek())){
                    int v1 = operand.pop();
                    int v2 = operand.pop();
                    char opt = operation.pop();

                    int val = operations(v1,v2,opt);
                    operand.push(val);
                }
                operation.push(ch);
            }else if(ch == ')'){
                while(operation.size() > 0 && operation.peek() != '('){
                    int v1 = operand.pop();
                    int v2 = operand.pop();
                    char opt = operation.pop();

                    int val = operations(v1,v2,opt);
                    operand.push(val);
                }
                if(operand.size() > 0){
                    operation.pop();
                }
            }


        }
        while(operation.size() > 0){
            int v1 = operand.pop();
            int v2 = operand.pop();
            char opt = operation.pop();

            int val = operations(v1,v2,opt);
            operand.push(val);
            operation.pop();
        }

        int val2 = operand.pop();
        return val2;
    }
    public static void main(String[] args){
//        Scanner scn = new Scanner(System.in);
//        String str = scn.nextLine();
        String str = "2 + 6 * 4 / 8 - 3";
        System.out.println(str);
        System.out.print(Arithmatic(str));
    }
}
