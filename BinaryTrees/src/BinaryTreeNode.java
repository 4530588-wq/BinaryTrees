class BinaryTreeNode<A>{
    A data;
    BinaryTreeNode<A> left;
    BinaryTreeNode<A> right;

    public BinaryTreeNode(){
        this.data = null;
        this.left = null;
        this.right = null;
    }

    public BinaryTreeNode(A data, BinaryTreeNode<A> left, BinaryTreeNode<A> right){
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public A getData(A data){
        return data;
    }
    public BinaryTreeNode<A> getLeft(BinaryTreeNode<A> left){
        return left;
    }
    public BinaryTreeNode<A> getRight(BinaryTreeNode<A> right){
        return right;
    }

    public void setData(A data){
        this.data = data;
    }
    public void setLeft(BinaryTreeNode<A> left){
        this.left = left;
    }
    public void setRight(BinaryTreeNode<A> right){
        this.right = right;
    }
}