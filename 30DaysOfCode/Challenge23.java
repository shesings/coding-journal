import java.io.*;
import java.util.*;
class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
class Solution{

    static void levelOrder(Node root){

        if(root == null) {
            return;
        }

        Queue<Node> queue = new LinkedList<Node>();

        queue.add(root);

        while(true) {

            int nodeCount = queue.size();
            if (nodeCount == 0)
                break;

            while(nodeCount > 0) {
                Node node = queue.peek();
                System.out.print(node.data + " ");
                queue.remove();
                if(node.left != null) {
                    queue.add(node.left);
                }
                if(node.right != null) {
                    queue.add(node.right);
                }
                nodeCount--;
            }

        }

    }

    static void print(Node root) {
        System.out.println("root.data: " + root.data);
    }

    public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Node root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        levelOrder(root);
    }
}