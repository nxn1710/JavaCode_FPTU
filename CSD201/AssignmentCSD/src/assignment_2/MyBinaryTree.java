package assignment_2;

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
    public void addToTree(Train data) {
        if (root == null) {
            root = insertNode(root, data);
        } else {
            insertNode(root, data);
        }
    }

    private TreeNode insertNode(TreeNode rootNode, Train data) {
        TreeNode newNode = new TreeNode(data);
        if (rootNode == null) {
            rootNode = newNode;
            return rootNode;
        }
        if (newNode.data.getTcode().compareTo(rootNode.data.getTcode()) < 0) {
            rootNode.left = insertNode(rootNode.left, data);
        } else {
            rootNode.right = insertNode(rootNode.right, data);
        }
        return rootNode;
    }

    //In-order traverse
    private void viewNode(TreeNode node) {
        System.out.println(node.data.toString());
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
    public Train search(TreeNode root, String code) {
        if (root == null) {
            return null;
        }
        if (root.data.getTcode().compareTo(code) > 0) {
            return search(root.left, code);
        } else if (root.data.getTcode().compareTo(code) < 0) {
            return search(root.right, code);
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

    public void delete(String tcode) {
        root = deleteNode(root, tcode);
    }

    private TreeNode deleteNode(TreeNode rootNode, String tcode) {
        if (rootNode == null) {
            return null;
        }
        if (tcode.compareToIgnoreCase(rootNode.data.getTcode()) > 0) {
            rootNode.right = deleteNode(rootNode.right, tcode);
        } else if (tcode.compareToIgnoreCase(rootNode.data.getTcode()) < 0) {
            rootNode.left = deleteNode(rootNode.left, tcode);
        } else {
            if (rootNode.right == null) {
                return rootNode.left;
            } else if (rootNode.left == null) {
                return rootNode.right;
            } else {
                rootNode.data = getMin(rootNode.right).data;
                rootNode.right = deleteNode(rootNode.right, rootNode.data.getTcode());
            }
        }
        return rootNode;
    }

    public Train[] sort() {
        Train[] trains = new Train[countNode(root)];
        int i = 0;
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
            trains[i++] = node.data;
        }
        for (int j = 0; j < trains.length; j++) {
            for (int k = trains.length - 1; k > j; k--) {
                if (trains[k - 1].getTcode().compareToIgnoreCase(trains[k].getTcode()) > 0) {
                    Train temp = trains[k - 1];
                    trains[k - 1] = trains[k];
                    trains[k] = temp;
                }
            }
        }
        return trains;
    }

    public void clear() {
        root = null;
    }
    
    public TreeNode simplyBalance(Train[] train, int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = (start + end) / 2;
        TreeNode rootNode = new TreeNode(train[mid]);
        addToTree(rootNode.data);
        rootNode.left = simplyBalance(train, start, mid - 1);
        rootNode.right = simplyBalance(train, mid + 1, end);
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
