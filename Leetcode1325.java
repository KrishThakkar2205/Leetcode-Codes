import Leetcode_classes.TreeNode;
public class Leetcode1325 {
   public static void main(String[] args) {
        TreeNode tree = new TreeNode(1);
        tree.left = new TreeNode(1);
        tree.right = new TreeNode(1);
        Solution s= new Solution();
        tree = s.removeLeafNodes(tree, 1);
        tree.Inorder(tree);
   } 
}

// class TreeNode {
//     int val;
//     TreeNode left;
//     TreeNode right;
//     TreeNode() {}
//     TreeNode(int val) { this.val = val; }
//     TreeNode(int val, TreeNode left, TreeNode right) {
//         this.val = val;
//         this.left = left;
//         this.right = right;
//     }
//     public void Inorder(TreeNode root){
//         if(root == null){
//             System.out.println("NULL");
//             return;
//         }
//         System.out.print(root.val+" ");
//         Inorder(root.left);
//         Inorder(root.right);
//     }
// }

class Solution {
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        if(root == null)
            return null;
        TreeNode left = removeLeafNodes(root.left, target);
        TreeNode right = removeLeafNodes(root.right, target);
        if(left == null && right ==null && root.val == target)
            return null;
        root.left = left;
        root.right = right;
        return root;
    }

}