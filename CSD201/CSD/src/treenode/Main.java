package treenode;

/**
 * @date Jun 22, 2020
 * @author Nguyen Xuan Nghiep
 */
public class Main {
    public static void main(String[] args) {
        TreeNode a = new TreeNode(50);
        BinarySearchTree bst = new BinarySearchTree(a);
        bst.insertNode(a, 30);
        bst.insertNode(a, 70);
        bst.insertNode(a, 20);
        bst.insertNode(a, 40);
        bst.insertNode(a, 60);
        bst.insertNode(a, 80);
        bst.inOrder(a);
        System.out.println("");
        int x = 90;
        if (bst.search(a, x) != null) {
            System.out.println("Tim thay " + x + " trong binary tree");
        } else {
            System.out.println("Khong tim thay " + x);
        }
    }
}
