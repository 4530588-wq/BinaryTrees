public class BinaryTree<A> {
    private BinaryTreeNode<A> root;

    public BinaryTree(){
        this.root = root;
    }

    public BinaryTreeNode<A> getRoot(){
        return root;
    }

    public void setRoot(BinaryTreeNode<A> root){
        this.root = root;
    }

    public void inOrder(BinaryTreeNode<A> node){
        if(node != null){
            inOrder(node.getLeft());
            System.out.println(node.getData() +" ");
            inOrder(node.getRight());
        }
    }

    public int countLeaves(BinaryTreeNode<A> node){
        if(node == null) return 0;
        if(node.getLeft() == null && node.getRight() == null){
            return 1;
        }
        return countLeaves(node.getLeft()) + countLeaves(node.getRight());
    }

    public int height(BinaryTreeNode<A> node){
        if(node == null) return -1;

        int leftHeight = height(node.getLeft());
        int rightHeight = height(node.getRight());

        return Math.max(leftHeight,rightHeight) +1;
    }

}