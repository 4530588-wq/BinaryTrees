public class Main {
    public static void main(String[] args){

        Node<Integer> n1 = new Node<>(11,null,null);
        Node<Integer> n2 = new Node<>(9,null,null);
        Node<Integer> n3 = new Node<>(15,null,null);
        Node<Integer> n4 = new Node<>(7,null,null);
        Node<Integer> n5 = new Node<>(10,null,null);
        Node<Integer> n6 = new Node<>(13,null,null);
        Node<Integer> n7 = new Node<>(22,null,null);
        Node<Integer> n8 = new Node<>(19,null,null);
        Node<Integer> n9 = new Node<>(25,null,null);
        Node<Integer> n10 = new Node<>(16,null,null);
        Node<Integer> n11 = new Node<>(20,null,null);
        Node<Integer> n12 = new Node<>(21,null,null);

        n1.setLeft(n2);
        n1.setRight(n3);
        n2.setLeft(n4);
        n2.setRight(n5);
        n3.setLeft(n6);
        n3.setRight(n7);
        n7.setLeft(n8);
        n7.setRight(n9);
        n8.setLeft(n10);
        n8.setRight(n11);
        n11.setRight(n12);

        BT<Integer> tree1 = new BT<>(n1);
        int elementSearch = 77;
        int elementInsert = 100;
        System.out.println("Element "+elementSearch+" exists in the tree : "+ tree1.search(tree1.root,elementSearch));
        System.out.println("Inserting element "+elementInsert+" in the tree : "+tree1.insert(tree1.root,elementInsert));

    }
}