public class BinaryTree<B> {
    private BinaryTreeNode<B> root;

    public BinaryTree() {
        this.root = null;
    }

    public BinaryTree(BinaryTreeNode<B> root) {
        this.root = root;
    }

    public BinaryTreeNode<B> getRoot() {
        return root;
    }

    public void setRoot(BinaryTreeNode<B> root) {
        this.root = root;
    }

    public int getHeight(BinaryTreeNode<B> node) {
        if (node == null) return 0;

        int leftHeight = getHeight(node.getLeft());
        int rightHeight = getHeight(node.getRight());

        return Math.max(leftHeight, rightHeight) + 1;
    }
}