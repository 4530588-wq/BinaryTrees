public class Main {
    public static void main(String[] args){

        BinaryTreeNode<Character> n1 = new BinaryTreeNode<>('a',null,null);
        BinaryTreeNode<Character> n2 = new BinaryTreeNode<>('b',null,null);
        BinaryTreeNode<Character> n3 = new BinaryTreeNode<>('c',null,null);
        BinaryTreeNode<Character> n4 = new BinaryTreeNode<>('d',null,null);
        BinaryTreeNode<Character> n5 = new BinaryTreeNode<>('e',null,null);
        BinaryTreeNode<Character> n6 = new BinaryTreeNode<>('f',null,null);

        n1.setLeft(n2);
        n1.setRight(n3);
        n2.setLeft(n4);
        n2.setRight(n5);
        n3.setLeft(n6);

        BinaryTree<Character> tree1 = new BinaryTree<>(n1);

        BinaryTreeNode<Integer> a1 = new BinaryTreeNode<>(20,null,null);
        BinaryTreeNode<Integer> a2 = new BinaryTreeNode<>(21,null,null);
        BinaryTreeNode<Integer> a3 = new BinaryTreeNode<>(22,null,null);
        BinaryTreeNode<Integer> a4 = new BinaryTreeNode<>(23,null,null);
        BinaryTreeNode<Integer> a5 = new BinaryTreeNode<>(24,null,null);
        BinaryTreeNode<Integer> a6 = new BinaryTreeNode<>(25,null,null);
        BinaryTreeNode<Integer> a7 = new BinaryTreeNode<>(26,null,null);

        a1.setLeft(a2);
        a1.setRight(a3);
        a2.setLeft(a4);
        a2.setRight(a5);
        a3.setLeft(a6);
        a3.setRight(a7);

        BinaryTree<Integer> tree2 = new BinaryTree<>(a1);

        System.out.println("Tree 1 In-order transversal : " );
        tree1.inOrder(tree1.getRoot());
        System.out.println(" ");
        System.out.println("Tree 1 Leaves : "+ tree1.countLeaves(tree1.getRoot()));
        System.out.println("Tree 1 height : "+tree1.height(tree1.getRoot()));
        System.out.println(" ");
        System.out.println("Tree 2 In-order transversal : " );
        tree2.inOrder(tree2.getRoot());
        System.out.println(" ");
        System.out.println("Tree 2 Leaves : "+ tree2.countLeaves(tree2.getRoot()));
        System.out.println("Tree 2 height : "+tree2.height(tree2.getRoot()));
    }
}