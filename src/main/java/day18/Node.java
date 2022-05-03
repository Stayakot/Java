package day18;

public class Node {
    private int value;
    private Node left;
    private Node right;
    public Node root;

    Node(int value) {
        this.value = value;
        right = null;
        left = null;
    }


    public Node add(Node node, int value){
        if (node==null){
            return new Node(value);
        }
        if (value<node.value) {
            node.left = add(node.left, value);
        }else if (value> node.value){
            node.right=add(node.right,value);
        }else {
            return node;
        }return node;
    }

    public void dfs(Node node) {
        if (node != null) {
            dfs(node.left);
            System.out.print(" " + node.value);
            dfs(node.right);
        }
    }


}