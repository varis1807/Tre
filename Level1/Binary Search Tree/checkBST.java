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

      // Static
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

      // Generic
      public static class isBSTPair {
            boolean isBST = true;
            int maxEle = -(int) 1e9;
            int minEle = (int) 1e9;
      }

      public static isBSTPair isBST2(Node node) {
            if (node == null)
                  return new isBSTPair();

            isBSTPair left = isBST2(node.left);
            if (!left.isBST)
                  return left;

            isBSTPair right = isBST2(node.right);
            if (!right.isBST)
                  return right;

            isBSTPair self = new isBSTPair();
            self.isBST = false;

            if (left.maxEle < node.data && right.minEle > node.data) {
                  self.maxEle = Math.max(right.maxEle, node.data);
                  self.minEle = Math.min(left.minEle, node.data);
                  self.isBST = true;
            }

            return self;
      }
}
