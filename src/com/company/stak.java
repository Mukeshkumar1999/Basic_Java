package com.company;

import java.util.Stack;

public class stak {
    public static void main(String[] args){
        Stack<Integer> st = new Stack<>();
        for(int idx = 1; idx<= 5;idx++)st.push(idx);
        while(!st.isEmpty()){
            System.out.print(st.pop()+" ");
        }
    }
}
