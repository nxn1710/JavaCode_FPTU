package lab4;

import java.io.Serializable;

/**
 * @date Jul 1, 2020
 * @author Nguyen Xuan Nghiep
 */
public class TreeNode implements Serializable {

    int data;
    TreeNode left;
    TreeNode right;
    public static final long serialVersionUID = 1L;

    public TreeNode() {
    }

    public TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

}
