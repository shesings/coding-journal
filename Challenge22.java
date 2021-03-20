import java.util.*;
import java.io.*;
class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
class Solution{

    public static int getHeight(Node root){
        // Traverse through from the root to leaf

        // Compile a list of lengths ("heights")
        // Get the largest one from that list comiled

        // we know we've reached the end of a "branch"
        // once the left AND right node is null

        if(root == null) {
            System.out.println("This is empty.");
            return 0;
        } else {
            int leftHeight = -1;
            int rightHeight = -1;

            // Calculate the height of the left subtree.
            if(root.left != null) {
                leftHeight = getHeight(root.left);
            }
            if(root.right != null) {
                rightHeight = getHeight(root.right);
            }

            //Compare height of left subtree and right substree
            // and store maximum of two variable max
            int max = (leftHeight > rightHeight) ? leftHeight : rightHeight;

            return (max + 1);
        }
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
        int height=getHeight(root);
        System.out.println(height);
    }
}