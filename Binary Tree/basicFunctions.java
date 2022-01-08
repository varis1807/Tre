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
            return leftSum+rightSum+root.data;
             // return node == null ? 0 : sum(node.left) + sum(node.right) + node.data;
      }

      // Max,Min
      public static int max(Node root) {

      }

      public static int min(Node root) {

      }

      // height
      public static int height(Node root) {

      }

      // find node
      public static int find(Node root) {

      }
}
