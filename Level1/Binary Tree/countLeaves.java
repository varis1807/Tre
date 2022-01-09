import java.util.*;

public class countLeaves {
      public static int cL(Node root) {
            if (root == null)
                  return 0;
            if (root.left == null && root.right == null)
                  return 1;
            return cL(root.left) + cL(root.right);
      }
}
