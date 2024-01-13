import com.sun.source.tree.ArrayTypeTree;
import org.w3c.dom.Node;

import javax.swing.tree.TreeNode;
import java.util.*;

/*
Consider all the leaves of a binary tree, from left to right order, the values of those leaves form a leaf value sequence.
For example, in the given tree above, the leaf value sequence is (6, 7, 4, 9, 8).

Two binary trees are considered leaf-similar if their leaf value sequence is the same.

Return true if and only if the two given trees with head nodes root1 and root2 are leaf-similar.



Example 1:
Input: root1 = [3,5,1,6,2,9,8,null,null,7,4], root2 = [3,5,1,6,7,4,2,null,null,null,null,null,null,9,8]
Output: true
Example 2:

Input: root1 = [1,2,3], root2 = [1,3,2]
Output: false
 */
public class Main {
    public static void main(String[] args) {
        TreeNode1 root1_1_1=new TreeNode1(2);
        TreeNode1 root1_1_2=new TreeNode1(3);
        TreeNode1 root1_1=new TreeNode1(5,root1_1_1,root1_1_2);

        TreeNode1 root1_2_1=new TreeNode1(1);
        TreeNode1 root1_2_2=new TreeNode1(1);
        TreeNode1 root1_2=new TreeNode1(1,root1_2_1,root1_2_2);
        TreeNode1 root1=new TreeNode1(3,root1_1,root1_2);

        TreeNode1 root2_1_1=new TreeNode1(2);
        TreeNode1 root2_1_2=new TreeNode1(3);
        TreeNode1 root2_1=new TreeNode1(5,root2_1_1,root2_1_2);


        TreeNode1 root2_2_1=new TreeNode1(1);
        TreeNode1 root2_2_2=new TreeNode1(2);
        TreeNode1 root2_2=new TreeNode1(16,root2_2_1,root2_2_2);
        TreeNode1 root2=new TreeNode1(3,root2_1,root2_2);

//        TreeNode1 root1_1=new TreeNode1(2);
//        TreeNode1 root1_2=new TreeNode1();
//        TreeNode1 root1=new TreeNode1(1,root1_1,root1_2);
//
//        TreeNode1 root2_2=new TreeNode1();
//        TreeNode1 root2_1=new TreeNode1(2);
//        TreeNode1 root2=new TreeNode1(2,root2_1,root2_2);

        System.out.println(Solution.leafSimilar(root1, root2));

        TreeNode1 root;

//        public int countNodes(root) {
//            int leftDepth = getDepth(root, -1);
//            int rightDepth = getDepth(root, 1);
//            if (leftDepth == rightDepth) {
//                return (1 << leftDepth) - 1;
//            }
//            return 1 + countNodes(root.left) + countNodes(root.right);
//        }

//        public static int getDepth (TreeNode1 root, int dir=0) {
//            int depth = 0;
//            while (root1 != null) {
//                depth++;
//
//
//                System.out.println(root1.val);
//            }
//
////            return depth;
////        }












    }
}
