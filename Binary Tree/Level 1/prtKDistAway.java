import java.util.*;

public class prtKDistAway {
      // Static
      public static boolean nTrP(Node root, int data, ArrayList<Node> ans) {
            if (root == null)
                  return false;
            if (root.data == data)
                  ans.add(root);
            boolean res = nTrP(root.left, data, ans) || nTrP(root.right, data, ans);
            if (res)
                  ans.add(root);
            return res;
      }

      public static void kLevelDwn(Node root, int k, Node block, ArrayList<Node> ans) {
            if (root == null || k < 0 || root == block)
                  return;
            if (k == 0) {
                  ans.add(root);
                  return;
            }
            kLevelDwn(root.left, k - 1, block, ans);
            kLevelDwn(root.right, k - 1, block, ans);
      }

      public static ArrayList<Node> kWay(Node root, int data, int k) {
            ArrayList<Node> list = new ArrayList<>();
            nTrP(root, data, list);
            ArrayList<Node> ans = new ArrayList<>();
            Node block = null;
            for (int i = 0; i < list.size(); i++) {
                  kLevelDwn(list.get(i), k - i, block, ans);
                  block = list.get(i);
            }
            return ans;
      }

      // Generic
      public static int kWays2(Node root, int data, int k, Node block, ArrayList<Node> ans) {
            if (root == null)
                  return -1;
            if (root.data == data) {
                  kLevelDwn(root, k, null, ans);
                  return 1;
            }
            int ld=kWays2(root.left, data, k, block, ans);
            if(ld!=-1){
                  kLevelDwn(root.left, k-ld, block, ans);
                  return ld+1;
            }
            int rd=kWays2(root, data, k, block, ans)
      }
}
