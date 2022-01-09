import java.util.*;

public class countOneChild {
      public static int COC(Node root) {
            if (root == null || (root.left == null && root.right == null))
                  return 0;
            if (root.left == null || root.right == null)
                  return 1;
            return COC(root.left) + COC(root.right);
      }

      // print
      // Print the nodes having exactly one child in a Binary tree
      public static void exactlyOneChild_(Node node, ArrayList<Integer> ans) {
            if (node == null || (node.left == null && node.right == null))
                  return;

            if (node.left == null || node.right == null)
                  ans.add(node.data);

            exactlyOneChild_(node.left, ans);
            exactlyOneChild_(node.right, ans);

      }

      public static void exactlyOneChild(Node node) {
            ArrayList<Integer> ans = new ArrayList<>();
            exactlyOneChild_(node, ans);
            System.out.println(ans);
      }

      public static void main(String[] args) {
            Node root = new Node(1);
            root.left = new Node(2);
            root.right = new Node(3);
            root.left.left = new Node(4);
            root.right.left = new Node(5);
            root.right.right = new Node(6);
            root.right.left.left = new Node(7);
            root.right.right.left = new Node(8);
            // System.out.println(COC(root));
            exactlyOneChild(root);
      }
}
