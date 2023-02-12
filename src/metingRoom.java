import java.util.*;

public class metingRoom {
    public static boolean meetingRoom(int[][] mat){
        if(mat.length == 0 || mat.length == 1 )return true;

        Arrays.sort(mat, (a,b) -> Integer.compare(a[0],b[0]));

        int entTime = mat[0][1];
        for(int idx = 1; idx < mat.length; idx++){
            if(mat[idx][0] < entTime){
                return false;
            }else{
                entTime = mat[idx][1];
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] mat = new int[n][2];

        for(int row = 0; row < n; row++){
            int st = scn.nextInt();
            int et  = scn.nextInt();
            mat[row][0] = st;
            mat[row][1] = et;
        }
        boolean res = meetingRoom(mat);
        System.out.println(res);
    }
}
