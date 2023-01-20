package com.company;
import java.util.Scanner;
public class kFreqElement {
    public static void main (String[] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        int k = scn.nextInt();

        int[] freq = new int[26];
        for(int idx = 0; idx < str.length(); idx++){
            if(Character.isLowerCase(str.charAt(idx)) == true){
                freq[str.charAt(idx) - 'a']++;
            }
        }
        String[] bucket = new String[str.length() + 1];
        for(int idx = 0; idx <= str.length(); idx++){
            bucket[idx] = "";
        }
        for(char ch = 'a'; ch <= 'z'; ch++){
            int count = freq[ch - 'a'];
            bucket[count] += ch;
        }
        int count = 0;
        for(int idx = str.length(); idx >= 0; idx--){
            for(int j = 0; j < bucket[idx].length(); j++){
                System.out.print(bucket[idx].charAt(j)+" ");
                count++;

                if(count == k) return;
            }
        }
    }
}
