import java.util.*;
public class BSTfromPREorderTraversal {
     
      // leet 1008

      public TreeNode construct4(int[] pre, int si, int ei) {
            if (si > ei)
                  return null;

            TreeNode root = new TreeNode(pre[si]);

            int idx = si + 1;
            while (idx < pre.length && pre[idx] < pre[si]) {
                  idx++;
            }

            root.left = construct4(pre, si + 1, idx - 1);
            root.right = construct4(pre, idx, ei);

            return root;
      }

      public TreeNode bstFromPreorder(int[] preorder) {
            return construct4(preorder, 0, preorder.length - 1);
      }

      // optimized version ==========
      public TreeNode construct5(int[] pre, int lower_limit, int upper_limit, int[] idx) {
            int i = idx[0];
            if (i >= pre.length || pre[i] < lower_limit || pre[i] > upper_limit)
                  return null;

            TreeNode root = new TreeNode(pre[i]);
            idx[0]++;

            root.left = construct5(pre, lower_limit, pre[i], idx);
            root.right = construct5(pre, pre[i], upper_limit, idx);

            return root;
      }

      public TreeNode bstFromPreorder1(int[] preorder) {
            int[] idx = new int[1];
            return construct5(preorder, Integer.MIN_VALUE, Integer.MAX_VALUE, idx);
      }
 
}
