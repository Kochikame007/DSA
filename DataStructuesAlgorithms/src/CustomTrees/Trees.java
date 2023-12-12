package CustomTrees;

import javax.swing.tree.TreeNode;

public class Trees {
    private Node root;

    public Trees() {
        this.root = null;
    }


    public Node add(int n) {
        root = addNode(n, root);
        return root;
    }

    private Node addNode(int n, Node root) {

        if (root == null) {
            root = new Node(n);
            return root;
        } else {
            if (root.n > n) {
                root.left = addNode(n, root.left);
            } else {
                root.right = addNode(n, root.right);
            }
        }
        return root;
    }


    public void inOrderTransversal(Node node) {
        if (node != null) {
            inOrderTransversal(root.left);
            System.out.println("inOrderTransversal " + node.n);
            inOrderTransversal(node.right);
        }
    }


    public void preOrdderTransversal(Node node) {
        if (node != null) {
            System.out.println("preOrdderTransversal " + node.n);
            preOrdderTransversal(node.left);
            preOrdderTransversal(node.right);
        }
    }

    public void postOrdderTransversal(Node node) {
        if (node != null) {
            postOrdderTransversal(node.left);
            postOrdderTransversal(node.right);
            System.out.println("postOrdderTransversal " + node.n);
        }
    }


    private class Node {
        private int n;
        private Node left;
        private Node right;

        Node(int n) {
            this.n = n;
            this.left = null;
            this.right = null;
        }

    }
}
