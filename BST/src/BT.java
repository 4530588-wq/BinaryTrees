import java.sql.SQLOutput;

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

        int cmp = value.compareTo(node.getData());
        if(cmp == 0){ System.out.println("Duplicate detected "+value);
    return node;}
        else if(cmp < 0) {node.setLeft(insert(node.getLeft(),value));}
        else {node.setRight(insert(node.getRight(),value));}
        return node;
    }

    private Node<A> findMin(Node<A> node){
        while(node.getLeft() != null) node = node.getLeft();
        return node;
    }
    private Node<A> deleteData(Node<A> node, A data){
        if(node == null) return null;
        else if(data.compareTo(node.getData()) >0) node.setRight(deleteData(node.getRight(),data));
        else if(data.compareTo(node.getData()) <0) node.setLeft(deleteData(node.getLeft(),data));
        else{
            if(node.getLeft() == null && node.getRight() == null) return null;
            else if(node.getLeft() == null) return node.getRight();
            else if(node.getRight() == null) return node.getLeft();
            Node<A> victimNode = findMin(node.getRight());
            node.setData(victimNode.getData());
            node.setRight(deleteData(node.getRight(),victimNode.getData()));
        }
        return node;
    }
    public void delete(A data){
        root = deleteData(root, data);
    }
    public void inOrder(Node<A> node){
        if(node != null){
            inOrder(node.getLeft());
            System.out.print(" "+node.getData());
            inOrder(node.getRight());
        }

    }

}