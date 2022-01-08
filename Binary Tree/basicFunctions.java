import java.util.*;

public class basicFunctions {
      // size
      public static int size(Node root) {
            /// 1-----------
            int count = 0;
            if (root == null)
                  return 0;
            else {
                  count += size(root.left);
                  count += size(root.right);
            }
            return count;
            /// 2-------------
            if (node == null)
                  return 0;

            int leftSize = size(node.left);
            int rightSize = size(node.right);

            return leftSize + rightSize + 1;
            /// 3------------
            return node == null ? 0 : size(node.left) + size(node.right) + 1;
      }

      // sum
      public static int sum(Node root) {
            if (root == null)
                  return 0;
            int leftSum = sum(root.left);
            int rightSum = sum(root.right);
            return leftSum + rightSum + root.data;
            // return node == null ? 0 : sum(node.left) + sum(node.right) + node.data;
      }

      // Max,Min
      public static int max(Node root) {
            // 1--------------
            if (root == null)
                  return -(int) 1e9;
            return Math.max(Math.max(max(root.left), max(root.right)), root.data);

            if (node == null)
                  return -(int) 1e9;

            int leftMax = max(node.left);
            int rightMax = max(node.right);
            // 2-------------------
            return Math.max(Math.max(leftMax, rightMax), node.data);
            // ----------3
            // return node == null ? -(int) 1e9 : Math.max(node.data,
            // Math.max(max(node.left), max(node.right)));
      }

      public static int min(Node root) {
            // 1--------------
            if (root == null)
                  return (int) 1e9;
            return Math.min(Math.min(min(root.left), min(root.right)), root.data);

            if (node == null)
                  return (int) 1e9;

            int leftMax = min(node.left);
            int rightMax = min(node.right);
            // 2-------------------
            return Math.min(Math.min(leftMax, rightMax), node.data);
            // ----------3
            // return node == null ? (int) 1e9 : Math.min(node.data,
            // Math.min(min(node.left), min(node.right)));
      }

      // height
      public static int height(Node root) {
            if (root == null)
                  return -1;
            int leftH = height(root.left);
            int rightH = height(root.right);
            return Math.max(leftH + rightH) + 1;

            return node == null ? -1 : Math.max(height(node.left), height(node.right)) + 1;
      }

      // find node
      public static boolean find(Node root) {
            if (node == null)
            return false;

        if (node.data == data)
            return true;

        return findData(node.left, data) || findData(node.right, data);
      }
}
