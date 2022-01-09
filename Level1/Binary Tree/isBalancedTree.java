import java.util.*;

public class isBalancedTree {
      public static int height(Node root) {
            return root == null ? -1 : Math.max(height(root.left), height(root.right)) + 1;
      }

      public static boolean isBal(Node root) {
            if (root == null)
                  return true;
            if (!isBal(root.left))
                  return false;
            if (!isBal(root.right))
                  return true;
            int lh = height(root.left);
            int rh = height(root.right);
            int diff = Math.abs(lh - rh);
            if (diff > 1)
                  return false;
            return true;
      }

      // With Pair
      // is balanced optimised
      public static class balPair {
            int height = -1;
            boolean isBal = true;
      }

      public static balPair isBal2(Node node) {
            if (node == null)
                  return new balPair();

            balPair leftPair = isBal2(node.left);
            if (leftPair.isBal == false)
                  return leftPair;

            balPair rightPair = isBal2(node.right);
            if (rightPair.isBal == false)
                  return rightPair;

            balPair myAns = new balPair();
            if (Math.abs(leftPair.height - rightPair.height) >= 1) {
                  myAns.isBal = false;
                  return myAns;
            }

            myAns.height = Math.max(leftPair.height, rightPair.height) + 1;

            return myAns;
      }
}
