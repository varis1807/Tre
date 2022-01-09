import java.util.*;

public class isBalancedTree {
      public static int height(Node root) {
            return root == null ? -1 : Math.max(height(root.left), height(root.right)) + 1;
      }
}
