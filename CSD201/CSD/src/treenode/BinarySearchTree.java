package treenode;

/**
 * @date Jun 22, 2020
 * @author Nguyen Xuan Nghiep
 */
public class BinarySearchTree<T> {

    TreeNode root;

    public BinarySearchTree() {
    }

    public BinarySearchTree(TreeNode root) {
        this.root = root;
    }

    public TreeNode insertNode(TreeNode root, int data) {
        TreeNode node = new TreeNode(data);

        if (root == null) {
            root = node;
            return root;
        } else if (data >= root.data) {
            root.right = insertNode(root.right, data);
        } else if (data < root.data) {
            root.left = insertNode(root.left, data);
        }
        return root;
    }

    public TreeNode search(TreeNode root, int x) {
        if (root == null || root.data == x) {
            return root;
        }
        if (root.data > x) {
            return search(root.left, x);
        }
        return search(root.right, x);
    }

    public void visit(TreeNode node) {
        System.out.print(node.data + "\t");
    }

    public void inOrder(TreeNode node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        visit(node);
        inOrder(node.right);
    }
}
