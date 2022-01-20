public class add_node {
    public static Node addData(Node node, int data) {
        if (node == null)
            return new Node(data);

        if (node.data < data)
            node.right = addData(node.right, data);
        else if (node.data > data)
            node.left = addData(node.left, data);
        return node;
    }

    public static void main(String[] args) {
        Node root = new Node(100);
        root.left = new Node(20);
        root.right = new Node(500);
        root.left.left = new Node(10);
        root.left.right = new Node(30);
        System.out.println(addData(root, 40));
    }
}
