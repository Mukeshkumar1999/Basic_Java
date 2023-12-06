package Leetcode;
import java.util.*;
public class DegreeOfanArray697 {
    public static int HighFre(ArrayList<Integer> li){
        int[] res = new int[10];
        for(int idx = 0; idx < li.size(); idx++){
            res[li.get(idx)]++;
        }
        int maxDegree = 0;
        for(int idx = 0; idx < res.length; idx++){
            maxDegree = Math.max(res[idx], maxDegree);
        }
        return maxDegree;
    }
    public static int DegreeArray(int[] arr){

        int highestDegree = 0;
        for(int st = 0; st < arr.length; st++){
            for(int end = st; end < arr.length; end++){
                ArrayList<Integer>li = new ArrayList<>();
                for(int idx = st ; idx <= end; idx++){
                    li.add(arr[idx]);
                }
                highestDegree = Math.max(highestDegree, HighFre(li));

            }

        }
//        System.out.println(highestDegree);
        int secondDegree = 0;
        int minLen = Integer.MAX_VALUE;
        for(int st = 0; st < arr.length; st++){
            for(int end = st; end < arr.length; end++){
                ArrayList<Integer>li1 = new ArrayList<>();
                for(int idx = st ; idx <= end; idx++){
                    li1.add(arr[idx]);
                }
                secondDegree = Math.max(secondDegree, HighFre(li1));
//                System.out.print(secondDegree);
                if(secondDegree == highestDegree){
                    minLen = Math.min(minLen, li1.size());
                }

            }

        }

        return minLen;

    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int idx = 0; idx < n; idx++){
            arr[idx] = scn.nextInt();
        }
        System.out.println(DegreeArray(arr));
    }
}
