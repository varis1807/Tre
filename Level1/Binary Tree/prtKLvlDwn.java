import java.util.*;

public class prtKLvlDwn {
      public static void kLevelDwn(Node root, int k, ArrayList<Integer> ans) {
            if (root == null || k < 0)
                  return;
            if (k == 0) {
                  ans.add(root.data);
                  return;
            }
            kLevelDwn(root.left, k-1, ans);
            kLevelDwn(root.right, k-1, ans);
      }
      public static void main(String[] args) {
            
      }
}
