package entities.tree;

public class BinaryTree {
    Node root;


    public void preOrder(Node node){
        if(node == null){
            return;
        }
        System.out.println(node.value);

        preOrder(node.left);
        preOrder(node.ritgh);
    }

    public void inOrder (Node node){
        if(node == null) {
            return;
        }
        inOrder(node.left);
        System.out.println(node.value + "");
        inOrder(node.ritgh);
    }

    public void posOrder (Node node){
        if(node == null) {
            return;
        }
        inOrder(node.left);
        inOrder(node.ritgh);
        System.out.println(node.value + "");
    }
}
