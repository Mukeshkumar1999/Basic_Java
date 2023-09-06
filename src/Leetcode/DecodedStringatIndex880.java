package Leetcode;
import java.util.*;
public class DecodedStringatIndex880 {
    // Brout force approache ..
    public static Character KthIndex(String str, int k){
        int idx;
        for( idx = 0; idx < str.length(); idx++){
            if(idx + 1 == k){
                return str.charAt(idx);
            }
        }
        return str.charAt(idx);
    }
    public static String DecodeStr(String s, int k){
       StringBuilder sb = new StringBuilder();

        for(int idx = 0; idx < s.length(); idx++){
            char ch = s.charAt(idx);
            if(Character.isDigit(ch)){
                int digit = Character.getNumericValue(ch);
//                System.out.println(digit);
                StringBuilder sb2 = new StringBuilder();
                while(digit-- > 0){
                    sb2.append(sb);

                }
                sb.delete(0, sb.length());
                sb.append(sb2);
            }else{
                sb.append(ch);

            }
        }
        String st2 = sb.toString();

        String str2 = (KthIndex(st2, k) + "");
       return str2;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
//        scn.nextLine();
        int k = scn.nextInt();
      System.out.print(DecodeStr(str, k));
    }
}
