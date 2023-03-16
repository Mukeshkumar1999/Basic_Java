package listkedList;

public class Main {
    public static void main(String[] args){
        LL list = new LL();
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(5);
        list.insertFirst(7);
        list.insertLast(90);

        list.insertOfPosition(88,3);
        list.insertOfPosition(01, 1);
        list.display();
        System.out.println();
        System.out.println(list.deleteFirst());
        list.display();
        System.out.println();
        System.out.println(list.deleteLast());
        list.display();
        System.out.println();
      System.out.println(list.deleteNthNode(3));
        list.display();
//        System.out.println();
//       System.out.println (list.findValue(3));
//        list.display();
    }
}
