package BinaryTree;
import java.lang.reflect.Array;
import java.util.*;
 class Node {
     Node left, right;
     int data;

     public Node(int data){
         this.data = data;
     }
 }
public class Tree {
     static Node createTree(){
         Node root = null;

         System.out.println("Enter data: ");
         int data = scn.nextInt();

         if(data == -1)return null;

         root = new Node(data);

         System.out.println("Enter left for " + data);
         root.left = createTree();

         System.out.println("Enter right for" + data);
         root.right = createTree();
         return root;
     }

     // traversal..
    static void inOrder(Node root){
         if(root == null)return ;
         inOrder(root.left);
         System.out.print(root.data+"->");
         inOrder(root.right);

    }

    static void preOrder(Node root){
        if(root == null)return ;
        System.out.print(root.data+"->");
        preOrder(root.left);

        preOrder(root.right);

    }
    static void postOrder(Node root){
        if(root == null)return ;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+"->");
    }
    static int  heightTree(Node root){
         if(root == null)return 0;
         return Math.max(heightTree(root.left), heightTree(root.right))+1;
    }
    public  static int CountNode(Node root){
         if(root == null)return 0;
         return CountNode(root.left) + CountNode(root.right) + 1;
    }
    public static int  MaximumNode(Node root){
         if(root == null)return Integer.MIN_VALUE;

         return Math.max(root.data, Math.max(MaximumNode(root.left),MaximumNode(root.right)));
    }
    // these code time complicity is O(N^2)....
//    public static void printlevel(Node root, int level){
//         if(root == null)return;
//
//         if(level == 0){
//             System.out.print(root.data +" ");
//         }else if(level > 0){
//             printlevel(root.left, level - 1);
//             printlevel(root.right, level -1);
//        }
//    }

    public static void levelOrder(Node root){
         Queue<Node> que = new LinkedList<>();

         que.add(root);

         while (!que.isEmpty()){
             Node curr = que.poll();
             System.out.print(curr.data +" ");
             if(curr.left != null){
                 que.add(curr.left);
             }
             if(curr.right != null){
                 que.add(curr.right);
             }
         }
    }
    // left view print ....
    public static ArrayList<Integer> leftView(Node root){
         ArrayList<Integer> list = new ArrayList<>();

       viewLeftuntil(root,list,0);
        return list;
    }
    public static void viewLeftuntil(Node root,ArrayList<Integer>list, int level){

         if(root == null)return ;
         if(list.get(level) == null){
             list.add(root.data);
         }
         viewLeftuntil(root.left,list, level+1);
         viewLeftuntil(root.right,list,  level+1);

    }

     static Scanner scn =null;
    public static void main(String[] args){
         scn = new Scanner(System.in);
       Node root =  createTree();
       inOrder(root);
        System.out.println("____________");
       preOrder(root);
        System.out.println("____________");
       postOrder(root);
       System.out.println("");
       System.out.println("Height of Binary Tree");
       System.out.println(heightTree(root));

        System.out.println("");
        System.out.println("Total Node present in Binary Tree");
        System.out.println(CountNode(root));

        System.out.println("");
        System.out.println("Maximum Node  in Binary Tree");
        System.out.println(MaximumNode(root));


//        System.out.println("");
//        System.out.println("level print  in Binary Tree");
//        for(int idx = 0; idx < heightTree(root); idx++){
//            printlevel(root, idx);
//        }
        System.out.println("");
        System.out.println("level print  optimize way in Binary Tree");
        levelOrder(root);

        System.out.println("");
        System.out.println(" print left view of Binary Tree");
          ArrayList<Integer> list1 = leftView(root);
          for(int val : list1){
              System.out.print(val +" ");
          }
    }
}
