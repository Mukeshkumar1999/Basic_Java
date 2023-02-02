import java.util.Comparator;
import java.util.PriorityQueue;


public class priorityQueu {

    public static void main(String[] args){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(20);
        pq.add(4);
        pq.offer(3);
        pq.offer(30);
        pq.forEach((e)-> System.out.print(e+" "));
    }
}
