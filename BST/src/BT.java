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

    public boolean search(Node<A> root, A value){
        if(root == null) return false;

        else if(value.compareTo(root.getData()) < 0)
            return search(root.getLeft(),value);

        else if(value.compareTo(root.getData()) > 0)
            return search(root.getRight(),value);

        else return true;
    }


}