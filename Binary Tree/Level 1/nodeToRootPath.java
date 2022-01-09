import java.util.*;

public class nodeToRootPath {
      // Static Code
      public static boolean nTrP(Node root, int data, ArrayList<Integer> ans) {
            if (root == null)
                  return false;
            if (root.data == data)
                  ans.add(root.data);
            boolean res = nTrP(root.left, data, ans) || nTrP(root.right, data, ans);
            if (res)
                  ans.add(root.data);

            return res;
      }

      public static ArrayList<Integer> ntrp(Node root, int data) {
            ArrayList<Integer> ans = new ArrayList<>();
            nTrP(root, data, ans);
            return ans;
      }

      // Generic Code & Utilized Code
      public static ArrayList<Integer> nTrP2(Node root, int data) {
            if (root == null)
                  return null;
            if (root.data == data) {
                  ArrayList<Integer> list = new ArrayList<>();
                  list.add(root.data);
                  return list;
            }
            ArrayList<Integer> left = nTrP2(root.left, data);
            if (left != null) {
                  left.add(root.data);
                  return left;
            }

            ArrayList<Integer> right = nTrP2(root.right, data);
            if (right != null) {
                  right.add(root.data);
                  return right;
            }

            return null;
      }
}
