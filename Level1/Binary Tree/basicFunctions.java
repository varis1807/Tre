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
            // if (root == null)
            // return 0;
            // int leftSize = size(root.left);
            // int rightSize = size(root.right);
            // return leftSize + rightSize + 1;

            /// 3------------
            // return root == null ? 0 : size(root.left) + size(root.right) + 1;
      }

      // sum
      public static int sum(Node root) {
            // 1---------------------
            if (root == null)
                  return 0;
            int leftSum = sum(root.left);
            int rightSum = sum(root.right);
            return leftSum + rightSum + root.data;
            // 2------------------------
            // return node == null ? 0 : sum(node.left) + sum(node.right) + node.data;
      }

      // Max,Min
      public static int max(Node root) {
            // 1------------------------------------
            if (root == null)
                  return -(int) 1e9;
            return Math.max(Math.max(max(root.left), max(root.right)), root.data);

            // 2-------------------------------------
            // if (root == null)
            // return -(int) 1e9;
            // int leftMax = max(root.left);
            // int rightMax = max(root.right);
            // return Math.max(Math.max(leftMax, rightMax), root.data);

            // 3-------------------------------------
            // return node == null ? -(int) 1e9 : Math.max(node.data,
            // Math.max(max(node.left), max(node.right)));
      }

      public static int min(Node root) {
            // 1--------------
            if (root == null)
                  return (int) 1e9;
            return Math.min(Math.min(min(root.left), min(root.right)), root.data);
            // 4--------------
            // if (root == null)
            // return (int) 1e9;

            // int leftMax = min(root.left);
            // int rightMax = min(root.right);
            // 2-------------------
            // return Math.min(Math.min(leftMax, rightMax), root.data);
            // ----------3
            // return node == null ? (int) 1e9 : Math.min(node.data,
            // Math.min(min(node.left), min(node.right)));
      }

      // height
      public static int height(Node root) {
            // 1-----------------------------------------
            if (root == null)
                  return -1;
            int leftH = height(root.left);
            int rightH = height(root.right);
            return Math.max(leftH, rightH) + 1;

            // 2---------------------------------------------
            // return root == null ? -1 : Math.max(height(root.left), height(root.right)) +
            // 1;
      }

      // find node
      public static boolean find(Node root, int data) {
            if (root == null)
                  return false;

            if (root.data == data)
                  return true;

            return find(root.left, data) || find(root.right, data);
      }
}
