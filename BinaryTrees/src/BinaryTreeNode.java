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

    public A getData(){
        return data;
    }
    public BinaryTreeNode<A> getLeft(){
        return left;
    }
    public BinaryTreeNode<A> getRight(){
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