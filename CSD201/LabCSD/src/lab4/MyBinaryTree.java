package lab4;

import java.io.Serializable;

/**
 * @date Jul 1, 2020
 * @author Nguyen Xuan Nghiep
 */
public class MyBinaryTree implements Serializable {

    TreeNode root;
    public static final long serialVersionUID = 1L;

    public MyBinaryTree() {
        root = null;
    }

    public TreeNode getRoot() {
        return root;
    }

    //Add a node
    public void addToTree(int data) {
        if (root == null) {
            root = insertNode(root, data);
        } else {
            insertNode(root, data);
        }
    }

    private TreeNode insertNode(TreeNode rootNode, int data) {
        TreeNode newNode = new TreeNode(data);
        if (rootNode == null) {
            rootNode = newNode;
            return rootNode;
        }
        if (rootNode.data > data) {
            rootNode.left = insertNode(rootNode.left, data);
        } else {
            rootNode.right = insertNode(rootNode.right, data);
        }
        return rootNode;
    }

    //In-order traverse
    private void viewNode(TreeNode node) {
        System.out.println(node.data);
    }

    public void inOrder(TreeNode rootNode) {
        if (rootNode == null) {
            return;
        }
        inOrder(rootNode.left);
        viewNode(rootNode);
        inOrder(rootNode.right);
    }

    //Breadth-first traverse
    public void breadthTraverse() {
        if (root == null) {
            return;
        }
        MyQueue queue = new MyQueue(100);
        queue.enqueue(root);
        while (!queue.isEmpty()) {
            TreeNode node = (TreeNode) queue.dequeue();
            if (node.left != null) {
                queue.enqueue(node.left);
            }
            if (node.right != null) {
                queue.enqueue(node.right);
            }
            viewNode(node);
        }
    }

    //Search
    public int search(TreeNode root, int data) {
        if (root == null) {
            return -1;
        }
        if (root.data > data) {
            return search(root.left, data);
        } else if (root.data < data) {
            return search(root.right, data);
        }
        return root.data;
    }

    public int countNode(TreeNode rootNode) {
        int count = 1;
        if (rootNode.left != null) {
            count += countNode(rootNode.left);
        }
        if (rootNode.right != null) {
            count += countNode(rootNode.right);
        }
        return count;
    }

    public void delete(int data) {
        root = deleteNode(root, data);
    }

    private TreeNode deleteNode(TreeNode rootNode, int data) {
        if (rootNode == null) {
            return rootNode;
        }
        if (data > rootNode.data) {
            rootNode.right = deleteNode(rootNode.right, data);
        } else if (data < rootNode.data) {
            rootNode.left = deleteNode(rootNode.left, data);
        } else {
            if (rootNode.right == null) {
                return rootNode.left;
            } else if (rootNode.left == null) {
                return rootNode.right;
            } else {
                rootNode.data = getMin(rootNode.right).data;
                rootNode.right = deleteNode(rootNode.right, rootNode.data);
            }
        }
        return rootNode;
    }

    public TreeNode getMin(TreeNode rootNode) {
        if (rootNode == null) {
            return rootNode;
        }
        while (rootNode.left != null) {
            rootNode = rootNode.left;
        }
        return rootNode;
    }
}
