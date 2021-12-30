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

      public static void PreOrder(Node root, int data) {
            if (root == null)
                  return;
            ans.add(root.data);
            PreOrder(root.left, data);
            PreOrder(root.right, data);
      }
      public static void main(String[] args) {
            
      }
}