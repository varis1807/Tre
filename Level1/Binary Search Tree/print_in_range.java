public class print_in_range {
    public static void printInRange(Node node, int lr, int rr) {
        if (node == null)
            return;

        printInRange(node.left, lr, rr);

        if (node.data >= lr && node.data <= rr)
            System.out.println(node.data);

        printInRange(node.right, lr, rr);
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(7);
        root.right = new Node(11);
        root.left.left = new Node(5);
        root.left.right = new Node(8);
        root.left.right.left = new Node(6);
        root.right.left = new Node(9);
        root.right.right = new Node(13);
        root.right.right.right = new Node(15);
        printInRange(root, 5, 15);
    }
}
