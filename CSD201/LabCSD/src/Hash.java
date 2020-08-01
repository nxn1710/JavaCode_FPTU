
import java.util.Arrays;

class GFG {

// A utility function to search x in arr[] of size n 
    static int search(int arr[], int x, int n) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

// Prints postorder traversal from  
// given inorder and preorder traversals 
    static void printPostOrder(int in1[],
            int pre[], int n) {
        // The first element in pre[] is  
        // always root, search it in in[]  
        // to find left and right subtrees 
        int root = search(in1, pre[0], n);

        // If left subtree is not empty, 
        // print left subtree 
        if (root != 0) {
            printPostOrder(in1, Arrays.copyOfRange(pre, 1, n), root);
        }

        // If right subtree is not empty, 
        // print right subtree 
        if (root != n - 1) {
            printPostOrder(Arrays.copyOfRange(in1, root + 1, n),
                    Arrays.copyOfRange(pre, 1 + root, n), n - root - 1);
        }

        // Print root 
        System.out.print((char)pre[0] + " ");
    }

// Driver code 
    public static void main(String args[]) {

        //D,B,F,E,G,H,A,C
        int in1[] = {'D', 'B', 'F', 'E', 'G', 'H', 'A', 'C'};
        int pre[] = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'C'};
        int n = in1.length;
        System.out.println("Postorder traversal ");
        printPostOrder(in1, pre, n);
    }
}
