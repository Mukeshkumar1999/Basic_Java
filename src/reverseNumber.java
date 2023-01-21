import java.util.*;
public class reverseNumber {
    public static int reversSkNum(int num){
        Stack<Integer> st = new Stack<>();
        while (num > 0){
            int digit  = num % 10;
            st.push(digit);
            num /= 10;
        }
        int ans = 0, power = 1;
        while(!st.isEmpty()){
            ans = ans+st.pop() * power;
            power *= 10;
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n  = scn.nextInt();
        while(n-- > 0){
            int num = scn.nextInt();
            System.out.println(reversSkNum(num));
        }
    }
}
