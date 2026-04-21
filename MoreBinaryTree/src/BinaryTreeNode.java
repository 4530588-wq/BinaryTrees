class BinaryTreeNode<B>{
   private B data;
   private BinaryTreeNode<B> left;
   private BinaryTreeNode<B> right;

   public BinaryTreeNode(){
       this.data = null;
       this.left = null;
       this.right = null;
   }
   public BinaryTreeNode(B data,BinaryTreeNode<B> left,BinaryTreeNode<B> right){
       this.data = data;
       this.left = left;
       this.right = right;
   }

   public B getData(){
       return data;
   }
   public BinaryTreeNode<B> getLeft(){
       return left;
   }
   public BinaryTreeNode<B> getRight(){
       return right;
   }

   public void setData(B data){
       this.data = data;
   }
   public void setLeft(BinaryTreeNode<B> left){
       this.left = left;
   }
   public void setRight(BinaryTreeNode<B> right){
       this.right = right;
   }

}