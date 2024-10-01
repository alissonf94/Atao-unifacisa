package entities.tree;

public class Node<t> {
    t value;
    Node left;
    Node ritgh;

    public Node (t value){
        this.value = value;
        this.left = null;
        this.ritgh =  null;
    }

    public Node getRitgh() {
        return ritgh;
    }

    public void setRitgh(Node ritgh) {
        this.ritgh = ritgh;
    }

    public t getValue() {
        return value;
    }

    public void setValue(t value) {
        this.value = value;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }
}
