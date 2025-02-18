/**
 * Leetcode : 979 --> Distribute Coins in Binary Tree
 */
import Leetcode_classes.TreeNode;
public class Leetcode979 {
    public static void main(String[] args) {
        TreeNode tree = new TreeNode(4);
        tree.left = new TreeNode(0);
        tree.left.right = new TreeNode(0);
        tree.left.right.right = new TreeNode(0);
        tree.Inorder(tree);
        System.out.println();
        DistributeCoinsInBinaryTree d = new DistributeCoinsInBinaryTree();
        int x = d.distributeCoins(tree);
        System.out.println(x);
        tree.Inorder(tree);
    }
}

class DistributeCoinsInBinaryTree{
    int steps = 0;
    int remaining = 0;
    public int distributeCoins(TreeNode root) {
        distibute(root);
        return steps;
    }
    private int distibute(TreeNode root){
        if(root.left==null && root.right == null){
            return root.val;
        }
        int left = -1 , right = -1;
        if(root.left != null){
            left = distibute(root.left);
        }
        if(root.right != null){
            right = distibute(root.right);
        }
        if(left > 1){
            root.val += left - 1;
            steps += left-1;
            root.left.val = 1;
        } 
        if( right > 1){
            root.val+=right - 1;
            steps += right - 1;
            root.right.val = 1;
        }
        if(root.val == 0){
            int remain = 0;
            if(left==0)remain++;
            if(right==0)remain++;
            steps+=remain+remaining;
            remaining+=remain;
            return 0;
        }
        if(left == 0 && root.val!=0){
            root.val--;
            steps++;
            root.left.val = 1;
        } 
        if(right == 0 && root.val!=0){
            root.val--;
            steps++;
            root.right.val = 1;
        }
        return root.val;
    }
}
