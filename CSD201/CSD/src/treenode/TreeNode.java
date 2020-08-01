package treenode;

/**
 * @date Jun 22, 2020
 * @author Nguyen Xuan Nghiep
 */
public class TreeNode<T> {

    int data;
    TreeNode left;
    TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

}
