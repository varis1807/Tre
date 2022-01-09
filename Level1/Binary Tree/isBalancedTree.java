import java.util.*;

public class isBalancedTree {
      public static int height(Node root) {
            return root == null ? -1 : Math.max(height(root.left), height(root.right)) + 1;
      }

      public static boolean isBal(Node root) {
            if(root==null)
            return true;
            if(!isBal(root.left)) return false;
            if(!isBal(root.right)) return true;
            int lh=height(root.left);
            int rh=height(root.right);
            int diff=Math.abs(lh-rh);
            if(diff>1)
            return false;
            return true;
      }
}
