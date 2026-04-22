class Node<A>{
    private A data;
    private Node<A> left;
    private Node<A> right;

    public Node(){
        this.data = null;
        this.left = null;
        this.right = null;
    }

    public Node(A data,Node<A> left,Node<A> right){
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public A getData(){
        return data;
    }
    public Node<A> getLeft(){
        return left;
    }
    public Node<A> getRight(){
        return right;
    }
    public void setData(A data){
        this.data = data;
    }
    public void setLeft(Node<A> left){
        this.left = left;
    }
    public void setRight(Node<A> right){
        this.right = right;
    }

}