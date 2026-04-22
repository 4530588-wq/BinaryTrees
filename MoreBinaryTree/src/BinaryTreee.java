public class BinaryTreee<B> {
    private BinaryTreeeNode<B> root;

    public BinaryTreee() {
        this.root = null;
    }

    public BinaryTreee(BinaryTreeeNode<B> root) {
        this.root = root;
    }

    public BinaryTreeeNode<B> getRoot() {
        return root;
    }

    public void setRoot(BinaryTreeeNode<B> root) {
        this.root = root;
    }

    public int getHeight(BinaryTreeeNode<B> node) {
        if (node == null) return -1;

        int leftHeight = getHeight(node.getLeft());
        int rightHeight = getHeight(node.getRight());

        return Math.max(leftHeight, rightHeight) + 1;
    }
    public int countLeaves(BinaryTreeeNode<B> node){
        if(node == null) return 0;
        if(node.getLeft() == null && node.getRight() == null) return 1;

        return countLeaves(node.getLeft()) + countLeaves(node.getRight());
    }

}