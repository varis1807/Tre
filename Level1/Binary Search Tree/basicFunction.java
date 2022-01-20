import java.util.*;

public class basicFunction {
      // size----------------------------
      public static int size(Node root) {
            return root == null ? 0 : size(root.left) + size(root.right) + 1;

      }

      // Height-----------------------------
      public static int height(Node root) {
            return root == null ? -1 : Math.max(height(root.left) + height(root.right)) + 1;
      }

      // sum------------------------------------
      public static int sum(Node root) {
            return root == null ? 0 : sum(root.left) + sum(root.right) + root.data;
      }

      // max--------------------- min=----------------
      public static int max(Node root) {
            while (root != null) {
                  root = root.right;
            }
            return root.data;
      }

      public static int min(Node root) {
            while (root != null) {
                  root = root.left;
            }
            return root.data;
      }

      // Find-------------------------------
      public static boolean find(Node root, int data) {
            while (root != null) {
                  if (root.data == data)
                        return true;
                  else if (root.data > data)
                        root = root.left;
                  else
                        root = root.right;
            }
            return false;
      }
}
