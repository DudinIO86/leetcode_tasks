import javax.swing.tree.TreeNode;
import java.util.ArrayList;

public class Solution {
    public static void f(TreeNode1 root, ArrayList<Integer> arr){
        if(root.left==null){
            arr.add(root.val);
            return;
        }
        f(root.left,arr);
        f(root.right,arr);

    }

    public static boolean leafSimilar(TreeNode1 root1, TreeNode1 root2) {
        ArrayList<Integer> ar1 = new ArrayList<>();
        ArrayList<Integer> ar2 = new ArrayList<>();
        f(root1,ar1);
        f(root2,ar2);
        return ar1.equals(ar2);
    }
}
