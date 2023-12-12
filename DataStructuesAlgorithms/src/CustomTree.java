public class CustomTree {
    Node head;


    public static class Node {

        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    public void add(int val) {
        head = insert(head, val);
    }

    public Node insert(Node n, int val) {
        if (n == null) {
            n = new Node(val);
        } else {
            if (n.val < val) {
                n.right = insert(n.right, val);
            } else {
                n.left = insert(n.left, val);
            }
        }
        return n;
    }

    public void display(Node n) {

        if (n != null) {
            display(n.left);
            System.out.println(n.val);
            display(n.right);
        }


    }
}
