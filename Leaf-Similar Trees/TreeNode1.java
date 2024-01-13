
public class TreeNode1 {
    int val;
    TreeNode1 left;
    TreeNode1 right;

    public TreeNode1() {}

    public TreeNode1 (int val){ this.val = val; }
    public TreeNode1(int val, TreeNode1 left, TreeNode1 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
