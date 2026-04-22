public class Main {
    public static void main(String[] args){

        BinaryTreeeNode<Integer> k1 = new BinaryTreeeNode<>(5,null,null);
        BinaryTreeeNode<Integer> k2 = new BinaryTreeeNode<>(10,null,null);
        BinaryTreeeNode<Integer> k3 = new BinaryTreeeNode<>(15,null,null);
        BinaryTreeeNode<Integer> k4 = new BinaryTreeeNode<>(20,null,null);
        BinaryTreeeNode<Integer> k5 = new BinaryTreeeNode<>(25,null,null);
        BinaryTreeeNode<Integer> k6 = new BinaryTreeeNode<>(30,null,null);

        k1.setLeft(k2);
        k1.setRight(k3);
        k2.setLeft(k4);
        k2.setRight(k5);
        k3.setLeft(k6);

        BinaryTreee<Integer> tree1 = new BinaryTreee<>(k1);

        BinaryTreeeNode<String> h1 = new BinaryTreeeNode<>("John",null,null);
        BinaryTreeeNode<String> h2 = new BinaryTreeeNode<>("Paulo",null,null);
        BinaryTreeeNode<String> h3 = new BinaryTreeeNode<>("Jake",null,null);
        BinaryTreeeNode<String> h4 = new BinaryTreeeNode<>("Sam",null,null);
        BinaryTreeeNode<String> h5 = new BinaryTreeeNode<>("Tim",null,null);

        h1.setLeft(h2);
        h1.setRight(h3);
        h2.setLeft(h4);
        h2.setRight(h5);

        BinaryTreee<String> tree2 = new BinaryTreee<>(h1);

        System.out.println("Leaves of tree 1 :"+ tree1.countLeaves(tree1.getRoot()));
        System.out.println("Leaves of tree 2 :"+ tree2.countLeaves(tree2.getRoot()));
        System.out.println("Height of tree 1 :"+ tree1.getHeight(tree1.getRoot()));
        System.out.println("Height of tree 2 :"+ tree2.getHeight(tree2.getRoot()));


    }
}