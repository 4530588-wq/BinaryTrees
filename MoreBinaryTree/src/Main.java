import com.sun.source.tree.BinaryTree;

public class Main {
    public static void main(String[] args){

        BinaryTreeNode<Integer> k1 = new BinaryTreeNode<>(5,null,null);
        BinaryTreeNode<Integer> k2 = new BinaryTreeNode<>(10,null,null);
        BinaryTreeNode<Integer> k3 = new BinaryTreeNode<>(15,null,null);
        BinaryTreeNode<Integer> k4 = new BinaryTreeNode<>(20,null,null);
        BinaryTreeNode<Integer> k5 = new BinaryTreeNode<>(25,null,null);
        BinaryTreeNode<Integer> k6 = new BinaryTreeNode<>(30,null,null);

        k1.setLeft(k2);
        k1.setRight(k3);
        k2.setLeft(k4);
        k2.setRight(k5);
        k3.setLeft(k6);

        BinaryTree<Integer> tree1 = new BinaryTree<>(k1);

        BinaryTreeNode<String> h1 = new BinaryTreeNode<>("John",null,null);
        BinaryTreeNode<String> h1 = new BinaryTreeNode<>("John",null,null);
        BinaryTreeNode<String> h1 = new BinaryTreeNode<>("John",null,null);
        BinaryTreeNode<String> h1 = new BinaryTreeNode<>("John",null,null);
        BinaryTreeNode<String> h1 = new BinaryTreeNode<>("John",null,null);




    }
}