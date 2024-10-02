package entities.tree;

public class BinaryTree {
    Node root;

    public void insert (int value){
        insertRecursive(value, this.root);
    }

    public Node insertRecursive (int value, Node root){
        if (root == null){
            this.root = new Node(value);
            return root;
        }
        else if(value < root.value){
            root.left = insertRecursive(value, root.left);
        }
        else{
            root.ritgh = insertRecursive(value, root.ritgh);
        }
        return root;
    }

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
