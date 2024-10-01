package entities.tree;

public class Node {
    int value;
    Node left;
    Node ritgh;

    public Node (int value){
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

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }
}
