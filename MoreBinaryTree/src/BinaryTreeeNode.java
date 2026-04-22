class BinaryTreeeNode<B>{
   private B data;
   private BinaryTreeeNode<B> left;
   private BinaryTreeeNode<B> right;

   public BinaryTreeeNode(){
       this.data = null;
       this.left = null;
       this.right = null;
   }
   public BinaryTreeeNode(B data,BinaryTreeeNode<B> left,BinaryTreeeNode<B> right){
       this.data = data;
       this.left = left;
       this.right = right;
   }

   public B getData(){
       return data;
   }
   public BinaryTreeeNode<B> getLeft(){
       return left;
   }
   public BinaryTreeeNode<B> getRight(){
       return right;
   }

   public void setData(B data){
       this.data = data;
   }
   public void setLeft(BinaryTreeeNode<B> left){
       this.left = left;
   }
   public void setRight(BinaryTreeeNode<B> right){
       this.right = right;
   }

}