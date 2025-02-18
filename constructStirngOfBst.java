// String is immutable so if any function with String take long time rather use String builder or String Buffer they are mutable
import Leetcode_classes.TreeNode;
public class constructStirngOfBst {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(4);
        TreeNode ancestor=new TreeNode(2,null,root);
        root=ancestor;
        ancestor=new TreeNode(3,null, null);
        TreeNode rootF=new TreeNode(1, root, ancestor);
        root=rootF;
        display s=new display();
        System.out.println(s.tree2str(root));
        s.preOrder(root);
    }    
}

class display {
    void preOrder(TreeNode root){
        if(root==null){
            return ;
        }
        System.out.println(root.val);
        preOrder(root.left);
        preOrder(root.right);
    }
    public String tree2str(TreeNode root) {
        return preOrder("", root);
    }
    String preOrder(String ans,TreeNode root){
        if(root==null){
            return ans;
        }
        ans+=String.valueOf(root.val);
        if(root.right==null&&root.left==null){
            return ans;
        }
        ans+="(";
        ans=preOrder(ans,root.left);
        ans+=")";
        if(root.right==null){
            return ans;
        }else{
            ans+="(";
            ans=preOrder(ans, root.right);
            ans+=")";
        }
        return ans;
    }
}
