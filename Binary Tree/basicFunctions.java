import java.util.*;

public class basicFunctions {
      // size
      public static int size(Node root) {
            int count = 0;
            if (root == null)
                  return 0;
            else {
                  count += size(root.left);
                  count += size(root.right);
            }
            return count;
      }

      // sum
      public static int sum(Node root) {

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
