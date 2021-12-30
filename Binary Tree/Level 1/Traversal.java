import java.util.*;

class Node {
      int data;
      Node left;
      Node right;

      Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
      }

      Node(int data) {
            this(data, null, null);
      }
}

public class Traversal {
      // Pre Order
      public static ArrayList<Integer> ans = new ArrayList<>();

      public static void PreOrder(Node root) {
            if (root == null)
                  return;
            ans.add(root.data);
            PreOrder(root.left);
            PreOrder(root.right);
      }

      public static void main(String[] args) {
            Node root = new Node(1);
            root.left = new Node(2);
            root.right = new Node(3);
            root.left.left = new Node(4);
            root.right.right = new Node(5);
            PreOrder(root);
            System.out.println(ans);
      }
}