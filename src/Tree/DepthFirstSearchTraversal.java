package Tree;

class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

public class DFSTreeTraversal {
    Node root;

    // Preorder Traversal (Root → Left → Right)
    void preorder(Node node) {
        if (node == null) return;
        System.out.print(node.data + " ");
        preorder(node.left);
        preorder(node.right);
    }

    // Inorder Traversal (Left → Root → Right)
    void inorder(Node node) {
        if (node == null) return;
        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }

    // Postorder Traversal (Left → Right → Root)
    void postorder(Node node) {
        if (node == null) return;
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data + " ");
    }

    public static void main(String[] args) {
        DFSTreeTraversal tree = new DFSTreeTraversal();

        // Creating Tree
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Preorder Traversal:");
        tree.preorder(tree.root);

        System.out.println("\nInorder Traversal:");
        tree.inorder(tree.root);

        System.out.println("\nPostorder Traversal:");
        tree.postorder(tree.root);
    }
}

