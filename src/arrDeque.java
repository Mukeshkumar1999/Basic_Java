import java.util.ArrayDeque;

public class arrDeque {
     public static void main(String[] args){
         ArrayDeque<Integer> dq = new ArrayDeque<>();
         dq.addLast(10);
         dq.addLast(20);
         dq.addLast(30);
         dq.addFirst(40);
         dq.addFirst(50);
         dq.add(70);
         dq.poll();
         dq.remove();
         dq.offerFirst(100);
//         dq.offerLast(101);
//         dq.pollFirst();
//         dq.pollLast();
         System.out.println(dq.peek());
         System.out.println(dq.size());

         dq.forEach((x)->System.out.print(x+" "));

     }
}


//ArrayDeque ...
//              means dubbleEnded Queue  insert and delete from both sides...
//A linear collection that supports element insertion and removal at both ends. The name deque is short for "double ended queue" and is usually pronounced "deck". Most Deque implementations place no fixed limits on the number of elements they may contain, but this interface supports capacity-restricted deques as well as those with no fixed size limit.
//This interface extends the Queue interface. When a deque is used as a queue, FIFO (First-In-First-Out) behavior results. Elements are added at the end of the deque and removed from the beginning. The methods inherited from the Queue interface are precisely equivalent to Deque methods as indicated in the following table: