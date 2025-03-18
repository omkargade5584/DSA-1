package Tree;

class BSTNode {
    int key;
    BSTNode left, right;

    public BSTNode(int item) {
        key = item;
        left = right = null;
    }
}

public class BinarySearchTree {
    BSTNode root;

    // Constructor
    BinarySearchTree() {
        root = null;
    }

    // Insert a new key
    void insert(int key) {
        root = insertRec(root, key);
    }

    // Recursive insert function
    BSTNode insertRec(BSTNode root, int key) {
        if (root == null) {
            root = new BSTNode(key);
            return root;
        }

        if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);

        return root;
    }

    // Inorder Traversal (Sorted Order)
    void inorder() {
        inorderRec(root);
    }

    void inorderRec(BSTNode root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.key + " ");
            inorderRec(root.right);
        }
    }

    // Search Key
    boolean search(int key) {
        return searchRec(root, key);
    }

    boolean searchRec(BSTNode root, int key) {
        if (root == null)
            return false;

        if (root.key == key)
            return true;

        return key < root.key ? searchRec(root.left, key) : searchRec(root.right, key);
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(50);
        tree.insert(30);
        tree.insert(70);
        tree.insert(20);
        tree.insert(40);
        tree.insert(60);
        tree.insert(80);

        System.out.println("Inorder traversal of BST:");
        tree.inorder();

        System.out.println("\nSearching for 40: " + tree.search(40)); // true
        System.out.println("Searching for 90: " + tree.search(90)); // false
    }
}
