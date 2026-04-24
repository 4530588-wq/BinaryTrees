public class BT<A extends Comparable<A>> {
    Node<A> root;
     A value;

    public BT(){
        this.root = null;
        this.value = null;
    }

    public BT(Node<A> root){
        this.root = root;
    }

    public boolean search(Node<A> node, A value){
        if(node == null) return false;

        else if(value.compareTo(node.getData()) < 0)
            return search(node.getLeft(),value);

        else if(value.compareTo(node.getData()) > 0)
            return search(node.getRight(),value);

        else return true;
    }

    public Node<A> insert(Node<A> node,A value){
        if(node == null)
            return new Node<>(value,null,null);

        else if(value == node.getData())
            return node;

        else if(value.compareTo(node.getData()) < 0)
            node.setLeft(insert(node.getLeft(),value));

        else node.setRight(insert(node.getRight(),value));
        return node;
    }

}