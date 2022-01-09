import java.util.*;

class Node {
      Node left, right;
      int data;

      Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
      }

      Node(int data) {
            this(data, null, null);
      }
}

public class checkBST {
      static Node prev = null;

      public static boolean isBST(Node root) {
            if (root == null)
                  return true;
            if (!isBST(root.left))
                  return false;

            if (prev != null && prev.data >= root.data)
                  return false;
            prev = root;
            if (!isBST(root.right))
                  return false;

            return true;
      }
}
