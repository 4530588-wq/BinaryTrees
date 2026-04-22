public class BT<A extends Comparable<A>> {
    Node<A> root;
    int value;

    public BT(){
        this.root = null;
        this.value = 0;
    }

    public BT(Node<A> root,int value){
        this.root = root;
        this.value = value;
    }

    public boolean search(Node<A> root, int value){
        if(root == null) return false;

        else if(value > root.getData())
            return search(root.getLeft(),value);

        else return search(root.getRight(),value);
    }

}