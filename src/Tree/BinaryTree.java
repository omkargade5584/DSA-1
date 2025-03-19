package Tree;

// Define Node Class
class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

// Define BinaryTree Class
class BinaryTree {
    Node root;

    // Preorder Traversal: Root, Left, Right
    void preorder(Node node) {
        if (node == null) return;
        System.out.print(node.data + " ");
        preorder(node.left);
        preorder(node.right);
    }

    // Inorder Traversal: Left, Root, Right
    void inorder(Node node) {
        if (node == null) return;
        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }

    // Postorder Traversal: Left, Right, Root
    void postorder(Node node) {
        if (node == null) return;
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data + " ");
    }
    

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        // Creating nodes manually
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Preorder traversal:");
        tree.preorder(tree.root);

        System.out.println("\nInorder traversal:");
        tree.inorder(tree.root);

        System.out.println("\nPostorder traversal:");
        tree.postorder(tree.root);
    }
}


