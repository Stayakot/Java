package day18;

public class Task3 {
    public static void main(String[] args) {
        Node tree=new Node(20);
        tree.add(tree, 14);
        tree.add(tree, 11);
        tree.add(tree, 5);
        tree.add(tree, 8);
        tree.add(tree, 16);
        tree.add(tree, 15);
        tree.add(tree, 18);
        tree.add(tree, 23);
        tree.add(tree, 22);
        tree.add(tree, 27);
        tree.add(tree, 24);
        tree.add(tree, 150);

        tree.dfs(tree);


    }
}