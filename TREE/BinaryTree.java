import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

class node {
    int val;
    node left;
    node right;

    

    node(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}
  

public class BinaryTree {

    static String input="10 20  40 -1 70 -1 -1 -1 30 50 -1 80 -1 90 -1 100 -1 -1 60 -1 -1";
    static Scanner sc = new Scanner(input);


    public static node createtree() {
        int input = sc.nextInt();

        // base case
        if (input == -1) {
            return null;
        }

        node newnode = new node(input);

        
        newnode.left = createtree();

       
        newnode.right = createtree();

        return newnode;
    }
    //inorder traversal

    public static void inorder(node root) {
        if (root == null) {
            return;
        }

        // Traverse the left subtree
        inorder(root.left);

        // Visit the root node
        System.out.print(root.val + " ");

        // Traverse the right subtree
        inorder(root.right);
    }
    //inorderIterative traversal
    public static void inorderIterative(node root) {
        Stack<node> stack = new Stack<>();
        node current = root;
        while(current!=null || !stack.isEmpty()){
            while(current!=null){
                stack.push(current);
                current=current.left;
            }
            current=stack.pop();
            System.out.print(current.val+" ");
            current=current.right;
        }
        
        
    }
    public static void levelOrderTraversal(node root) {
        Queue<node> queue=new LinkedList<>();
        queue.offer(root);
         int level=0;
        while(!queue.isEmpty()){
            int size=queue.size();
            System.out.println("Level "+level+":");
             
           
            for(int i=0;i<size;i++){
            node current=queue.poll();
            //we want to print level wise so we will print the current node and then add its left and right child to the queue
            System.out.print(current.val+" ");

          
            if(current.left!=null){
                queue.offer(current.left);
            }
            if(current.right!=null){
                queue.offer(current.right);
            }
        }
          System.out.println();
        level++;
        }
        }
        
        //get count of total nodes in the tree
        public static int getCount(node root){
            if(root==null){
                return 0;
            }
            int leftCount=getCount(root.left);
            int rightCount=getCount(root.right);
            return leftCount+rightCount+1;
        }
    public static int getHeight(node root){
        if(root==null){
            return -1;
        }
        int leftHeight=getHeight(root.left);
        int rightHeight=getHeight(root.right);
        return Math.max(leftHeight,rightHeight)+1;
    }
    
    //leftview of the tree
    public static void leftView(node root){
        if(root==null){
            return;
        }
        Queue<node> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int size=queue.size();
            for(int i=0;i<size;i++){
                node current=queue.poll();
                if(i==0){
                    System.out.print(current.val+" ");
                }
                if(current.left!=null){
                    queue.offer(current.left);
                }
                if(current.right!=null){
                    queue.offer(current.right);
                }
            }
        }
    }
    public static void main(String[] args) {
        node root = createtree();

       // System.out.println("Inorder Traversal:");
        //inorder(root);
       // System.out.println("\nInorder Iterative Traversal:");
       // inorderIterative(root);
       levelOrderTraversal(root);
       int treeheight=getHeight(root);
         System.out.println("Height of the tree: "+treeheight);
         int totalNodes=getCount(root);
            System.out.println("Total number of nodes in the tree: "+totalNodes);
            System.out.println("Left view of the tree:");
            leftView(root);

    }
}
