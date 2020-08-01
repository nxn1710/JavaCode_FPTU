package treenode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @date Jun 22, 2020
 * @author Nguyen Xuan Nghiep
 */
public class MyTree<T> {

    TreeNode root;

    public MyTree() {
        root = null;
    }

    public MyTree(int data) {
        root = new TreeNode(data);
    }

    public void visit(TreeNode node) {
        System.out.print(node.data + "\t");
    }

    public void preOrder(TreeNode node) {
        if (node == null) {
            return;
        }
        visit(node);
        preOrder(node.left);
        preOrder(node.right);
    }

    public void inOrder(TreeNode node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        visit(node);
        inOrder(node.right);
    }

    public void postOrder(TreeNode node) {
        if (node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        visit(node);
    }

    public void breath(TreeNode node) {
        if (node == null) {
            return;
        }
        Queue queue = new LinkedList();
        queue.add(node);
        while (!queue.isEmpty()) {
            TreeNode a = (TreeNode) queue.poll();
            if (a.left != null) {
                queue.add(a.left);
            }
            if (a.right != null) {
                queue.add(a.right);
            }
            visit(a);
        }
    }
    

    public int height(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int lheight = height(node.left);
        int rheight = height(node.right);
        int result = lheight > rheight ? lheight : rheight;
        return result + 1;
    }
}
