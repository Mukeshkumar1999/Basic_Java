import java.util.ArrayList;
public class arraylist {
    public static ArrayList<Integer> printSort(ArrayList<Integer> a1, ArrayList<Integer> a2) {
        ArrayList<Integer> list = new ArrayList<>();
        int p1 = 0, p2 = 0;
        while (p1 < a1.size() && p2 < a2.size()) {
            if (a1.get(p1) < a2.get(p2)) {
                list.add(a1.get(p1));
                p1++;
            } else {
                list.add(a2.get(p2));
                p2++;
            }
        }
        while (p1 < a1.size()) {
            list.add(a1.get(p1));
            p1++;
        }
        while (p2 < a2.size()) {
            list.add(a2.get(p2));
            p2++;
        }
//        for (int val : list) {
//            System.out.print(val + " ");
//        }
        return list;

    }
    public static void main(String[] args){
        ArrayList<Integer> a1 = new ArrayList<>();
//        a1.add(1);
//        a1.add(3);
//        a1.add(5);
//        a1.add(8);
//        a1.add(10);
//        a1.add(11);

         for (int idx = 1; idx <= 10; idx++) {
             if(idx%2 == 1) {
                 a1.add(idx);
             }
         }
        ArrayList<Integer> a2 = new ArrayList<>();
//        a2.add(2);
//        a2.add(4);
//        a2.add(6);
//        a2.add(7);
         for (int idx = 2; idx <= 10;  idx++) {
             if(idx %2 == 0) {
                 a2.add(idx);
             }
         }
       ArrayList<Integer> list =  printSort(a1, a2);
         for(int val : list)
             System.out.print(val+" ");
    }
}
