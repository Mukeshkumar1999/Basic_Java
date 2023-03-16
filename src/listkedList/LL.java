package listkedList;

// parent class of linkedList ..
public class LL {
    private Node head;
    private Node tail;
    private  int size;

    public LL(){
        this.size = 0;
    }

    // insert last Positions of Element...

    public void insertLast(int val){
        if(tail == null){
            insertFirst(val);
            return;
        }

        Node temp = new Node(val);
        tail.next = temp;
        tail = temp;
        size++;
    }
//     Insert first Positions of element..

    public void insertFirst(int value){
       Node node = new Node(value);
        node.next = head;
        head = node;
        if(tail == null){
            tail = head;
        }
        size += 1;
    }

//    insert element of specific positions...

    public void insertOfPosition(int val, int index){
        if(index == 0){
           insertFirst(val);
            return;
        }
        if( index == size){
            insertLast(val);
            return;
        }

        Node node = head;
        for(int idx = 0; idx < index -1; idx++){
            node = node.next;

        }
//        01.fist Methode..


//        Node temp = new Node(val, node.next);
//        node.next = temp;
//        size++;

//       02.second methode...
        Node temp = new Node(val);
        temp.next = node.next;
        node.next = temp;
        size++;
    }
//    delete first Element ..

    public int deleteFirst(){
       int val = head.value;
       head = head.next;
       if(head == null){
           tail = null;
       }
       size--;
       return val;
    }

//    delete LastNode ...
    public int deleteLast(){
        if(size <= 1){
            deleteFirst();
        }
        Node secondLast = get(size -2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        return val;
    }

    public Node get(int index){
        Node node = head;
        for(int idx = 0; idx < index ; idx++){
            node = node.next;

        }
        return node;
    }

//    delete n th Node...

    public int deleteNthNode(int index){
        if(index == 0){
          return deleteFirst();

        }
        if( index == size -1){
           return deleteLast();
        }
       Node prev = get(index -1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        return val;
    }

//    find N th NodeValue...

//    public Node findValue(int val){
//        Node  temp = head;
//        while(temp != null){
//            if(temp.value == val){
//                return temp;
//            }
//            temp = temp.next;
//
//        }
//        return  null;

//    }

//     Print linked list ...

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value +" -> ");
            temp = temp.next;
        }
        System.out.print("NULL");
    }
//      Node class ...
    private class Node{
        int value;
        Node next;

//     first  constructor ...
        public Node(int value){
            this.value = value;

        }
//        second constructor ...
        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }
}
